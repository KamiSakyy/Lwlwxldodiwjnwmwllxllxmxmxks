package com.github.rudroid.studio;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.webkit.JavascriptInterface;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * JS-мост «Скачивание файлов» для GitHub RU Studio.
 *
 * <p>Объект отдаётся в JavaScript под именем {@code window.Studio} и умеет:
 * <ul>
 *     <li>сохранять текст/Base64 в «Загрузки» (MediaStore, API 29+; публичная папка на API 28);</li>
 *     <li>скачивать файл по ссылке через системный DownloadManager (с уведомлением);</li>
 *     <li>открывать файл с устройства в редакторе (SAF, без разрешений);</li>
 *     <li>«Сохранить как» — SAF-диалог выбора места;</li>
 *     <li>делиться текстом через системное «Поделиться»;</li>
 *     <li>показывать список скачанного и открывать/удалять файлы;</li>
 *     <li>считать SHA-256, отдавать информацию об устройстве и версии приложения.</li>
 * </ul>
 *
 * <p>Все методы возвращают строку: {@code ok:<текст>} или {@code err:<причина>},
 * поэтому JavaScript всегда может показать понятный результат. Методы вызываются
 * в потоке JS-моста, поэтому UI-действия уходят через {@link MainActivity#runOnUiThread}.
 */
public final class StudioFiles {

    private static final String TAG = "StudioFiles";
    /** Подпапка в «Загрузках», чтобы файлы студии не смешивались с остальными. */
    static final String FOLDER = "GitHub RU Studio";

    private final MainActivity activity;

    StudioFiles(MainActivity activity) {
        this.activity = activity;
    }

    // ------------------------------------------------------------------ Инфо

    @JavascriptInterface
    public String deviceInfo() {
        return "Android " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + ") • "
                + String.join(", ", Build.SUPPORTED_ABIS) + " • " + Build.MANUFACTURER + " " + Build.MODEL
                + " • WebView " + webViewVersion();
    }

    @JavascriptInterface
    public String appInfo() {
        JSONObject o = new JSONObject();
        try {
            PackageInfo pi = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            o.put("versionName", pi.versionName);
            o.put("versionCode", pi.getLongVersionCode());
            o.put("package", activity.getPackageName());
            o.put("sdk", Build.VERSION.SDK_INT);
            o.put("abis", String.join(",", Build.SUPPORTED_ABIS));
            o.put("nodeReady", activity.nodeStateName());
            o.put("nodeVersion", activity.nodeVersion());
            o.put("theme", activity.currentThemeName());
            o.put("downloadsFolder", Build.VERSION.SDK_INT >= 29
                    ? "Download/" + FOLDER
                    : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                    + "/" + FOLDER);
        } catch (Exception e) {
            return "err:" + e;
        }
        return o.toString();
    }

    @JavascriptInterface
    public void toast(String message) {
        activity.toastOnUi(message);
    }

    @JavascriptInterface
    public String sha256(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest((text == null ? "" : text).getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(Character.forDigit((b >> 4) & 0xF, 16));
                sb.append(Character.forDigit(b & 0xF, 16));
            }
            return "ok:" + sb;
        } catch (Exception e) {
            return "err:" + e;
        }
    }

    // ------------------------------------------------------- Сохранение файлов

    /** Сохраняет текст в «Загрузки» (папка {@value #FOLDER}). */
    @JavascriptInterface
    public String saveText(String name, String text) {
        return writeToDownloads(safeName(name), (text == null ? "" : text).getBytes(java.nio.charset.StandardCharsets.UTF_8),
                mimeFromName(name));
    }

    /** Сохраняет бинарные данные, переданные из JS в base64. */
    @JavascriptInterface
    public String saveBase64(String name, String base64, String mime) {
        try {
            byte[] data = Base64.decode(base64 == null ? "" : base64, Base64.DEFAULT);
            return writeToDownloads(safeName(name), data, mime == null || mime.isEmpty() ? mimeFromName(name) : mime);
        } catch (Exception e) {
            return "err:base64: " + e.getMessage();
        }
    }

    /** Скачивает файл по ссылке системным DownloadManager (прогресс + уведомление). */
    @JavascriptInterface
    public String downloadUrl(String url, String name) {
        if (url == null || url.isEmpty()) {
            return "err:пустая ссылка";
        }
        if (url.startsWith("file://")) {
            try {
                File src = new File(Uri.parse(url).getPath());
                byte[] data = new byte[(int) src.length()];
                try (InputStream in = new java.io.FileInputStream(src)) {
                    int off = 0;
                    while (off < data.length) {
                        int read = in.read(data, off, data.length - off);
                        if (read <= 0) {
                            break;
                        }
                        off += read;
                    }
                }
                return writeToDownloads(safeName(name != null ? name : src.getName()), data, mimeFromName(src.getName()));
            } catch (Exception e) {
                return "err:" + e.getMessage();
            }
        }
        if (url.startsWith("data:")) {
            try {
                int comma = url.indexOf(',');
                String meta = url.substring(5, comma);
                String payload = url.substring(comma + 1);
                String mime = meta.split(";")[0];
                byte[] data = meta.endsWith(";base64")
                        ? Base64.decode(payload, Base64.DEFAULT)
                        : Uri.decode(payload).getBytes(java.nio.charset.StandardCharsets.UTF_8);
                return writeToDownloads(safeName(name), data, mime);
            } catch (Exception e) {
                return "err:" + e.getMessage();
            }
        }
        if (!(url.startsWith("http://") || url.startsWith("https://"))) {
            return "err:поддерживаются http, https, data и file ссылки";
        }
        activity.requestNotificationPermissionIfNeeded();
        String out = activity.startSystemDownload(url, safeName(name), mimeFromName(name));
        return out;
    }

    /** Открывает нативный диалог выбора файла — содержимое придёт в редактор. */
    @JavascriptInterface
    public void openTextFile() {
        activity.runOnUiThread(activity::launchOpenDocument);
    }

    /** «Сохранить как»: системный диалог выбора места и имени файла. */
    @JavascriptInterface
    public void saveTextAs(String name, String text) {
        activity.runOnUiThread(() -> activity.launchCreateDocument(safeName(name), text == null ? "" : text));
    }

    @JavascriptInterface
    public void share(String name, String text) {
        activity.runOnUiThread(() -> activity.shareText(safeName(name), text == null ? "" : text));
    }

    // ----------------------------------------------------------- Список файлов

    /** JSON-массив скачанных файлов студии: name, size, date, uri. */
    @JavascriptInterface
    public String listDownloads() {
        JSONArray arr = new JSONArray();
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                ContentResolver cr = activity.getContentResolver();
                String[] projection = {
                        MediaStore.Downloads._ID,
                        MediaStore.Downloads.DISPLAY_NAME,
                        MediaStore.Downloads.SIZE,
                        MediaStore.Downloads.DATE_MODIFIED,
                };
                String selection = MediaStore.Downloads.RELATIVE_PATH + " LIKE ?";
                String[] args = {"%" + FOLDER + "%"};
                try (android.database.Cursor c = cr.query(MediaStore.Downloads.EXTERNAL_CONTENT_URI,
                        projection, selection, args, MediaStore.Downloads.DATE_MODIFIED + " DESC")) {
                    if (c != null) {
                        while (c.moveToNext() && arr.length() < 200) {
                            JSONObject o = new JSONObject();
                            long id = c.getLong(0);
                            o.put("name", c.getString(1));
                            o.put("size", c.getLong(2));
                            o.put("date", c.getLong(3) * 1000L);
                            o.put("uri", Uri.withAppendedPath(MediaStore.Downloads.EXTERNAL_CONTENT_URI,
                                    String.valueOf(id)).toString());
                            arr.put(o);
                        }
                    }
                }
            } else {
                File dir = new File(Environment.getExternalStoragePublicDirectory(
                        Environment.DIRECTORY_DOWNLOADS), FOLDER);
                File[] files = dir.listFiles();
                if (files != null) {
                    for (File f : files) {
                        if (arr.length() >= 200) {
                            break;
                        }
                        JSONObject o = new JSONObject();
                        o.put("name", f.getName());
                        o.put("size", f.length());
                        o.put("date", f.lastModified());
                        o.put("uri", Uri.fromFile(f).toString());
                        arr.put(o);
                    }
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "listDownloads", e);
            return "err:" + e.getMessage();
        }
        return arr.toString();
    }

    /** Открывает сохранённый файл системным просмотрщиком. */
    @JavascriptInterface
    public String openDownloaded(String uri, String mime) {
        return activity.openContent(Uri.parse(uri), mime);
    }

    /** Удаляет сохранённый файл. */
    @JavascriptInterface
    public String deleteDownloaded(String uri) {
        try {
            activity.getContentResolver().delete(Uri.parse(uri), null, null);
            return "ok:удалено";
        } catch (Exception e) {
            return "err:" + e.getMessage();
        }
    }

    @JavascriptInterface
    public String formattedDate(long millis) {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()).format(new Date(millis));
    }

    // -------------------------------------------------------------- Внутреннее

    /**
     * Пишем в общую папку «Загрузки»: на Android 10+ через MediaStore (без разрешений),
     * на Android 9 — обычным файлом (разрешение спрашиваем заранее).
     */
    private String writeToDownloads(String name, byte[] data, String mime) {
        String safe = safeName(name);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues values = new ContentValues();
                values.put(MediaStore.Downloads.DISPLAY_NAME, safe);
                values.put(MediaStore.Downloads.MIME_TYPE, mime);
                values.put(MediaStore.Downloads.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS + "/" + FOLDER);
                values.put(MediaStore.Downloads.IS_PENDING, 1);
                Uri uri = activity.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, values);
                if (uri == null) {
                    return "err:MediaStore отказал в создании файла";
                }
                try (OutputStream out = activity.getContentResolver().openOutputStream(uri)) {
                    if (out == null) {
                        return "err:нет потока записи";
                    }
                    out.write(data);
                    out.flush();
                }
                values.clear();
                values.put(MediaStore.Downloads.IS_PENDING, 0);
                activity.getContentResolver().update(uri, values, null, null);
                return "ok:" + Environment.DIRECTORY_DOWNLOADS + "/" + FOLDER + "/" + safe;
            }

            if (!activity.ensureStoragePermission()) {
                return "err:нужно разрешение на запись (Android 9) — разрешите и повторите";
            }
            File dir = new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_DOWNLOADS), FOLDER);
            if (!dir.isDirectory() && !dir.mkdirs()) {
                return "err:не удалось создать папку " + dir;
            }
            File out = new File(dir, safe);
            try (FileOutputStream fos = new FileOutputStream(out)) {
                fos.write(data);
                fos.flush();
            }
            activity.scanFile(out);
            return "ok:" + out.getAbsolutePath();
        } catch (Exception e) {
            Log.w(TAG, "writeToDownloads", e);
            return "err:" + e.getMessage();
        }
    }

    static String safeName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "studio-" + System.currentTimeMillis() + ".txt";
        }
        String clean = name.trim().replace('/', '_').replace('\\', '_').replace(':', '_');
        if (clean.length() > 96) {
            String ext = "";
            int dot = clean.lastIndexOf('.');
            if (dot > 0) {
                ext = clean.substring(dot);
                clean = clean.substring(0, dot);
            }
            clean = clean.substring(0, Math.max(1, 96 - ext.length())) + ext;
        }
        return clean;
    }

    static String mimeFromName(String name) {
        String n = name == null ? "" : name.toLowerCase(Locale.ROOT);
        if (n.endsWith(".json")) return "application/json";
        if (n.endsWith(".html") || n.endsWith(".htm")) return "text/html";
        if (n.endsWith(".css")) return "text/css";
        if (n.endsWith(".js") || n.endsWith(".mjs") || n.endsWith(".jsx")) return "text/javascript";
        if (n.endsWith(".ts") || n.endsWith(".tsx")) return "text/typescript";
        if (n.endsWith(".md")) return "text/markdown";
        if (n.endsWith(".xml")) return "text/xml";
        if (n.endsWith(".yml") || n.endsWith(".yaml")) return "text/yaml";
        if (n.endsWith(".svg")) return "image/svg+xml";
        if (n.endsWith(".png")) return "image/png";
        if (n.endsWith(".jpg") || n.endsWith(".jpeg")) return "image/jpeg";
        if (n.endsWith(".gif")) return "image/gif";
        if (n.endsWith(".webp")) return "image/webp";
        if (n.endsWith(".pdf")) return "application/pdf";
        if (n.endsWith(".zip")) return "application/zip";
        if (n.endsWith(".apk")) return "application/vnd.android.package-archive";
        return "text/plain";
    }

    private static String webViewVersion() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo pi = android.webkit.WebView.getCurrentWebViewPackage();
                return pi == null ? "?" : pi.versionName;
            }
        } catch (Throwable ignored) {
        }
        return "?";
    }

    /** Служебный список для диагностики (используется экраном «О приложении»). */
    static List<String> featureList() {
        List<String> list = new ArrayList<>();
        list.add("Скачивание файлов: ссылка, текст редактора, Base64, «Сохранить как»");
        list.add("Редактор: нумерация строк, подсветка, поиск/замена, форматирование, минификация");
        list.add("Инструменты: JSON, Base64, URL, SHA-256, регистр, статистика текста");
        list.add("Node.js-консоль офлайн (если движок встроен в сборку)");
        return list;
    }
}

package com.github.rudroid.studio.node;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Встроенный ОФЛАЙН Node.js (Node 24, libnode.so + JNI-мост).
 *
 * <p>Архитектура: нативный поток вызывает node::Start() с нашим
 * assets/nodejs/server.js. Скрипт поднимает HTTP-сервер ТОЛЬКО на 127.0.0.1
 * (случайный порт, записывается в port.txt) и выполняет JS по POST /eval.
 * Интернет не нужен вообще — всё внутри устройства.
 *
 * <p>Если libnode.so нет в APK (сборка без скачивания Node.js) — движок
 * переходит в состояние UNAVAILABLE с понятным текстом, приложение живёт дальше.
 */
public final class NodeEngine {

    private static final String TAG = "NodeEngine";

    /** Состояние движка. */
    public enum State {
        IDLE, STARTING, READY, FAILED, UNAVAILABLE
    }

    /** Результат выполнения JS. */
    public static final class EvalResult {
        public final boolean ok;
        public final String text;

        public EvalResult(boolean ok, String text) {
            this.ok = ok;
            this.text = text;
        }
    }

    public interface Listener {
        void onState(State state, String status);
    }

    private static final ExecutorService IO = Executors.newCachedThreadPool();
    private static volatile State state = State.IDLE;
    private static volatile String status = "Не запущен";
    private static volatile int port = -1;
    private static volatile String nodeVersion = "";
    private static volatile Listener listener;

    private NodeEngine() {
    }

    public static State getState() {
        return state;
    }

    public static String getStatus() {
        return status;
    }

    public static int getPort() {
        return port;
    }

    public static String getNodeVersion() {
        return nodeVersion;
    }

    public static void setListener(Listener l) {
        listener = l;
        if (l != null) {
            l.onState(state, status);
        }
    }

    private static void emit(State s, String st) {
        state = s;
        status = st;
        Listener l = listener;
        if (l != null) {
            l.onState(s, st);
        }
    }

    /** Запускает Node.js один раз (повторные вызовы игнорируются). */
    public static synchronized void ensureStarted(Context context) {
        if (state == State.STARTING || state == State.READY) {
            return;
        }
        emit(State.STARTING, "Запуск встроенного Node.js…");
        final Context app = context.getApplicationContext();
        IO.execute(() -> boot(app));
    }

    private static void boot(Context context) {
        try {
            File home = new File(context.getFilesDir(), "nodejs");
            File cache = new File(context.getCacheDir(), "nodejs");
            // noinspection ResultOfMethodCallIgnored
            home.mkdirs();
            // noinspection ResultOfMethodCallIgnored
            cache.mkdirs();

            // Кладём стартовые скрипты из assets рядом с данными.
            copyAssetDir(context.getAssets(), "nodejs", home);

            File portFile = new File(home, "port.txt");
            // noinspection ResultOfMethodCallIgnored
            portFile.delete();

            int rc;
            try {
                System.loadLibrary("nodestarter");
            } catch (UnsatisfiedLinkError e) {
                Log.w(TAG, "nodestarter отсутствует", e);
                emit(State.UNAVAILABLE,
                        "Node.js не встроен в этот APK (нет нативного моста). " +
                                "Пересоберите проект с интернетом.");
                return;
            }
            try {
                rc = nativeStart(home.getAbsolutePath(), cache.getAbsolutePath());
            } catch (UnsatisfiedLinkError e) {
                Log.w(TAG, "nativeStart отсутствует", e);
                emit(State.UNAVAILABLE,
                        "Node.js не встроен в этот APK (нет libnode.so). " +
                                "Пересоберите проект с интернетом.");
                return;
            }
            if (rc == 2) {
                emit(State.UNAVAILABLE,
                        "Node.js не встроен в этот APK (сборка-заглушка без libnode.so). " +
                                "Пересоберите проект с интернетом.");
                return;
            }
            if (rc != 0) {
                emit(State.FAILED, "Нативный старт Node.js вернул код " + rc);
                return;
            }

            // Ждём, пока server.js запишет порт (до 60 секунд).
            long deadline = System.currentTimeMillis() + 60_000;
            while (System.currentTimeMillis() < deadline && !portFile.isFile()) {
                try {
                    Thread.sleep(150);
                } catch (InterruptedException ignored) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            if (!portFile.isFile()) {
                emit(State.FAILED,
                        "Node.js запустился, но не поднял локальный сервер за 60 c. " +
                                "Смотрите logcat (тег node).");
                return;
            }
            String raw = readFile(portFile).trim();
            port = Integer.parseInt(raw);

            // Проверяем /info.
            String info = httpGet("http://127.0.0.1:" + port + "/info", 10_000);
            nodeVersion = extractJsonString(info, "node");
            if (nodeVersion.isEmpty()) {
                nodeVersion = "запущен";
            }
            emit(State.READY, "Node.js " + nodeVersion + " готов (офлайн, 127.0.0.1:" + port + ")");
            Log.i(TAG, "Node READY: " + info);
        } catch (Exception e) {
            Log.e(TAG, "Ошибка запуска Node.js", e);
            emit(State.FAILED, "Ошибка запуска Node.js: " + e.getMessage());
        }
    }

    /** Выполняет JS-код во встроенном Node.js (фон, результат — в колбэк). */
    public static void evalAsync(String code, Listener2 callback) {
        final String src = code == null ? "" : code;
        IO.execute(() -> callback.onResult(eval(src)));
    }

    /** Синхронный вызов (только из фонового потока!). */
    public static EvalResult eval(String code) {
        if (state != State.READY || port <= 0) {
            return new EvalResult(false, "Node.js не готов: " + status);
        }
        try {
            String body = "{\"code\":" + jsonQuote(code) + "}";
            String resp = httpPost("http://127.0.0.1:" + port + "/eval", body, 15_000);
            if (resp.contains("\"ok\":true")) {
                return new EvalResult(true, extractJsonString(resp, "result"));
            }
            return new EvalResult(false, extractJsonString(resp, "error"));
        } catch (Exception e) {
            return new EvalResult(false, "Ошибка связи с Node.js: " + e.getMessage());
        }
    }

    public interface Listener2 {
        void onResult(EvalResult result);
    }

    // ------------------------------------------------------------------ HTTP

    private static String httpGet(String url, int timeoutMs) throws Exception {
        HttpURLConnection c = (HttpURLConnection) new URL(url).openConnection();
        c.setConnectTimeout(timeoutMs);
        c.setReadTimeout(timeoutMs);
        c.setRequestMethod("GET");
        try (InputStream in = c.getInputStream()) {
            return readAll(in);
        } finally {
            c.disconnect();
        }
    }

    private static String httpPost(String url, String json, int timeoutMs) throws Exception {
        byte[] data = json.getBytes(StandardCharsets.UTF_8);
        HttpURLConnection c = (HttpURLConnection) new URL(url).openConnection();
        c.setConnectTimeout(timeoutMs);
        c.setReadTimeout(timeoutMs);
        c.setRequestMethod("POST");
        c.setDoOutput(true);
        c.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        c.setFixedLengthStreamingMode(data.length);
        try (OutputStream out = c.getOutputStream()) {
            out.write(data);
        }
        try (InputStream in = c.getInputStream()) {
            return readAll(in);
        } finally {
            c.disconnect();
        }
    }

    // -------------------------------------------------------------- Утилиты

    private static void copyAssetDir(AssetManager assets, String assetPath, File destDir) throws Exception {
        String[] list = assets.list(assetPath);
        if (list == null) {
            return;
        }
        for (String name : list) {
            String sub = assetPath.isEmpty() ? name : assetPath + "/" + name;
            String[] subList = assets.list(sub);
            File out = new File(destDir, name);
            if (subList != null && subList.length > 0) {
                // noinspection ResultOfMethodCallIgnored
                out.mkdirs();
                copyAssetDir(assets, sub, out);
            } else {
                try (InputStream in = assets.open(sub);
                     OutputStream fileOut = new FileOutputStream(out)) {
                    byte[] buf = new byte[32768];
                    int n;
                    while ((n = in.read(buf)) > 0) {
                        fileOut.write(buf, 0, n);
                    }
                }
            }
        }
    }

    private static String readFile(File f) throws Exception {
        try (InputStream in = new FileInputStream(f)) {
            return readAll(in);
        }
    }

    private static String readAll(InputStream in) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[32768];
        int n;
        while ((n = in.read(buf)) > 0) {
            bos.write(buf, 0, n);
        }
        return bos.toString("UTF-8");
    }

    /** Мини-парсер JSON-строки {"key":"value"} без зависимостей. */
    private static String extractJsonString(String json, String key) {
        if (json == null) {
            return "";
        }
        String needle = "\"" + key + "\":\"";
        int i = json.indexOf(needle);
        if (i < 0) {
            // Может быть не строка, а число/объект — вернём сырое значение.
            String needle2 = "\"" + key + "\":";
            int j = json.indexOf(needle2);
            if (j < 0) {
                return "";
            }
            int start = j + needle2.length();
            int end = start;
            int depth = 0;
            boolean inStr = false;
            while (end < json.length()) {
                char ch = json.charAt(end);
                if (inStr) {
                    if (ch == '\\') {
                        end += 2;
                        continue;
                    }
                    if (ch == '"') {
                        inStr = false;
                    }
                } else {
                    if (ch == '"') {
                        inStr = true;
                    } else if (ch == '{' || ch == '[') {
                        depth++;
                    } else if (ch == '}' || ch == ']') {
                        if (depth == 0) {
                            break;
                        }
                        depth--;
                    } else if (ch == ',' && depth == 0) {
                        break;
                    }
                }
                end++;
            }
            return json.substring(start, end).trim();
        }
        StringBuilder sb = new StringBuilder();
        int k = i + needle.length();
        while (k < json.length()) {
            char ch = json.charAt(k);
            if (ch == '\\' && k + 1 < json.length()) {
                char next = json.charAt(k + 1);
                switch (next) {
                    case 'n':
                        sb.append('\n');
                        break;
                    case 't':
                        sb.append('\t');
                        break;
                    case 'r':
                        sb.append('\r');
                        break;
                    case 'u':
                        if (k + 5 < json.length()) {
                            try {
                                sb.append((char) Integer.parseInt(json.substring(k + 2, k + 6), 16));
                            } catch (NumberFormatException ignored) {
                                sb.append("\\u");
                            }
                            k += 4;
                        }
                        break;
                    default:
                        sb.append(next);
                        break;
                }
                k += 2;
            } else if (ch == '"') {
                break;
            } else {
                sb.append(ch);
                k++;
            }
        }
        return sb.toString();
    }

    private static String jsonQuote(String s) {
        if (s == null) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '"':
                    sb.append("\\\"");
                    break;
                case '\\':
                    sb.append("\\\\");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                default:
                    if (ch < 0x20) {
                        sb.append(String.format("\\u%04x", (int) ch));
                    } else {
                        sb.append(ch);
                    }
                    break;
            }
        }
        return sb.append("\"").toString();
    }

    /** Диагностика для экрана «Node.js». */
    public static String deviceInfo() {
        return "Android " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + "), "
                + Build.SUPPORTED_ABIS.length + " ABI: " + String.join(", ", Build.SUPPORTED_ABIS);
    }

    /**
     * Нативный старт: поднимает фоновый поток с node::Start().
     *
     * @return 0 — поток запущен; 2 — сборка-заглушка без libnode.so.
     */
    private static native int nativeStart(String homeDir, String cacheDir);
}

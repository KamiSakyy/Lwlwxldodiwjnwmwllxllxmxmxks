package ru.webapk.studio;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.compose.ui.platform.ComposeView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.activity.ComponentActivity;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/** Compose Material 3 front end for static-site and embedded Python APK builds. */
public final class MainActivity extends ComponentActivity {
    private static final int PICK_HTML = 10;
    private static final int PICK_ZIP = 11;
    private static final int PICK_ICON = 12;
    private static final int SAVE_APK = 13;
    private static final int PICK_PYTHON_PROJECT = 16;
    private static final int REQUEST_INSTALL_SOURCE = 14;
    private static final int INSTALL_APK = 15;
    private static final int MAX_IMPORT_FILES = 10000;
    private static final long MAX_PYTHON_PROJECT_BYTES = 1024L * 1024L * 1024L;
    private static final ExecutorService IO = Executors.newSingleThreadExecutor();
    private StudioComposeUi composeUi;
    private volatile File siteRoot;
    private volatile File pythonProjectRoot;
    private volatile File iconFile;
    private volatile File generatedApk;
    private ActivityResultLauncher<Intent> activityResultLauncher;
    private int pendingActivityRequestCode = -1;
    private boolean pendingInstallAfterSourceAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> handleActivityResult(pendingActivityRequestCode, result.getResultCode(), result.getData()));
        enableEdgeToEdge();
        composeUi = new StudioComposeUi(this);

        if (savedInstanceState != null) {
            pendingInstallAfterSourceAccess = savedInstanceState.getBoolean("pendingInstallAfterSourceAccess", false);
            pendingActivityRequestCode = savedInstanceState.getInt("pendingActivityRequestCode", -1);
            siteRoot = existing(savedInstanceState.getString("siteRoot"));
            pythonProjectRoot = existing(savedInstanceState.getString("pythonProjectRoot"));
            iconFile = existing(savedInstanceState.getString("iconFile"));
            generatedApk = existing(savedInstanceState.getString("generatedApk"));
            composeUi.setAppNameValue(savedInstanceState.getString("appName", composeUi.getAppNameValue()));
            composeUi.setPackageIdValue(savedInstanceState.getString("packageId", composeUi.getPackageIdValue()));
            composeUi.setVersionCodeValue(savedInstanceState.getString("versionCode", composeUi.getVersionCodeValue()));
            composeUi.setAutoRotateValue(savedInstanceState.getBoolean("autoRotate", composeUi.getAutoRotateValue()));
            composeUi.setFullscreenValue(savedInstanceState.getBoolean("fullscreen", composeUi.getFullscreenValue()));
        } else {
            siteRoot = restoreSiteRoot();
            pythonProjectRoot = restorePythonProjectRoot();
            iconFile = existing(new File(getFilesDir(), "workspace/custom-icon.png").getAbsolutePath());
        }
        if (siteRoot == null) siteRoot = restoreSiteRoot();
        if (pythonProjectRoot == null) pythonProjectRoot = restorePythonProjectRoot();
        if (iconFile == null) {
            iconFile = existing(new File(getFilesDir(), "workspace/custom-icon.png").getAbsolutePath());
        }

        ComposeView composeView = new ComposeView(this);
        composeUi.install(composeView);
        setContentView(composeView);
        ViewCompat.requestApplyInsets(composeView);
        refreshImportedFiles();
        if (generatedApk != null) {
            composeUi.setStatus("APK готов · " + ApkBuilder.formatBytes(generatedApk.length()), false);
            composeUi.setSaveAvailable(true);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("siteRoot", siteRoot == null ? null : siteRoot.getAbsolutePath());
        outState.putString("pythonProjectRoot", pythonProjectRoot == null ? null : pythonProjectRoot.getAbsolutePath());
        outState.putString("iconFile", iconFile == null ? null : iconFile.getAbsolutePath());
        outState.putString("generatedApk", generatedApk == null ? null : generatedApk.getAbsolutePath());
        outState.putBoolean("pendingInstallAfterSourceAccess", pendingInstallAfterSourceAccess);
        outState.putInt("pendingActivityRequestCode", pendingActivityRequestCode);
        if (composeUi != null) {
            outState.putString("appName", composeUi.getAppNameValue());
            outState.putString("packageId", composeUi.getPackageIdValue());
            outState.putString("versionCode", composeUi.getVersionCodeValue());
            outState.putBoolean("autoRotate", composeUi.getAutoRotateValue());
            outState.putBoolean("fullscreen", composeUi.getFullscreenValue());
        }
    }

    private void enableEdgeToEdge() {
        Window window = getWindow();
        window.setStatusBarColor(Color.TRANSPARENT);
        window.setNavigationBarColor(Color.TRANSPARENT);
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        WindowInsetsControllerCompat bars = WindowCompat.getInsetsController(window, window.getDecorView());
        bars.setAppearanceLightStatusBars(false);
        bars.setAppearanceLightNavigationBars(false);
    }

    void openHtmlPicker() {
        openDocument(PICK_HTML, new String[]{"text/html", "application/xhtml+xml", "application/octet-stream"});
    }

    void openZipPicker() {
        openDocument(PICK_ZIP, new String[]{"application/zip", "application/x-zip-compressed",
                "application/octet-stream"});
    }

    void openPythonProjectPicker() {
        openDocument(PICK_PYTHON_PROJECT, new String[]{"application/zip", "application/x-zip-compressed",
                "application/octet-stream", "text/x-python", "text/plain"});
    }

    private void openDocument(int request, String[] mimeTypes) {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        launchActivityForResult(intent, request);
    }

    void openIconPicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("image/*");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        try {
            launchActivityForResult(Intent.createChooser(intent, "Выберите фото из галереи"), PICK_ICON);
        } catch (Exception unavailable) {
            Intent fallback = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            fallback.addCategory(Intent.CATEGORY_OPENABLE);
            fallback.setType("image/*");
            fallback.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            launchActivityForResult(fallback, PICK_ICON);
        }
    }

    void clearProject() {
        hideKeyboard();
        siteRoot = null;
        generatedApk = null;
        getPreferences(MODE_PRIVATE).edit().remove("siteRoot").apply();
        composeUi.setProjectSummary("Файл ещё не выбран");
        composeUi.setSaveAvailable(false);
        setStatus("Очищаю выбранный проект…", true);
        IO.execute(() -> {
            try {
                clearDirectory(new File(getFilesDir(), "workspace/site"));
                clearDirectory(new File(getCacheDir(), "webapk-build"));
                siteRoot = null;
                getPreferences(MODE_PRIVATE).edit().remove("siteRoot").apply();
                generatedApk = null;
                runOnUiThread(() -> {
                    composeUi.setProjectSummary("Файл ещё не выбран");
                    composeUi.setBuildProgress(0f, "");
                    setStatus("Проект удалён с устройства", false);
                });
            } catch (Exception error) {
                showFailure("Не удалось очистить проект: " + error.getMessage());
            }
        });
    }

    void clearPythonProject() {
        pythonProjectRoot = null;
        generatedApk = null;
        getPreferences(MODE_PRIVATE).edit().remove("pythonProjectRoot").apply();
        composeUi.setPythonProjectSummary("Python-проект не выбран");
        composeUi.setSaveAvailable(false);
        IO.execute(() -> {
            try {
                clearDirectory(new File(getFilesDir(), "workspace/python-project"));
                runOnUiThread(() -> setStatus("Python-проект удалён с устройства", false));
            } catch (Exception error) {
                showFailure("Не удалось очистить Python-проект: " + error.getMessage());
            }
        });
    }

    private void beginProjectImport() {
        siteRoot = null;
        generatedApk = null;
        getPreferences(MODE_PRIVATE).edit().remove("siteRoot").apply();
        composeUi.setProjectSummary("Файл ещё не выбран");
        composeUi.setSaveAvailable(false);
    }

    private void launchActivityForResult(Intent intent, int requestCode) {
        pendingActivityRequestCode = requestCode;
        if (activityResultLauncher == null) throw new IllegalStateException("Android result launcher is not ready.");
        activityResultLauncher.launch(intent);
    }

    private void handleActivityResult(int requestCode, int resultCode, Intent data) {
        pendingActivityRequestCode = -1;
        if (requestCode == REQUEST_INSTALL_SOURCE) {
            boolean retry = pendingInstallAfterSourceAccess;
            pendingInstallAfterSourceAccess = false;
            if (retry && Build.VERSION.SDK_INT >= 26 && getPackageManager().canRequestPackageInstalls()) {
                installGeneratedApk();
            } else if (retry) {
                setStatus("Разрешите установку приложений для Web APK Studio в настройках Android.", false);
            }
            return;
        }
        if (requestCode == INSTALL_APK) {
            if (resultCode == RESULT_OK) {
                setStatus("Установка приложения завершена", false);
                Toast.makeText(this, "APK установлен", Toast.LENGTH_LONG).show();
            } else {
                setStatus("Установка отменена или отклонена Android", false);
            }
            return;
        }
        if (resultCode != RESULT_OK || data == null) return;
        Uri uri = data.getData();
        if (uri == null && data.getClipData() != null && data.getClipData().getItemCount() > 0) {
            uri = data.getClipData().getItemAt(0).getUri();
        }
        if (uri == null) return;
        if (requestCode == PICK_HTML) importHtml(uri);
        else if (requestCode == PICK_ZIP) importZip(uri);
        else if (requestCode == PICK_PYTHON_PROJECT) importPythonProject(uri);
        else if (requestCode == PICK_ICON) importIcon(uri);
        else if (requestCode == SAVE_APK) saveApk(uri);
    }

    private void importHtml(Uri uri) {
        beginProjectImport();
        setStatus("Копирую HTML…", true);
        IO.execute(() -> {
            try {
                clearDirectory(new File(getCacheDir(), "webapk-build"));
                File root = new File(getFilesDir(), "workspace/site");
                clearDirectory(root);
                if (!root.exists() && !root.mkdirs()) throw new IOException("Не удалось создать папку сайта.");
                File target = new File(root, "index.html");
                long size;
                InputStream opened = getContentResolver().openInputStream(uri);
                if (opened == null) throw new IOException("Не удалось открыть выбранный HTML-файл.");
                try (InputStream input = new BufferedInputStream(opened);
                     OutputStream output = new BufferedOutputStream(new FileOutputStream(target))) {
                    size = copyStream(input, output);
                }
                if (size == 0) throw new IOException("Выбранный HTML-файл пуст.");
                siteRoot = root;
                getPreferences(MODE_PRIVATE).edit().putString("siteRoot", root.getAbsolutePath()).apply();
                generatedApk = null;
                runOnUiThread(() -> {
                    composeUi.setProjectSummary("HTML · index.html · " + ApkBuilder.formatBytes(size));
                    setStatus("HTML скопирован в память приложения", false);
                });
            } catch (Exception error) {
                showFailure("Не удалось импортировать HTML: " + error.getMessage());
            }
        });
    }

    private void importZip(Uri uri) {
        beginProjectImport();
        setStatus("Безопасно распаковываю ZIP…", true);
        IO.execute(() -> {
            try {
                clearDirectory(new File(getCacheDir(), "webapk-build"));
                File root = new File(getFilesDir(), "workspace/site");
                clearDirectory(root);
                if (!root.exists() && !root.mkdirs()) throw new IOException("Не удалось создать папку сайта.");
                List<String> indexPaths = new ArrayList<>();
                int files = 0;
                long total = 0;
                InputStream opened = getContentResolver().openInputStream(uri);
                if (opened == null) throw new IOException("Не удалось открыть ZIP-файл.");
                try (ZipInputStream zip = new ZipInputStream(new BufferedInputStream(opened))) {
                    ZipEntry entry;
                    byte[] buffer = new byte[8192];
                    while ((entry = zip.getNextEntry()) != null) {
                        String relative = normalizeZipPath(entry.getName());
                        if (relative.isEmpty()) {
                            zip.closeEntry();
                            continue;
                        }
                        File target = new File(root, relative);
                        String basePath = root.getCanonicalPath();
                        String targetPath = target.getCanonicalPath();
                        if (!targetPath.startsWith(basePath + File.separator)) {
                            throw new IOException("В ZIP найден опасный путь за пределы проекта.");
                        }
                        if (entry.isDirectory()) {
                            if (!target.exists() && !target.mkdirs()) throw new IOException("Не удалось создать папку сайта.");
                        } else {
                            File parent = target.getParentFile();
                            if (parent != null && !parent.exists() && !parent.mkdirs()) {
                                throw new IOException("Не удалось распаковать папку сайта.");
                            }
                            if (target.exists()) throw new IOException("В ZIP повторяется файл: " + relative);
                            try (OutputStream output = new BufferedOutputStream(new FileOutputStream(target))) {
                                int read;
                                while ((read = zip.read(buffer)) != -1) {
                                    total += read;
                                    output.write(buffer, 0, read);
                                }
                            }
                            files++;
                            if (files > MAX_IMPORT_FILES) throw new IOException("В ZIP больше 10 000 файлов.");
                            if (relative.substring(relative.lastIndexOf('/') + 1).equalsIgnoreCase("index.html")) {
                                indexPaths.add(relative);
                            }
                        }
                        zip.closeEntry();
                    }
                }
                if (indexPaths.isEmpty()) throw new IOException("В ZIP не найден index.html.");
                String selectedIndex = null;
                for (String candidate : indexPaths) {
                    if (candidate.equals("index.html")) {
                        selectedIndex = candidate;
                        break;
                    }
                }
                if (selectedIndex == null) {
                    if (indexPaths.size() != 1) {
                        throw new IOException("В ZIP несколько index.html. Оставьте один в корне сайта.");
                    }
                    selectedIndex = indexPaths.get(0);
                }
                int slash = selectedIndex.lastIndexOf('/');
                File actualRoot = slash < 0 ? root : new File(root, selectedIndex.substring(0, slash));
                File originalIndex = new File(root, selectedIndex);
                File normalizedIndex = new File(actualRoot, "index.html");
                if (!originalIndex.equals(normalizedIndex)) {
                    if (normalizedIndex.exists() || !originalIndex.renameTo(normalizedIndex)) {
                        throw new IOException("Не удалось привести имя стартового файла к index.html.");
                    }
                }
                siteRoot = actualRoot;
                getPreferences(MODE_PRIVATE).edit().putString("siteRoot", actualRoot.getAbsolutePath()).apply();
                generatedApk = null;
                int fileCount = files;
                long unpacked = total;
                runOnUiThread(() -> {
                    composeUi.setProjectSummary("ZIP · " + fileCount + " файлов · "
                            + ApkBuilder.formatBytes(unpacked));
                    setStatus("Проект распакован офлайн", false);
                });
            } catch (Exception error) {
                showFailure("Не удалось распаковать ZIP: " + error.getMessage());
            }
        });
    }

    private void importPythonProject(Uri uri) {
        pythonProjectRoot = null;
        generatedApk = null;
        composeUi.setPythonProjectSummary("Импорт Python-проекта…");
        composeUi.setSaveAvailable(false);
        setStatus("Импортирую Python/Flask проект офлайн…", true);
        IO.execute(() -> {
            File workspaceRoot = new File(getFilesDir(), "workspace/python-project");
            File root = workspaceRoot;
            try {
                clearDirectory(workspaceRoot);
                if (!root.exists() && !root.mkdirs()) throw new IOException("Не удалось создать папку проекта.");
                String displayName = getDisplayName(uri);
                if (displayName.toLowerCase(java.util.Locale.ROOT).endsWith(".py")) {
                    File target = new File(root, "app.py");
                    InputStream opened = getContentResolver().openInputStream(uri);
                    if (opened == null) throw new IOException("Не удалось открыть Python-файл.");
                    long total;
                    try (InputStream input = new BufferedInputStream(opened);
                         OutputStream output = new BufferedOutputStream(new FileOutputStream(target))) {
                        total = copyStreamLimited(input, output, MAX_PYTHON_PROJECT_BYTES);
                    }
                    if (total == 0) throw new IOException("Python-файл пуст.");
                    if (total > MAX_PYTHON_PROJECT_BYTES) throw new IOException("Python-проект слишком большой.");
                } else if (displayName.toLowerCase(java.util.Locale.ROOT).endsWith(".zip")) {
                    int files = 0;
                    int entries = 0;
                    long total = 0;
                    InputStream opened = getContentResolver().openInputStream(uri);
                    if (opened == null) throw new IOException("Не удалось открыть ZIP-проект.");
                    try (ZipInputStream zip = new ZipInputStream(new BufferedInputStream(opened))) {
                        ZipEntry entry;
                        byte[] buffer = new byte[16 * 1024];
                        while ((entry = zip.getNextEntry()) != null) {
                            if (++entries > MAX_IMPORT_FILES * 2) {
                                throw new IOException("В ZIP слишком много файловых и папочных записей.");
                            }
                            String relative = normalizeZipPath(entry.getName());
                            if (relative.isEmpty() || isPythonArchiveMetadata(relative)) {
                                zip.closeEntry();
                                continue;
                            }
                            File target = new File(root, relative);
                            String basePath = root.getCanonicalPath();
                            String targetPath = target.getCanonicalPath();
                            if (!targetPath.startsWith(basePath + File.separator)) {
                                throw new IOException("В ZIP найден путь за пределами проекта.");
                            }
                            if (entry.isDirectory()) {
                                if (!target.exists() && !target.mkdirs()) throw new IOException("Не удалось создать папку проекта.");
                            } else {
                                File parent = target.getParentFile();
                                if (parent != null && !parent.exists() && !parent.mkdirs()) {
                                    throw new IOException("Не удалось распаковать папку проекта.");
                                }
                                if (target.exists()) throw new IOException("В ZIP повторяется путь: " + relative);
                                try (OutputStream output = new BufferedOutputStream(new FileOutputStream(target))) {
                                    int read;
                                    while ((read = zip.read(buffer)) != -1) {
                                        total += read;
                                        if (total > MAX_PYTHON_PROJECT_BYTES) {
                                            throw new IOException("Распакованный Python-проект превышает 1 ГБ.");
                                        }
                                        output.write(buffer, 0, read);
                                    }
                                }
                                files++;
                                if (files > MAX_IMPORT_FILES) throw new IOException("В ZIP больше 10 000 файлов.");
                            }
                            zip.closeEntry();
                        }
                    }
                    root = selectPythonProjectRoot(root);
                    if (!containsPythonSource(root)) {
                        throw new IOException("В архиве не найден Python-файл (.py). Проверьте содержимое ZIP.");
                    }
                } else {
                    throw new IOException("Выберите Python-файл .py или ZIP проекта.");
                }

                pythonProjectRoot = root;
                getPreferences(MODE_PRIVATE).edit().putString("pythonProjectRoot", root.getAbsolutePath()).apply();
                generatedApk = null;
                File finalRoot = root;
                runOnUiThread(() -> {
                    composeUi.setPythonProjectSummary("Python · " + countFiles(finalRoot) + " файлов");
                    setStatus("Python-проект импортирован без сети", false);
                });
            } catch (Exception error) {
                clearDirectory(workspaceRoot);
                pythonProjectRoot = null;
                getPreferences(MODE_PRIVATE).edit().remove("pythonProjectRoot").apply();
                showFailure("Не удалось импортировать Python-проект: " + error.getMessage());
                runOnUiThread(() -> composeUi.setPythonProjectSummary("Python-проект не выбран"));
            }
        });
    }

    private String getDisplayName(Uri uri) {
        try (android.database.Cursor cursor = getContentResolver().query(uri,
                new String[]{android.provider.OpenableColumns.DISPLAY_NAME}, null, null, null)) {
            if (cursor != null && cursor.moveToFirst()) {
                int index = cursor.getColumnIndex(android.provider.OpenableColumns.DISPLAY_NAME);
                if (index >= 0) return cursor.getString(index);
            }
        } catch (Exception ignored) { }
        return uri.getLastPathSegment() == null ? "project.zip" : uri.getLastPathSegment();
    }

    private File selectPythonProjectRoot(File root) {
        File selected = root;
        while (true) {
            File[] children = selected.listFiles();
            if (children == null) return selected;
            File onlyDirectory = null;
            boolean hasOtherContent = false;
            for (File child : children) {
                if (isPythonArchiveMetadata(child.getName())) continue;
                if (!child.isDirectory() || onlyDirectory != null) {
                    hasOtherContent = true;
                    break;
                }
                onlyDirectory = child;
            }
            if (hasOtherContent || onlyDirectory == null) return selected;
            selected = onlyDirectory;
        }
    }

    private boolean isPythonArchiveMetadata(String relative) {
        String[] parts = relative.replace('\\', '/').split("/");
        for (String part : parts) {
            if ("__MACOSX".equals(part) || ".DS_Store".equals(part) || "Thumbs.db".equalsIgnoreCase(part)
                    || part.startsWith("._")) return true;
        }
        return false;
    }

    private boolean containsPythonSource(File root) {
        File[] children = root.listFiles();
        if (children == null) return false;
        for (File child : children) {
            if (isPythonArchiveMetadata(child.getName())) continue;
            if (child.isFile() && child.getName().toLowerCase(java.util.Locale.ROOT).endsWith(".py")) return true;
            if (child.isDirectory() && containsPythonSource(child)) return true;
        }
        return false;
    }

    private int countFiles(File root) {
        File[] children = root.listFiles();
        if (children == null) return 0;
        int count = 0;
        for (File child : children) count += child.isDirectory() ? countFiles(child) : 1;
        return count;
    }

    private void importIcon(Uri uri) {
        setStatus("Подготавливаю иконку…", true);
        IO.execute(() -> {
            try {
                Bitmap decoded = decodeIconImage(uri);
                int side = Math.min(decoded.getWidth(), decoded.getHeight());
                Bitmap square = Bitmap.createBitmap(decoded, (decoded.getWidth() - side) / 2,
                        (decoded.getHeight() - side) / 2, side, side);
                if (square != decoded) decoded.recycle();
                Bitmap scaled = Bitmap.createScaledBitmap(square, 512, 512, true);
                if (scaled != square) square.recycle();
                File path = new File(getFilesDir(), "workspace/custom-icon.png");
                File parent = path.getParentFile();
                if (parent != null && !parent.exists()) parent.mkdirs();
                try (FileOutputStream output = new FileOutputStream(path)) {
                    if (!scaled.compress(Bitmap.CompressFormat.PNG, 100, output)) {
                        throw new IOException("Не удалось сохранить PNG-иконку.");
                    }
                } finally {
                    scaled.recycle();
                }
                iconFile = path;
                generatedApk = null;
                runOnUiThread(() -> {
                    Bitmap preview = BitmapFactory.decodeFile(path.getAbsolutePath());
                    composeUi.setIcon(preview, "Своя иконка");
                    setStatus("Иконка подготовлена · 5 размеров", false);
                    composeUi.setSaveAvailable(false);
                });
            } catch (Exception error) {
                String reason = error.getMessage();
                if (reason == null || reason.trim().isEmpty()) reason = error.getClass().getSimpleName();
                showFailure("Не удалось загрузить иконку: " + reason);
            }
        });
    }

    private Bitmap decodeIconImage(Uri uri) throws IOException {
        Exception decoderError = null;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                ImageDecoder.Source source = ImageDecoder.createSource(getContentResolver(), uri);
                return ImageDecoder.decodeBitmap(source, (decoder, info, sourceInfo) -> {
                    decoder.setAllocator(ImageDecoder.ALLOCATOR_SOFTWARE);
                    int width = info.getSize().getWidth();
                    int height = info.getSize().getHeight();
                    int longest = Math.max(width, height);
                    if (longest > 1024) {
                        float scale = 1024f / longest;
                        decoder.setTargetSize(Math.max(1, Math.round(width * scale)),
                                Math.max(1, Math.round(height * scale)));
                    }
                });
            } catch (Exception error) {
                decoderError = error;
            }
        }

        BitmapFactory.Options bounds = new BitmapFactory.Options();
        bounds.inJustDecodeBounds = true;
        try (InputStream input = getContentResolver().openInputStream(uri)) {
            if (input == null) throw new IOException("Галерея не дала доступ к выбранному фото.");
            BitmapFactory.decodeStream(input, null, bounds);
        } catch (Exception error) {
            if (decoderError != null) error.addSuppressed(decoderError);
            throw new IOException("Не удалось открыть фото из галереи: " + error.getMessage(), error);
        }
        if (bounds.outWidth <= 0 || bounds.outHeight <= 0) {
            throw new IOException("Не удалось определить формат этого фото. Попробуйте сохранить его как PNG или JPEG.",
                    decoderError);
        }

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        int longest = Math.max(bounds.outWidth, bounds.outHeight);
        while (longest / options.inSampleSize > 1024 && options.inSampleSize < (1 << 30)) {
            options.inSampleSize *= 2;
        }
        try (InputStream input = getContentResolver().openInputStream(uri)) {
            if (input == null) throw new IOException("Галерея не дала доступ к фото при чтении.");
            Bitmap bitmap = BitmapFactory.decodeStream(input, null, options);
            if (bitmap == null) {
                throw new IOException("Android не смог декодировать это фото. Попробуйте PNG, JPEG или WebP.",
                        decoderError);
            }
            return bitmap;
        }
    }

    void buildApk() {
        hideKeyboard();
        boolean pythonServer = composeUi.getPythonServerMode();
        File selectedSite = siteRoot;
        File selectedPythonProject = pythonProjectRoot;
        if (pythonServer && (selectedPythonProject == null || !selectedPythonProject.isDirectory())) {
            Toast.makeText(this, "Сначала импортируйте Python/Flask проект ZIP или .py", Toast.LENGTH_LONG).show();
            return;
        }
        if (pythonServer && Build.VERSION.SDK_INT < 22) {
            Toast.makeText(this, "Python runtime требует Android API 22 или новее", Toast.LENGTH_LONG).show();
            return;
        }
        if (!pythonServer && (selectedSite == null || !new File(selectedSite, "index.html").isFile())) {
            Toast.makeText(this, "Сначала выберите index.html или ZIP сайта", Toast.LENGTH_LONG).show();
            return;
        }
        String appName = ApkBuilder.sanitizeLabel(composeUi.getAppNameValue());
        String packageName = composeUi.getPackageIdValue().trim();
        if (!ApkBuilder.isValidPackageName(packageName)) {
            composeUi.setPackageError("Например, com.company.mysite");
            return;
        }
        int requestedVersion;
        try {
            requestedVersion = Integer.parseInt(composeUi.getVersionCodeValue().trim());
            if (requestedVersion < 1) throw new NumberFormatException();
        } catch (NumberFormatException invalidVersion) {
            composeUi.setVersionError("Укажите положительный номер версии");
            return;
        }
        String versionPreference = "target_version_" + packageName;
        int previousVersion = getPreferences(MODE_PRIVATE).getInt(versionPreference, 0);
        if (previousVersion == Integer.MAX_VALUE) {
            composeUi.setVersionError("Достигнут предел номера версии");
            return;
        }
        final int versionCode = Math.max(requestedVersion, previousVersion + 1);
        composeUi.setVersionCodeValue(Integer.toString(versionCode));
        composeUi.setVersionError(null);
        File selectedIcon = iconFile;
        boolean autoRotate = composeUi.getAutoRotateValue();
        boolean fullscreen = composeUi.getFullscreenValue();
        generatedApk = null;
        composeUi.setSaveAvailable(false);
        composeUi.setBuildProgress(0.03f, "Проверяем исходные файлы");
        setStatus("Создаю и подписываю APK…", true);
        IO.execute(() -> {
            try {
                File apk = ApkBuilder.build(this, selectedSite, packageName, appName, selectedIcon,
                        autoRotate, fullscreen, versionCode, pythonServer, selectedPythonProject,
                        (percent, message) -> runOnUiThread(() ->
                                composeUi.setBuildProgress(percent / 100f, message)));
                generatedApk = apk;
                runOnUiThread(() -> {
                    getPreferences(MODE_PRIVATE).edit().putInt(versionPreference, versionCode).apply();
                    if (versionCode < Integer.MAX_VALUE) {
                        composeUi.setVersionCodeValue(Integer.toString(versionCode + 1));
                    }
                    composeUi.setSaveAvailable(true);
                    setStatus((pythonServer ? "Flask APK готов · " : "APK готов · ")
                            + ApkBuilder.formatBytes(apk.length()) + " · постоянная подпись", false);
                    Toast.makeText(this, pythonServer ? "Python/Flask APK создан" : "Настоящий APK создан офлайн",
                            Toast.LENGTH_SHORT).show();
                });
            } catch (Exception error) {
                showFailure(error.getMessage() == null ? "Ошибка сборки APK" : error.getMessage());
            }
        });
    }

    void installGeneratedApk() {
        File apk = generatedApk;
        if (apk == null || !apk.isFile()) {
            Toast.makeText(this, "Сначала соберите APK", Toast.LENGTH_SHORT).show();
            return;
        }
        if (Build.VERSION.SDK_INT >= 26 && !getPackageManager().canRequestPackageInstalls()) {
            pendingInstallAfterSourceAccess = true;
            try {
                Intent settings = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                        Uri.parse("package:" + getPackageName()));
                launchActivityForResult(settings, REQUEST_INSTALL_SOURCE);
            } catch (Exception error) {
                pendingInstallAfterSourceAccess = false;
                showFailure("Не удалось открыть разрешение на установку APK: " + error.getMessage());
            }
            return;
        }

        try {
            Uri apkUri = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", apk);
            Intent install = new Intent(Intent.ACTION_INSTALL_PACKAGE);
            install.setDataAndType(apkUri, "application/vnd.android.package-archive");
            install.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            install.putExtra(Intent.EXTRA_RETURN_RESULT, true);
            launchActivityForResult(install, INSTALL_APK);
            setStatus("Откройте системный установщик и подтвердите установку", false);
        } catch (Exception error) {
            showFailure("Не удалось запустить установку: " + error.getMessage());
        }
    }

    void chooseSaveLocation() {
        File apk = generatedApk;
        if (apk == null || !apk.isFile()) {
            Toast.makeText(this, "Сначала соберите APK", Toast.LENGTH_SHORT).show();
            return;
        }
        String title = composeUi.getAppNameValue().trim();
        title = title.replaceAll("[^\\p{L}\\p{N}_-]+", "_");
        if (title.isEmpty()) title = "website";
        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("application/vnd.android.package-archive");
        intent.putExtra(Intent.EXTRA_TITLE, title + ".apk");
        launchActivityForResult(intent, SAVE_APK);
    }

    private void saveApk(Uri destination) {
        File apk = generatedApk;
        if (apk == null || !apk.isFile()) {
            showFailure("APK больше не найден во временной папке.");
            return;
        }
        setStatus("Сохраняю APK…", true);
        IO.execute(() -> {
            try {
                OutputStream opened = getContentResolver().openOutputStream(destination, "wt");
                if (opened == null) throw new IOException("Не удалось открыть место сохранения.");
                try (InputStream input = new BufferedInputStream(new FileInputStream(apk));
                     OutputStream output = new BufferedOutputStream(opened)) {
                    copyStream(input, output);
                }
                runOnUiThread(() -> {
                    setStatus("APK сохранён · можно установить на Android", false);
                    Toast.makeText(this, "APK сохранён", Toast.LENGTH_LONG).show();
                });
            } catch (Exception error) {
                showFailure("Не удалось сохранить APK: " + error.getMessage());
            }
        });
    }

    private File restoreSiteRoot() {
        String savedPath = getPreferences(MODE_PRIVATE).getString("siteRoot", null);
        File restored = existing(savedPath);
        if (restored == null) restored = existing(new File(getFilesDir(), "workspace/site").getAbsolutePath());
        return restored != null && new File(restored, "index.html").isFile() ? restored : null;
    }

    private File restorePythonProjectRoot() {
        String savedPath = getPreferences(MODE_PRIVATE).getString("pythonProjectRoot", null);
        File restored = existing(savedPath);
        if (restored == null) restored = existing(new File(getFilesDir(), "workspace/python-project").getAbsolutePath());
        return restored != null && restored.isDirectory() ? restored : null;
    }

    private void refreshImportedFiles() {
        if (pythonProjectRoot != null && pythonProjectRoot.isDirectory()) {
            composeUi.setPythonProjectSummary("Python · проект восстановлен");
        } else {
            pythonProjectRoot = null;
            composeUi.setPythonProjectSummary("Python-проект не выбран");
        }
        if (siteRoot != null && new File(siteRoot, "index.html").isFile()) {
            composeUi.setProjectSummary("Проект восстановлен · index.html");
        } else {
            siteRoot = null;
            composeUi.setProjectSummary("Файл ещё не выбран");
        }
        if (iconFile != null && iconFile.isFile()) {
            Bitmap preview = BitmapFactory.decodeFile(iconFile.getAbsolutePath());
            composeUi.setIcon(preview, "Своя иконка");
        }
    }

    private void setStatus(String message, boolean busy) {
        if (composeUi != null) composeUi.setStatus(message, busy);
    }

    private void showFailure(String message) {
        runOnUiThread(() -> {
            setStatus(message, false);
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        });
    }

    private void hideKeyboard() {
        try {
            InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            View focus = getCurrentFocus();
            if (manager != null && focus != null) manager.hideSoftInputFromWindow(focus.getWindowToken(), 0);
        } catch (Exception ignored) { }
    }

    private String normalizeZipPath(String raw) throws IOException {
        if (raw == null || raw.length() > 4096) throw new IOException("Слишком длинный путь внутри ZIP.");
        String value = raw.replace('\\', '/');
        if (value.startsWith("/") || value.matches("^[A-Za-z]:.*") || value.indexOf('\0') >= 0) {
            throw new IOException("В ZIP найден абсолютный или недопустимый путь.");
        }
        String[] parts = value.split("/");
        StringBuilder normalized = new StringBuilder();
        int count = 0;
        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) continue;
            if (part.equals("..")) throw new IOException("В ZIP найден путь с выходом из папки сайта.");
            if (part.indexOf('\n') >= 0 || part.indexOf('\r') >= 0) {
                throw new IOException("В ZIP есть имя файла с переносом строки.");
            }
            if (++count > 64) throw new IOException("Слишком глубокая структура ZIP.");
            if (normalized.length() > 0) normalized.append('/');
            normalized.append(part);
        }
        return normalized.toString();
    }

    private long copyStream(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[64 * 1024];
        int read;
        long total = 0;
        while ((read = input.read(buffer)) != -1) {
            total += read;
            output.write(buffer, 0, read);
        }
        return total;
    }

    private long copyStreamLimited(InputStream input, OutputStream output, long maxBytes) throws IOException {
        byte[] buffer = new byte[64 * 1024];
        int read;
        long total = 0;
        while ((read = input.read(buffer)) != -1) {
            if (read > maxBytes - total) throw new IOException("Python-файл превышает лимит 1 ГБ.");
            total += read;
            output.write(buffer, 0, read);
        }
        return total;
    }

    private void clearDirectory(File directory) throws IOException {
        if (!directory.exists()) return;
        File[] children = directory.listFiles();
        if (children != null) {
            for (File child : children) {
                if (child.isDirectory()) clearDirectory(child);
                if (!child.delete()) throw new IOException("Не удалось очистить старый проект сайта.");
            }
        }
        if (!directory.delete() && directory.exists()) throw new IOException("Не удалось удалить старую папку.");
    }

    private File existing(String path) {
        if (path == null) return null;
        File file = new File(path);
        return file.exists() ? file : null;
    }
}

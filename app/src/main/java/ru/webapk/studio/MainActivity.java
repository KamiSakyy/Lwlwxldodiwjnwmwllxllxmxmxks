package ru.webapk.studio;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.text.InputFilter;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

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
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/** Russian UI for importing a local web project and producing an installable offline APK. */
public final class MainActivity extends Activity {
    private static final int PICK_HTML = 10;
    private static final int PICK_ZIP = 11;
    private static final int PICK_ICON = 12;
    private static final int SAVE_APK = 13;
    private static final int MAX_IMPORT_FILES = 10000;
    private static final ExecutorService IO = Executors.newSingleThreadExecutor();
    private static final int BG = Color.rgb(244, 246, 251);
    private static final int INK = Color.rgb(28, 35, 53);
    private static final int MUTED = Color.rgb(106, 116, 137);
    private static final int ACCENT = Color.rgb(88, 88, 225);

    private EditText appNameField;
    private EditText packageField;
    private TextView siteSummary;
    private TextView iconSummary;
    private TextView statusView;
    private Button buildButton;
    private Button saveButton;
    private ImageView iconPreview;
    private volatile File siteRoot;
    private volatile File iconFile;
    private volatile File generatedApk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setStatusBarColor(BG);
        window.setNavigationBarColor(BG);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        } else {
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) window.setDecorFitsSystemWindows(false);

        if (savedInstanceState != null) {
            siteRoot = existing(savedInstanceState.getString("siteRoot"));
            iconFile = existing(savedInstanceState.getString("iconFile"));
            generatedApk = existing(savedInstanceState.getString("generatedApk"));
        }
        setContentView(createScreen());
        refreshImportedFiles();
        if (generatedApk != null) {
            setStatus("APK готов · " + ApkBuilder.formatBytes(generatedApk.length()), false);
            saveButton.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("siteRoot", siteRoot == null ? null : siteRoot.getAbsolutePath());
        outState.putString("iconFile", iconFile == null ? null : iconFile.getAbsolutePath());
        outState.putString("generatedApk", generatedApk == null ? null : generatedApk.getAbsolutePath());
    }

    private View createScreen() {
        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setBackgroundColor(BG);
        scroll.setOnApplyWindowInsetsListener((view, insets) -> {
            view.setPadding(0, insets.getSystemWindowInsetTop(), 0, insets.getSystemWindowInsetBottom());
            return insets;
        });

        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(18), dp(18), dp(18), dp(28));
        scroll.addView(page, new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout hero = new LinearLayout(this);
        hero.setOrientation(LinearLayout.VERTICAL);
        hero.setPadding(dp(22), dp(22), dp(22), dp(22));
        hero.setBackground(roundDrawable(Color.rgb(39, 43, 105), 24, 0, Color.TRANSPARENT));
        TextView tag = text("ОФЛАЙН · ANDROID", 11, Color.rgb(192, 196, 255), true);
        tag.setLetterSpacing(0.12f);
        hero.addView(tag);
        TextView title = text("WEB  →  APK", 29, Color.WHITE, true);
        LinearLayout.LayoutParams titleParams = paramsWrap();
        titleParams.topMargin = dp(8);
        hero.addView(title, titleParams);
        TextView subtitle = text("Упакуйте сайт в настоящее устанавливаемое приложение", 14,
                Color.rgb(224, 226, 255), false);
        LinearLayout.LayoutParams subtitleParams = paramsWrap();
        subtitleParams.topMargin = dp(6);
        hero.addView(subtitle, subtitleParams);
        page.addView(hero, matchWrap());

        LinearLayout sourceCard = card(page);
        addCardHeading(sourceCard, "1. Исходники сайта", "Выберите один HTML-файл или ZIP с сайтом.");
        LinearLayout choices = new LinearLayout(this);
        choices.setOrientation(LinearLayout.HORIZONTAL);
        Button htmlButton = button("Выбрать HTML", false);
        Button zipButton = button("Выбрать ZIP", true);
        LinearLayout.LayoutParams half = new LinearLayout.LayoutParams(0, dp(50), 1f);
        choices.addView(htmlButton, half);
        LinearLayout.LayoutParams halfRight = new LinearLayout.LayoutParams(0, dp(50), 1f);
        halfRight.leftMargin = dp(10);
        choices.addView(zipButton, halfRight);
        sourceCard.addView(choices);
        siteSummary = text("Файл ещё не выбран", 13, MUTED, false);
        LinearLayout.LayoutParams summaryParams = paramsWrap();
        summaryParams.topMargin = dp(11);
        sourceCard.addView(siteSummary, summaryParams);
        htmlButton.setOnClickListener(v -> openHtmlPicker());
        zipButton.setOnClickListener(v -> openZipPicker());

        LinearLayout settingsCard = card(page);
        addCardHeading(settingsCard, "2. Настройки приложения", "Название и уникальный идентификатор Android.");
        addFieldLabel(settingsCard, "Название приложения");
        appNameField = editField("Мой сайт", 40, false);
        settingsCard.addView(appNameField, fieldMargins());
        addFieldLabel(settingsCard, "Идентификатор пакета");
        packageField = editField("com.example.mysite", 127, true);
        packageField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        settingsCard.addView(packageField, fieldMargins());
        TextView packageHint = text("Например: com.company.mysite · только строчные латинские буквы", 12, MUTED, false);
        LinearLayout.LayoutParams hintParams = paramsWrap();
        hintParams.topMargin = dp(7);
        settingsCard.addView(packageHint, hintParams);

        LinearLayout iconCard = card(page);
        addCardHeading(iconCard, "3. Иконка", "Своя картинка появится в списке приложений.");
        LinearLayout iconRow = new LinearLayout(this);
        iconRow.setGravity(Gravity.CENTER_VERTICAL);
        iconPreview = new ImageView(this);
        iconPreview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iconPreview.setBackground(roundDrawable(Color.rgb(237, 239, 249), 15, 1, Color.rgb(226, 229, 239)));
        iconPreview.setPadding(dp(5), dp(5), dp(5), dp(5));
        iconRow.addView(iconPreview, new LinearLayout.LayoutParams(dp(62), dp(62)));
        LinearLayout iconDetails = new LinearLayout(this);
        iconDetails.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams detailsParams = new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        detailsParams.leftMargin = dp(13);
        iconRow.addView(iconDetails, detailsParams);
        iconSummary = text("Стандартная иконка", 13, INK, true);
        iconDetails.addView(iconSummary);
        Button iconButton = button("Выбрать изображение", true);
        LinearLayout.LayoutParams iconButtonParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(43));
        iconButtonParams.topMargin = dp(8);
        iconDetails.addView(iconButton, iconButtonParams);
        iconCard.addView(iconRow);
        iconButton.setOnClickListener(v -> openIconPicker());

        LinearLayout noteCard = card(page);
        addCardHeading(noteCard, "Полностью офлайн", "HTML, CSS, JavaScript и локальные файлы сайта попадут в APK.");
        TextView note = text("Приложение использует системный WebView Android; SDK и интернет для сборки на телефоне не нужны. Сайт открывается локально. Внешние URL и CDN без сети работать не будут. Для сайта и создаваемого сайт-APK нет искусственного лимита размера: предел зависит от свободного места и ZIP32 (до ~4 ГБ).",
                12, MUTED, false);
        note.setLineSpacing(dp(3), 1f);
        noteCard.addView(note);

        buildButton = button("СОБРАТЬ APK ОФЛАЙН", false);
        buildButton.setTextSize(15);
        buildButton.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        LinearLayout.LayoutParams buildParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(56));
        buildParams.topMargin = dp(2);
        page.addView(buildButton, buildParams);
        buildButton.setOnClickListener(v -> buildApk());

        saveButton = button("СОХРАНИТЬ APK…", true);
        LinearLayout.LayoutParams saveParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(52));
        saveParams.topMargin = dp(10);
        page.addView(saveButton, saveParams);
        saveButton.setVisibility(View.GONE);
        saveButton.setOnClickListener(v -> chooseSaveLocation());

        statusView = text("Готово к работе · интернет не требуется", 13, MUTED, false);
        statusView.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams statusParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        statusParams.topMargin = dp(14);
        page.addView(statusView, statusParams);

        TextView footer = text("Локальная упаковка сайта · WebView · Android APK", 11,
                Color.rgb(151, 158, 176), false);
        footer.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams footerParams = paramsWrap();
        footerParams.topMargin = dp(14);
        page.addView(footer, footerParams);

        return scroll;
    }

    private LinearLayout card(LinearLayout parent) {
        LinearLayout view = new LinearLayout(this);
        view.setOrientation(LinearLayout.VERTICAL);
        view.setPadding(dp(17), dp(17), dp(17), dp(17));
        view.setBackground(roundDrawable(Color.WHITE, 20, 1, Color.rgb(231, 234, 242)));
        view.setElevation(dp(1));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = dp(13);
        parent.addView(view, params);
        return view;
    }

    private void addCardHeading(LinearLayout card, String heading, String helper) {
        TextView title = text(heading, 16, INK, true);
        card.addView(title, paramsWrap());
        TextView subtitle = text(helper, 12, MUTED, false);
        LinearLayout.LayoutParams params = paramsWrap();
        params.topMargin = dp(5);
        params.bottomMargin = dp(13);
        card.addView(subtitle, params);
    }

    private void addFieldLabel(LinearLayout parent, String label) {
        TextView view = text(label, 13, INK, true);
        LinearLayout.LayoutParams params = paramsWrap();
        params.topMargin = dp(2);
        params.bottomMargin = dp(6);
        parent.addView(view, params);
    }

    private EditText editField(String value, int maxLength, boolean packageInput) {
        EditText edit = new EditText(this);
        edit.setSingleLine(true);
        edit.setText(value);
        edit.setTextSize(15);
        edit.setTextColor(INK);
        edit.setHintTextColor(Color.rgb(159, 166, 181));
        edit.setPadding(dp(13), dp(10), dp(13), dp(10));
        edit.setBackground(roundDrawable(Color.rgb(249, 250, 253), 12, 1, Color.rgb(229, 232, 241)));
        edit.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
        if (packageInput) {
            edit.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                    | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        }
        return edit;
    }

    private LinearLayout.LayoutParams fieldMargins() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(52));
        params.bottomMargin = dp(12);
        return params;
    }

    private Button button(String label, boolean secondary) {
        Button button = new Button(this);
        button.setText(label);
        button.setAllCaps(false);
        button.setTextSize(13);
        button.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        button.setTextColor(secondary ? ACCENT : Color.WHITE);
        button.setPadding(dp(10), 0, dp(10), 0);
        button.setMinHeight(0);
        button.setMinimumHeight(0);
        button.setBackground(roundDrawable(secondary ? Color.WHITE : ACCENT, 14,
                secondary ? 1 : 0, secondary ? Color.rgb(218, 220, 250) : ACCENT));
        return button;
    }

    private TextView text(String value, int size, int color, boolean bold) {
        TextView view = new TextView(this);
        view.setText(value);
        view.setTextSize(size);
        view.setTextColor(color);
        if (bold) view.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        return view;
    }

    private GradientDrawable roundDrawable(int color, int radiusDp, int strokeDp, int strokeColor) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(dp(radiusDp));
        if (strokeDp > 0) drawable.setStroke(dp(strokeDp), strokeColor);
        return drawable;
    }

    private LinearLayout.LayoutParams paramsWrap() {
        return new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    private LinearLayout.LayoutParams matchWrap() {
        return new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private void openHtmlPicker() {
        openDocument(PICK_HTML, new String[]{"text/html", "application/xhtml+xml", "application/octet-stream"});
    }

    private void openZipPicker() {
        openDocument(PICK_ZIP, new String[]{"application/zip", "application/x-zip-compressed",
                "application/octet-stream"});
    }

    private void openDocument(int request, String[] mimeTypes) {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        startActivityForResult(intent, request);
    }

    private void openIconPicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("image/*");
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        try {
            startActivityForResult(Intent.createChooser(intent, "Выберите фото из галереи"), PICK_ICON);
        } catch (Exception unavailable) {
            Intent fallback = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            fallback.addCategory(Intent.CATEGORY_OPENABLE);
            fallback.setType("image/*");
            fallback.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivityForResult(fallback, PICK_ICON);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK || data == null) return;
        Uri uri = data.getData();
        if (uri == null && data.getClipData() != null && data.getClipData().getItemCount() > 0) {
            uri = data.getClipData().getItemAt(0).getUri();
        }
        if (uri == null) return;
        if (requestCode == PICK_HTML) importHtml(uri);
        else if (requestCode == PICK_ZIP) importZip(uri);
        else if (requestCode == PICK_ICON) importIcon(uri);
        else if (requestCode == SAVE_APK) saveApk(uri);
    }

    private void importHtml(Uri uri) {
        setStatus("Копирую HTML…", true);
        saveButton.setVisibility(View.GONE);
        IO.execute(() -> {
            try {
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
                generatedApk = null;
                String name = displayName(uri);
                runOnUiThread(() -> {
                    siteSummary.setText(name + " → index.html  ·  " + ApkBuilder.formatBytes(size));
                    setStatus("HTML скопирован в память приложения", false);
                });
            } catch (Exception error) {
                showFailure("Не удалось импортировать HTML: " + error.getMessage());
            }
        });
    }

    private void importZip(Uri uri) {
        setStatus("Безопасно распаковываю ZIP…", true);
        saveButton.setVisibility(View.GONE);
        IO.execute(() -> {
            try {
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
                generatedApk = null;
                String selected = selectedIndex;
                int fileCount = files;
                long unpacked = total;
                runOnUiThread(() -> {
                    siteSummary.setText("ZIP · " + fileCount + " файлов · " + selected
                            + "  ·  " + ApkBuilder.formatBytes(unpacked));
                    setStatus("Проект распакован офлайн", false);
                });
            } catch (Exception error) {
                showFailure("Не удалось распаковать ZIP: " + error.getMessage());
            }
        });
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
                String name = displayName(uri);
                runOnUiThread(() -> {
                    iconSummary.setText(name);
                    Bitmap preview = BitmapFactory.decodeFile(path.getAbsolutePath());
                    if (preview != null) iconPreview.setImageBitmap(preview);
                    setStatus("Иконка подготовлена · 5 размеров", false);
                    saveButton.setVisibility(View.GONE);
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

    private void buildApk() {
        hideKeyboard();
        File selectedSite = siteRoot;
        if (selectedSite == null || !new File(selectedSite, "index.html").isFile()) {
            Toast.makeText(this, "Сначала выберите index.html или ZIP сайта", Toast.LENGTH_LONG).show();
            return;
        }
        String appName = ApkBuilder.sanitizeLabel(appNameField.getText().toString());
        String packageName = packageField.getText().toString().trim();
        if (!ApkBuilder.isValidPackageName(packageName)) {
            packageField.setError("Например, com.company.mysite");
            packageField.requestFocus();
            return;
        }
        File selectedIcon = iconFile;
        generatedApk = null;
        saveButton.setVisibility(View.GONE);
        setStatus("Создаю и подписываю APK…", true);
        buildButton.setEnabled(false);
        IO.execute(() -> {
            try {
                File apk = ApkBuilder.build(this, selectedSite, packageName, appName, selectedIcon);
                generatedApk = apk;
                runOnUiThread(() -> {
                    buildButton.setEnabled(true);
                    saveButton.setVisibility(View.VISIBLE);
                    setStatus("APK готов · " + ApkBuilder.formatBytes(apk.length())
                            + " · подписан локальным ключом", false);
                    Toast.makeText(this, "Настоящий APK создан офлайн", Toast.LENGTH_SHORT).show();
                });
            } catch (Exception error) {
                showFailure(error.getMessage() == null ? "Ошибка сборки APK" : error.getMessage());
            }
        });
    }

    private void chooseSaveLocation() {
        File apk = generatedApk;
        if (apk == null || !apk.isFile()) {
            Toast.makeText(this, "Сначала соберите APK", Toast.LENGTH_SHORT).show();
            return;
        }
        String title = appNameField.getText().toString().trim();
        title = title.replaceAll("[^\\p{L}\\p{N}_-]+", "_");
        if (title.isEmpty()) title = "website";
        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("application/vnd.android.package-archive");
        intent.putExtra(Intent.EXTRA_TITLE, title + ".apk");
        startActivityForResult(intent, SAVE_APK);
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

    private void refreshImportedFiles() {
        if (siteRoot != null && new File(siteRoot, "index.html").isFile()) {
            siteSummary.setText("Проект готов · index.html");
        }
        if (iconFile != null && iconFile.isFile()) {
            iconSummary.setText("Своя иконка выбрана");
            Bitmap preview = BitmapFactory.decodeFile(iconFile.getAbsolutePath());
            if (preview != null) iconPreview.setImageBitmap(preview);
        }
    }

    private void setStatus(String message, boolean busy) {
        if (statusView != null) statusView.setText(message);
        if (buildButton != null) buildButton.setEnabled(!busy);
    }

    private void showFailure(String message) {
        runOnUiThread(() -> {
            if (buildButton != null) buildButton.setEnabled(true);
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

    private String displayName(Uri uri) {
        String name = null;
        try (android.database.Cursor cursor = getContentResolver().query(uri,
                new String[]{OpenableColumns.DISPLAY_NAME}, null, null, null)) {
            if (cursor != null && cursor.moveToFirst()) name = cursor.getString(0);
        } catch (Exception ignored) { }
        if (name == null || name.trim().isEmpty()) name = uri.getLastPathSegment();
        return name == null ? "Файл" : name;
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

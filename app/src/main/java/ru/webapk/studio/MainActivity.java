package ru.webapk.studio;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.text.InputFilter;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
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
    private static final int BG = Color.rgb(8, 9, 11);
    private static final int SURFACE = Color.rgb(17, 19, 23);
    private static final int SURFACE_RAISED = Color.rgb(23, 26, 31);
    private static final int FIELD = Color.rgb(12, 14, 18);
    private static final int LINE = Color.rgb(42, 46, 54);
    private static final int INK = Color.rgb(246, 247, 250);
    private static final int MUTED = Color.rgb(151, 158, 170);
    private static final int BLUE = Color.rgb(10, 132, 255);
    private static final int BLUE_DARK = Color.rgb(16, 37, 61);

    private EditText appNameField;
    private EditText packageField;
    private EditText versionCodeField;
    private Switch autoRotateSwitch;
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
        enableEdgeToEdge();

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

    private void enableEdgeToEdge() {
        Window window = getWindow();
        window.setStatusBarColor(Color.TRANSPARENT);
        window.setNavigationBarColor(Color.TRANSPARENT);
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
            window.setNavigationBarDividerColor(Color.TRANSPARENT);
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
            WindowInsetsController controller = window.getInsetsController();
            if (controller != null) {
                int lightBarFlags = WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                        | WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS;
                controller.setSystemBarsAppearance(0, lightBarFlags);
            }
        } else {
            window.getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        }
    }

    private View createScreen() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(BG);
        root.setClipChildren(false);
        root.setClipToPadding(false);

        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setBackgroundColor(BG);
        scroll.setClipToPadding(false);
        scroll.setVerticalScrollBarEnabled(false);
        scroll.setHorizontalScrollBarEnabled(false);
        scroll.setOverScrollMode(View.OVER_SCROLL_NEVER);
        scroll.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        root.addView(scroll, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));

        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(22), dp(14), dp(22), dp(26));
        page.setClipChildren(false);
        scroll.addView(page, new ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout brandRow = new LinearLayout(this);
        brandRow.setGravity(Gravity.CENTER_VERTICAL);
        ImageView brandMark = new ImageView(this);
        brandMark.setImageResource(R.mipmap.ic_launcher);
        brandMark.setScaleType(ImageView.ScaleType.CENTER_CROP);
        brandMark.setBackground(roundDrawable(SURFACE_RAISED, 14, 1, LINE));
        brandMark.setClipToOutline(true);
        LinearLayout.LayoutParams markParams = new LinearLayout.LayoutParams(dp(42), dp(42));
        brandRow.addView(brandMark, markParams);
        TextView brandName = text("WEBAPK STUDIO", 12, INK, true);
        brandName.setLetterSpacing(0.09f);
        LinearLayout.LayoutParams brandNameParams = new LinearLayout.LayoutParams(
                0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        brandNameParams.leftMargin = dp(12);
        brandRow.addView(brandName, brandNameParams);
        TextView offlineBadge = text("ОФЛАЙН", 10, BLUE, true);
        offlineBadge.setLetterSpacing(0.04f);
        offlineBadge.setPadding(dp(10), dp(7), dp(10), dp(7));
        offlineBadge.setBackground(roundDrawable(BLUE_DARK, 20, 0, BLUE_DARK));
        brandRow.addView(offlineBadge, paramsWrap());
        page.addView(brandRow, paramsWrap());

        TextView pageTitle = text("Сайт в APK", 31, INK, true);
        pageTitle.setLetterSpacing(-0.025f);
        LinearLayout.LayoutParams pageTitleParams = paramsWrap();
        pageTitleParams.topMargin = dp(23);
        page.addView(pageTitle, pageTitleParams);
        TextView intro = text("Создайте Android-приложение из локального сайта. Проект останется на устройстве.",
                14, MUTED, false);
        LinearLayout.LayoutParams introParams = paramsWrap();
        introParams.topMargin = dp(5);
        introParams.bottomMargin = dp(7);
        page.addView(intro, introParams);

        LinearLayout sourceCard = card(page);
        addCardHeading(sourceCard, "Проект сайта", "Один HTML-файл или готовый ZIP-архив.");
        siteSummary = text("Добавьте файлы сайта — они не отправляются в интернет.", 13, MUTED, false);
        siteSummary.setPadding(dp(13), dp(10), dp(13), dp(10));
        siteSummary.setBackground(roundDrawable(FIELD, 14, 1, LINE));
        sourceCard.addView(siteSummary, paramsWrap());

        LinearLayout sourceActions = new LinearLayout(this);
        sourceActions.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams sourceActionsParams = paramsWrap();
        sourceActionsParams.topMargin = dp(11);
        sourceCard.addView(sourceActions, sourceActionsParams);
        Button htmlButton = button("HTML-файл", true);
        Button zipButton = button("ZIP-архив", true);
        LinearLayout.LayoutParams sourceButtonParams = new LinearLayout.LayoutParams(0, dp(50), 1f);
        sourceActions.addView(htmlButton, sourceButtonParams);
        LinearLayout.LayoutParams zipButtonParams = new LinearLayout.LayoutParams(0, dp(50), 1f);
        zipButtonParams.leftMargin = dp(9);
        sourceActions.addView(zipButton, zipButtonParams);
        htmlButton.setOnClickListener(v -> openHtmlPicker());
        zipButton.setOnClickListener(v -> openZipPicker());

        LinearLayout settingsCard = card(page);
        addCardHeading(settingsCard, "Параметры приложения", "Настройте отображаемое имя и Android package ID.");
        addFieldLabel(settingsCard, "Название приложения");
        appNameField = editField("Мой сайт", 40, false);
        appNameField.setHint("Например, Мой сайт");
        settingsCard.addView(appNameField, fieldMargins());

        addFieldLabel(settingsCard, "Package ID");
        packageField = editField("com.example.mysite", 127, true);
        packageField.setHint("com.company.mysite");
        packageField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        settingsCard.addView(packageField, fieldMargins());

        LinearLayout optionsColumn = new LinearLayout(this);
        optionsColumn.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams optionsParams = paramsWrap();
        optionsParams.topMargin = dp(1);
        settingsCard.addView(optionsColumn, optionsParams);

        LinearLayout versionColumn = new LinearLayout(this);
        versionColumn.setOrientation(LinearLayout.VERTICAL);
        optionsColumn.addView(versionColumn, paramsWrap());
        addFieldLabel(versionColumn, "Версия");
        versionCodeField = editField("1", 10, false);
        versionCodeField.setHint("1");
        versionCodeField.setInputType(InputType.TYPE_CLASS_NUMBER);
        versionCodeField.setImeOptions(android.view.inputmethod.EditorInfo.IME_ACTION_DONE);
        int previousVersion = getPreferences(MODE_PRIVATE)
                .getInt("target_version_" + packageField.getText().toString(), 0);
        versionCodeField.setText(Integer.toString(previousVersion == Integer.MAX_VALUE
                ? Integer.MAX_VALUE : Math.max(1, previousVersion + 1)));
        LinearLayout.LayoutParams versionParams = new LinearLayout.LayoutParams(dp(112), dp(52));
        versionColumn.addView(versionCodeField, versionParams);

        LinearLayout rotateRow = new LinearLayout(this);
        rotateRow.setGravity(Gravity.CENTER_VERTICAL);
        rotateRow.setPadding(dp(14), dp(9), dp(12), dp(9));
        rotateRow.setBackground(roundDrawable(FIELD, 15, 1, LINE));
        LinearLayout.LayoutParams rotateRowParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(75));
        rotateRowParams.topMargin = dp(12);
        optionsColumn.addView(rotateRow, rotateRowParams);
        LinearLayout rotateText = new LinearLayout(this);
        rotateText.setOrientation(LinearLayout.VERTICAL);
        rotateRow.addView(rotateText, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));
        TextView rotateTitle = text("Автоповорот", 13, INK, true);
        rotateText.addView(rotateTitle, paramsWrap());
        TextView rotateHelper = text("Все ориентации", 11, MUTED, false);
        LinearLayout.LayoutParams rotateHelperParams = paramsWrap();
        rotateHelperParams.topMargin = dp(2);
        rotateText.addView(rotateHelper, rotateHelperParams);
        autoRotateSwitch = new Switch(this);
        autoRotateSwitch.setText("");
        autoRotateSwitch.setShowText(false);
        autoRotateSwitch.setContentDescription("Автоповорот экрана");
        autoRotateSwitch.setChecked(getPreferences(MODE_PRIVATE).getBoolean("auto_rotate", false));
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            autoRotateSwitch.setThumbTintList(new ColorStateList(
                    new int[][]{{android.R.attr.state_checked}, new int[0]},
                    new int[]{Color.WHITE, Color.rgb(164, 170, 180)}));
            autoRotateSwitch.setTrackTintList(new ColorStateList(
                    new int[][]{{android.R.attr.state_checked}, new int[0]},
                    new int[]{BLUE, LINE}));
        }
        LinearLayout.LayoutParams switchParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        switchParams.leftMargin = dp(5);
        rotateRow.addView(autoRotateSwitch, switchParams);
        autoRotateSwitch.setOnCheckedChangeListener((button, checked) ->
                getPreferences(MODE_PRIVATE).edit().putBoolean("auto_rotate", checked).apply());

        LinearLayout iconCard = card(page);
        addCardHeading(iconCard, "Иконка приложения", "Значок на главном экране Android.");
        LinearLayout iconRow = new LinearLayout(this);
        iconRow.setGravity(Gravity.CENTER_VERTICAL);
        iconCard.addView(iconRow, paramsWrap());
        iconPreview = new ImageView(this);
        iconPreview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iconPreview.setImageResource(R.mipmap.ic_launcher);
        iconPreview.setBackground(roundDrawable(FIELD, 16, 1, LINE));
        iconPreview.setClipToOutline(true);
        iconRow.addView(iconPreview, new LinearLayout.LayoutParams(dp(62), dp(62)));
        LinearLayout iconDetails = new LinearLayout(this);
        iconDetails.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams detailsParams = new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        detailsParams.leftMargin = dp(13);
        iconRow.addView(iconDetails, detailsParams);
        iconSummary = text("По умолчанию", 13, INK, true);
        iconDetails.addView(iconSummary, paramsWrap());
        TextView iconHint = text("PNG или JPG", 12, MUTED, false);
        LinearLayout.LayoutParams iconHintParams = paramsWrap();
        iconHintParams.topMargin = dp(3);
        iconDetails.addView(iconHint, iconHintParams);
        Button iconButton = button("Выбрать", true);
        LinearLayout.LayoutParams iconButtonParams = new LinearLayout.LayoutParams(
                dp(84), dp(44));
        iconButtonParams.leftMargin = dp(9);
        iconRow.addView(iconButton, iconButtonParams);
        iconButton.setOnClickListener(v -> openIconPicker());

        LinearLayout bottomDock = new LinearLayout(this);
        bottomDock.setOrientation(LinearLayout.VERTICAL);
        bottomDock.setBackgroundColor(BG);
        View divider = new View(this);
        divider.setBackgroundColor(LINE);
        bottomDock.addView(divider, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(1)));
        statusView = text("Готово к сборке", 12, MUTED, false);
        statusView.setAccessibilityLiveRegion(View.ACCESSIBILITY_LIVE_REGION_POLITE);
        LinearLayout.LayoutParams statusParams = paramsWrap();
        statusParams.topMargin = dp(10);
        bottomDock.addView(statusView, statusParams);

        LinearLayout actionRow = new LinearLayout(this);
        actionRow.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams actionRowParams = paramsWrap();
        actionRowParams.topMargin = dp(9);
        bottomDock.addView(actionRow, actionRowParams);
        buildButton = button("Собрать APK", false);
        LinearLayout.LayoutParams buildParams = new LinearLayout.LayoutParams(0, dp(56), 1f);
        actionRow.addView(buildButton, buildParams);
        buildButton.setOnClickListener(v -> buildApk());
        saveButton = button("Сохранить", true);
        LinearLayout.LayoutParams saveParams = new LinearLayout.LayoutParams(0, dp(56), 1f);
        saveParams.leftMargin = dp(9);
        actionRow.addView(saveButton, saveParams);
        saveButton.setVisibility(View.GONE);
        saveButton.setOnClickListener(v -> chooseSaveLocation());
        root.addView(bottomDock, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        root.setOnApplyWindowInsetsListener((view, insets) -> {
            int left;
            int top;
            int right;
            int bottom;
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.graphics.Insets bars = insets.getInsets(WindowInsets.Type.systemBars()
                        | WindowInsets.Type.displayCutout());
                android.graphics.Insets ime = insets.getInsets(WindowInsets.Type.ime());
                left = bars.left;
                top = bars.top;
                right = bars.right;
                bottom = Math.max(bars.bottom, ime.bottom);
            } else {
                left = insets.getSystemWindowInsetLeft();
                top = insets.getSystemWindowInsetTop();
                right = insets.getSystemWindowInsetRight();
                bottom = insets.getSystemWindowInsetBottom();
            }
            page.setPadding(dp(22) + left, dp(14) + top, dp(22) + right, dp(26));
            bottomDock.setPadding(dp(22) + left, dp(9), dp(22) + right, dp(11) + bottom);
            return insets;
        });
        return root;
    }

    private LinearLayout card(LinearLayout parent) {
        LinearLayout view = new LinearLayout(this);
        view.setOrientation(LinearLayout.VERTICAL);
        view.setPadding(dp(17), dp(17), dp(17), dp(17));
        view.setBackground(roundDrawable(SURFACE, 21, 1, LINE));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = dp(13);
        parent.addView(view, params);
        return view;
    }

    private void addCardHeading(LinearLayout card, String heading, String helper) {
        TextView title = text(heading, 17, INK, true);
        LinearLayout.LayoutParams titleParams = paramsWrap();
        titleParams.bottomMargin = dp(helper == null || helper.isEmpty() ? 13 : 3);
        card.addView(title, titleParams);
        if (helper != null && !helper.isEmpty()) {
            TextView subtitle = text(helper, 12, MUTED, false);
            LinearLayout.LayoutParams helperParams = paramsWrap();
            helperParams.bottomMargin = dp(13);
            card.addView(subtitle, helperParams);
        }
    }

    private void addFieldLabel(LinearLayout parent, String label) {
        TextView view = text(label, 12, MUTED, true);
        LinearLayout.LayoutParams params = paramsWrap();
        params.bottomMargin = dp(6);
        parent.addView(view, params);
    }

    private EditText editField(String value, int maxLength, boolean packageInput) {
        EditText edit = new EditText(this);
        edit.setSingleLine(true);
        edit.setText(value);
        edit.setTextSize(packageInput ? 14 : 16);
        edit.setTextColor(INK);
        edit.setHintTextColor(Color.rgb(111, 118, 130));
        edit.setGravity(Gravity.CENTER_VERTICAL | Gravity.START);
        edit.setPadding(dp(14), 0, dp(14), 0);
        edit.setBackground(fieldBackground());
        edit.setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
        edit.setImeOptions(android.view.inputmethod.EditorInfo.IME_ACTION_NEXT);
        if (packageInput) {
            edit.setTypeface(android.graphics.Typeface.MONOSPACE);
            edit.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                    | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        }
        return edit;
    }

    private android.graphics.drawable.Drawable fieldBackground() {
        StateListDrawable backgrounds = new StateListDrawable();
        backgrounds.addState(new int[]{android.R.attr.state_focused},
                roundDrawable(FIELD, 15, 1, BLUE));
        backgrounds.addState(new int[0], roundDrawable(FIELD, 15, 1, LINE));
        return backgrounds;
    }

    private LinearLayout.LayoutParams fieldMargins() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(54));
        params.bottomMargin = dp(12);
        return params;
    }

    private Button button(String label, boolean secondary) {
        Button button = new Button(this);
        button.setText(label);
        button.setAllCaps(false);
        button.setSingleLine(true);
        button.setTextSize(14);
        button.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        button.setTextColor(INK);
        button.setGravity(Gravity.CENTER);
        button.setPadding(dp(9), 0, dp(9), 0);
        button.setMinHeight(0);
        button.setMinimumHeight(0);
        button.setMinWidth(0);
        button.setMinimumWidth(0);
        button.setStateListAnimator(null);
        button.setElevation(0);
        GradientDrawable shape = roundDrawable(secondary ? SURFACE_RAISED : BLUE,
                16, secondary ? 1 : 0, secondary ? LINE : BLUE);
        int rippleColor = secondary ? Color.argb(34, 255, 255, 255) : Color.argb(42, 255, 255, 255);
        button.setBackground(new RippleDrawable(ColorStateList.valueOf(rippleColor), shape, null));
        return button;
    }

    private TextView text(String value, int size, int color, boolean bold) {
        TextView view = new TextView(this);
        view.setText(value);
        view.setTextSize(size);
        view.setTextColor(color);
        if (bold) view.setTypeface(android.graphics.Typeface.DEFAULT, android.graphics.Typeface.BOLD);
        view.setLineSpacing(dp(1), 1f);
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
                runOnUiThread(() -> {
                    siteSummary.setText("HTML · index.html · " + ApkBuilder.formatBytes(size));
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
                int fileCount = files;
                long unpacked = total;
                runOnUiThread(() -> {
                    siteSummary.setText("ZIP · " + fileCount + " файлов · "
                            + ApkBuilder.formatBytes(unpacked));
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
                runOnUiThread(() -> {
                    iconSummary.setText("Своя иконка");
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
        int requestedVersion;
        try {
            requestedVersion = Integer.parseInt(versionCodeField.getText().toString().trim());
            if (requestedVersion < 1) throw new NumberFormatException();
        } catch (NumberFormatException invalidVersion) {
            versionCodeField.setError("Укажите положительный номер версии");
            versionCodeField.requestFocus();
            return;
        }
        String versionPreference = "target_version_" + packageName;
        int previousVersion = getPreferences(MODE_PRIVATE).getInt(versionPreference, 0);
        if (previousVersion == Integer.MAX_VALUE) {
            versionCodeField.setError("Достигнут предел номера версии");
            return;
        }
        final int versionCode = Math.max(requestedVersion, previousVersion + 1);
        versionCodeField.setText(Integer.toString(versionCode));
        File selectedIcon = iconFile;
        boolean autoRotate = autoRotateSwitch != null && autoRotateSwitch.isChecked();
        generatedApk = null;
        saveButton.setVisibility(View.GONE);
        setStatus("Создаю и подписываю APK…", true);
        buildButton.setEnabled(false);
        IO.execute(() -> {
            try {
                File apk = ApkBuilder.build(this, selectedSite, packageName, appName, selectedIcon,
                        autoRotate, versionCode);
                generatedApk = apk;
                runOnUiThread(() -> {
                    getPreferences(MODE_PRIVATE).edit().putInt(versionPreference, versionCode).apply();
                    if (versionCode < Integer.MAX_VALUE) {
                        versionCodeField.setText(Integer.toString(versionCode + 1));
                    }
                    buildButton.setEnabled(true);
                    saveButton.setVisibility(View.VISIBLE);
                    setStatus("APK готов · " + ApkBuilder.formatBytes(apk.length())
                            + " · постоянная подпись", false);
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
            iconSummary.setText("Своя иконка");
            Bitmap preview = BitmapFactory.decodeFile(iconFile.getAbsolutePath());
            if (preview != null) iconPreview.setImageBitmap(preview);
        }
    }

    private void setStatus(String message, boolean busy) {
        if (statusView != null) {
            statusView.setText(message);
            statusView.setTextColor(busy ? BLUE : MUTED);
        }
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

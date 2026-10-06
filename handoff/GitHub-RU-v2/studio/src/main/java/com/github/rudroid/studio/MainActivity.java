package com.github.rudroid.studio;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.InputType;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.rudroid.studio.node.NodeEngine;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * GitHub RU Studio — оболочка.
 *
 * <p>Вкладки: «Студия» (React-билд редактора + скачивания), «Vue» (тот же движок
 * на Vue, создаётся лениво — экономия памяти на старте), «Node.js» (нативная
 * консоль встроенного офлайн-движка).
 *
 * <p>Только фреймворк Android (API 28–36), ноль внешних зависимостей. Всё, что
 * касается файлов (скачивание, сохранение, открытие, «Поделиться»), живёт в
 * {@link StudioFiles} и вызывается из JavaScript через window.Studio.
 */
public class MainActivity extends Activity {

    private static final String PREFS = "studio";
    private static final String KEY_NIGHT = "night"; // -1 системная, 0 светлая, 1 тёмная

    private static final int REQ_OPEN = 1001;
    private static final int REQ_SAVE_AS = 1002;
    private static final int REQ_STORAGE = 1003;
    private static final int REQ_NOTIF = 1004;

    private static final String URL_STUDIO = "file:///android_asset/web/react/index.html";
    private static final String URL_VUE = "file:///android_asset/web/vue/index.html";

    private LinearLayout root;
    private LinearLayout navRow;
    private FrameLayout content;
    private WebView webStudio;
    private WebView webVue;
    private View nodePanel;
    private TextView engineChip;
    private TextView nodeStatus;
    private TextView nodeLog;
    private ScrollView nodeScroll;
    private EditText nodeInput;
    private LinearLayout[] navItems;
    private final List<WebView> aliveWebViews = new ArrayList<>();
    private StudioFiles files;

    private int cBg;
    private int cSurface;
    private int cSurface2;
    private int cBorder;
    private int cText;
    private int cMuted;
    private int cAccent;
    private int cAccentText;
    private int cChip;
    private int cDanger;

    private int currentTab;
    private boolean vueCreated;
    private boolean nodeStarted;
    private String pendingSaveName;
    private String pendingSaveText;

    // ------------------------------------------------------------------ Жизнь

    @Override
    protected void attachBaseContext(Context base) {
        // Своя тема без AndroidX: подменяем uiMode у конфигурации.
        SharedPreferences prefs = base.getSharedPreferences(PREFS, MODE_PRIVATE);
        int night = prefs.getInt(KEY_NIGHT, -1);
        if (night >= 0) {
            Configuration cfg = new Configuration(base.getResources().getConfiguration());
            cfg.uiMode = (cfg.uiMode & ~Configuration.UI_MODE_NIGHT_MASK)
                    | (night == 1 ? Configuration.UI_MODE_NIGHT_YES : Configuration.UI_MODE_NIGHT_NO);
            super.attachBaseContext(base.createConfigurationContext(cfg));
        } else {
            super.attachBaseContext(base);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView.setWebContentsDebuggingEnabled(false);

        cBg = getColor(R.color.bg);
        cSurface = getColor(R.color.surface);
        cSurface2 = getColor(R.color.surface2);
        cBorder = getColor(R.color.border);
        cText = getColor(R.color.text);
        cMuted = getColor(R.color.muted);
        cAccent = getColor(R.color.accent);
        cAccentText = getColor(R.color.accent_text);
        cChip = getColor(R.color.chip);
        cDanger = getColor(R.color.danger);

        files = new StudioFiles(this);

        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(cBg);
        root.addView(buildHeader(), new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        content = new FrameLayout(this);
        root.addView(content, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));

        webStudio = makeWebView(URL_STUDIO);
        content.addView(webStudio);
        nodePanel = buildNodePanel();
        nodePanel.setVisibility(View.GONE);
        content.addView(nodePanel);

        root.addView(buildNav(), new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        setContentView(root);
        applyInsets();
        selectTab(0);

        NodeEngine.setListener((state, status) -> runOnUiThread(() -> {
            engineChip.setText(shortEngineStatus(state));
            engineChip.setTextColor(engineColor(state));
            nodeStatus.setText(status);
            nodeStatus.setTextColor(engineColor(state));
            if (state == NodeEngine.State.READY) {
                injectAll();
            }
        }));

        // Оптимизация старта: движок поднимаем после первого кадра,
        // чтобы холодный запуск показывал интерфейс мгновенно.
        root.postDelayed(() -> {
            if (!nodeStarted) {
                nodeStarted = true;
                NodeEngine.ensureStarted(this);
            }
        }, 900);
    }

    private void applyInsets() {
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            root.setOnApplyWindowInsetsListener((v, insets) -> {
                android.graphics.Insets bars = insets.getInsets(
                        WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
                v.setPadding(bars.left, bars.top, bars.right, bars.bottom);
                return insets;
            });
            root.requestApplyInsets();
        } else {
            getWindow().setStatusBarColor(cBg);
            getWindow().setNavigationBarColor(cBg);
        }
    }

    @Override
    public void onBackPressed() {
        WebView active = currentTab == 0 ? webStudio : (currentTab == 1 ? webVue : null);
        if (active != null && active.canGoBack()) {
            active.goBack();
            return;
        }
        if (currentTab != 0) {
            selectTab(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        NodeEngine.setListener(null);
        for (WebView w : aliveWebViews) {
            w.destroy();
        }
        aliveWebViews.clear();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        // Оптимизация: освобождаем кеш рендера, не трогая дисковый кеш.
        for (WebView w : aliveWebViews) {
            w.clearCache(false);
        }
    }

    // -------------------------------------------------------------------- UI

    private View buildHeader() {
        LinearLayout header = new LinearLayout(this);
        header.setOrientation(LinearLayout.HORIZONTAL);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(dp(16), dp(12), dp(12), dp(10));
        header.setBackgroundColor(cBg);

        LinearLayout titles = new LinearLayout(this);
        titles.setOrientation(LinearLayout.VERTICAL);

        TextView title = new TextView(this);
        title.setText("GitHub RU Studio");
        title.setTextColor(cText);
        title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        title.setTypeface(Typeface.DEFAULT_BOLD);
        titles.addView(title);

        LinearLayout chips = new LinearLayout(this);
        chips.setOrientation(LinearLayout.HORIZONTAL);
        chips.setPadding(0, dp(6), 0, 0);

        engineChip = new TextView(this);
        engineChip.setText("Node.js: запуск…");
        engineChip.setTextSize(TypedValue.COMPLEX_UNIT_SP, 11);
        engineChip.setTextColor(cMuted);
        engineChip.setPadding(dp(10), dp(4), dp(10), dp(4));
        engineChip.setBackground(pill(cSurface2, cBorder));
        chips.addView(engineChip);

        TextView build = new TextView(this);
        build.setText("API 28–36 • arm64");
        build.setTextSize(TypedValue.COMPLEX_UNIT_SP, 11);
        build.setTextColor(cMuted);
        build.setPadding(dp(10), dp(4), dp(10), dp(4));
        build.setBackground(pill(cSurface2, cBorder));
        LinearLayout.LayoutParams blp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        blp.setMargins(dp(6), 0, 0, 0);
        chips.addView(build, blp);

        titles.addView(chips);
        header.addView(titles, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        header.addView(iconButton("🌓", v -> toggleTheme()));
        header.addView(iconButton("ℹ", v -> showAbout()));
        return header;
    }

    private Button iconButton(String glyph, View.OnClickListener click) {
        Button b = new Button(this);
        b.setText(glyph);
        b.setAllCaps(false);
        b.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        b.setTextColor(cText);
        b.setBackground(roundRect(cSurface, cBorder, 12));
        b.setOnClickListener(click);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(dp(44), dp(44));
        lp.setMargins(dp(8), 0, 0, 0);
        b.setLayoutParams(lp);
        return b;
    }

    private View buildNav() {
        navRow = new LinearLayout(this);
        navRow.setOrientation(LinearLayout.HORIZONTAL);
        navRow.setPadding(dp(10), dp(6), dp(10), dp(10));
        navRow.setBackgroundColor(cBg);
        navItems = new LinearLayout[]{
                navItem("📝", getString(R.string.tab_studio)),
                navItem("💚", getString(R.string.tab_vue)),
                navItem("🟢", getString(R.string.tab_node)),
        };
        for (int i = 0; i < navItems.length; i++) {
            final int index = i;
            navItems[i].setOnClickListener(v -> selectTab(index));
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0,
                    ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
            lp.setMargins(dp(4), 0, dp(4), 0);
            navRow.addView(navItems[i], lp);
        }
        return navRow;
    }

    private LinearLayout navItem(String icon, String label) {
        LinearLayout item = new LinearLayout(this);
        item.setOrientation(LinearLayout.VERTICAL);
        item.setGravity(Gravity.CENTER);
        item.setPadding(dp(6), dp(8), dp(6), dp(8));

        TextView ic = new TextView(this);
        ic.setText(icon);
        ic.setTextSize(TypedValue.COMPLEX_UNIT_SP, 17);
        ic.setGravity(Gravity.CENTER);
        item.addView(ic);

        TextView tx = new TextView(this);
        tx.setText(label);
        tx.setTextSize(TypedValue.COMPLEX_UNIT_SP, 11);
        tx.setGravity(Gravity.CENTER);
        tx.setPadding(0, dp(3), 0, 0);
        item.addView(tx);
        item.setContentDescription(label);
        return item;
    }

    private void selectTab(int index) {
        currentTab = index;
        if (index == 1 && !vueCreated) {
            webVue = makeWebView(URL_VUE);
            content.addView(webVue, 0);
            vueCreated = true;
        }
        if (index == 2 && !nodeStarted) {
            nodeStarted = true;
            NodeEngine.ensureStarted(this);
        }
        webStudio.setVisibility(index == 0 ? View.VISIBLE : View.GONE);
        if (webVue != null) {
            webVue.setVisibility(index == 1 ? View.VISIBLE : View.GONE);
        }
        nodePanel.setVisibility(index == 2 ? View.VISIBLE : View.GONE);
        for (int i = 0; i < navItems.length; i++) {
            paintNavItem(navItems[i], i == index);
        }
        View shown = index == 0 ? webStudio : (index == 1 ? webVue : nodePanel);
        if (shown != null) {
            shown.setAlpha(0f);
            shown.setTranslationY(dp(6));
            shown.animate().alpha(1f).translationY(0f).setDuration(170).start();
        }
        injectAll();
    }

    private void paintNavItem(LinearLayout item, boolean active) {
        TextView icon = (TextView) item.getChildAt(0);
        TextView label = (TextView) item.getChildAt(1);
        if (active) {
            item.setBackground(pill(cChip, cChip));
            label.setTextColor(cAccent);
            label.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            item.setBackground(ripple(0x00000000, cBorder));
            label.setTextColor(cMuted);
            label.setTypeface(Typeface.DEFAULT);
        }
        icon.setTextColor(active ? cAccent : cMuted);
    }

    // -------------------------------------------------------------- WebView

    private WebView makeWebView(String url) {
        WebView w = new WebView(this);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setDatabaseEnabled(true);
        s.setAllowFileAccess(true);
        s.setAllowContentAccess(true);
        // Локальная страница из assets должна уметь обращаться к 127.0.0.1
        // (встроенный Node.js) без CORS-ограничений file://.
        s.setAllowFileAccessFromFileURLs(true);
        s.setAllowUniversalAccessFromFileURLs(true);
        s.setUseWideViewPort(true);
        s.setLoadWithOverviewMode(true);
        s.setSupportZoom(false);
        s.setBuiltInZoomControls(false);
        s.setDisplayZoomControls(false);
        s.setMediaPlaybackRequiresUserGesture(false);
        s.setGeolocationEnabled(false);
        s.setSaveFormData(false);
        s.setCacheMode(WebSettings.LOAD_DEFAULT);
        s.setDefaultTextEncodingName("utf-8");
        if (Build.VERSION.SDK_INT >= 26) {
            w.setRendererPriorityPolicy(WebView.RENDERER_PRIORITY_BOUND, true);
        }
        w.setBackgroundColor(cBg);
        w.setOverScrollMode(View.OVER_SCROLL_NEVER);
        w.setVerticalScrollBarEnabled(false);
        w.setHorizontalScrollBarEnabled(false);
        w.addJavascriptInterface(files, "Studio");
        w.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String finishedUrl) {
                super.onPageFinished(view, finishedUrl);
                injectAll();
            }
        });
        w.setDownloadListener((downloadUrl, userAgent, contentDisposition, mimeType, contentLength) -> {
            String name = android.webkit.URLUtil.guessFileName(downloadUrl, contentDisposition, mimeType);
            String result = files.downloadUrl(downloadUrl, name);
            toastOnUi(result.startsWith("ok:") ? "Скачивание: " + name : result);
        });
        CookieManager.getInstance().setAcceptCookie(true);
        w.setLayoutParams(new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        w.loadUrl(url);
        aliveWebViews.add(w);
        return w;
    }

    /** Передаём веб-слою тему, порт Node.js и событие готовности. */
    private void injectAll() {
        int port = NodeEngine.getPort();
        StringBuilder js = new StringBuilder();
        js.append("window.__STUDIO_THEME__='").append(isNight() ? "dark" : "light").append("';");
        js.append("window.__STUDIO_APP__='GitHub RU Studio';");
        if (port > 0) {
            js.append("window.__NODE_PORT__=").append(port).append(";");
        }
        js.append("window.dispatchEvent(new Event('studio-ready'));");
        if (port > 0) {
            js.append("window.dispatchEvent(new Event('node-ready'));");
        }
        evalJsAll(js.toString());
    }

    void evalJsAll(String js) {
        for (WebView w : aliveWebViews) {
            try {
                w.evaluateJavascript(js, null);
            } catch (Exception ignored) {
            }
        }
    }

    void dispatchFileOpened(String name, String text) {
        String js = "window.StudioEditor&&window.StudioEditor.onFileOpened("
                + quote(name) + "," + quote(text) + ");";
        evalJsAll(js);
    }

    void toastOnUi(String message) {
        runOnUiThread(() -> Toast.makeText(this, message, Toast.LENGTH_SHORT).show());
    }

    // ------------------------------------------------------------ Node-панель

    private View buildNodePanel() {
        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setBackgroundColor(cBg);
        panel.setPadding(dp(14), dp(4), dp(14), dp(14));

        nodeStatus = new TextView(this);
        nodeStatus.setText("Запуск встроенного Node.js…");
        nodeStatus.setTextColor(cMuted);
        nodeStatus.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        panel.addView(nodeStatus);

        nodeLog = new TextView(this);
        nodeLog.setTextColor(cText);
        nodeLog.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        nodeLog.setTypeface(Typeface.MONOSPACE);
        nodeLog.setTextIsSelectable(true);
        nodeLog.setPadding(dp(12), dp(12), dp(12), dp(12));
        nodeScroll = new ScrollView(this);
        nodeScroll.setBackground(roundRect(cSurface, cBorder, 14));
        nodeScroll.addView(nodeLog);
        LinearLayout.LayoutParams logLp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f);
        logLp.setMargins(0, dp(10), 0, dp(10));
        panel.addView(nodeScroll, logLp);

        nodeInput = new EditText(this);
        nodeInput.setHint("JS-код, например: process.version");
        nodeInput.setHintTextColor(cMuted);
        nodeInput.setTextColor(cText);
        nodeInput.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        nodeInput.setTypeface(Typeface.MONOSPACE);
        nodeInput.setBackground(roundRect(cSurface, cBorder, 14));
        nodeInput.setPadding(dp(12), dp(12), dp(12), dp(12));
        nodeInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        nodeInput.setMinLines(2);
        nodeInput.setMaxLines(5);
        panel.addView(nodeInput, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setPadding(0, dp(10), 0, 0);

        Button run = new Button(this);
        run.setText("▶ Выполнить");
        run.setAllCaps(false);
        run.setBackgroundTintList(ColorStateList.valueOf(cAccent));
        run.setTextColor(cAccentText);
        run.setOnClickListener(v -> {
            String code = nodeInput.getText().toString().trim();
            if (code.isEmpty()) {
                return;
            }
            appendLog("> " + code, cMuted);
            run.setEnabled(false);
            NodeEngine.evalAsync(code, result -> runOnUiThread(() -> {
                run.setEnabled(true);
                appendLog(result.ok ? result.text : ("ОШИБКА: " + result.text),
                        result.ok ? cAccent : cDanger);
            }));
        });
        row.addView(run, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        Button clear = new Button(this);
        clear.setText("Очистить");
        clear.setAllCaps(false);
        clear.setTextColor(cText);
        clear.setBackgroundTintList(ColorStateList.valueOf(cSurface2));
        clear.setOnClickListener(v -> nodeLog.setText(""));
        LinearLayout.LayoutParams clp = new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        clp.setMargins(dp(8), 0, 0, 0);
        row.addView(clear, clp);
        panel.addView(row);

        appendLog("$ встроенный Node.js — офлайн, только 127.0.0.1", cMuted);
        return panel;
    }

    private void appendLog(String line, int color) {
        if (nodeLog == null) {
            return;
        }
        if (nodeLog.getText().length() > 4000) {
            nodeLog.setText(nodeLog.getText().subSequence(0, 2000));
        }
        if (nodeLog.getText().length() > 0) {
            nodeLog.append("\n");
        }
        int start = nodeLog.getText().length();
        nodeLog.append(line);
        if (nodeLog.getText() instanceof Spannable) {
            Spannable sp = (Spannable) nodeLog.getText();
            sp.setSpan(new ForegroundColorSpan(color), start, nodeLog.getText().length(),
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        if (nodeScroll != null) {
            nodeScroll.post(() -> nodeScroll.fullScroll(View.FOCUS_DOWN));
        }
    }

    private CharSequence shortEngineStatus(NodeEngine.State state) {
        switch (state) {
            case READY:
                return "Node.js " + NodeEngine.getNodeVersion();
            case STARTING:
                return "Node.js: запуск…";
            case UNAVAILABLE:
                return "Node.js: lite-сборка";
            case FAILED:
                return "Node.js: ошибка";
            default:
                return "Node.js: ожидание";
        }
    }

    private int engineColor(NodeEngine.State state) {
        switch (state) {
            case READY:
                return cAccent;
            case FAILED:
                return cDanger;
            default:
                return cMuted;
        }
    }

    String nodeStateName() {
        return NodeEngine.getState().name();
    }

    String nodeVersion() {
        return NodeEngine.getNodeVersion();
    }

    // ------------------------------------------------------------------ Тема

    boolean isNight() {
        int mode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        return mode == Configuration.UI_MODE_NIGHT_YES;
    }

    String currentThemeName() {
        return isNight() ? "dark" : "light";
    }

    private void toggleTheme() {
        boolean goDark = !isNight();
        getSharedPreferences(PREFS, MODE_PRIVATE).edit()
                .putInt(KEY_NIGHT, goDark ? 1 : 0).apply();
        if (Build.VERSION.SDK_INT >= 31) {
            android.app.UiModeManager uiModeManager = getSystemService(android.app.UiModeManager.class);
            if (uiModeManager != null) {
                uiModeManager.setApplicationNightMode(
                        goDark ? android.app.UiModeManager.MODE_NIGHT_YES
                                : android.app.UiModeManager.MODE_NIGHT_NO);
            }
        }
        recreate();
    }

    // ------------------------------------------------- Файлы (мост → отсюда)

    void launchOpenDocument() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_MIME_TYPES, new String[]{
                "text/*", "application/json", "application/javascript", "application/xml",
                "application/x-yaml", "application/octet-stream"});
        try {
            startActivityForResult(intent, REQ_OPEN);
        } catch (ActivityNotFoundException e) {
            toastOnUi("На устройстве нет файлового менеджера");
        }
    }

    void launchCreateDocument(String name, String text) {
        pendingSaveName = name;
        pendingSaveText = text;
        Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TITLE, name);
        try {
            startActivityForResult(intent, REQ_SAVE_AS);
        } catch (ActivityNotFoundException e) {
            toastOnUi("На устройстве нет файлового менеджера");
        }
    }

    String startSystemDownload(String url, String name, String mime) {
        try {
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(Uri.parse(url));
            request.setTitle(name);
            request.setDescription("GitHub RU Studio");
            request.setMimeType(mime);
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(
                    android.app.DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(
                    android.os.Environment.DIRECTORY_DOWNLOADS, StudioFiles.FOLDER + "/" + name);
            android.app.DownloadManager dm =
                    (android.app.DownloadManager) getSystemService(DOWNLOAD_SERVICE);
            if (dm == null) {
                return "err:DownloadManager недоступен";
            }
            long id = dm.enqueue(request);
            return "ok:скачивание запущено (#" + id + ") → Загрузки/" + StudioFiles.FOLDER;
        } catch (Exception e) {
            return "err:" + e.getMessage();
        }
    }

    void shareText(String name, String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, name);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        try {
            startActivity(Intent.createChooser(intent, "Поделиться"));
        } catch (Exception e) {
            toastOnUi("Не удалось поделиться: " + e.getMessage());
        }
    }

    String openContent(Uri uri, String mime) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(uri, mime == null || mime.isEmpty() ? "*/*" : mime);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return "ok:открываю";
        } catch (Exception e) {
            return "err:" + e.getMessage();
        }
    }

    void scanFile(java.io.File file) {
        try {
            android.media.MediaScannerConnection.scanFile(this,
                    new String[]{file.getAbsolutePath()}, null, null);
        } catch (Exception ignored) {
        }
    }

    boolean ensureStoragePermission() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED) {
            return true;
        }
        requestPermissions(new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQ_STORAGE);
        return false;
    }

    void requestNotificationPermissionIfNeeded() {
        if (Build.VERSION.SDK_INT >= 33 && checkSelfPermission("android.permission.POST_NOTIFICATIONS")
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, REQ_NOTIF);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK || data == null || data.getData() == null) {
            return;
        }
        Uri uri = data.getData();
        if (requestCode == REQ_OPEN) {
            try {
                String text = readText(uri);
                dispatchFileOpened(displayName(uri), text);
                toastOnUi("Открыт файл: " + displayName(uri));
            } catch (Exception e) {
                toastOnUi("Не удалось прочитать файл: " + e.getMessage());
            }
        } else if (requestCode == REQ_SAVE_AS) {
            try {
                ContentResolver cr = getContentResolver();
                try (OutputStream out = cr.openOutputStream(uri, "wt")) {
                    if (out != null) {
                        out.write((pendingSaveText == null ? "" : pendingSaveText)
                                .getBytes(StandardCharsets.UTF_8));
                        out.flush();
                    }
                }
                toastOnUi("Сохранено: " + displayName(uri));
            } catch (Exception e) {
                toastOnUi("Не удалось сохранить: " + e.getMessage());
            } finally {
                pendingSaveText = null;
                pendingSaveName = null;
            }
        }
    }

    private String readText(Uri uri) throws Exception {
        ContentResolver cr = getContentResolver();
        try (InputStream in = cr.openInputStream(uri)) {
            if (in == null) {
                throw new IllegalStateException("пустой поток");
            }
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[65536];
            int n;
            int total = 0;
            while ((n = in.read(buf)) > 0) {
                total += n;
                if (total > 8 * 1024 * 1024) {
                    throw new IllegalStateException("файл больше 8 МБ — редактор рассчитан на тексты");
                }
                bos.write(buf, 0, n);
            }
            return bos.toString("UTF-8");
        }
    }

    private String displayName(Uri uri) {
        try (Cursor c = getContentResolver().query(uri,
                new String[]{android.provider.OpenableColumns.DISPLAY_NAME}, null, null, null)) {
            if (c != null && c.moveToFirst() && c.getString(0) != null) {
                return c.getString(0);
            }
        } catch (Exception ignored) {
        }
        String last = uri.getLastPathSegment();
        return last == null ? "file.txt" : last;
    }

    // -------------------------------------------------------------- Диалоги

    private void showAbout() {
        StringBuilder sb = new StringBuilder();
        try {
            PackageInfo pi = getPackageManager().getPackageInfo(getPackageName(), 0);
            sb.append("Версия: ").append(pi.versionName).append(" (").append(pi.getLongVersionCode()).append(")\n");
        } catch (Exception e) {
            sb.append("Версия: ?\n");
        }
        sb.append("Пакет: ").append(getPackageName()).append("\n");
        sb.append("Android: ").append(Build.VERSION.RELEASE).append(" (API ").append(Build.VERSION.SDK_INT).append(")\n");
        sb.append("ABI: ").append(String.join(", ", Build.SUPPORTED_ABIS)).append("\n");
        sb.append("Node.js: ").append(NodeEngine.isReady()
                ? NodeEngine.getNodeVersion() + " (офлайн)" : nodeStateName()).append("\n\n");
        sb.append("Что умеет:\n");
        for (String line : StudioFiles.featureList()) {
            sb.append("• ").append(line).append("\n");
        }
        sb.append("\nФайлы сохраняются в «Загрузки/").append(StudioFiles.FOLDER).append("».");
        new AlertDialog.Builder(this)
                .setTitle("GitHub RU Studio")
                .setMessage(sb.toString())
                .setPositiveButton("Понятно", null)
                .show();
    }

    // ------------------------------------------------------------ Отрисовка

    private GradientDrawable roundRect(int fill, int stroke, int radiusDp) {
        GradientDrawable d = new GradientDrawable();
        d.setShape(GradientDrawable.RECTANGLE);
        d.setColor(fill);
        d.setCornerRadius(dp(radiusDp));
        if (stroke != 0) {
            d.setStroke(dp(1), stroke);
        }
        return d;
    }

    private GradientDrawable pill(int fill, int stroke) {
        return roundRect(fill, stroke, 999);
    }

    private android.graphics.drawable.Drawable ripple(int fill, int stroke) {
        GradientDrawable content = roundRect(fill, stroke, 999);
        return new RippleDrawable(ColorStateList.valueOf(cBorder & 0x22FFFFFF), content, null);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    /** JSON-строка для безопасной передачи текста в JavaScript. */
    private String quote(String text) {
        return org.json.JSONObject.quote(text == null ? "" : text);
    }
}

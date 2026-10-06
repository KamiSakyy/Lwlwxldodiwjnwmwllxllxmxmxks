package com.github.rudroid.studio;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.github.rudroid.studio.node.NodeEngine;

/**
 * GitHub RU Studio — стартовый экран.
 *
 * <p>Три вкладки: React (WebView на локальные assets), Vue (WebView на локальные
 * assets), Node.js (консоль встроенного офлайн-движка). Всё работает без интернета.
 *
 * <p>Только фреймворк Android (API 28–36), без единой внешней зависимости.
 */
public class MainActivity extends Activity {

    private static final int BG = 0xFF0D1117;
    private static final int CARD = 0xFF161B22;
    private static final int GREEN = 0xFF3FB950;
    private static final int TEXT = 0xFFE6EDF3;
    private static final int DIM = 0xFF9AA4B2;
    private static final int RED = 0xFFF85149;

    private Button tabReact;
    private Button tabVue;
    private Button tabNode;
    private WebView webReact;
    private WebView webVue;
    private View nodePanel;
    private TextView nodeStatus;
    private TextView nodeLog;
    private ScrollView nodeScroll;
    private EditText nodeInput;
    private boolean demoDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(BG);
        getWindow().setNavigationBarColor(BG);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(BG);

        // Шапка.
        TextView header = new TextView(this);
        header.setText("GitHub RU Studio  •  API 28–36  •  офлайн");
        header.setTextColor(TEXT);
        header.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        header.setTypeface(Typeface.DEFAULT_BOLD);
        header.setGravity(Gravity.CENTER);
        int pad = dp(12);
        header.setPadding(pad, pad, pad, dp(4));
        root.addView(header, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView sub = new TextView(this);
        sub.setText(NodeEngine.deviceInfo() + "  •  React + Vue + Node.js 24 внутри APK");
        sub.setTextColor(DIM);
        sub.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        sub.setGravity(Gravity.CENTER);
        sub.setPadding(pad, 0, pad, dp(8));
        root.addView(sub, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        // Вкладки.
        LinearLayout tabs = new LinearLayout(this);
        tabs.setOrientation(LinearLayout.HORIZONTAL);
        tabs.setPadding(dp(8), 0, dp(8), dp(8));
        tabReact = makeTab("⚛ React", tabs);
        tabVue = makeTab("💚 Vue", tabs);
        tabNode = makeTab("🟢 Node.js", tabs);
        root.addView(tabs, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        // Контент.
        FrameLayout content = new FrameLayout(this);
        content.setBackgroundColor(BG);
        webReact = makeWebView("file:///android_asset/web/react/index.html");
        webVue = makeWebView("file:///android_asset/web/vue/index.html");
        nodePanel = makeNodePanel();
        content.addView(webReact);
        content.addView(webVue);
        content.addView(nodePanel);
        root.addView(content, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));

        setContentView(root);
        selectTab(0);

        // Движок стартует в фоне сразу.
        NodeEngine.setListener((state, status) -> runOnUiThread(() -> {
            nodeStatus.setText(status);
            nodeStatus.setTextColor(state == NodeEngine.State.READY ? GREEN
                    : (state == NodeEngine.State.FAILED ? RED : DIM));
            if (state == NodeEngine.State.READY) {
                injectNodePort();
                if (!demoDone) {
                    demoDone = true;
                    runDemo();
                }
            }
        }));
        NodeEngine.ensureStarted(this);
    }

    private Button makeTab(String title, LinearLayout parent) {
        Button b = new Button(this);
        b.setText(title);
        b.setAllCaps(false);
        b.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        lp.setMargins(dp(4), 0, dp(4), 0);
        parent.addView(b, lp);
        if (title.contains("React")) {
            b.setOnClickListener(v -> selectTab(0));
        } else if (title.contains("Vue")) {
            b.setOnClickListener(v -> selectTab(1));
        } else {
            b.setOnClickListener(v -> selectTab(2));
        }
        return b;
    }

    private void selectTab(int index) {
        webReact.setVisibility(index == 0 ? View.VISIBLE : View.GONE);
        webVue.setVisibility(index == 1 ? View.VISIBLE : View.GONE);
        nodePanel.setVisibility(index == 2 ? View.VISIBLE : View.GONE);
        paintTab(tabReact, index == 0);
        paintTab(tabVue, index == 1);
        paintTab(tabNode, index == 2);
    }

    private void paintTab(Button b, boolean active) {
        if (active) {
            b.setBackgroundTintList(android.content.res.ColorStateList.valueOf(GREEN));
            b.setTextColor(Color.BLACK);
        } else {
            b.setBackgroundTintList(null);
            b.setTextColor(TEXT);
        }
    }

    private WebView makeWebView(String url) {
        WebView w = new WebView(this);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setAllowFileAccess(true);
        s.setAllowContentAccess(true);
        s.setUseWideViewPort(true);
        s.setLoadWithOverviewMode(true);
        s.setMediaPlaybackRequiresUserGesture(false);
        w.setBackgroundColor(BG);
        w.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String finishedUrl) {
                super.onPageFinished(view, finishedUrl);
                injectNodePort();
            }
        });
        w.setLayoutParams(new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        w.loadUrl(url);
        return w;
    }

    /** Передаём локальным страницам порт Node.js, чтобы React/Vue вызывали движок. */
    private void injectNodePort() {
        int port = NodeEngine.getPort();
        if (port <= 0) {
            return;
        }
        String js = "window.__NODE_PORT__=" + port
                + ";window.dispatchEvent(new Event('node-ready'));";
        runOnUiThread(() -> {
            try {
                webReact.evaluateJavascript(js, null);
            } catch (Exception ignored) {
            }
            try {
                webVue.evaluateJavascript(js, null);
            } catch (Exception ignored) {
            }
        });
    }

    private View makeNodePanel() {
        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setBackgroundColor(BG);
        panel.setPadding(dp(12), dp(4), dp(12), dp(12));
        panel.setLayoutParams(new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        nodeStatus = new TextView(this);
        nodeStatus.setText("Запуск встроенного Node.js…");
        nodeStatus.setTextColor(DIM);
        nodeStatus.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        panel.addView(nodeStatus);

        nodeLog = new TextView(this);
        nodeLog.setTextColor(TEXT);
        nodeLog.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13);
        nodeLog.setTypeface(Typeface.MONOSPACE);
        nodeLog.setTextIsSelectable(true);
        nodeLog.setPadding(dp(10), dp(10), dp(10), dp(10));
        nodeScroll = new ScrollView(this);
        nodeScroll.setBackgroundColor(CARD);
        nodeScroll.addView(nodeLog);
        LinearLayout.LayoutParams logLp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f);
        logLp.setMargins(0, dp(8), 0, dp(8));
        panel.addView(nodeScroll, logLp);

        nodeInput = new EditText(this);
        nodeInput.setHint("JS-код, например: process.version");
        nodeInput.setHintTextColor(DIM);
        nodeInput.setTextColor(TEXT);
        nodeInput.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        nodeInput.setTypeface(Typeface.MONOSPACE);
        nodeInput.setBackgroundColor(CARD);
        nodeInput.setPadding(dp(10), dp(10), dp(10), dp(10));
        nodeInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        nodeInput.setMinLines(2);
        nodeInput.setMaxLines(6);
        panel.addView(nodeInput, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setPadding(0, dp(8), 0, 0);

        Button run = new Button(this);
        run.setText("▶ Выполнить");
        run.setAllCaps(false);
        run.setBackgroundTintList(android.content.res.ColorStateList.valueOf(GREEN));
        run.setTextColor(Color.BLACK);
        run.setOnClickListener(v -> {
            String code = nodeInput.getText().toString().trim();
            if (code.isEmpty()) {
                return;
            }
            appendLog("> " + code, TEXT);
            run.setEnabled(false);
            NodeEngine.evalAsync(code, result -> runOnUiThread(() -> {
                run.setEnabled(true);
                appendLog(result.ok ? result.text : ("ОШИБКА: " + result.text),
                        result.ok ? GREEN : RED);
            }));
        });
        row.addView(run, new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f));

        Button info = new Button(this);
        info.setText("ℹ Версия");
        info.setAllCaps(false);
        info.setTextColor(TEXT);
        LinearLayout.LayoutParams infoLp = new LinearLayout.LayoutParams(0,
                ViewGroup.LayoutParams.WRAP_CONTENT, 1f);
        infoLp.setMargins(dp(8), 0, 0, 0);
        info.setOnClickListener(v -> {
            appendLog("> process.version", TEXT);
            NodeEngine.evalAsync("process.version", result -> runOnUiThread(() ->
                    appendLog(result.ok ? result.text : ("ОШИБКА: " + result.text),
                            result.ok ? GREEN : RED)));
        });
        row.addView(info, infoLp);
        panel.addView(row);
        return panel;
    }

    private void runDemo() {
        appendLog("$ встроенный Node.js " + NodeEngine.getNodeVersion() + " (офлайн)",
                DIM);
        NodeEngine.evalAsync(
                "({node: process.version, v8: process.versions.v8, "
                        + "platform: process.platform + '/' + process.arch})",
                result -> runOnUiThread(() -> appendLog(
                        result.ok ? result.text : ("ОШИБКА: " + result.text),
                        result.ok ? GREEN : RED)));
    }

    private void appendLog(String line, int color) {
        if (nodeLog.getText().length() > 0) {
            nodeLog.append("\n");
        }
        int start = nodeLog.getText().length();
        nodeLog.append(line);
        if (nodeLog.getText() instanceof android.text.Spannable) {
            android.text.Spannable sp = (android.text.Spannable) nodeLog.getText();
            sp.setSpan(new android.text.style.ForegroundColorSpan(color), start,
                    start + line.length(), android.text.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        nodeScroll.post(() -> nodeScroll.fullScroll(View.FOCUS_DOWN));
    }

    private int dp(int v) {
        return Math.round(v * getResources().getDisplayMetrics().density);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onBackPressed() {
        if (webReact.getVisibility() == View.VISIBLE && webReact.canGoBack()) {
            webReact.goBack();
        } else if (webVue.getVisibility() == View.VISIBLE && webVue.canGoBack()) {
            webVue.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        NodeEngine.setListener(null);
        if (webReact != null) {
            webReact.destroy();
        }
        if (webVue != null) {
            webVue.destroy();
        }
        super.onDestroy();
    }
}

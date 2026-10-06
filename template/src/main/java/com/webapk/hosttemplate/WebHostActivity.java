package com.webapk.hosttemplate;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.webapk.security.EncryptedSiteArchive;
import com.webapk.security.N;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

/** Minimal offline WebView shell embedded in the compiler as a reusable APK template. */
public final class WebHostActivity extends Activity {
    private static final String FULLSCREEN_META = "com.webapk.studio.FULLSCREEN";
    private WebView webView;
    private FrameLayout rootFrame;
    private View splashView;
    private TextView splashMessage;
    private ProgressBar splashProgress;
    private Button retryButton;
    private volatile EncryptedSiteArchive siteArchive;
    private volatile boolean destroyed;
    private volatile boolean loadFailed;
    private boolean fullscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fullscreen = readFullscreenSetting();
        configureSystemBars(getWindow());

        webView = new WebView(this);
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                return interceptSiteRequest(request.getUrl().toString());
            }

            @Override
            public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                return interceptSiteRequest(url);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!loadFailed && url != null
                        && url.startsWith("https://appassets.androidplatform.net/site/")) {
                    showSiteContent();
                }
            }

            @android.annotation.TargetApi(23)
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                if (request.isForMainFrame()) showLoadFailure("Не удалось открыть страницу сайта. Проверьте index.html.");
            }

            @android.annotation.TargetApi(23)
            @Override
            public void onReceivedHttpError(WebView view, WebResourceRequest request,
                                            WebResourceResponse response) {
                super.onReceivedHttpError(view, request, response);
                if (request.isForMainFrame() && response.getStatusCode() >= 400) {
                    showLoadFailure("Стартовая страница не найдена или не читается.");
                }
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                if (failingUrl != null && failingUrl.endsWith("/site/index.html")) {
                    showLoadFailure("Не удалось открыть страницу сайта. Проверьте index.html.");
                }
            }
        });
        webView.setWebChromeClient(new WebChromeClient());

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);

        rootFrame = new FrameLayout(this);
        rootFrame.setBackgroundColor(Color.rgb(9, 19, 27));
        rootFrame.addView(webView, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        splashView = createSplashView();
        rootFrame.addView(splashView, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(rootFrame);
        showLoadingSplash();
        loadEncryptedSite();
    }

    private void loadEncryptedSite() {
        showLoadingSplash();
        if (webView != null) webView.stopLoading();
        EncryptedSiteArchive previous = siteArchive;
        siteArchive = null;
        if (previous != null) {
            try { previous.close(); } catch (IOException ignored) { }
        }
        new Thread(() -> {
            EncryptedSiteArchive opened = null;
            File encryptedFile = new File(getCacheDir(), EncryptedSiteArchive.ASSET_NAME);
            try {
                try (InputStream asset = getAssets().open(EncryptedSiteArchive.ASSET_NAME);
                     OutputStream output = new BufferedOutputStream(new FileOutputStream(encryptedFile))) {
                    copy(asset, output);
                }
                if (destroyed) {
                    encryptedFile.delete();
                    return;
                }
                byte[] masterKey = N.k();
                try {
                    opened = EncryptedSiteArchive.open(encryptedFile, masterKey);
                } finally {
                    Arrays.fill(masterKey, (byte) 0);
                }
                EncryptedSiteArchive ready = opened;
                runOnUiThread(() -> {
                    if (destroyed || webView == null) {
                        try { ready.close(); } catch (IOException ignored) { }
                        return;
                    }
                    siteArchive = ready;
                    webView.loadUrl("https://appassets.androidplatform.net/site/index.html");
                });
            } catch (Exception failure) {
                if (opened != null) {
                    try { opened.close(); } catch (IOException ignored) { }
                }
                runOnUiThread(() -> {
                    if (!destroyed) showLoadFailure("Не удалось подготовить проект. Попробуйте переустановить APK.");
                });
            }
        }, "webapk-encrypted-site").start();
    }

    private View createSplashView() {
        LinearLayout splash = new LinearLayout(this);
        splash.setOrientation(LinearLayout.VERTICAL);
        splash.setGravity(Gravity.CENTER);
        splash.setPadding(dp(28), dp(24), dp(28), dp(24));
        splash.setBackgroundColor(Color.rgb(9, 19, 27));

        ImageView icon = new ImageView(this);
        GradientDrawable iconBackground = new GradientDrawable();
        iconBackground.setColor(Color.rgb(25, 49, 61));
        iconBackground.setCornerRadius(dp(24));
        icon.setBackground(iconBackground);
        icon.setClipToOutline(true);
        icon.setPadding(dp(12), dp(12), dp(12), dp(12));
        icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
        try {
            icon.setImageDrawable(getPackageManager().getApplicationIcon(getPackageName()));
        } catch (PackageManager.NameNotFoundException ignored) { }
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(dp(88), dp(88));
        iconParams.bottomMargin = dp(20);
        splash.addView(icon, iconParams);

        TextView title = new TextView(this);
        title.setText(getPackageManager().getApplicationLabel(getApplicationInfo()));
        title.setTextColor(Color.rgb(242, 247, 248));
        title.setTextSize(22f);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setMaxLines(2);
        splash.addView(title, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        splashMessage = new TextView(this);
        splashMessage.setTextColor(Color.rgb(167, 186, 197));
        splashMessage.setTextSize(13f);
        splashMessage.setGravity(Gravity.CENTER);
        splashMessage.setText("Подготавливаем приложение…");
        LinearLayout.LayoutParams messageParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        messageParams.topMargin = dp(10);
        splash.addView(splashMessage, messageParams);

        splashProgress = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
        splashProgress.setIndeterminate(true);
        LinearLayout.LayoutParams progressParams = new LinearLayout.LayoutParams(dp(188), dp(5));
        progressParams.topMargin = dp(18);
        splash.addView(splashProgress, progressParams);

        retryButton = new Button(this);
        retryButton.setText("Повторить");
        retryButton.setAllCaps(false);
        retryButton.setTextSize(14f);
        retryButton.setTextColor(Color.rgb(6, 23, 16));
        GradientDrawable retryBackground = new GradientDrawable();
        retryBackground.setColor(Color.rgb(103, 228, 193));
        retryBackground.setCornerRadius(dp(14));
        retryButton.setBackground(retryBackground);
        retryButton.setPadding(dp(22), dp(8), dp(22), dp(8));
        retryButton.setVisibility(View.GONE);
        retryButton.setOnClickListener(view -> {
            showLoadingSplash();
            loadEncryptedSite();
        });
        LinearLayout.LayoutParams retryParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        retryParams.topMargin = dp(8);
        splash.addView(retryButton, retryParams);
        return splash;
    }

    private void showLoadingSplash() {
        loadFailed = false;
        if (webView != null) webView.setVisibility(View.INVISIBLE);
        if (rootFrame != null && splashView == null) {
            splashView = createSplashView();
            rootFrame.addView(splashView, new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        }
        if (splashView != null) {
            splashView.setAlpha(1f);
            splashView.setVisibility(View.VISIBLE);
        }
        if (splashMessage != null) splashMessage.setText("Подготавливаем приложение…");
        if (splashProgress != null) splashProgress.setVisibility(View.VISIBLE);
        if (retryButton != null) retryButton.setVisibility(View.GONE);
    }

    private void showSiteContent() {
        if (destroyed || loadFailed || webView == null) return;
        webView.setVisibility(View.VISIBLE);
        View overlay = splashView;
        if (overlay == null) return;
        overlay.animate().alpha(0f).setDuration(220L).withEndAction(() -> {
            if (rootFrame != null) rootFrame.removeView(overlay);
            if (splashView == overlay) splashView = null;
        }).start();
    }

    private void showLoadFailure(String message) {
        if (destroyed) return;
        loadFailed = true;
        if (webView != null) webView.setVisibility(View.INVISIBLE);
        if (rootFrame != null && splashView == null) {
            splashView = createSplashView();
            rootFrame.addView(splashView, new FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        }
        if (splashView != null) {
            splashView.setAlpha(1f);
            splashView.setVisibility(View.VISIBLE);
        }
        if (splashMessage != null) splashMessage.setText(message);
        if (splashProgress != null) splashProgress.setVisibility(View.GONE);
        if (retryButton != null) retryButton.setVisibility(View.VISIBLE);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private WebResourceResponse interceptSiteRequest(String rawUrl) {
        Uri uri = Uri.parse(rawUrl);
        if (!"https".equals(uri.getScheme())
                || !"appassets.androidplatform.net".equals(uri.getHost())) return null;
        String path = uri.getPath();
        if (path == null) return errorResponse(404, "Not Found", "Missing path");
        String relative = path.startsWith("/site/") ? path.substring("/site/".length())
                : path.startsWith("/") ? path.substring(1) : path;
        if (relative.isEmpty() || "/site".equals(path)) relative = "index.html";
        EncryptedSiteArchive archive = siteArchive;
        if (archive == null) return errorResponse(503, "Service Unavailable", "Site is not ready");
        try {
            InputStream content = archive.openResource(relative);
            if (content == null) return errorResponse(404, "Not Found", "Site resource not found");
            String mimeType = mimeType(relative);
            return new WebResourceResponse(mimeType, isTextResource(mimeType) ? "UTF-8" : null, content);
        } catch (IOException failure) {
            return errorResponse(500, "Internal Server Error", "Site resource could not be decrypted");
        }
    }

    private static WebResourceResponse errorResponse(int status, String reason, String message) {
        return new WebResourceResponse("text/plain", "UTF-8", status, reason,
                Collections.<String, String>emptyMap(),
                new ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8)));
    }

    private static String mimeType(String path) {
        String lower = path.toLowerCase(java.util.Locale.ROOT);
        if (lower.endsWith(".html") || lower.endsWith(".htm")) return "text/html";
        if (lower.endsWith(".css")) return "text/css";
        if (lower.endsWith(".js") || lower.endsWith(".mjs")) return "application/javascript";
        if (lower.endsWith(".json")) return "application/json";
        if (lower.endsWith(".xml")) return "application/xml";
        if (lower.endsWith(".svg")) return "image/svg+xml";
        if (lower.endsWith(".png")) return "image/png";
        if (lower.endsWith(".jpg") || lower.endsWith(".jpeg")) return "image/jpeg";
        if (lower.endsWith(".gif")) return "image/gif";
        if (lower.endsWith(".webp")) return "image/webp";
        if (lower.endsWith(".ico")) return "image/x-icon";
        if (lower.endsWith(".woff2")) return "font/woff2";
        if (lower.endsWith(".woff")) return "font/woff";
        if (lower.endsWith(".ttf")) return "font/ttf";
        if (lower.endsWith(".otf")) return "font/otf";
        if (lower.endsWith(".mp4")) return "video/mp4";
        if (lower.endsWith(".mp3")) return "audio/mpeg";
        if (lower.endsWith(".pdf")) return "application/pdf";
        return "application/octet-stream";
    }

    private static boolean isTextResource(String mimeType) {
        return mimeType.startsWith("text/") || mimeType.contains("javascript")
                || mimeType.contains("json") || mimeType.contains("xml") || mimeType.contains("svg");
    }

    private static void copy(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[64 * 1024];
        int count;
        while ((count = input.read(buffer)) != -1) output.write(buffer, 0, count);
    }

    private boolean readFullscreenSetting() {
        try {
            android.os.Bundle metadata = getPackageManager()
                    .getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA).metaData;
            return metadata != null && Boolean.parseBoolean(metadata.getString(FULLSCREEN_META));
        } catch (PackageManager.NameNotFoundException ignored) {
            return false;
        }
    }

    private void configureSystemBars(Window window) {
        if (Build.VERSION.SDK_INT >= 30) window.setDecorFitsSystemWindows(false);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.setStatusBarColor(Color.TRANSPARENT);
        window.setNavigationBarColor(Color.TRANSPARENT);
        if (Build.VERSION.SDK_INT >= 28) window.setNavigationBarDividerColor(Color.TRANSPARENT);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        window.getDecorView().setSystemUiVisibility(systemUiFlags());
    }

    private int systemUiFlags() {
        int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
        if (fullscreen) {
            flags |= View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        }
        return flags;
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && fullscreen) getWindow().getDecorView().setSystemUiVisibility(systemUiFlags());
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
        destroyed = true;
        if (webView != null) {
            webView.stopLoading();
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            webView.destroy();
            webView = null;
        }
        EncryptedSiteArchive archive = siteArchive;
        siteArchive = null;
        if (archive != null) {
            try { archive.close(); } catch (IOException ignored) { }
        }
        File encryptedFile = new File(getCacheDir(), EncryptedSiteArchive.ASSET_NAME);
        if (encryptedFile.exists()) encryptedFile.delete();
        if (rootFrame != null) rootFrame.removeAllViews();
        rootFrame = null;
        splashView = null;
        splashMessage = null;
        splashProgress = null;
        retryButton = null;
        super.onDestroy();
    }
}

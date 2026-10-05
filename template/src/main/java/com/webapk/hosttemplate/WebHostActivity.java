package com.webapk.hosttemplate;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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
    private volatile EncryptedSiteArchive siteArchive;
    private volatile boolean destroyed;
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

        setContentView(webView);
        loadEncryptedSite();
    }

    private void loadEncryptedSite() {
        new Thread(() -> {
            EncryptedSiteArchive opened = null;
            File encryptedFile = new File(getCacheDir(), EncryptedSiteArchive.ASSET_NAME);
            try {
                try (InputStream asset = getAssets().open(EncryptedSiteArchive.ASSET_NAME);
                     OutputStream output = new BufferedOutputStream(new FileOutputStream(encryptedFile))) {
                    copy(asset, output);
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
                    if (webView != null) {
                        webView.loadDataWithBaseURL("https://appassets.androidplatform.net/",
                                "<!doctype html><meta charset=utf-8><p>Не удалось открыть защищённый сайт.</p>",
                                "text/html", "UTF-8", null);
                    }
                });
            }
        }, "webapk-encrypted-site").start();
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
        if (Build.VERSION.SDK_INT >= 23) flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        if (Build.VERSION.SDK_INT >= 26) flags |= View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
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
        super.onDestroy();
    }
}

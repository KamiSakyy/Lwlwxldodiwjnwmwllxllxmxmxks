package com.webapk.hosttemplate;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** Runs the packaged Python/WSGI project on loopback and displays it in the Android WebView. */
public final class PythonHostActivity extends ComponentActivity {
    private static final String FULLSCREEN_META = "com.webapk.studio.FULLSCREEN";
    private final ExecutorService engineExecutor = Executors.newSingleThreadExecutor();
    private FrameLayout root;
    private WebView webView;
    private View splash;
    private TextView message;
    private ProgressBar progress;
    private Button retry;
    private volatile boolean destroyed;
    private volatile PyObject engineModule;
    private volatile String serverUrl;
    private PermissionRequest pendingMediaRequest;
    private ValueCallback<android.net.Uri[]> pendingFileCallback;
    private ActivityResultLauncher<Intent> fileChooserLauncher;
    private ActivityResultLauncher<String[]> mediaPermissionLauncher;
    private boolean fullscreen;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        registerActivityResults();
        registerBackNavigation();
        fullscreen = readFullscreenSetting();
        configureSystemBars(getWindow());

        root = new FrameLayout(this);
        root.setBackgroundColor(Color.rgb(9, 19, 27));
        webView = new WebView(this);
        webView.setBackgroundColor(Color.TRANSPARENT);
        webView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        configureWebView();
        root.addView(webView, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        splash = createSplash();
        root.addView(splash, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(root);
        showLoading("Запускаем локальный Python-сервер…");
        startServer();
    }

    private void registerBackNavigation() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                if (webView != null && webView.canGoBack()) {
                    webView.goBack();
                } else {
                    setEnabled(false);
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
        });
    }

    private void registerActivityResults() {
        fileChooserLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    ValueCallback<android.net.Uri[]> callback = pendingFileCallback;
                    pendingFileCallback = null;
                    if (callback != null) callback.onReceiveValue(
                            result.getResultCode() == RESULT_OK
                                    ? WebChromeClient.FileChooserParams.parseResult(result.getResultCode(), result.getData())
                                    : null);
                });
        mediaPermissionLauncher = registerForActivityResult(
                new ActivityResultContracts.RequestMultiplePermissions(), result -> {
                    PermissionRequest request = pendingMediaRequest;
                    pendingMediaRequest = null;
                    if (request == null || destroyed || !isLocalServerUrl(request.getOrigin().toString())) return;
                    boolean granted = !result.isEmpty();
                    for (Boolean value : result.values()) granted &= Boolean.TRUE.equals(value);
                    if (granted) request.grant(request.getResources());
                    else request.deny();
                });
    }

    private void configureWebView() {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view, ValueCallback<android.net.Uri[]> callback,
                                             FileChooserParams params) {
                if (pendingFileCallback != null) pendingFileCallback.onReceiveValue(null);
                pendingFileCallback = callback;
                try {
                    fileChooserLauncher.launch(params.createIntent());
                    return true;
                } catch (Exception ignored) {
                    pendingFileCallback = null;
                    callback.onReceiveValue(null);
                    return true;
                }
            }

            @Override
            public void onPermissionRequest(PermissionRequest request) {
                runOnUiThread(() -> requestWebMediaPermission(request));
            }

            @Override
            public void onPermissionRequestCanceled(PermissionRequest request) {
                if (pendingMediaRequest == request) pendingMediaRequest = null;
            }

            @Override
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebView popup = new WebView(PythonHostActivity.this);
                popup.getSettings().setJavaScriptEnabled(true);
                popup.setWebChromeClient(new WebChromeClient());
                popup.setWebViewClient(new WebViewClient() {
                    private boolean opened;

                    private void openOnce(String url) {
                        if (opened) return;
                        opened = true;
                        openExternalUrl(url);
                        popup.postDelayed(popup::destroy, 1000L);
                    }

                    @Override
                    public boolean shouldOverrideUrlLoading(WebView child, WebResourceRequest request) {
                        openOnce(request.getUrl().toString());
                        return true;
                    }

                    @Override
                    public boolean shouldOverrideUrlLoading(WebView child, String url) {
                        openOnce(url);
                        return true;
                    }
                });
                WebView.WebViewTransport transport = (WebView.WebViewTransport) resultMsg.obj;
                transport.setWebView(popup);
                resultMsg.sendToTarget();
                return true;
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                if (isLocalServerUrl(url)) return false;
                openExternalUrl(url);
                return true;
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (isLocalServerUrl(url)) return false;
                openExternalUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                if (!destroyed && isLocalServerUrl(url)) showApplication();
            }

            @android.annotation.TargetApi(23)
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                if (request.isForMainFrame()) showFailure("Локальный Python-сервер не загрузил страницу.");
            }
        });
    }

    private void requestWebMediaPermission(PermissionRequest request) {
        if (destroyed || !isLocalServerUrl(request.getOrigin().toString())) {
            request.deny();
            return;
        }
        String[] resources = request.getResources();
        List<String> required = new ArrayList<>();
        for (String resource : resources) {
            if (PermissionRequest.RESOURCE_AUDIO_CAPTURE.equals(resource)) {
                if (!required.contains(Manifest.permission.RECORD_AUDIO)) required.add(Manifest.permission.RECORD_AUDIO);
            } else if (PermissionRequest.RESOURCE_VIDEO_CAPTURE.equals(resource)) {
                if (!required.contains(Manifest.permission.CAMERA)) required.add(Manifest.permission.CAMERA);
            } else {
                request.deny();
                return;
            }
        }
        if (required.isEmpty()) {
            request.deny();
            return;
        }
        if (pendingMediaRequest != null) pendingMediaRequest.deny();
        if (Build.VERSION.SDK_INT < 23) {
            request.grant(resources);
            return;
        }
        pendingMediaRequest = request;
        List<String> missing = new ArrayList<>();
        for (String permission : required) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) missing.add(permission);
        }
        if (missing.isEmpty()) {
            pendingMediaRequest = null;
            request.grant(resources);
        } else {
            mediaPermissionLauncher.launch(missing.toArray(new String[0]));
        }
    }

    private File preparePythonProject() throws IOException {
        File project = new File(getFilesDir(), "python-project");
        File versionMarker = new File(getFilesDir(), "python-project-version");
        String version = installedVersionCode();
        if (project.isDirectory() && versionMarker.isFile()) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(versionMarker), java.nio.charset.StandardCharsets.UTF_8))) {
                if (version.equals(reader.readLine())) return project;
            } catch (Exception ignored) { }
        }
        deleteRecursively(project);
        if (!project.exists() && !project.mkdirs()) throw new IOException("Не удалось создать папку Python-проекта.");
        copyAssetFolder("python-project", project);
        try (OutputStream output = new FileOutputStream(versionMarker, false)) {
            output.write(version.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        return project;
    }

    private String installedVersionCode() {
        try {
            android.content.pm.PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
            return Build.VERSION.SDK_INT >= 28 ? Long.toString(info.getLongVersionCode()) : Integer.toString(info.versionCode);
        } catch (PackageManager.NameNotFoundException ignored) {
            return "0";
        }
    }

    private void copyAssetFolder(String assetPath, File destination) throws IOException {
        String[] children = getAssets().list(assetPath);
        if (children == null || children.length == 0) {
            try (InputStream input = new BufferedInputStream(getAssets().open(assetPath));
                 OutputStream output = new BufferedOutputStream(new FileOutputStream(destination))) {
                copyStream(input, output);
            }
            return;
        }
        if (!destination.exists() && !destination.mkdirs()) throw new IOException("Не удалось создать папку Python-проекта.");
        for (String child : children) {
            File target = new File(destination, child);
            copyAssetFolder(assetPath + "/" + child, target);
        }
    }

    private void copyStream(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[64 * 1024];
        int read;
        while ((read = input.read(buffer)) != -1) output.write(buffer, 0, read);
    }

    private void deleteRecursively(File target) {
        if (target == null || !target.exists()) return;
        if (target.isDirectory()) {
            File[] children = target.listFiles();
            if (children != null) for (File child : children) deleteRecursively(child);
        }
        target.delete();
    }

    private void startServer() {
        showLoading("Запускаем локальный Python-сервер…");
        engineExecutor.execute(() -> {
            try {
                if (destroyed) return;
                File pythonProject = preparePythonProject();
                if (!Python.isStarted()) Python.start(new AndroidPlatform(getApplicationContext()));
                PyObject module = Python.getInstance().getModule("engine");
                int port = module.callAttr("start", getFilesDir().getAbsolutePath(),
                        pythonProject.getAbsolutePath()).toInt();
                if (port < 1 || port > 65535) throw new IllegalStateException("Python engine returned an invalid port.");
                engineModule = module;
                if (destroyed) {
                    try { module.callAttr("stop"); } catch (Exception ignored) { }
                    engineModule = null;
                    return;
                }
                String url = "http://127.0.0.1:" + port + "/";
                serverUrl = url;
                runOnUiThread(() -> {
                    if (destroyed || webView == null) {
                        stopPythonServer();
                        return;
                    }
                    webView.loadUrl(url);
                });
            } catch (Exception error) {
                String detail = error.getMessage();
                if (detail == null || detail.trim().isEmpty()) detail = error.getClass().getSimpleName();
                final String failure = "Не удалось запустить Python/Flask: " + detail;
                runOnUiThread(() -> showFailure(failure));
            }
        });
    }

    private void openExternalUrl(String raw) {
        if (raw == null) return;
        try {
            android.net.Uri uri = android.net.Uri.parse(raw);
            String scheme = uri.getScheme();
            if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        } catch (Exception ignored) { }
    }

    private boolean isLocalServerUrl(String raw) {
        if (raw == null || serverUrl == null) return false;
        try {
            android.net.Uri uri = android.net.Uri.parse(raw);
            android.net.Uri base = android.net.Uri.parse(serverUrl);
            return "http".equals(uri.getScheme()) && "127.0.0.1".equals(uri.getHost())
                    && uri.getPort() == base.getPort();
        } catch (Exception ignored) {
            return false;
        }
    }

    private View createSplash() {
        LinearLayout box = new LinearLayout(this);
        box.setOrientation(LinearLayout.VERTICAL);
        box.setGravity(Gravity.CENTER);
        box.setPadding(dp(28), dp(24), dp(28), dp(24));
        box.setBackgroundColor(Color.rgb(9, 19, 27));

        ImageView icon = new ImageView(this);
        GradientDrawable iconBg = new GradientDrawable();
        iconBg.setColor(Color.rgb(25, 49, 61));
        iconBg.setCornerRadius(dp(24));
        icon.setBackground(iconBg);
        icon.setClipToOutline(true);
        icon.setPadding(dp(12), dp(12), dp(12), dp(12));
        icon.setScaleType(ImageView.ScaleType.FIT_CENTER);
        try {
            icon.setImageDrawable(getPackageManager().getApplicationIcon(getPackageName()));
        } catch (PackageManager.NameNotFoundException ignored) { }
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(dp(88), dp(88));
        iconParams.bottomMargin = dp(18);
        box.addView(icon, iconParams);

        TextView title = new TextView(this);
        title.setText(getPackageManager().getApplicationLabel(getApplicationInfo()));
        title.setTextColor(Color.rgb(242, 247, 248));
        title.setTextSize(22f);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        title.setMaxLines(2);
        box.addView(title, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        message = new TextView(this);
        message.setTextColor(Color.rgb(167, 186, 197));
        message.setTextSize(13f);
        message.setGravity(Gravity.CENTER);
        message.setText("Запускаем локальный Python-сервер…");
        LinearLayout.LayoutParams messageParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        messageParams.topMargin = dp(10);
        box.addView(message, messageParams);

        progress = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
        progress.setIndeterminate(true);
        LinearLayout.LayoutParams progressParams = new LinearLayout.LayoutParams(dp(188), dp(5));
        progressParams.topMargin = dp(18);
        box.addView(progress, progressParams);

        retry = new Button(this);
        retry.setText("Повторить");
        retry.setAllCaps(false);
        retry.setTextColor(Color.rgb(6, 23, 16));
        retry.setBackgroundColor(Color.rgb(103, 228, 193));
        retry.setVisibility(View.GONE);
        retry.setOnClickListener(view -> {
            String url = serverUrl;
            if (url != null && engineModule != null && webView != null) {
                showLoading("Повторный запуск локального сервера…");
                webView.loadUrl(url);
            } else {
                startServer();
            }
        });
        LinearLayout.LayoutParams retryParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        retryParams.topMargin = dp(8);
        box.addView(retry, retryParams);
        return box;
    }

    private void showLoading(String text) {
        if (splash != null) {
            splash.setAlpha(1f);
            splash.setVisibility(View.VISIBLE);
        }
        if (webView != null) webView.setVisibility(View.INVISIBLE);
        if (message != null) message.setText(text);
        if (progress != null) progress.setVisibility(View.VISIBLE);
        if (retry != null) retry.setVisibility(View.GONE);
    }

    private void showApplication() {
        if (destroyed || webView == null || splash == null) return;
        webView.setVisibility(View.VISIBLE);
        View overlay = splash;
        overlay.animate().alpha(0f).setDuration(220L).withEndAction(() -> {
            if (root != null) root.removeView(overlay);
            if (splash == overlay) splash = null;
        }).start();
    }

    private void showFailure(String text) {
        if (destroyed) return;
        if (splash != null) {
            splash.setAlpha(1f);
            splash.setVisibility(View.VISIBLE);
        }
        if (webView != null) webView.setVisibility(View.INVISIBLE);
        if (message != null) message.setText(text);
        if (progress != null) progress.setVisibility(View.GONE);
        if (retry != null) retry.setVisibility(View.VISIBLE);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private boolean readFullscreenSetting() {
        try {
            Bundle metadata = getPackageManager().getApplicationInfo(
                    getPackageName(), PackageManager.GET_META_DATA).metaData;
            return metadata != null && Boolean.parseBoolean(metadata.getString(FULLSCREEN_META));
        } catch (PackageManager.NameNotFoundException ignored) {
            return false;
        }
    }

    private void configureSystemBars(Window window) {
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(Color.TRANSPARENT);
        window.setNavigationBarColor(Color.TRANSPARENT);
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        WindowInsetsControllerCompat bars = WindowCompat.getInsetsController(window, window.getDecorView());
        bars.setAppearanceLightStatusBars(false);
        bars.setAppearanceLightNavigationBars(false);
        if (fullscreen) {
            bars.setSystemBarsBehavior(WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
            bars.hide(WindowInsetsCompat.Type.systemBars());
        } else {
            bars.show(WindowInsetsCompat.Type.systemBars());
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && fullscreen) configureSystemBars(getWindow());
    }

    private void stopPythonServer() {
        PyObject module = engineModule;
        engineModule = null;
        serverUrl = null;
        if (module != null && !engineExecutor.isShutdown()) {
            try {
                engineExecutor.execute(() -> {
                    try { module.callAttr("stop"); } catch (Exception ignored) { }
                });
            } catch (RuntimeException ignored) { }
        }
    }

    @Override
    protected void onDestroy() {
        destroyed = true;
        if (pendingMediaRequest != null) {
            pendingMediaRequest.deny();
            pendingMediaRequest = null;
        }
        if (pendingFileCallback != null) {
            pendingFileCallback.onReceiveValue(null);
            pendingFileCallback = null;
        }
        if (webView != null) {
            webView.stopLoading();
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            webView.destroy();
            webView = null;
        }
        stopPythonServer();
        engineExecutor.shutdown();
        if (root != null) root.removeAllViews();
        root = null;
        splash = null;
        message = null;
        progress = null;
        retry = null;
        super.onDestroy();
    }
}

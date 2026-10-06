package com.mailgram.app.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicBoolean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.mailgram.app.R;
import com.mailgram.app.net.Auth;
import com.mailgram.app.net.LoopbackServer;
import com.mailgram.app.net.OAuth;

/** Вход через Google: один тап, PKCE, без серверов и секретов. */
public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "MailGramLogin";

    private MaterialButton googleButton;
    private LinearProgressIndicator progress;
    private TextView status;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final AtomicBoolean probing = new AtomicBoolean(false);

    private Auth.Probe probe;
    private boolean awaitingAuth;
    private long authStartedAt;
    private boolean fixDialogShown;

    private final Runnable authWatchdog = () -> {
        if (awaitingAuth && !Auth.isSignedIn(this)) showFixDialog();
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Anim.springIn(findViewById(R.id.login_logo), 0.86f, 16f);
        Ui.applySystemBars(this, findViewById(R.id.login_root), findViewById(R.id.login_root));

        googleButton = findViewById(R.id.btn_google);
        progress = findViewById(R.id.login_progress);
        status = findViewById(R.id.login_status);

        if (Auth.isSignedIn(this)) {
            openMain();
            return;
        }

        googleButton.setOnClickListener(Ui.tap(v -> startLogin()));
        View logo = findViewById(R.id.login_logo);
        if (logo != null) {
            logo.setOnLongClickListener(Ui.hold(v -> {
                startActivity(new Intent(this, SetupOauthActivity.class));
                return true;
            }));
        }
        findViewById(R.id.btn_setup).setOnClickListener(Ui.tap(v ->
                startActivity(new Intent(this, SetupOauthActivity.class))));
        findViewById(R.id.btn_diag).setOnClickListener(Ui.tap(v -> startProbe(true)));
        updateStatus();
        // Никаких проверок при запуске: показываем только ранее сохранённый результат.
        // Живая диагностика — по кнопке, если вход действительно не проходит.
        Auth.Probe cachedProbe = Auth.cachedProbe(this);
        if (cachedProbe != null) {
            onProbe(cachedProbe);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Auth.isSignedIn(this)) {
            openMain();
            return;
        }
        updateStatus();
        // вернулись из браузера, а код в приложение не пришёл — почти всегда это
        // отклонённый Google запрос (например, выключенный custom URI scheme)
        if (awaitingAuth && !Auth.isSignedIn(this)
                && System.currentTimeMillis() - authStartedAt > 6000L) {
            showFixDialog();
        }
    }

    /** Спрашивает у Google, какие схемы редиректа принимает client ID, и подбирает режим входа. */
    private void startProbe(boolean force) {
        if (!force) {
            Auth.Probe cached = Auth.cachedProbe(this);
            if (cached != null) {
                onProbe(cached);
                return;
            }
        }
        if (!probing.compareAndSet(false, true)) return;
        status.setVisibility(View.VISIBLE);
        status.setTextColor(getResources().getColor(R.color.text_secondary));
        status.setText(R.string.login_check_running);
        new Thread(() -> {
            final Auth.Probe result = Auth.probeNow(getApplicationContext());
            handler.post(() -> onProbe(result));
        }, "mailgram-probe").start();
    }

    private void onProbe(final Auth.Probe result) {
        probing.set(false);
        probe = result;
        if (isFinishing() || isDestroyed()) return;
        status.setVisibility(View.VISIBLE);
        boolean ok = result.androidOk || result.loopbackOk;
        status.setTextColor(ok ? getResources().getColor(R.color.success) : (result.inconclusive ? getResources().getColor(R.color.text_secondary) : getResources().getColor(R.color.danger)));
        status.setText(result.summary);
        if (result.hasFixHint() && !fixDialogShown) {
            fixDialogShown = true;
            showFixDialog();
        }
    }

    private void showFixDialog() {
        if (isFinishing() || isDestroyed()) return;
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle(R.string.login_fix_title)
                .setMessage(R.string.login_fix_message)
                .setPositiveButton(R.string.login_fix_open, (d, w) -> openConsole())
                .setNeutralButton(R.string.login_fix_own, (d, w) ->
                        startActivity(new Intent(this, SetupOauthActivity.class)))
                .setNegativeButton(R.string.done, null)
                .show();
    }

    private void openConsole() {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(OAuth.clientConsoleUrl(Auth.clientId(this)))));
        } catch (Exception e) {
            Ui.toast(this, getString(R.string.error_generic, "нет браузера"));
        }
    }

    private void updateStatus() {
        if (probe != null && !probe.summary.isEmpty()) {
            status.setVisibility(View.VISIBLE);
            boolean ok = probe.androidOk || probe.loopbackOk;
            status.setTextColor(ok ? getResources().getColor(R.color.success) : (probe.inconclusive ? getResources().getColor(R.color.text_secondary) : getResources().getColor(R.color.danger)));
            status.setText(probe.summary);
            return;
        }
        String clientId = Auth.clientId(this);
        if (clientId.isEmpty()) {
            status.setVisibility(View.VISIBLE);
            status.setText(getString(R.string.error_no_client_id));
        } else if (Auth.clientIdFromSettings(this).isEmpty() && Auth.clientIdFromBuild()) {
            status.setVisibility(View.VISIBLE);
            status.setText(R.string.login_ready);
        } else if (!Auth.clientIdFromSettings(this).isEmpty()
                && !Auth.requiredManifestScheme(this).equalsIgnoreCase(Auth.androidSchemeFromBuild())) {
            // схема редиректа жёстко прописана в манифесте на этапе сборки
            status.setVisibility(View.VISIBLE);
            status.setText(getString(R.string.login_client_mismatch, Auth.androidSchemeFromBuild()));
            status.setTextColor(getResources().getColor(R.color.danger));
        } else {
            status.setVisibility(View.VISIBLE);
            status.setText(R.string.login_ready);
        }
    }

    private static String shortId(String id) {
        if (id.length() <= 24) return id;
        return id.substring(0, 18) + "…" + id.substring(id.length() - 12);
    }

    private void startLogin() {
        final String clientId = Auth.clientId(this);
        if (clientId.isEmpty()) {
            status.setVisibility(View.VISIBLE);
            status.setText(R.string.error_no_client_id);
            startActivity(new Intent(this, SetupOauthActivity.class));
            return;
        }
        progress.setVisibility(View.VISIBLE);
        status.setVisibility(View.VISIBLE);
        status.setText(R.string.signing_in);
        awaitingAuth = true;
        authStartedAt = System.currentTimeMillis();
        handler.removeCallbacks(authWatchdog);
        handler.postDelayed(authWatchdog, 90_000L);

        if (Auth.MODE_LOOPBACK.equals(Auth.authMode(this))) {
            LoopbackServer.start(new LoopbackServer.Callback() {
                @Override
                public void onCode(final String code, final String state) {
                    handler.post(() -> finishLogin(code, state));
                }

                @Override
                public void onError(final String message) {
                    handler.post(() -> {
                        progress.setVisibility(View.GONE);
                        status.setText(getString(R.string.error_auth, message));
                    });
                }
            });
        }

        final String url = Auth.beginAuth(this, null);
        try {
            CustomTabsIntent tabs = new CustomTabsIntent.Builder()
                    .setShowTitle(true)
                    .setUrlBarHidingEnabled(true)
                    .build();
            tabs.launchUrl(this, Uri.parse(url));
        } catch (Exception e) {
            Log.w(TAG, "Custom Tabs недоступны, открываем браузер: " + e);
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            } catch (Exception e2) {
                progress.setVisibility(View.GONE);
                status.setText(R.string.browser_missing);
            }
        }
    }

    private void finishLogin(final String code, final String state) {
        status.setText(R.string.please_wait);
        new Thread(() -> {
            try {
                Auth.completeAuth(getApplicationContext(), code, state);
                handler.post(this::openMain);
            } catch (Exception e) {
                Log.w(TAG, "вход не завершён: " + e);
                handler.post(() -> {
                    progress.setVisibility(View.GONE);
                    status.setText(getString(R.string.error_auth, String.valueOf(e.getMessage())));
                });
            }
        }, "mailgram-login").start();
    }

    private void openMain() {
        awaitingAuth = false;
        handler.removeCallbacks(authWatchdog);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

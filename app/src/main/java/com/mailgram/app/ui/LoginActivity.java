package com.mailgram.app.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.mailgram.app.R;
import com.mailgram.app.net.Auth;
import com.mailgram.app.net.LoopbackServer;

/** Вход через Google: один тап, PKCE, без серверов и секретов. */
public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "MailGramLogin";

    private MaterialButton googleButton;
    private LinearProgressIndicator progress;
    private TextView status;
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Ui.applySystemBars(this, null, findViewById(R.id.login_root));

        googleButton = findViewById(R.id.btn_google);
        progress = findViewById(R.id.login_progress);
        status = findViewById(R.id.login_status);

        if (Auth.isSignedIn(this)) {
            openMain();
            return;
        }

        googleButton.setOnClickListener(v -> startLogin());
        findViewById(R.id.btn_setup).setOnClickListener(v ->
                startActivity(new Intent(this, SetupOauthActivity.class)));
        updateStatus();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Auth.isSignedIn(this)) {
            openMain();
            return;
        }
        updateStatus();
    }

    private void updateStatus() {
        String clientId = Auth.clientId(this);
        if (clientId.isEmpty()) {
            status.setVisibility(View.VISIBLE);
            status.setText(getString(R.string.error_no_client_id));
        } else if (Auth.clientIdFromSettings(this).isEmpty() && Auth.clientIdFromBuild()) {
            status.setVisibility(View.VISIBLE);
            status.setText("Client ID взят из сборки: " + shortId(clientId));
        } else {
            status.setVisibility(View.VISIBLE);
            status.setText("Client ID: " + shortId(clientId) + "\nРежим: "
                    + (Auth.MODE_LOOPBACK.equals(Auth.authMode(this)) ? "локальный порт" : "Android-клиент"));
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
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

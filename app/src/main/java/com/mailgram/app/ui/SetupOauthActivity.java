package com.mailgram.app.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.mailgram.app.R;
import com.mailgram.app.net.Auth;
import com.mailgram.app.net.LoopbackServer;
import com.mailgram.app.net.OAuth;

/**
 * Помощник подключения: показывает ровно те данные, которые нужно вставить
 * в Google Cloud Console, и принимает OAuth client ID. Так в коде приложения
 * не хранится ни одного идентификатора.
 */
public class SetupOauthActivity extends AppCompatActivity {

    private static final String CONSOLE_URL = "https://console.cloud.google.com/apis/credentials";

    private TextInputEditText clientIdField;
    private RadioGroup modeGroup;
    private TextView modeNote;
    private TextView redirectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        Ui.applySystemBars(this, findViewById(R.id.setup_toolbar), null);

        MaterialToolbar toolbar = findViewById(R.id.setup_toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        clientIdField = findViewById(R.id.setup_client_id);
        modeGroup = findViewById(R.id.setup_mode_group);
        modeNote = findViewById(R.id.setup_mode_note);
        redirectView = findViewById(R.id.setup_redirect);

        ((TextView) findViewById(R.id.setup_package)).setText(getPackageName());
        ((TextView) findViewById(R.id.setup_sha1)).setText(Ui.signingSha1(this));

        clientIdField.setText(Auth.clientId(this));
        boolean bakedIn = Auth.clientIdFromBuild();
        if (bakedIn) {
            // Идентификатор уже внутри APK и совпадает со схемой редиректа в манифесте —
            // менять его в настройках нельзя, только пересобрать с другим значением.
            clientIdField.setEnabled(false);
            modeGroup.check(R.id.setup_mode_android);
            modeGroup.setEnabled(false);
            for (int i = 0; i < modeGroup.getChildCount(); i++) {
                modeGroup.getChildAt(i).setEnabled(false);
            }
        }
        boolean loopback = !bakedIn && Auth.MODE_LOOPBACK.equals(Auth.authMode(this));
        modeGroup.check(loopback ? R.id.setup_mode_loopback : R.id.setup_mode_android);
        modeGroup.setOnCheckedChangeListener((g, id) -> updateMode());
        updateMode();

        findViewById(R.id.btn_copy_setup).setOnClickListener(v ->
                Ui.copy(this, "MailGram setup", setupText()));
        findViewById(R.id.btn_open_console).setOnClickListener(v -> {
            try {
                String clientId = enteredClientId();
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(clientId.isEmpty() ? CONSOLE_URL : OAuth.clientConsoleUrl(clientId))));
            } catch (Exception e) {
                Ui.toast(this, getString(R.string.error_generic, "нет браузера"));
            }
        });
        findViewById(R.id.btn_setup_save).setOnClickListener(v -> save());
    }

    private String enteredClientId() {
        String value = clientIdField.getText() == null ? "" : clientIdField.getText().toString().trim();
        return value;
    }

    private boolean isLoopbackSelected() {
        return modeGroup.getCheckedRadioButtonId() == R.id.setup_mode_loopback;
    }

    private void updateMode() {
        String clientId = enteredClientId();
        String redirect;
        if (isLoopbackSelected()) {
            redirect = LoopbackServer.redirectUri();
            modeNote.setText(getString(R.string.setup_loopback_note, redirect));
        } else {
            redirect = clientId.isEmpty()
                    ? Auth.androidSchemeFromBuild() + OAuth.ANDROID_REDIRECT_SUFFIX
                    : OAuth.redirectForAndroidClient(clientId);
            modeNote.setText(getString(R.string.setup_android_note, Auth.androidSchemeFromBuild()));
            // Google с 2023 выключает custom URI scheme у новых Android-клиентов по умолчанию:
            // без этой галочки вход отклоняется с ошибкой 400 invalid_request.
            modeNote.setText(modeNote.getText() + "\n\n" + getString(R.string.setup_probe_hint));
            if (Auth.clientIdFromBuild()) {
                modeNote.setText(modeNote.getText() + "\n\n" + getString(R.string.setup_baked_note,
                        Auth.clientIdFromBuildShort()));
            }
            Auth.Probe cached = Auth.cachedProbe(this);
            if (cached != null && !cached.summary.isEmpty()) {
                modeNote.setText(modeNote.getText() + "\n\n" + getString(R.string.setup_probe_result)
                        + ": " + cached.summary);
            }
            if (!clientId.isEmpty()
                    && !clientId.equals(Auth.clientIdFromSettings(this))
                    && !OAuth.androidScheme(clientId).equalsIgnoreCase(Auth.androidSchemeFromBuild())) {
                modeNote.setText(modeNote.getText() + "\n\n"
                        + getString(R.string.setup_scheme_mismatch, Auth.androidSchemeFromBuild()));
            }
        }
        redirectView.setText(redirect);
    }

    private String setupText() {
        return "MailGram — данные для Google Cloud Console\n"
                + getString(R.string.setup_package) + ": " + getPackageName() + "\n"
                + getString(R.string.setup_sha1) + ": " + Ui.signingSha1(this) + "\n"
                + getString(R.string.setup_redirect) + ": " + redirectView.getText() + "\n"
                + getString(R.string.setup_probe_hint) + "\n"
                + "Scopes: " + OAuth.SCOPE;
    }

    private void save() {
        if (Auth.clientIdFromBuild()) {
            // Client ID вшит при сборке: держим режим и хранилище в согласованном состоянии.
            Auth.setClientId(this, "");
            Auth.setAuthMode(this, Auth.MODE_ANDROID);
            Ui.toast(this, getString(R.string.setup_baked_saved));
            finish();
            return;
        }
        String clientId = enteredClientId();
        if (!clientId.isEmpty()
                && !clientId.endsWith(".apps.googleusercontent.com")
                && !clientId.endsWith(".apps.googleusercontent.com".replace(".apps", ""))) {
            Ui.toast(this, "Похоже, это не client ID: ожидается строка вида 123-abc.apps.googleusercontent.com");
        }
        Auth.setClientId(this, clientId);
        Auth.setAuthMode(this, isLoopbackSelected() ? Auth.MODE_LOOPBACK : Auth.MODE_ANDROID);
        if (!isLoopbackSelected() && !clientId.isEmpty()
                && !OAuth.androidScheme(clientId).equalsIgnoreCase(Auth.androidSchemeFromBuild())) {
            Ui.toast(this, "Внимание: схема сборки — " + Auth.androidSchemeFromBuild()
                    + ". Для этого client ID используйте режим «локальный порт».");
        } else {
            Ui.toast(this, getString(R.string.setup_saved));
        }
        finish();
    }

    @SuppressWarnings("unused")
    private boolean blank(String s) {
        return TextUtils.isEmpty(s);
    }
}

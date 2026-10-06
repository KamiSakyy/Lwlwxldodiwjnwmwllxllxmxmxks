package com.mailgram.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.mailgram.app.R;
import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.Identity;
import com.mailgram.app.crypto.NativeCrypto;
import com.mailgram.app.net.Auth;
import com.mailgram.app.net.LoopbackServer;
import com.mailgram.app.net.OAuth;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Prefs;
import com.mailgram.app.store.Store;
import com.mailgram.app.sync.SyncService;

/** Настройки: оформление, доставка, безопасность, подключение и аккаунт. */
public class SettingsActivity extends AppCompatActivity {

    private TextView selfTestResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Ui.applySystemBars(this, findViewById(R.id.settings_toolbar), null);

        MaterialToolbar toolbar = findViewById(R.id.settings_toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        TextView email = findViewById(R.id.settings_email);
        email.setText(Auth.account(this));

        com.mailgram.app.ui.AvatarView avatar = findViewById(R.id.settings_avatar);
        avatar.setName(Store.displayName(this, Auth.account(this)));

        TextView identity = findViewById(R.id.settings_identity_mode);
        boolean hw = Identity.isHardwareBacked(this);
        identity.setText(hw ? R.string.identity_hardware : R.string.identity_software);

        // оформление
        RadioGroup themeGroup = findViewById(R.id.theme_group);
        String theme = Prefs.theme(this);
        if (Prefs.THEME_LIGHT.equals(theme)) themeGroup.check(R.id.theme_light);
        else if (Prefs.THEME_DARK.equals(theme)) themeGroup.check(R.id.theme_dark);
        else themeGroup.check(R.id.theme_system);
        themeGroup.setOnCheckedChangeListener((group, checkedId) -> {
            String value = checkedId == R.id.theme_light ? Prefs.THEME_LIGHT
                    : checkedId == R.id.theme_dark ? Prefs.THEME_DARK : Prefs.THEME_SYSTEM;
            Prefs.setTheme(this, value);
            com.mailgram.app.App.applyTheme(com.mailgram.app.App.themeMode(value));
        });

        // доставка
        final TextView pollValue = findViewById(R.id.settings_poll_value);
        pollValue.setText(pollLabel(Prefs.pollSeconds(this)));
        findViewById(R.id.row_poll).setOnClickListener(v -> pollDialog(pollValue));

        MaterialSwitch background = findViewById(R.id.switch_background);
        background.setChecked(Prefs.backgroundSync(this));
        background.setOnCheckedChangeListener((buttonView, isChecked) -> {
            Prefs.setBackgroundSync(this, isChecked);
            if (isChecked) {
                SyncService.start(this);
            } else {
                SyncService.stop(this);
                com.mailgram.app.sync.Alarms.cancel(this);
            }
        });

        final TextView fontValue = findViewById(R.id.settings_font_value);
        fontValue.setText(fontScaleLabel(Prefs.fontScale(this)));
        findViewById(R.id.row_font_scale).setOnClickListener(v -> {
            int next = (Prefs.fontScale(this) + 1) % 4;
            Prefs.setFontScale(this, next);
            fontValue.setText(fontScaleLabel(next));
        });

        MaterialSwitch animations = findViewById(R.id.switch_animations);
        animations.setChecked(Prefs.animations(this));
        animations.setOnCheckedChangeListener((buttonView, isChecked) -> Prefs.setAnimations(this, isChecked));

        MaterialSwitch notifications = findViewById(R.id.switch_notifications);
        notifications.setChecked(Prefs.notifications(this));
        notifications.setOnCheckedChangeListener((buttonView, isChecked) ->
                Prefs.setNotifications(this, isChecked));

        // криптография
        TextView ratchetState = findViewById(R.id.settings_ratchet_state);
        boolean anySession = false;
        for (Chat chat : Store.get(this).chats()) {
            if (com.mailgram.app.crypto.RatchetStore.hasSession(this, chat.uid)) {
                anySession = true;
                break;
            }
        }
        ratchetState.setText(anySession ? getString(R.string.ratchet_state_on)
                : getString(R.string.ratchet_state_wait));
        findViewById(R.id.row_ratchet).setOnClickListener(v -> showRatchetInfo());

        // безопасность
        selfTestResult = findViewById(R.id.settings_selftest_result);
        findViewById(R.id.row_selftest).setOnClickListener(v -> runSelfTest());
        findViewById(R.id.row_mykey).setOnClickListener(v -> showMyKey());
        findViewById(R.id.row_invite_link).setOnClickListener(v -> editInviteLink());

        // подключение
        findViewById(R.id.row_setup).setOnClickListener(v ->
                startActivity(new Intent(this, SetupOauthActivity.class)));

        TextView clientId = findViewById(R.id.settings_client_id);
        String id = Auth.clientId(this);
        clientId.setText(getString(R.string.setup_client_id) + ":\n" + (id.isEmpty() ? "—" : id)
                + "\n" + (Auth.MODE_LOOPBACK.equals(Auth.authMode(this))
                ? "режим: локальный порт" : "режим: Android-клиент"));

        TextView redirect = findViewById(R.id.settings_redirect);
        redirect.setText(getString(R.string.setup_redirect) + ":\n" + currentRedirect());

        TextView versions = findViewById(R.id.settings_versions);
        versions.setText("MailGram " + Ui.versionName(this)
                + "\n" + getString(R.string.about_native) + ": " + (NativeCrypto.isLoaded()
                ? NativeCrypto.version() : "не загружено — " + NativeCrypto.loadError())
                + "\n" + getString(R.string.about_protocol) + ": " + com.mailgram.app.crypto.MailCrypto.ALG
                + "\n" + getString(R.string.setup_package) + ": " + getPackageName());

        findViewById(R.id.btn_logout).setOnClickListener(v -> logoutDialog());
    }

    private String currentRedirect() {
        String mode = Auth.authMode(this);
        if (Auth.MODE_LOOPBACK.equals(mode)) {
            return LoopbackServer.redirectUri() + "\n(в консоли нужен тип клиента «Desktop/Web» и этот адрес)";
        }
        String clientId = Auth.clientId(this);
        if (clientId != null && !clientId.isEmpty()) {
            return OAuth.redirectForAndroidClient(clientId);
        }
        return Auth.androidSchemeFromBuild() + OAuth.ANDROID_REDIRECT_SUFFIX;
    }

    private String pollLabel(int seconds) {
        switch (seconds) {
            case 10:
                return getString(R.string.poll_10);
            case 60:
                return getString(R.string.poll_60);
            case 300:
                return getString(R.string.poll_300);
            default:
                return getString(R.string.poll_30);
        }
    }

    private void pollDialog(final TextView label) {
        final int[] values = {10, 30, 60, 300};
        final String[] titles = {
                getString(R.string.poll_10), getString(R.string.poll_30),
                getString(R.string.poll_60), getString(R.string.poll_300)};
        int current = Prefs.pollSeconds(this);
        int checked = 1;
        for (int i = 0; i < values.length; i++) if (values[i] == current) checked = i;
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.settings_poll)
                .setSingleChoiceItems(titles, checked, (dialog, which) -> {
                    Prefs.setPollSeconds(this, values[which]);
                    label.setText(titles[which]);
                    dialog.dismiss();
                    if (Prefs.backgroundSync(this)) SyncService.start(this);
                })
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    private void runSelfTest() {
        selfTestResult.setVisibility(View.VISIBLE);
        selfTestResult.setText(R.string.please_wait);
        new Thread(() -> {
            final String raw;
            try {
                raw = NativeCrypto.selfTest();
            } catch (Throwable t) {
                runOnUiThread(() -> selfTestResult.setText(getString(R.string.error_generic,
                        String.valueOf(t.getMessage()))));
                return;
            }
            runOnUiThread(() -> {
                String[] parts = raw.split("\\|", 3);
                String version = parts.length > 0 ? parts[0] : "?";
                int failures = parts.length > 1 ? parseInt(parts[1]) : -1;
                String report = parts.length > 2 ? parts[2].trim() : raw;
                String head = failures == 0
                        ? getString(R.string.selftest_ok) + " (" + version + ")"
                        : getString(R.string.selftest_fail, failures + " (" + version + ")");
                selfTestResult.setText(head + "\n\n" + report);
                new MaterialAlertDialogBuilder(this)
                        .setTitle(R.string.settings_selftest)
                        .setMessage(head + "\n\n" + report)
                        .setPositiveButton(R.string.done, null)
                        .show();
            });
        }, "mailgram-selftest").start();
    }

    private static int parseInt(String s) {
        try {
            return Integer.parseInt(s.trim());
        } catch (Exception e) {
            return -1;
        }
    }

    private void showMyKey() {
        String key;
        try {
            key = B64.str(Identity.publicKeyRaw(this));
        } catch (Exception e) {
            key = "ошибка: " + e.getMessage();
        }
        View view = LayoutInflater.from(this).inflate(R.layout.dialog_text, null);
        TextView text = view.findViewById(R.id.dialog_text);
        text.setText(getString(R.string.key_share_text) + "\n\n" + key);
        final String value = key;
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.my_key)
                .setView(view)
                .setNegativeButton(R.string.done, null)
                .setPositiveButton(R.string.copy, (d, w) -> Ui.copy(this, "MailGram key", value))
                .show();
    }

    private void editInviteLink() {
        final EditText edit = new EditText(this);
        edit.setText(Prefs.inviteLink(this));
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.invite_contact)
                .setMessage("Ссылка, которую получают приглашённые (например, страница загрузки APK).")
                .setView(edit)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.save, (d, w) -> {
                    Prefs.setInviteLink(this, edit.getText().toString().trim());
                    Ui.toast(this, getString(R.string.setup_saved));
                })
                .show();
    }

    /** Что именно делает шифрование — простыми словами, но без прикрас. */
    private void showRatchetInfo() {
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.settings_ratchet)
                .setMessage(getString(R.string.settings_security_desc)
                        + "\n\n• X3DH: DH(свой ключ, ключ собеседника) + эфемерный ключ + предключ\n"
                        + "• Корневой ключ: HKDF-SHA256, соль — идентификатор пары\n"
                        + "• Цепочки: KDF_CK выдаёт отдельный ключ на каждое сообщение\n"
                        + "• DH-шаг: при каждом ответе собеседника — новый эфемерный ключ\n"
                        + "• AEAD: ChaCha20-Poly1305, заголовок сообщения в AAD\n"
                        + "• Пропущенные сообщения: до 500 ключей на цепочку\n"
                        + "• Сессии хранятся запечатанными ключом Android Keystore")
                .setPositiveButton(R.string.done, null)
                .show();
    }

    private void setUpAppLock() {
        final com.google.android.material.materialswitch.MaterialSwitch lock =
                findViewById(R.id.switch_app_lock);
        if (lock == null) return;
        lock.setChecked(Prefs.pinHash(this).length() > 0);
        lock.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                askNewPin();
            } else {
                Prefs.clearPin(this);
                Ui.toast(this, getString(R.string.pin_remove));
            }
        });
    }

    private void askNewPin() {
        final EditText first = pinField();
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.pin_title)
                .setView(first)
                .setCancelable(false)
                .setNegativeButton(R.string.cancel, (d, w) -> setUpAppLock())
                .setPositiveButton(R.string.continue_label, (d, w) -> {
                    String pin = first.getText().toString().trim();
                    if (pin.length() < 4) {
                        Ui.toast(this, getString(R.string.pin_4_digits));
                        setUpAppLock();
                        return;
                    }
                    askRepeatPin(pin);
                })
                .show();
    }

    private void askRepeatPin(final String pin) {
        final EditText second = pinField();
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.pin_repeat)
                .setView(second)
                .setCancelable(false)
                .setNegativeButton(R.string.cancel, (d, w) -> setUpAppLock())
                .setPositiveButton(R.string.save, (d, w) -> {
                    String again = second.getText().toString().trim();
                    if (!pin.equals(again)) {
                        Ui.toast(this, getString(R.string.pin_mismatch));
                        askNewPin();
                        return;
                    }
                    Prefs.setPinHash(this, Prefs.hashPin(this, pin));
                    Ui.toast(this, getString(R.string.app_lock));
                })
                .show();
    }

    private EditText pinField() {
        EditText edit = new EditText(this);
        edit.setInputType(android.text.InputType.TYPE_CLASS_NUMBER
                | android.text.InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        edit.setHint(R.string.pin_enter);
        edit.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(8)});
        return edit;
    }

    private String fontScaleLabel(int scale) {
        switch (scale) {
            case 0:
                return getString(R.string.font_small);
            case 2:
                return getString(R.string.font_large);
            case 3:
                return getString(R.string.font_huge);
            default:
                return getString(R.string.font_normal);
        }
    }

    private void logoutDialog() {
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.logout_title)
                .setMessage(R.string.logout_text)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.logout, (d, w) -> {
                    SyncService.stop(this);
                    com.mailgram.app.sync.Alarms.cancel(this);
                    Store store = Store.get(this);
                    for (Chat chat : store.chats()) store.removeChat(chat.uid);
                    Auth.signOut(this, true);
                    Identity.destroy(this);
                    com.mailgram.app.crypto.RatchetStore.wipeAll(this);
                    startActivity(new Intent(this, LoginActivity.class)
                            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                    finish();
                })
                .show();
    }
}

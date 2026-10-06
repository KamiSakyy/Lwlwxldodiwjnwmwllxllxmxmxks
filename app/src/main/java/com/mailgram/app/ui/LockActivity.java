package com.mailgram.app.ui;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mailgram.app.App;
import com.mailgram.app.R;
import com.mailgram.app.store.Prefs;

/**
 * Экран блокировки: PIN-код вводится на своей клавиатуре (крупные круглые клавиши,
 * пружинный отклик, «дрожание» при ошибке). Хеш PIN-кода хранится с солью,
 * сам код нигде в открытом виде не сохраняется.
 */
public class LockActivity extends AppCompatActivity {

    private final StringBuilder entered = new StringBuilder();
    private LinearLayout dots;
    private TextView title;
    private int pinLength = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stored = Prefs.pinHash(this);
        if (stored.isEmpty()) {
            App.setUnlocked(true);
            finish();
            return;
        }
        Ui.safeSetContentView(this, R.layout.activity_lock);
        Ui.safely(this, () -> {
            Ui.applyWallpaper(this, R.id.lock_root);
            Ui.applySystemBars(this, findViewById(R.id.lock_root), findViewById(R.id.lock_root));
        });
        try {
            setUpScreen();
        } catch (Throwable error) {
            com.mailgram.app.util.CrashLog.record(this, error);
        }
    }

    /** Настройка экрана блокировки: точки, заголовок, клавиатура. */
    private void setUpScreen() {
        dots = findViewById(R.id.lock_dots);
        title = findViewById(R.id.lock_title);
        com.mailgram.app.ui.AvatarView avatar = findViewById(R.id.lock_avatar);
        String account = com.mailgram.app.net.Auth.account(this);
        avatar.setName(account.isEmpty() ? getString(R.string.app_name) : account);
        buildKeypad();
        updateDots();
    }

    private void buildKeypad() {
        GridLayout keypad = findViewById(R.id.lock_keypad);
        int size = Ui.dp(this, 74);
        int margin = Ui.dp(this, 6);
        for (int i = 1; i <= 9; i++) {
            keypad.addView(key(String.valueOf(i), size, margin));
        }
        View empty = new View(this);
        GridLayout.LayoutParams emptyParams = new GridLayout.LayoutParams();
        emptyParams.width = size;
        emptyParams.height = size;
        emptyParams.setMargins(margin, margin, margin, margin);
        empty.setLayoutParams(emptyParams);
        keypad.addView(empty);
        keypad.addView(key("0", size, margin));
        keypad.addView(key("\u232B", size, margin));
    }

    private TextView key(final String label, int size, int margin) {
        final TextView view = new TextView(this);
        view.setText(label);
        view.setTextSize(26f);
        view.setGravity(Gravity.CENTER);
        view.setTextColor(getResources().getColor(R.color.text_primary));
        view.setBackgroundResource(R.drawable.bg_keypad_key);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.width = size;
        params.height = size;
        params.setMargins(margin, margin, margin, margin);
        view.setLayoutParams(params);
        Anim.pressFeedback(view);
        view.setOnClickListener(Ui.tap(v -> {
            Anim.haptic(v, false);
            if ("\u232B".equals(label)) {
                if (entered.length() > 0) {
                    entered.deleteCharAt(entered.length() - 1);
                    updateDots();
                }
                return;
            }
            if (entered.length() >= pinLength) return;
            entered.append(label);
            Anim.pop(lastDot());
            updateDots();
            if (entered.length() == pinLength) {
                verify();
            }
        }));
        return view;
    }

    private void updateDots() {
        dots.removeAllViews();
        int size = Ui.dp(this, 12);
        for (int i = 0; i < pinLength; i++) {
            View dot = new View(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(size, size);
            params.setMargins(Ui.dp(this, 7), 0, Ui.dp(this, 7), 0);
            dot.setLayoutParams(params);
            dot.setBackgroundResource(i < entered.length()
                    ? R.drawable.bg_lock_dot_on : R.drawable.bg_lock_dot_off);
            dots.addView(dot);
        }
    }

    private View lastDot() {
        return dots.getChildCount() == 0 ? dots : dots.getChildAt(dots.getChildCount() - 1);
    }

    private void verify() {
        final String pin = entered.toString();
        if (Prefs.checkPin(this, pin)) {
            App.setUnlocked(true);
            Anim.pop(dots);
            finish();
            return;
        }
        Anim.shake(dots);
        Anim.haptic(dots, true);
        title.setText(R.string.pin_wrong);
        dots.postDelayed(() -> {
            entered.setLength(0);
            updateDots();
            title.setText(R.string.pin_enter);
        }, 700L);
    }

    @Override
    public void onBackPressed() {
        // выйти из приложения, не оставляя разблокированным
        moveTaskToBack(true);
    }
}

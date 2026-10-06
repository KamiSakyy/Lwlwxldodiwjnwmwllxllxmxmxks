package com.mailgram.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.mailgram.app.net.Auth;

/**
 * Ловит редирект Google в режиме Android-клиента
 * (схема com.googleusercontent.apps.<id>:/oauth2redirect, зашита в манифест при сборке).
 */
public class RedirectActivity extends Activity {

    private static final String TAG = "MailGramRedirect";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Uri data = intent == null ? null : intent.getData();
        if (data == null) {
            finish();
            return;
        }
        final String code = data.getQueryParameter("code");
        final String state = data.getQueryParameter("state");
        final String error = data.getQueryParameter("error");
        if (error != null) {
            showError("Google вернул ошибку: " + error);
            return;
        }
        if (code == null || code.isEmpty()) {
            showError("Google не передал код авторизации");
            return;
        }
        new Thread(() -> {
            try {
                Auth.completeAuth(getApplicationContext(), code, state);
                runOnUiThread(() -> {
                    startActivity(new Intent(RedirectActivity.this, MainActivity.class)
                            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                    finish();
                });
            } catch (Exception e) {
                Log.w(TAG, "обмен кода не удался: " + e);
                runOnUiThread(() -> showError("Не удалось завершить вход: " + e.getMessage()));
            }
        }, "mailgram-token-exchange").start();
    }

    private void showError(String message) {
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Ошибка входа")
                .setMessage(message)
                .setPositiveButton("ОК", (d, w) -> finish())
                .show();
    }
}

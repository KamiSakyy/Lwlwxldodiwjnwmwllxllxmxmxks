package com.mailgram.app.net;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.mailgram.app.BuildConfig;
import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.KeystoreBox;

/**
 * Состояние входа: OAuth-токены (зашифрованы ключом Android Keystore),
 * выбранный client ID и режим редиректа. Секретов в коде нет: client ID
 * либо вписан в настройках приложения, либо передан при сборке как
 * GitHub Secret (это идентификатор публичного клиента, не секрет).
 */
public final class Auth {

    private static final String TAG = "MailGramAuth";
    private static final String PREFS = "mailgram_auth";

    public static final String MODE_ANDROID = "android";
    public static final String MODE_LOOPBACK = "loopback";

    private static final String K_CLIENT_ID = "client_id";
    private static final String K_MODE = "auth_mode";
    private static final String K_ACCESS = "access_sealed";
    private static final String K_REFRESH = "refresh_sealed";
    private static final String K_EXPIRES = "expires_at";
    private static final String K_ACCOUNT = "account";
    private static final String K_VERIFIER = "pkce_verifier";
    private static final String K_STATE = "pkce_state";

    private Auth() {
    }

    public static SharedPreferences prefs(Context ctx) {
        return ctx.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
    }

    /** Client ID: из настроек, иначе из сборки (GitHub Secret). */
    public static String clientId(Context ctx) {
        String stored = prefs(ctx).getString(K_CLIENT_ID, "");
        if (stored != null && !stored.trim().isEmpty()) return stored.trim();
        return BuildConfig.OAUTH_CLIENT_ID == null ? "" : BuildConfig.OAUTH_CLIENT_ID.trim();
    }

    public static String clientIdFromSettings(Context ctx) {
        String stored = prefs(ctx).getString(K_CLIENT_ID, "");
        return stored == null ? "" : stored.trim();
    }

    public static void setClientId(Context ctx, String clientId) {
        prefs(ctx).edit().putString(K_CLIENT_ID, clientId == null ? "" : clientId.trim()).apply();
    }

    public static boolean clientIdFromBuild() {
        return BuildConfig.OAUTH_CLIENT_ID != null && !BuildConfig.OAUTH_CLIENT_ID.trim().isEmpty();
    }

    public static String authMode(Context ctx) {
        String stored = prefs(ctx).getString(K_MODE, null);
        if (stored != null) return stored;
        // Android-режим требует, чтобы схема редиректа была «вшита» в манифест при сборке
        return redirectForBuildClient(ctx).equals(OAuth.redirectForAndroidClient(clientId(ctx)))
                ? MODE_ANDROID
                : MODE_LOOPBACK;
    }

    public static void setAuthMode(Context ctx, String mode) {
        prefs(ctx).edit().putString(K_MODE, mode).apply();
    }

    private static String redirectForBuildClient(Context ctx) {
        return BuildConfig.OAUTH_REDIRECT_SCHEME + OAuth.ANDROID_REDIRECT_SUFFIX;
    }

    public static String redirectUri(Context ctx) {
        if (MODE_LOOPBACK.equals(authMode(ctx))) return LoopbackServer.redirectUri();
        return OAuth.redirectForAndroidClient(clientId(ctx));
    }

    public static String androidSchemeFromBuild() {
        return BuildConfig.OAUTH_REDIRECT_SCHEME;
    }

    /** Схема, которую надо зарегистрировать в манифесте (для режима Android-клиента). */
    public static String requiredManifestScheme(Context ctx) {
        return OAuth.androidScheme(clientId(ctx));
    }

    public static boolean isSignedIn(Context ctx) {
        return !account(ctx).isEmpty() && !refreshToken(ctx).isEmpty();
    }

    public static String account(Context ctx) {
        return prefs(ctx).getString(K_ACCOUNT, "");
    }

    public static void setAccount(Context ctx, String email) {
        prefs(ctx).edit().putString(K_ACCOUNT, email == null ? "" : email).apply();
    }

    private static String accessToken(Context ctx) {
        String sealed = prefs(ctx).getString(K_ACCESS, null);
        if (sealed == null) return "";
        try {
            return B64.fromUtf8(KeystoreBox.open(ctx, sealed));
        } catch (Exception e) {
            Log.w(TAG, "не читается access-token: " + e);
            return "";
        }
    }

    private static String refreshToken(Context ctx) {
        String sealed = prefs(ctx).getString(K_REFRESH, null);
        if (sealed == null) return "";
        try {
            return B64.fromUtf8(KeystoreBox.open(ctx, sealed));
        } catch (Exception e) {
            Log.w(TAG, "не читается refresh-token: " + e);
            return "";
        }
    }

    private static long expiresAt(Context ctx) {
        return prefs(ctx).getLong(K_EXPIRES, 0L);
    }

    public static void saveTokens(Context ctx, OAuth.Tokens tokens) {
        try {
            SharedPreferences.Editor ed = prefs(ctx).edit();
            if (tokens.accessToken != null && !tokens.accessToken.isEmpty()) {
                ed.putString(K_ACCESS, KeystoreBox.seal(ctx, B64.utf8(tokens.accessToken)));
            }
            if (tokens.refreshToken != null && !tokens.refreshToken.isEmpty()) {
                ed.putString(K_REFRESH, KeystoreBox.seal(ctx, B64.utf8(tokens.refreshToken)));
            }
            ed.putLong(K_EXPIRES, tokens.expiresAt);
            ed.apply();
        } catch (Exception e) {
            throw new IllegalStateException("не удалось сохранить токены: " + e.getMessage(), e);
        }
    }

    /** Действующий access-token, при необходимости обновляется по refresh-token. */
    public static synchronized String accessTokenFresh(Context ctx) throws Exception {
        String token = accessToken(ctx);
        if (!token.isEmpty() && expiresAt(ctx) > System.currentTimeMillis() + 60_000L) {
            return token;
        }
        String refresh = refreshToken(ctx);
        if (refresh.isEmpty()) throw new IllegalStateException("нужно войти в аккаунт Google");
        OAuth.Tokens fresh = OAuth.refresh(clientId(ctx), refresh);
        saveTokens(ctx, fresh);
        return fresh.accessToken;
    }

    /** Готовит ссылку для входа (PKCE) — её открывает Chrome Custom Tab. */
    public static String beginAuth(Context ctx, String loginHint) {
        String verifier = OAuth.randomVerifier();
        String state = OAuth.randomState();
        prefs(ctx).edit().putString(K_VERIFIER, verifier).putString(K_STATE, state).apply();
        return OAuth.authUrl(clientId(ctx), redirectUri(ctx), state, verifier, loginHint);
    }

    public static String pendingState(Context ctx) {
        return prefs(ctx).getString(K_STATE, "");
    }

    /** Завершает вход: обмен кода на токены, определение адреса. @return email */
    public static String completeAuth(Context ctx, String code, String state) throws Exception {
        String expected = pendingState(ctx);
        if (expected != null && !expected.isEmpty() && state != null && !state.isEmpty()
                && !expected.equals(state)) {
            throw new SecurityException("state не совпал — вход прерван (возможная подмена ответа)");
        }
        String verifier = prefs(ctx).getString(K_VERIFIER, "");
        if (verifier == null || verifier.isEmpty()) {
            throw new IllegalStateException("нет code_verifier — начните вход заново");
        }
        OAuth.Tokens tokens = OAuth.exchangeCode(clientId(ctx), code, verifier, redirectUri(ctx));
        saveTokens(ctx, tokens);
        String email = OAuth.userEmail(tokens.accessToken);
        setAccount(ctx, email);
        prefs(ctx).edit().remove(K_VERIFIER).remove(K_STATE).apply();
        return email;
    }

    public static void signOut(Context ctx, boolean revoke) {
        if (revoke) {
            try {
                String refresh = refreshToken(ctx);
                if (!refresh.isEmpty()) OAuth.revoke(refresh);
            } catch (Exception e) {
                Log.w(TAG, "не удалось отозвать токен: " + e);
            }
        }
        prefs(ctx).edit()
                .remove(K_ACCESS).remove(K_REFRESH).remove(K_EXPIRES)
                .remove(K_ACCOUNT).remove(K_VERIFIER).remove(K_STATE)
                .apply();
    }
}

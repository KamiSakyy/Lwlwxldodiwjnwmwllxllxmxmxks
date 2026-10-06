package com.kamisakyy.noxchat;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/** Firebase Identity Toolkit anonymous sign-in and secure-token refresh over HTTPS REST. */
final class FirebaseAuthClient {
    private static final String PREFS = "firebase_session";
    private static final long REFRESH_SKEW_MS = 2 * 60 * 1000L;
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final OkHttpClient HTTP = new OkHttpClient.Builder()
            .connectTimeout(15, java.util.concurrent.TimeUnit.SECONDS)
            .readTimeout(20, java.util.concurrent.TimeUnit.SECONDS)
            .callTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
            .build();

    private final SharedPreferences preferences;
    private User cachedUser;

    FirebaseAuthClient(Context context) {
        preferences = context.getApplicationContext()
                .getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        cachedUser = readSavedUser();
    }

    synchronized User authenticate() throws IOException {
        if (cachedUser != null && cachedUser.expiresAtMs > System.currentTimeMillis() + REFRESH_SKEW_MS) {
            return cachedUser;
        }
        String refreshToken = preferences.getString("refresh_token", null);
        if (refreshToken != null && !refreshToken.isEmpty()) {
            try {
                cachedUser = refresh(refreshToken);
                save(cachedUser);
                return cachedUser;
            } catch (IOException refreshFailure) {
                String reason = refreshFailure.getMessage() == null ? "" : refreshFailure.getMessage().toLowerCase(java.util.Locale.ROOT);
                if (reason.contains("invalid_grant") || reason.contains("invalid refresh token")
                        || reason.contains("user_disabled")) {
                    // A revoked anonymous credential gets a fresh anonymous account.
                    preferences.edit().clear().apply();
                } else {
                    // Keep the refresh token after transient network/server failures.
                    throw refreshFailure;
                }
            }
        }
        cachedUser = signInAnonymously();
        save(cachedUser);
        return cachedUser;
    }

    synchronized String idToken() throws IOException {
        return authenticate().idToken;
    }

    synchronized String uid() throws IOException {
        return authenticate().uid;
    }

    private User readSavedUser() {
        String token = preferences.getString("id_token", null);
        String refresh = preferences.getString("refresh_token", null);
        String uid = preferences.getString("uid", null);
        long expires = preferences.getLong("expires_at", 0L);
        if (token == null || refresh == null || uid == null) return null;
        return new User(uid, token, refresh, expires);
    }

    private void save(User user) {
        preferences.edit()
                .putString("uid", user.uid)
                .putString("id_token", user.idToken)
                .putString("refresh_token", user.refreshToken)
                .putLong("expires_at", user.expiresAtMs)
                .apply();
    }

    private User signInAnonymously() throws IOException {
        JSONObject payload = new JSONObject();
        try {
            payload.put("returnSecureToken", true);
        } catch (Exception ignored) { }
        Request request = new Request.Builder()
                .url("https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=" +
                        urlEncode(FirebaseConfig.API_KEY))
                .post(RequestBody.create(JSON, payload.toString()))
                .build();
        JSONObject response = executeJson(request, "Firebase anonymous sign-in");
        return userFrom(response, true);
    }

    private User refresh(String refreshToken) throws IOException {
        RequestBody body = new FormBody.Builder()
                .add("grant_type", "refresh_token")
                .add("refresh_token", refreshToken)
                .build();
        Request request = new Request.Builder()
                .url("https://securetoken.googleapis.com/v1/token?key=" +
                        urlEncode(FirebaseConfig.API_KEY))
                .post(body)
                .build();
        JSONObject response = executeJson(request, "Firebase token refresh");
        return userFrom(response, false);
    }

    private User userFrom(JSONObject response, boolean initialSignIn) throws IOException {
        String idToken = response.optString(initialSignIn ? "idToken" : "id_token", "");
        String refreshToken = response.optString(initialSignIn ? "refreshToken" : "refresh_token", "");
        String uid = response.optString(initialSignIn ? "localId" : "user_id", "");
        long expiresSeconds;
        try {
            expiresSeconds = Long.parseLong(response.optString("expiresIn", response.optString("expires_in", "3600")));
        } catch (NumberFormatException ex) {
            expiresSeconds = 3600L;
        }
        if (idToken.isEmpty() || refreshToken.isEmpty() || uid.isEmpty()) {
            throw new IOException("Firebase Auth returned an incomplete anonymous session.");
        }
        return new User(uid, idToken, refreshToken,
                System.currentTimeMillis() + Math.max(60L, expiresSeconds) * 1000L);
    }

    private JSONObject executeJson(Request request, String action) throws IOException {
        try (Response response = HTTP.newCall(request).execute()) {
            String body = response.body() == null ? "" : response.body().string();
            JSONObject json;
            try {
                json = body.isEmpty() ? new JSONObject() : new JSONObject(body);
            } catch (Exception parseFailure) {
                throw new IOException(action + " returned an unreadable response.", parseFailure);
            }
            if (!response.isSuccessful()) {
                String message = json.optJSONObject("error") == null
                        ? body
                        : json.optJSONObject("error").optString("message", body);
                throw new IOException(action + " failed: " + message);
            }
            return json;
        }
    }

    private static String urlEncode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        } catch (Exception impossible) {
            return value;
        }
    }

    static final class User {
        final String uid;
        final String idToken;
        final String refreshToken;
        final long expiresAtMs;

        User(String uid, String idToken, String refreshToken, long expiresAtMs) {
            this.uid = uid;
            this.idToken = idToken;
            this.refreshToken = refreshToken;
            this.expiresAtMs = expiresAtMs;
        }
    }
}

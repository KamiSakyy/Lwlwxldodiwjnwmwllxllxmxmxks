package com.kamisakyy.noxchat;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/** Small RTDB REST client. Live changes are consumed through Firebase's REST SSE endpoint. */
final class FirebaseRealtimeDatabase {
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final OkHttpClient HTTP = new OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(25, TimeUnit.SECONDS)
            .callTimeout(35, TimeUnit.SECONDS)
            .build();

    private final FirebaseAuthClient auth;
    private final String databaseUrl;

    FirebaseRealtimeDatabase(FirebaseAuthClient auth) {
        this.auth = auth;
        this.databaseUrl = FirebaseConfig.DATABASE_URL.replaceAll("/+$", "");
    }

    void put(String path, JSONObject value) throws IOException {
        execute("PUT", path, value);
    }

    void delete(String path) throws IOException {
        execute("DELETE", path, null);
    }

    void execute(String method, String path, JSONObject value) throws IOException {
        String url = endpoint(path, auth.idToken());
        Request.Builder builder = new Request.Builder().url(url);
        if ("DELETE".equals(method)) {
            builder.delete();
        } else {
            builder.method(method, RequestBody.create(JSON, value == null ? "null" : value.toString()));
        }
        try (Response response = HTTP.newCall(builder.build()).execute()) {
            String body = response.body() == null ? "" : response.body().string();
            if (!response.isSuccessful()) {
                String reason = body;
                try {
                    reason = new JSONObject(body).optJSONObject("error") == null
                            ? body : new JSONObject(body).optJSONObject("error").optString("message", body);
                } catch (Exception ignored) { }
                throw new IOException("Realtime Database HTTP " + response.code() + ": " + reason);
            }
        }
    }

    String endpoint(String path, String idToken) {
        String cleanPath = path == null ? "" : path.replaceAll("^/+|/+$", "");
        String encodedPath = encodePath(cleanPath);
        String token = urlEncode(idToken);
        return databaseUrl + (encodedPath.isEmpty() ? "" : "/" + encodedPath) + ".json?auth=" + token;
    }

    FirebaseAuthClient auth() {
        return auth;
    }

    private static String encodePath(String path) {
        if (path.isEmpty()) return "";
        String[] segments = path.split("/");
        StringBuilder result = new StringBuilder();
        for (String segment : segments) {
            if (result.length() > 0) result.append('/');
            result.append(urlEncode(segment));
        }
        return result.toString();
    }

    private static String urlEncode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name()).replace("+", "%20");
        } catch (Exception impossible) {
            return value;
        }
    }
}

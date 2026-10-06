package com.kamisakyy.noxchat;

import android.os.Handler;
import android.os.Looper;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/** Reconnecting Firebase Realtime Database REST event stream (Server-Sent Events). */
final class FirebaseRestStream {
    interface Listener {
        void onEvent(String event, String data);
        void onStreamError(String message);
    }

    private final FirebaseRealtimeDatabase database;
    private final String path;
    private final Listener listener;
    private final ExecutorService streamThread = Executors.newSingleThreadExecutor(r -> {
        Thread thread = new Thread(r, "rtdb-sse");
        thread.setDaemon(true);
        return thread;
    });
    private final Handler main = new Handler(Looper.getMainLooper());
    private final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(20, TimeUnit.SECONDS)
            .readTimeout(0, TimeUnit.MILLISECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .build();

    private volatile boolean stopped;
    private volatile okhttp3.Call currentCall;
    private int retrySeconds = 1;

    FirebaseRestStream(FirebaseRealtimeDatabase database, String path, Listener listener) {
        this.database = database;
        this.path = path;
        this.listener = listener;
    }

    void start() {
        if (stopped) return;
        connect();
    }

    private void connect() {
        if (stopped) return;
        try {
            streamThread.execute(() -> readStream());
        } catch (RuntimeException ignored) {
            // Executor has already been shut down.
        }
    }

    private void readStream() {
        if (stopped) return;
        String failure = null;
        try {
            String token = database.auth().idToken();
            Request request = new Request.Builder()
                    .url(database.endpoint(path, token))
                    .header("Accept", "text/event-stream")
                    .header("Cache-Control", "no-cache")
                    .get()
                    .build();
            okhttp3.Call call = client.newCall(request);
            currentCall = call;
            try (Response response = call.execute()) {
                if (!response.isSuccessful()) {
                    String body = response.body() == null ? "" : response.body().string();
                    failure = "Realtime Database stream HTTP " + response.code() + ": " + body;
                } else {
                    retrySeconds = 1;
                    ResponseBody responseBody = response.body();
                    if (responseBody == null) throw new IOException("Empty realtime stream response");
                    BufferedSource source = responseBody.source();
                    String event = "message";
                    StringBuilder data = new StringBuilder();
                    String line;
                    while (!stopped && (line = source.readUtf8Line()) != null) {
                        if (line.isEmpty()) {
                            dispatch(event, data.toString());
                            event = "message";
                            data.setLength(0);
                        } else if (line.startsWith("event:")) {
                            event = line.substring(6).trim();
                        } else if (line.startsWith("data:")) {
                            if (data.length() > 0) data.append('\n');
                            data.append(line.substring(5).trim());
                        } else if (line.startsWith("retry:")) {
                            try {
                                retrySeconds = Math.max(1, Math.min(30,
                                        Integer.parseInt(line.substring(6).trim()) / 1000));
                            } catch (NumberFormatException ignored) { }
                        }
                    }
                    if (!stopped) failure = "Realtime Database stream closed; reconnecting.";
                }
            }
        } catch (IOException | RuntimeException ex) {
            if (!stopped) failure = ex.getMessage() == null ? "Realtime Database stream interrupted." : ex.getMessage();
        } finally {
            currentCall = null;
        }

        if (!stopped) {
            if (failure != null) {
                String message = failure;
                main.post(() -> listener.onStreamError(message));
            }
            long delay = Math.min(30L, Math.max(1, retrySeconds));
            retrySeconds = Math.min(30, retrySeconds * 2);
            main.postDelayed(this::connect, delay * 1000L);
        }
    }

    private void dispatch(String event, String data) {
        if (stopped || data == null || data.isEmpty()) return;
        if ("put".equals(event) || "patch".equals(event) || "cancel".equals(event)
                || "auth_revoked".equals(event)) {
            main.post(() -> {
                if (!stopped) listener.onEvent(event, data);
            });
        }
    }

    void close() {
        stopped = true;
        okhttp3.Call call = currentCall;
        if (call != null) call.cancel();
        streamThread.shutdownNow();
    }
}

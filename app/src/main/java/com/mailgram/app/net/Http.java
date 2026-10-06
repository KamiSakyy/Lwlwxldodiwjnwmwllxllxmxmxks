package com.mailgram.app.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/** Минимальный HTTP-клиент на HttpURLConnection (без сторонних библиотек). */
public final class Http {

    private static final int CONNECT_TIMEOUT = 15000;
    private static final int READ_TIMEOUT = 45000;
    public static final String USER_AGENT = "MailGram-Android/1.0 (gmail-api)";

    private Http() {
    }

    public static final class HttpException extends IOException {
        public final int code;
        public final String body;

        public HttpException(int code, String body) {
            super("HTTP " + code + (body == null || body.isEmpty() ? "" : ": " + trim(body)));
            this.code = code;
            this.body = body;
        }

        private static String trim(String s) {
            String t = s.replace('\n', ' ').trim();
            return t.length() > 240 ? t.substring(0, 240) + "…" : t;
        }
    }

    /** Gmail вернул 403/429 quota: запросы надо прекратить и подождать, а не повторять. */
    public static final class RateLimited extends IOException {
        public final long retryAfterMs;

        RateLimited(String message, long retryAfterMs) {
            super(message);
            this.retryAfterMs = retryAfterMs <= 0L ? 45_000L : retryAfterMs;
        }
    }

    private static String rateLimitedMessage(String body) {
        if (body == null || body.isEmpty()) return "Google ограничил частоту запросов";
        String one = body.replace('\n', ' ').trim();
        return "Google ограничил частоту запросов: "
                + (one.length() > 220 ? one.substring(0, 220) + "…" : one);
    }

    static long retryAfterMs(String header) {
        if (header == null || header.trim().isEmpty()) return 0L;
        try {
            long seconds = (long) Double.parseDouble(header.trim());
            if (seconds < 5L) seconds = 5L;
            if (seconds > 300L) seconds = 300L;
            return seconds * 1000L;
        } catch (Exception e) {
            return 0L;
        }
    }

    /** Похоже ли сообщение об ошибке на ответ про исчерпанный лимит запросов. */
    public static boolean isQuotaError(int code, String body) {
        if (code != 403 && code != 429) return false;
        if (body == null) return true;
        String b = body.toLowerCase(java.util.Locale.US);
        return b.contains("quota") || b.contains("rate_limit") || b.contains("ratelimit")
                || b.contains("exceeded") || b.contains("userRateLimitExceeded");
    }

    public static final class Response {
        public final int code;
        public final String body;

        Response(int code, String body) {
            this.code = code;
            this.body = body;
        }
    }

    public static Response request(String method, String url, String bearer,
                                   byte[] body, String contentType) throws IOException {
        IOException last = null;
        for (int attempt = 0; attempt < 3; attempt++) {
            HttpURLConnection conn = null;
            try {
                conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod(method);
                conn.setConnectTimeout(CONNECT_TIMEOUT);
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setRequestProperty("User-Agent", USER_AGENT);
                conn.setRequestProperty("Accept", "application/json");
                if (bearer != null) {
                    conn.setRequestProperty("Authorization", "Bearer " + bearer);
                }
                if (body != null) {
                    conn.setDoOutput(true);
                    if (contentType != null) conn.setRequestProperty("Content-Type", contentType);
                    conn.setFixedLengthStreamingMode(body.length);
                    try (OutputStream os = conn.getOutputStream()) {
                        os.write(body);
                    }
                }
                int code = conn.getResponseCode();
                InputStream is = (code >= 200 && code < 300) ? conn.getInputStream() : conn.getErrorStream();
                String text = is == null ? "" : readAll(is);
                if (code >= 500 && attempt < 2) {
                    last = new HttpException(code, text);
                    sleep(400L * (attempt + 1));
                    continue;
                }
                if (code < 200 || code >= 300) {
                    if (isQuotaError(code, text)) {
                        // лимит запросов: повторять бессмысленно — только ждать
                        throw new RateLimited(rateLimitedMessage(text),
                                retryAfterMs(conn.getHeaderField("Retry-After")));
                    }
                    throw new HttpException(code, text);
                }
                return new Response(code, text);
            } catch (HttpException e) {
                throw e;
            } catch (IOException e) {
                last = e;
                if (attempt < 2) sleep(400L * (attempt + 1));
            } finally {
                if (conn != null) conn.disconnect();
            }
        }
        throw last != null ? last : new IOException("сеть недоступна");
    }

    public static String get(String url, String bearer) throws IOException {
        return request("GET", url, bearer, null, null).body;
    }

    public static String postJson(String url, String bearer, String json) throws IOException {
        return request("POST", url, bearer, json.getBytes(StandardCharsets.UTF_8),
                "application/json; charset=UTF-8").body;
    }

    public static String postForm(String url, String form) throws IOException {
        return request("POST", url, null, form.getBytes(StandardCharsets.UTF_8),
                "application/x-www-form-urlencoded").body;
    }

    private static String readAll(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int n;
        while ((n = is.read(buf)) > 0) bos.write(buf, 0, n);
        is.close();
        return new String(bos.toByteArray(), StandardCharsets.UTF_8);
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

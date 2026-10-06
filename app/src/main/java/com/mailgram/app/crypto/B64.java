package com.mailgram.app.crypto;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

/** Base64url / hex / UTF-8 без лишних зависимостей. */
public final class B64 {

    private static final int URL = Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING;
    private static final char[] HEX = "0123456789abcdef".toCharArray();

    private B64() {
    }

    public static String str(byte[] data) {
        if (data == null) return "";
        return Base64.encodeToString(data, URL);
    }

    public static byte[] bytes(String s) {
        if (s == null) return new byte[0];
        String cleaned = s.replace("=", "").replace("\r", "").replace("\n", "")
                .replace(" ", "").replace("\t", "").trim();
        if (cleaned.isEmpty()) return new byte[0];
        try {
            return Base64.decode(cleaned, URL);
        } catch (IllegalArgumentException e) {
            try {
                return Base64.decode(cleaned, Base64.DEFAULT);
            } catch (IllegalArgumentException ignored) {
                return new byte[0];
            }
        }
    }

    public static String hex(byte[] data) {
        if (data == null) return "";
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (byte b : data) {
            sb.append(HEX[(b >> 4) & 0xf]).append(HEX[b & 0xf]);
        }
        return sb.toString();
    }

    public static String hexColons(byte[] data) {
        StringBuilder sb = new StringBuilder(data.length * 3);
        for (int i = 0; i < data.length; i++) {
            if (i > 0) sb.append(':');
            sb.append(HEX[(data[i] >> 4) & 0xf]).append(HEX[data[i] & 0xf]);
        }
        return sb.toString().toUpperCase(java.util.Locale.US);
    }

    public static byte[] utf8(String s) {
        return s == null ? new byte[0] : s.getBytes(StandardCharsets.UTF_8);
    }

    public static String fromUtf8(byte[] data) {
        return data == null ? "" : new String(data, StandardCharsets.UTF_8);
    }
}

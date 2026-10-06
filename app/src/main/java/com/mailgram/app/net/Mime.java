package com.mailgram.app.net;

import android.util.Base64;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/** Сборка RFC 5322 (MIME) письма для Gmail API. */
public final class Mime {

    private Mime() {
    }

    public static String rfc2822Date(long ts) {
        SimpleDateFormat fmt = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.US);
        fmt.setTimeZone(TimeZone.getDefault());
        return fmt.format(new Date(ts));
    }

    /**
     * @param bodyText тело письма (base64-строки с переносами — так делают все почтовые клиенты)
     */
    public static String build(String from, String to, String subject, String bodyText,
                               String messageId, String inReplyTo) {
        StringBuilder sb = new StringBuilder();
        sb.append("From: ").append(from).append("\r\n");
        sb.append("To: ").append(to).append("\r\n");
        sb.append("Subject: ").append(encodeHeader(subject)).append("\r\n");
        sb.append("MIME-Version: 1.0\r\n");
        sb.append("Content-Type: text/plain; charset=UTF-8\r\n");
        sb.append("Content-Transfer-Encoding: 7bit\r\n");
        sb.append("X-Mailer: MailGram/1.0 (Android)\r\n");
        if (messageId != null && !messageId.isEmpty()) {
            sb.append("Message-ID: <").append(messageId).append("@mailgram.app>\r\n");
        }
        if (inReplyTo != null && !inReplyTo.isEmpty()) {
            sb.append("In-Reply-To: <").append(inReplyTo).append(">\r\n");
            sb.append("References: <").append(inReplyTo).append(">\r\n");
        }
        sb.append("Date: ").append(rfc2822Date(System.currentTimeMillis())).append("\r\n");
        sb.append("\r\n");
        sb.append(bodyText);
        return sb.toString();
    }

    /** Кодирование темы, если в ней есть не-ASCII (RFC 2047). */
    public static String encodeHeader(String value) {
        if (value == null) return "";
        boolean ascii = true;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) > 127) {
                ascii = false;
                break;
            }
        }
        if (ascii) return value;
        String b64 = Base64.encodeToString(value.getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
        return "=?UTF-8?B?" + b64 + "?=";
    }

    /** Тело письма, готовое к передаче (с переносами строк каждые 76 символов). */
    public static String wrap(String base64) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < base64.length(); i += 76) {
            sb.append(base64, i, Math.min(base64.length(), i + 76)).append("\r\n");
        }
        return sb.toString();
    }

    /** MIME → base64url для поля "raw" в Gmail API. */
    public static String toRaw(String mime) {
        return Base64.encodeToString(mime.getBytes(StandardCharsets.UTF_8),
                Base64.URL_SAFE | Base64.NO_WRAP | Base64.NO_PADDING);
    }
}

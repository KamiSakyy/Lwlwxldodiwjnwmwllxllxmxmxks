package com.mailgram.app.crypto;

import android.content.Context;
import android.util.Base64;

import org.json.JSONObject;

/**
 * Слой сообщений MailGram: превращает текст в «конверт», который уходит письмом,
 * и обратно. Всё, что видит почта — случайный base64:
 * <pre>
 * MailGram 9f2c1ab4
 *
 * eyJ2IjoxLCJhbGciOiJFQy1QMjU2K0hLREYtU0hBMjU2K0NoYUNoYTIwLVBvbHkxMzA1IiwiaWQiOiJ...
 * </pre>
 *
 * Конверт (JSON, поля):
 * <ul>
 *   <li>v   — версия протокола</li>
 *   <li>alg — список алгоритмов (информативно)</li>
 *   <li>id  — UUID сообщения (дедупликация)</li>
 *   <li>ts  — время отправки (мс)</li>
 *   <li>chat— идентификатор пары (8 hex, в теме письма — тот же)</li>
 *   <li>from/to — адреса сторон</li>
 *   <li>pk  — открытый ключ отправителя (65 байт)</li>
 *   <li>n   — одноразовый nonce (12 байт)</li>
 *   <li>c   — ChaCha20-Poly1305(ключ сессии, nonce, AAD=заголовок конверта, plaintext)</li>
 * </ul>
 * Ключ сессии = HKDF-SHA256(ECDH(P-256) || соль || "MailGram/v1|chat=...").
 */
public final class MailCrypto {

    public static final String SUBJECT_PREFIX = "MailGram ";
    public static final int VERSION = 1;
    public static final String ALG = "EC-P256-ECDH+HKDF-SHA256+ChaCha20-Poly1305";

    private static final byte[] SALT = B64.utf8("MailGram/v1/salt");

    private MailCrypto() {
    }

    /** Ключ сессии для пары (свой приватный + открытый ключ собеседника). */
    public static byte[] sessionKey(Context ctx, byte[] peerPublicRaw, String chatUid) throws Exception {
        byte[] shared = Identity.agree(ctx, peerPublicRaw);
        byte[] info = B64.utf8("MailGram/v1|chat=" + chatUid);
        return NativeCrypto.hkdfSha256(shared, SALT, info, 32);
    }

    /** AAD — заголовочные поля конверта: связывает их с шифротекстом. */
    public static byte[] aad(int version, String id, long ts, String from, String to, String chatUid) {
        return B64.utf8("MailGram|" + version + "|" + id + "|" + ts + "|" + from + "|" + to + "|" + chatUid);
    }

    /**
     * Собирает конверт.
     *
     * @param payloadJson то, что реально шифруется (текст сообщения и т.п.)
     * @return JSON-строка конверта
     */
    public static String seal(Context ctx, String from, String to, String chatUid,
                              String id, long ts, byte[] peerPublicRaw, String payloadJson) throws Exception {
        if (!NativeCrypto.isLoaded()) {
            throw new IllegalStateException("нативная библиотека не загружена: " + NativeCrypto.loadError());
        }
        byte[] key = sessionKey(ctx, peerPublicRaw, chatUid);
        byte[] nonce = NativeCrypto.random(12);
        byte[] aad = aad(VERSION, id, ts, from, to, chatUid);
        byte[] ct = NativeCrypto.aeadEncrypt(key, nonce, aad, B64.utf8(payloadJson));

        JSONObject env = new JSONObject();
        env.put("v", VERSION);
        env.put("alg", ALG);
        env.put("id", id);
        env.put("ts", ts);
        env.put("chat", chatUid);
        env.put("from", from);
        env.put("to", to);
        env.put("pk", B64.str(Identity.publicKeyRaw(ctx)));
        env.put("n", B64.str(nonce));
        env.put("c", B64.str(ct));
        java.util.Arrays.fill(key, (byte) 0);
        return env.toString();
    }

    /** Разобранный конверт. */
    public static final class Envelope {
        public int version;
        public String id;
        public long ts;
        public String chatUid;
        public String from;
        public String to;
        public byte[] senderPublicRaw;
        public String payload; // расшифрованный JSON
    }

    /**
     * Разбирает текст письма. Возвращает {@code null}, если это не письмо MailGram.
     *
     * @throws SecurityException если конверт есть, но расшифровать не удалось
     */
    public static Envelope open(Context ctx, String mailBody, String myEmail) throws Exception {
        return open(ctx, mailBody, myEmail, null);
    }

    /**
     * @param peerPublicForOwnMessages открытый ключ собеседника — нужен, чтобы прочитать
     *        собственное отправленное письмо (ключ сессии симметричен: ECDH(мой прив., его публ.)
     *        равно ECDH(его прив., мой публ.)).
     */
    public static Envelope open(Context ctx, String mailBody, String myEmail, byte[] peerPublicForOwnMessages)
            throws Exception {
        String json = extractEnvelopeJson(mailBody);
        if (json == null) return null;

        JSONObject env = new JSONObject(json);
        int version = env.optInt("v", 0);
        if (version != VERSION) {
            throw new SecurityException("неизвестная версия протокола: " + version);
        }
        Envelope out = new Envelope();
        out.version = version;
        out.id = env.getString("id");
        out.ts = env.getLong("ts");
        out.chatUid = env.getString("chat");
        out.from = env.getString("from");
        out.to = env.getString("to");
        out.senderPublicRaw = B64.bytes(env.getString("pk"));
        if (out.senderPublicRaw.length != 65) {
            throw new SecurityException("некорректный открытый ключ отправителя");
        }
        boolean iAmSender = myEmail != null && myEmail.equalsIgnoreCase(out.from);
        byte[] peerKey;
        if (iAmSender) {
            if (peerPublicForOwnMessages == null || peerPublicForOwnMessages.length != 65) {
                throw new SecurityException("это моё отправленное сообщение, "
                        + "но ключ собеседника неизвестен — прочитать его можно только с устройства-отправителя");
            }
            peerKey = peerPublicForOwnMessages;
        } else {
            peerKey = out.senderPublicRaw;
        }

        byte[] key = sessionKey(ctx, peerKey, out.chatUid);
        byte[] nonce = B64.bytes(env.getString("n"));
        byte[] aad = aad(out.version, out.id, out.ts, out.from, out.to, out.chatUid);
        byte[] pt = NativeCrypto.aeadDecrypt(key, nonce, aad, B64.bytes(env.getString("c")));
        java.util.Arrays.fill(key, (byte) 0);
        if (pt == null) {
            throw new SecurityException("тег не сошёлся: сообщение изменено или ключ не подходит");
        }
        out.payload = B64.fromUtf8(pt);
        return out;
    }

    /** Достаёт JSON конверта из тела письма (base64 с переносами строк, возможен HTML). */
    public static String extractEnvelopeJson(String body) {
        if (body == null) return null;
        String text = body;
        if (text.contains("<")) {
            text = text.replaceAll("<[^>]*>", " ");
        }
        String cleaned = text.replaceAll("\\s+", "");
        String decoded = B64.fromUtf8(B64.bytes(cleaned));
        if (decoded.contains("\"alg\"")) {
            return slice(decoded);
        }
        if (text.contains("\"alg\"")) {
            return slice(text);
        }
        // на случай, если переносы строк «порвали» base64 — склеиваем всё, что похоже на base64
        StringBuilder sb = new StringBuilder();
        for (String line : text.split("\\s+")) {
            if (line.matches("[A-Za-z0-9_\\-+/=]{20,}")) sb.append(line);
        }
        if (sb.length() > 0) {
            String again = B64.fromUtf8(B64.bytes(sb.toString()));
            if (again.contains("\"alg\"")) return slice(again);
        }
        return null;
    }

    private static String slice(String s) {
        int start = s.indexOf('{');
        int end = s.lastIndexOf('}');
        if (start < 0 || end <= start) return null;
        return s.substring(start, end + 1);
    }

    /** Тело письма: конверт в base64 (то, что увидит почтовый клиент). */
    public static String toMailBody(String envelopeJson) {
        byte[] b64 = Base64.encode(envelopeJson.getBytes(java.nio.charset.StandardCharsets.UTF_8),
                Base64.DEFAULT);
        return new String(b64, java.nio.charset.StandardCharsets.US_ASCII);
    }
}

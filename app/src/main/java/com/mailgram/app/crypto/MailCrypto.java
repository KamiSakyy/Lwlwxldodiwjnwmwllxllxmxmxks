package com.mailgram.app.crypto;

import android.content.Context;
import android.util.Base64;
import android.util.Log;

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

    /** Тема наших писем — ровно «MailGram», без идентификаторов. */
    public static final String SUBJECT = "MailGram";

    /** Умное распознавание темы: регистр, пробелы и мусор вокруг «mailgram» не важны. */
    public static boolean isMailGramSubject(String subject) {
        if (subject == null) return false;
        String s = subject.toLowerCase(java.util.Locale.US).replaceAll("[^a-z0-9]", "");
        return s.contains("mailgram");
    }
    private static final String TAG = "MailGramCrypto";
    /** Статический конверт: ECDH(P-256) + HKDF + ChaCha20-Poly1305 (нужен только для старта сессии). */
    public static final int VERSION = 1;

    /** Простой конверт без шифрования: работает без обмена ключами. */
    public static final int VERSION_PLAIN = 0;

    /** Собирает простой (нешифрованный) конверт версии 0. */
    public static String sealPlain(String from, String to, String chatUid,
                                   String id, long ts, byte[] senderPublicRaw, String payload)
            throws Exception {
        JSONObject env = new JSONObject();
        env.put("v", VERSION_PLAIN);
        env.put("id", id);
        env.put("ts", ts);
        env.put("chat", chatUid);
        env.put("from", from);
        env.put("to", to);
        if (senderPublicRaw != null && senderPublicRaw.length > 0) {
            env.put("pk", B64.str(senderPublicRaw));
        }
        env.put("b", payload);
        return env.toString();
    }
    /** Конверт с двойным крысиным шагом (Double Ratchet) — основной режим. */
    public static final int VERSION_RATCHET = 2;
    public static final String ALG = "EC-P256-ECDH+HKDF-SHA256+ChaCha20-Poly1305";
    public static final String ALG_RATCHET = "P256+HKDF-SHA256+ChaCha20-Poly1305+DOUBLE-RATCHET";

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
        env.put("pre", ourPreKey(ctx));
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
        /** Открытый предключ отправителя (для старта сессии с крысиным шагом). */
        public byte[] senderPreKeyRaw;
        /** Заголовок крысиного шага (версия 2). */
        public byte[] ratchetPublic;
        public long pn;
        public long n;
        /** Своё же отправленное письмо в режиме крысиного шага: прочитать его на этом
         *  устройстве нельзя (ключ цепочки уже ушёл вперёд), но и ошибкой это не является. */
        public boolean selfCopyOfRatchet;
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
        int version = env.optInt("v", -1);
        if (version == VERSION_RATCHET) {
            return openRatchet(ctx, env, myEmail);
        }
        if (version == VERSION_PLAIN) {
            // простой конверт без шифрования
            Envelope plain = new Envelope();
            plain.version = VERSION_PLAIN;
            plain.id = env.getString("id");
            plain.ts = env.optLong("ts", 0L);
            plain.chatUid = env.getString("chat");
            plain.from = env.getString("from");
            plain.to = env.getString("to");
            String plainPk = env.optString("pk", "");
            if (!plainPk.isEmpty()) plain.senderPublicRaw = B64.bytes(plainPk);
            plain.payload = env.getString("b");
            return plain;
        }
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
        String pre = env.optString("pre", "");
        if (!pre.isEmpty()) {
            try {
                out.senderPreKeyRaw = B64.bytes(pre);
                if (!iAmSender) RatchetStore.setPeerPre(ctx, out.chatUid, out.senderPreKeyRaw);
            } catch (Exception ignored) {
            }
        }
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

    // ---------------- двойной крысиный шаг ----------------

    /** Наш открытый предключ (в письме — поле pre), при любой ошибке пустая строка. */
    private static String ourPreKey(Context ctx) {
        try {
            return B64.str(RatchetStore.myPreKeyPublic(ctx));
        } catch (Exception e) {
            Log.w(TAG, "предключ недоступен: " + e);
            return "";
        }
    }

    /** Готовы ли шифровать письмо крысиным шагом (нужен предключ собеседника). */
    public static boolean canRatchet(Context ctx, String chatUid, byte[] peerIdentityRaw) {
        if (peerIdentityRaw == null || peerIdentityRaw.length != 65) return false;
        return RatchetStore.peerPre(ctx, chatUid) != null;
    }

    /**
     * Основной путь: конверт с двойным крысиным шагом. Если предключа собеседника ещё нет —
     * используется статический конверт (в нём уходит наш предключ, и собеседник начнёт сессию).
     */
    public static String sealMessage(Context ctx, String from, String to, String chatUid,
                                     String id, long ts, byte[] peerIdentityRaw,
                                     String payloadJson) throws Exception {
        if (canRatchet(ctx, chatUid, peerIdentityRaw)) {
            try {
                return sealRatchet(ctx, from, to, chatUid, id, ts, peerIdentityRaw, payloadJson);
            } catch (Exception e) {
                Log.w(TAG, "крысиный шаг не сработал, отправляем статическим конвертом: " + e);
            }
        }
        return seal(ctx, from, to, chatUid, id, ts, peerIdentityRaw, payloadJson);
    }

    /** AD для конверта версии 2: метаданные письма плюс заголовок крысиного шага. */
    private static byte[] aadRatchet(String id, long ts, String from, String to, String chatUid) {
        return B64.utf8("MailGram/DR|" + VERSION_RATCHET + "|" + id + "|" + ts + "|"
                + from + "|" + to + "|" + chatUid);
    }

    /** Шифрует payload ключом текущего звена цепочки (версия 2). */
    public static String sealRatchet(Context ctx, String from, String to, String chatUid,
                                     String id, long ts, byte[] peerIdentityRaw,
                                     String payloadJson) throws Exception {
        Ratchet.Sealed sealed;
        synchronized (RatchetStore.chatLock(chatUid)) {
            Ratchet r = RatchetStore.load(ctx, chatUid, true);
            if (r == null || !r.ready) {
                byte[] peerPre = RatchetStore.peerPre(ctx, chatUid);
                if (peerPre == null || peerPre.length != 65) {
                    throw new IllegalStateException("нет предключа собеседника");
                }
                r = Ratchet.initiator(ctx, chatUid, peerIdentityRaw, peerPre);
                RatchetStore.save(ctx, chatUid, r);
            }
            sealed = r.encrypt(ctx, aadRatchet(id, ts, from, to, chatUid), B64.utf8(payloadJson));
            RatchetStore.save(ctx, chatUid, r);
        }

        JSONObject env = new JSONObject();
        env.put("v", VERSION_RATCHET);
        env.put("alg", ALG_RATCHET);
        env.put("id", id);
        env.put("ts", ts);
        env.put("chat", chatUid);
        env.put("from", from);
        env.put("to", to);
        env.put("pk", B64.str(Identity.publicKeyRaw(ctx)));
        env.put("pre", ourPreKey(ctx));
        env.put("dh", B64.str(sealed.dhPublic));
        env.put("pn", sealed.pn);
        env.put("n", sealed.n);
        env.put("nc", B64.str(sealed.nonce));
        env.put("c", B64.str(sealed.ciphertext));
        return env.toString();
    }

    /** Разбирает конверт версии 2: при первом письме поднимает сессию, дальше — крысиный шаг. */
    private static Envelope openRatchet(Context ctx, JSONObject env, String myEmail) throws Exception {
        Envelope out = new Envelope();
        out.version = VERSION_RATCHET;
        out.id = env.getString("id");
        out.ts = env.getLong("ts");
        out.chatUid = env.getString("chat");
        out.from = env.getString("from");
        out.to = env.getString("to");
        out.senderPublicRaw = B64.bytes(env.getString("pk"));
        out.ratchetPublic = B64.bytes(env.getString("dh"));
        out.pn = env.optLong("pn", 0L);
        out.n = env.optLong("n", 0L);
        byte[] nonce = B64.bytes(env.getString("nc"));
        byte[] ct = B64.bytes(env.getString("c"));
        String pre = env.optString("pre", "");
        out.senderPreKeyRaw = pre.isEmpty() ? null : B64.bytes(pre);

        boolean iAmSender = myEmail != null && myEmail.equalsIgnoreCase(out.from);
        if (iAmSender) {
            // своя же копия письма из Gmail: ключ этого звена цепочки уже израсходован,
            // содержимое читается из локальной базы, поэтому просто помечаем письмо своим
            out.selfCopyOfRatchet = true;
            return out;
        }
        if (out.senderPreKeyRaw != null && out.senderPreKeyRaw.length == 65) {
            RatchetStore.setPeerPre(ctx, out.chatUid, out.senderPreKeyRaw);
        }
        byte[] aad = aadRatchet(out.id, out.ts, out.from, out.to, out.chatUid);

        synchronized (RatchetStore.chatLock(out.chatUid)) {
            Ratchet r = RatchetStore.load(ctx, out.chatUid, true);
            byte[] pt = null;
            Exception first = null;
            if (r != null && r.ready) {
                try {
                    pt = r.decrypt(ctx, aad, out.ratchetPublic, out.pn, out.n, nonce, ct);
                    RatchetStore.save(ctx, out.chatUid, r);
                } catch (Exception e) {
                    first = e;
                    r = null;
                }
            }
            if (pt == null) {
                // первое письмо в сессии либо рассинхронизация после переустановки —
                // поднимаем новую сессию в роли ответчика из заголовка письма
                try {
                    Ratchet fresh = Ratchet.responder(ctx, out.chatUid, out.senderPublicRaw,
                            out.ratchetPublic, out.senderPreKeyRaw,
                            RatchetStore.myPreKeyPrivateForResponder(ctx),
                            RatchetStore.myPreKeyPublic(ctx));
                    pt = fresh.decrypt(ctx, aad, out.ratchetPublic, out.pn, out.n, nonce, ct);
                    RatchetStore.save(ctx, out.chatUid, fresh);
                } catch (Exception e) {
                    if (first != null) {
                        throw new SecurityException("не удалось расшифровать в крысином шаге: "
                                + first.getMessage() + " / " + e.getMessage());
                    }
                    throw new SecurityException("не удалось поднять сессию: " + e.getMessage());
                }
            }
            out.payload = B64.fromUtf8(pt);
        }
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

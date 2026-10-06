package com.mailgram.app.crypto;

import android.content.Context;
import android.util.Base64;

import org.json.JSONObject;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;

import javax.crypto.KeyAgreement;

/**
 * Двойной крысиный шаг (Double Ratchet) из спецификации Signal —
 * https://signal.org/docs/specifications/doubleratchet/
 *
 * <p>Что даёт реализация:
 * <ul>
 *   <li><b>Прямая секретность (forward secrecy)</b> — каждое сообщение шифруется своим
 *       ключом, выведенным из цепочки; компрометация текущего состояния не раскрывает прошлое.</li>
 *   <li><b>Восстановление после взлома (post-compromise security)</b> — при каждом ответе
 *       собеседника выполняется DH-шаг с новым эфемерным ключом, после чего старые утечки
 *       бесполезны.</li>
 *   <li><b>Сообщения вне порядка</b> — пропущенные ключи сохраняются (не более MAX_SKIP).</li>
 * </ul>
 *
 * <p>Шаг X3DH-рукопожатия (упрощённый, без подписи предключа — аутентификация обеспечивается
 * уже сверенными отпечатками и тем, что стороны знают открытые ключи друг друга):
 * <pre>
 *   IKM = DH(IK_a, IK_b) || DH(EK_a, IK_b) || DH(EK_a, PK_b)
 *   SK  = HKDF-SHA256(IKM, salt = chatUid, info = "MailGram/DR/x3dh")
 * </pre>
 * где {@code EK} — первый ключ крысиного шага инициатора, {@code PK_b} — предключ собеседника
 * (публикуется в каждом письме полем {@code pre}). Роль {@code DHs} на старте играет предключ,
 * поэтому первый же ответ собеседника проворачивает полноценный DH-шаг.
 *
 * <p>KDF по примитивам, доступным в нативном ядре (HKDF-SHA256):
 * <pre>
 *   KDF_RK(rk, dh)   = HKDF(ikm = dh, salt = rk,  info = "MailGram/DR/root", 64) → rk' ‖ ck
 *   KDF_CK(ck)       = mk = HKDF(ck, salt = 0…0, info = "MailGram/DR/message", 32)
 *                      ck' = HKDF(ck, salt = 0…0, info = "MailGram/DR/chain",   32)
 * </pre>
 * Оба вывода — независимые значения псевдослучайной функции от ключа цепочки, что и требуется
 * от разветвляющего KDF по спецификации.
 *
 * <p>AEAD — ChaCha20-Poly1305 из нативного ядра, дополнительно аутентифицируются заголовок
 * сообщения (наш ключ крысиного шага, номера) и метаданные конверта — то есть AD = CONCAT(AD, header).
 */
public final class Ratchet {

    /** Максимум пропущенных ключей в одной цепочке (как в спецификации Signal). */
    public static final int MAX_SKIP = 500;
    /** Общий предел хранимых пропущенных ключей на сессию. */
    public static final int MAX_SKIPPED_TOTAL = 800;

    private static final byte[] ZERO_SALT = new byte[32];
    private static final byte[] INFO_X3DH = B64.utf8("MailGram/DR/x3dh");
    private static final byte[] INFO_ROOT = B64.utf8("MailGram/DR/root");
    private static final byte[] INFO_CHAIN = B64.utf8("MailGram/DR/chain");
    private static final byte[] INFO_MESSAGE = B64.utf8("MailGram/DR/message");

    // ---------------- состояние (переменные спецификации) ----------------

    /** Корневой ключ (RK). */
    public byte[] rootKey;
    /** Цепочка отправки (CKs). */
    public byte[] ckSend;
    /** Цепочка приёма (CKr). */
    public byte[] ckRecv;
    /** Своя пара крысиного шага (DHs): приватный PKCS#8 и открытый 65 байт. */
    public byte[] dhSelfPriv;
    public byte[] dhSelfPub;
    /** Открытый ключ крысиного шага собеседника (DHr), 65 байт. */
    public byte[] dhRemote;
    /** Номера сообщений (Ns, Nr) и длина предыдущей цепочки (PN). */
    public long nSend;
    public long nRecv;
    public long pn;
    /** Пропущенные ключи: "dh:n" → ключ сообщения. */
    public final java.util.LinkedHashMap<String, byte[]> skipped = new java.util.LinkedHashMap<>();
    /** Предключ собеседника (base64, 65 байт) — нужен, чтобы стать инициатором сессии. */
    public String peerPre = "";
    /** Сессия установлена (есть корневой ключ и цепочки). */
    public boolean ready;

    private Ratchet() {
    }

    // ---------------- создание ----------------

    /** Инициатор: генерирует первый ключ крысиного шага и выводит корневой ключ X3DH. */
    public static Ratchet initiator(Context ctx, String chatUid, byte[] peerIdentityRaw,
                                    byte[] peerPreRaw) throws Exception {
        // Все три DH считаются на одном и том же эфемерном ключе EK.
        KeyPair ek = generateKeyPair();
        byte[] dh1 = Identity.agree(ctx, peerIdentityRaw);
        byte[] dh2 = dh(ek.getPrivate(), peerIdentityRaw);
        byte[] dh3 = dh(ek.getPrivate(), peerPreRaw);

        Ratchet r = new Ratchet();
        byte[] sk = NativeCrypto.hkdfSha256(concat(dh1, dh2, dh3), B64.utf8(chatUid), INFO_X3DH, 32);
        r.rootKey = sk;
        r.dhSelfPriv = ek.getPrivate().getEncoded();
        r.dhSelfPub = Identity.rawFromPublicKey(ek.getPublic());
        r.dhRemote = peerPreRaw;
        r.peerPre = B64.str(peerPreRaw);
        byte[] rkCk = kdfRoot(r.rootKey, dh(ek.getPrivate(), peerPreRaw));
        r.rootKey = slice(rkCk, 0, 32);
        r.ckSend = slice(rkCk, 32, 32);
        r.nSend = 0;
        r.nRecv = 0;
        r.pn = 0;
        r.ready = true;
        wipe(dh1, dh2, dh3);
        return r;
    }

    /** Ответчик: получает первый ключ крысиного шага собеседника и свой предключ. */
    public static Ratchet responder(Context ctx, String chatUid, byte[] peerIdentityRaw,
                                    byte[] peerRatchetRaw, byte[] peerPreRaw,
                                    byte[] myPrePrivPkcs8, byte[] myPrePubRaw) throws Exception {
        byte[] dh1 = Identity.agree(ctx, peerIdentityRaw);
        byte[] dh2 = Identity.agree(ctx, peerRatchetRaw);
        byte[] dh3 = dh(myPrePrivPkcs8, peerRatchetRaw);
        byte[] sk = NativeCrypto.hkdfSha256(concat(dh1, dh2, dh3), B64.utf8(chatUid), INFO_X3DH, 32);

        Ratchet r = new Ratchet();
        r.rootKey = sk;
        r.dhSelfPriv = myPrePrivPkcs8;
        r.dhSelfPub = myPrePubRaw;
        r.dhRemote = peerRatchetRaw;
        r.peerPre = peerPreRaw == null ? "" : B64.str(peerPreRaw);
        r.nSend = 0;
        r.nRecv = 0;
        r.pn = 0;
        r.ready = true;
        // DH-шаг: принимающая цепочка по предключу, отправляющая — по новой паре (по спецификации).
        byte[] recv = kdfRoot(r.rootKey, dh3);
        r.rootKey = slice(recv, 0, 32);
        r.ckRecv = slice(recv, 32, 32);
        wipec(recv);
        KeyPair fresh = generateKeyPair();
        byte[] send = kdfRoot(r.rootKey, dh(fresh.getPrivate(), r.dhRemote));
        r.rootKey = slice(send, 0, 32);
        r.ckSend = slice(send, 32, 32);
        wipec(send);
        r.dhSelfPriv = fresh.getPrivate().getEncoded();
        r.dhSelfPub = Identity.rawFromPublicKey(fresh.getPublic());
        wipe(dh1, dh2, dh3);
        return r;
    }

    // ---------------- шифрование / расшифровка ----------------

    /** Заголовок сообщения, который аутентифицируется как часть AD. */
    public static String header(byte[] dhPub, long pn, long n) {
        return B64.str(dhPub) + "|" + pn + "|" + n;
    }

    /** Шифрует одно сообщение: симметричный шаг цепочки отправки. */
    public Sealed encrypt(Context ctx, byte[] aadPrefix, byte[] plaintext) throws Exception {
        if (!ready) throw new IllegalStateException("сессия не установлена");
        byte[][] step = kdfChain(ckSend);
        byte[] nextCk = step[0];
        byte[] mk = step[1];
        byte[] aad = concat(aadPrefix, B64.utf8(header(dhSelfPub, pn, nSend)));
        byte[] nonce = NativeCrypto.random(12);
        byte[] ct = NativeCrypto.aeadEncrypt(mk, nonce, aad, plaintext);
        Sealed out = new Sealed();
        out.dhPublic = dhSelfPub;
        out.pn = pn;
        out.n = nSend;
        out.nonce = nonce;
        out.ciphertext = ct;
        ckSend = nextCk;
        nSend++;
        wipe(mk);
        return out;
    }

    /** Результат шифрования одного сообщения. */
    public static final class Sealed {
        public byte[] dhPublic;
        public long pn;
        public long n;
        public byte[] nonce;
        public byte[] ciphertext;
    }

    /**
     * Расшифровывает сообщение, соблюдая порядок спецификации: сначала пропущенные ключи,
     * затем (при новом ключе собеседника) DH-шаг, затем симметричный шаг.
     */
    public byte[] decrypt(Context ctx, byte[] aadPrefix, byte[] dhPub, long pnIn, long nIn,
                          byte[] nonce, byte[] ciphertext) throws Exception {
        if (!ready) throw new IllegalStateException("сессия не установлена");
        byte[] aad = concat(aadPrefix, B64.utf8(header(dhPub, pnIn, nIn)));

        // 1. Может быть, ключ уже сохранён как пропущенный.
        String key = B64.str(dhPub) + ":" + nIn;
        byte[] cached = skipped.remove(key);
        if (cached != null) {
            byte[] pt = NativeCrypto.aeadDecrypt(cached, nonce, aad, ciphertext);
            wipe(cached);
            if (pt == null) throw new SecurityException("тег не сошёлся (пропущенный ключ)");
            return pt;
        }

        // 2. Новый ключ собеседника — сохраняем пропущенные и делаем DH-шаг.
        if (dhRemote == null || !java.util.Arrays.equals(dhRemote, dhPub)) {
            skipMessageKeys(pnIn);
            dhRatchet(dhPub);
        }

        // 3. Пропуски внутри текущей цепочки и симметричный шаг.
        skipMessageKeys(nIn);
        byte[][] step = kdfChain(ckRecv);
        byte[] nextCk = step[0];
        byte[] mk = step[1];
        ckRecv = nextCk;
        nRecv++;
        byte[] pt = NativeCrypto.aeadDecrypt(mk, nonce, aad, ciphertext);
        wipe(mk);
        if (pt == null) throw new SecurityException("тег не сошёлся: сообщение изменено или ключ не подходит");
        return pt;
    }

    private void dhRatchet(byte[] headerDh) throws Exception {
        pn = nSend;
        nSend = 0;
        nRecv = 0;
        dhRemote = headerDh;
        byte[] recv = kdfRoot(rootKey, dh(dhSelfPriv, dhRemote));
        rootKey = slice(recv, 0, 32);
        ckRecv = slice(recv, 32, 32);
        wipec(recv);
        KeyPair fresh = generateKeyPair();
        byte[] send = kdfRoot(rootKey, dh(fresh.getPrivate(), dhRemote));
        rootKey = slice(send, 0, 32);
        ckSend = slice(send, 32, 32);
        wipec(send);
        dhSelfPriv = fresh.getPrivate().getEncoded();
        dhSelfPub = Identity.rawFromPublicKey(fresh.getPublic());
    }

    private void skipMessageKeys(long until) {
        if (ckRecv == null) return;
        if (nRecv + MAX_SKIP < until) {
            // цепочка «убежала» слишком далеко — защита от переполнения пропусков
            return;
        }
        while (nRecv < until) {
            byte[][] step = kdfChain(ckRecv);
            ckRecv = step[0];
            if (skipped.size() < MAX_SKIPPED_TOTAL) {
                skipped.put(B64.str(dhRemote) + ":" + nRecv, step[1]);
            } else {
                java.util.Iterator<String> it = skipped.keySet().iterator();
                if (it.hasNext()) {
                    wipe(skipped.remove(it.next()));
                }
                skipped.put(B64.str(dhRemote) + ":" + nRecv, step[1]);
            }
            nRecv++;
        }
    }

    // ---------------- KDF ----------------

    private static byte[] kdfRoot(byte[] rk, byte[] dhOut) {
        byte[] out = NativeCrypto.hkdfSha256(dhOut, rk, INFO_ROOT, 64);
        return out;
    }

    /** @return {новая цепочка, ключ сообщения} */
    private static byte[][] kdfChain(byte[] ck) {
        byte[] next = NativeCrypto.hkdfSha256(ck, ZERO_SALT, INFO_CHAIN, 32);
        byte[] mk = NativeCrypto.hkdfSha256(ck, ZERO_SALT, INFO_MESSAGE, 32);
        return new byte[][]{next, mk};
    }

    // ---------------- ключи и DH ----------------

    public static KeyPair generateKeyPair() throws Exception {
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp256r1"));
        return kpg.generateKeyPair();
    }

    public static KeyPair dhGenerate() throws Exception {
        return generateKeyPair();
    }

    /** ECDH между нашим эфемерным приватным ключом (PKCS#8) и открытым ключом собеседника. */
    public static byte[] dh(PrivateKey privateKey, byte[] peerPublicRaw) throws Exception {
        PublicKey peer = Identity.publicKeyFromRaw(peerPublicRaw);
        KeyAgreement ka = KeyAgreement.getInstance("ECDH");
        ka.init(privateKey);
        ka.doPhase(peer, true);
        return fix32(ka.generateSecret());
    }

    public static byte[] dh(byte[] privatePkcs8, byte[] peerPublicRaw) throws Exception {
        PrivateKey priv = KeyFactory.getInstance("EC")
                .generatePrivate(new PKCS8EncodedKeySpec(privatePkcs8));
        return dh(priv, peerPublicRaw);
    }

    // ---------------- сохранение ----------------

    public JSONObject toJson() {
        JSONObject o = new JSONObject();
        try {
            o.put("rk", B64.str(rootKey));
            if (ckSend != null) o.put("cks", B64.str(ckSend));
            if (ckRecv != null) o.put("ckr", B64.str(ckRecv));
            if (dhSelfPriv != null) o.put("dsp", Base64.encodeToString(dhSelfPriv, Base64.NO_WRAP));
            if (dhSelfPub != null) o.put("dsu", B64.str(dhSelfPub));
            if (dhRemote != null) o.put("dr", B64.str(dhRemote));
            o.put("ns", nSend);
            o.put("nr", nRecv);
            o.put("pn", pn);
            o.put("pre", peerPre == null ? "" : peerPre);
            o.put("ready", ready);
            JSONObject sk = new JSONObject();
            for (java.util.Map.Entry<String, byte[]> e : skipped.entrySet()) {
                sk.put(e.getKey(), B64.str(e.getValue()));
            }
            o.put("skipped", sk);
        } catch (Exception ignored) {
        }
        return o;
    }

    public static Ratchet fromJson(JSONObject o) {
        Ratchet r = new Ratchet();
        r.rootKey = b64(o.optString("rk", ""));
        r.ckSend = b64(o.optString("cks", ""));
        r.ckRecv = b64(o.optString("ckr", ""));
        String dsp = o.optString("dsp", "");
        r.dhSelfPriv = dsp.isEmpty() ? null : Base64.decode(dsp, Base64.NO_WRAP);
        r.dhSelfPub = b64(o.optString("dsu", ""));
        r.dhRemote = b64(o.optString("dr", ""));
        r.nSend = o.optLong("ns", 0L);
        r.nRecv = o.optLong("nr", 0L);
        r.pn = o.optLong("pn", 0L);
        r.peerPre = o.optString("pre", "");
        r.ready = o.optBoolean("ready", false);
        JSONObject sk = o.optJSONObject("skipped");
        if (sk != null) {
            java.util.Iterator<String> it = sk.keys();
            while (it.hasNext()) {
                String key = it.next();
                byte[] value = b64(sk.optString(key, ""));
                if (value != null) r.skipped.put(key, value);
            }
        }
        return r;
    }

    // ---------------- утилиты ----------------

    private static byte[] b64(String s) {
        if (s == null || s.isEmpty()) return null;
        try {
            return B64.bytes(s);
        } catch (Exception e) {
            return null;
        }
    }

    private static byte[] fix32(byte[] secret) {
        if (secret.length == 32) return secret;
        byte[] out = new byte[32];
        if (secret.length > 32) {
            System.arraycopy(secret, secret.length - 32, out, 0, 32);
        } else {
            System.arraycopy(secret, 0, out, 32 - secret.length, secret.length);
        }
        return out;
    }

    private static byte[] concat(byte[]... parts) {
        int len = 0;
        for (byte[] p : parts) len += p == null ? 0 : p.length;
        byte[] out = new byte[len];
        int off = 0;
        for (byte[] p : parts) {
            if (p == null) continue;
            System.arraycopy(p, 0, out, off, p.length);
            off += p.length;
        }
        return out;
    }

    private static byte[] slice(byte[] src, int from, int len) {
        byte[] out = new byte[len];
        System.arraycopy(src, from, out, 0, len);
        return out;
    }

    private static void wipe(byte[]... arrays) {
        for (byte[] a : arrays) {
            if (a != null) java.util.Arrays.fill(a, (byte) 0);
        }
    }

    private static void wipec(byte[]... arrays) {
        wipe(arrays);
    }
}

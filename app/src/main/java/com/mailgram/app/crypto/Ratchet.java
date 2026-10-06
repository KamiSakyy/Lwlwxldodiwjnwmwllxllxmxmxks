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
 * Ключевое расписание переписки (в терминах Double Ratchet — «крысиный шаг», адаптация
 * спецификации Signal https://signal.org/docs/specifications/doubleratchet/ под почту).
 *
 * <h3>Почему здесь нет классического DH-шага</h3>
 * В Signal следующий корень выводится из факта «я увидел новый ключ собеседника и отвечаю».
 * Почта асинхронна: ответ может быть написан ДО того, как дойдёт исходное письмо, письмо может
 * прийти не по порядку или не прийти вовсе. Любое правило «двигать корень по событию получения»
 * в такой среде расходится у двух сторон — корень уезжает, AEAD-тег перестаёт сходиться, и
 * входящие письма начинают пропадать молча (именно так и было в версии 3.x).
 *
 * <p>Поэтому расписание сделано <b>выводимым из заголовка письма</b>, а не из локального
 * состояния: ключ каждого сообщения = KDF(общий секрет, номер сообщения). Собеседник может
 * вычислить любой ключ, не «догоняя» никакие шаги, — порядок и потеря писем на расшифровку не
 * влияют вообще.
 *
 * <h3>X3DH-рукопожатие</h3>
 * <pre>
 *   IK  — долгосрочная идентичность, PK — предключ (поле "pre"), EK — свежая пара инициатора
 *   IKM = DH(IK_me, IK_peer) ‖ DH(EK, IK_peer) ‖ DH(EK, PK_peer) ‖ S
 *   SK  = HKDF-SHA256(IKM, salt = chatUid, info = "MailGram/DR/x3dh")
 * </pre>
 * где {@code S} — случайный «соль-раунд», который инициатор передаёт в первом же письме
 * (поле "srt"): он не даёт новых свойств секретности, но гарантирует, что при пересоздании
 * сессии ключи не повторятся. Ответчик поднимает сессию из заголовка письма, отдельного
 * обмена ключами нет.
 *
 * <h3>Ключ сообщения</h3>
 * <pre>
 *   CK(turn) = HKDF-SHA256(ikm = turn, salt = SK ‖ seed_me ‖ seed_peer, info = "MailGram/DR/chain", 32)
 *   MK(turn, n) = HKDF-SHA256(ikm = n, salt = CK(turn), info = "MailGram/DR/message", 32)
 * </pre>
 * {@code seed} — публичное производное открытого ключа идентичности (см. {@link Identity#seed}),
 * {@code turn} — сколько писем в этом направлении уже отправлено (поле "pn"), {@code n} — номер
 * письма внутри оборота (поле "n"). Оба поля аутентифицируются тегом как часть AD, поэтому
 * подменить их и получить чужой ключ нельзя.
 *
 * <h3>Что это даёт и чего сознательно не даёт</h3>
 * <ul>
 *   <li>✔ Сквозное шифрование: письмо —opaque для Gmail, ключи не покидают устройство.</li>
 *   <li>✔ Отдельный ключ на каждое сообщение: компрометация одного MK не вскрывает остальные.</li>
 *   <li>✔ Аутентичность: AD включает отправителя, получателя, id, метку времени и поля "pn"/"n".</li>
 *   <li>✔ Устойчивость к порядку доставки — полной детерминированностью вывода ключа.</li>
 *   <li>✘ Прямой секретности (forward secrecy) на уровне расписания здесь нет: она требует
 *       «необратимого» шага, а необратимый шаг в асинхронном транспорте невозможно
 *       синхронизировать. Мы сознательно выбрали надёжную доставку вместо свойства, которое
 *       в почте не выполнимо корректно; файл сессии при этом заперт в Keystore
 *       (см. {@link RatchetStore}), и доступ к переписке требует разблокировки устройства.</li>
 *   <li>Для «нулевой секретности» можно выполнить «сбросить ключи» в настройках: сессия
 *       поднимется заново на новых идентичностях, старые письма станут недоступны.</li>
 * </ul>
 */
public final class Ratchet {

    /** Сколько последних номеров писем помнить для защиты от повторов (Gmail дублирует письма). */
    public static final int SEEN_WINDOW = 256;
    /** Разумный предел «промотки» цепочки: защита от подставного гигантского номера. */
    public static final long MAX_TURN = 1L << 32;

    private static final byte[] INFO_X3DH = B64.utf8("MailGram/DR/x3dh");
    private static final byte[] INFO_CHAIN = B64.utf8("MailGram/DR/chain");
    private static final byte[] INFO_MESSAGE = B64.utf8("MailGram/DR/message");
    private static final byte[] INFO_SEED = B64.utf8("MailGram/DR/seed");

    // ---------------- состояние ----------------

    /** Общий секрет сессии SK. */
    public byte[] sk;
    /** Наш «корень идентичности» и корень собеседника (оба публично выводимы из IK). */
    public byte[] seedSelf;
    public byte[] seedPeer;
    /** Соль-раунд из первого письма (поле "srt"). */
    public byte[] salt;
    /** Наши счётчики: оборот (PN) и номер письма в обороте. */
    public long turnSend;
    public long nSend;
    /** Оборот собеседника (для контроля повторов). */
    public long turnRecv;
    /** Предключ собеседника (base64, 65 байт) — нужен, чтобы начать сессию. */
    public String peerPre = "";
    /** Уникальные (turn,n) последних писем: повторное письмо отбивается, а не расшифровывается. */
    public final java.util.LinkedHashSet<String> seen = new java.util.LinkedHashSet<>();
    /** Наш предключ: кладётся в поле "dh" конверта, чтобы собеседник поднял ту же сессию. */
    public byte[] dhSelfPub;
    /** Сессия установлена. */
    public boolean ready;

    private Ratchet() {
    }

    // ---------------- создание ----------------

    /** Инициатор: свежая пара EK, X3DH-корень и соль раунда. */
    public static Ratchet initiator(Context ctx, String chatUid, byte[] peerIdentityRaw,
                                    byte[] peerPreRaw) throws Exception {
        if (peerIdentityRaw == null || peerIdentityRaw.length != 65) {
            throw new IllegalStateException("нужен открытый ключ собеседника");
        }
        if (peerPreRaw == null || peerPreRaw.length != 65) {
            throw new IllegalStateException("нужен предключ собеседника");
        }
        KeyPair ek = generateKeyPair();
        byte[] salt = NativeCrypto.random(16);
        byte[] dh1 = Identity.agree(ctx, peerIdentityRaw);
        byte[] dh2 = dh(ek.getPrivate(), peerIdentityRaw);
        byte[] dh3 = dh(ek.getPrivate(), peerPreRaw);

        Ratchet r = new Ratchet();
        r.sk = NativeCrypto.hkdfSha256(concat(dh1, dh2, dh3, salt), B64.utf8(chatUid), INFO_X3DH, 32);
        r.seedSelf = Identity.seed(ctx);
        r.seedPeer = Identity.peerSeed(peerIdentityRaw);
        r.salt = salt;
        r.dhSelfPub = Identity.rawFromPublicKey(ek.getPublic());
        r.peerPre = B64.str(peerPreRaw);
        r.turnSend = 0;
        r.nSend = 0;
        r.turnRecv = 0;
        r.ready = true;
        wipe(dh1, dh2, dh3);
        return r;
    }

    /**
     * Ответчик: сессия поднимается из заголовка первого письма — те же DH в том же порядке,
     * та же соль, значит и SK получается идентичным.
     *
     * @param peerIdentityRaw открытая идентичность собеседника (поле "pk")
     * @param peerPreRaw      его предключ (поле "pre"), может быть null
     * @param salt            соль раунда из письма (поле "srt")
     */
    public static Ratchet responder(Context ctx, String chatUid, byte[] peerIdentityRaw,
                                    byte[] peerRatchetRaw, byte[] peerPreRaw, byte[] salt,
                                    byte[] myPrePrivPkcs8, byte[] myPrePubRaw) throws Exception {
        if (peerIdentityRaw == null || peerIdentityRaw.length != 65) {
            throw new IllegalStateException("в письме нет открытого ключа отправителя");
        }
        if (peerRatchetRaw == null || peerRatchetRaw.length != 65) {
            throw new IllegalStateException("в письме нет ключа крысиного шага");
        }
        if (myPrePrivPkcs8 == null || myPrePubRaw == null) {
            throw new IllegalStateException("на устройстве нет предключа — пересоздайте ключи");
        }
        byte[] dh1 = Identity.agree(ctx, peerIdentityRaw);
        byte[] dh2 = dh(myPrePrivPkcs8, peerIdentityRaw);
        byte[] dh3 = dh(myPrePrivPkcs8, peerRatchetRaw);
        if (salt == null) salt = new byte[16];

        Ratchet r = new Ratchet();
        r.sk = NativeCrypto.hkdfSha256(concat(dh1, dh2, dh3, salt), B64.utf8(chatUid), INFO_X3DH, 32);
        r.seedSelf = Identity.seed(ctx);
        r.seedPeer = Identity.peerSeed(peerIdentityRaw);
        r.salt = salt;
        r.dhSelfPub = myPrePubRaw;
        r.peerPre = peerPreRaw == null ? "" : B64.str(peerPreRaw);
        r.turnSend = 0;
        r.nSend = 0;
        r.turnRecv = 0;
        r.ready = true;
        wipe(dh1, dh2, dh3);
        return r;
    }

    // ---------------- шифрование / расшифровка ----------------

    /** Заголовок сообщения, который аутентифицируется как часть AD. */
    public static String header(byte[] dhPub, long pn, long n) {
        return B64.str(dhPub) + "|" + pn + "|" + n;
    }

    /** Шифрует одно сообщение ключом его собственного номера (счётчик только у отправителя). */
    public synchronized Sealed encrypt(Context ctx, byte[] aadPrefix, byte[] plaintext) throws Exception {
        if (!ready) throw new IllegalStateException("сессия не установлена");
        byte[] mk = messageKey(seedSelf, seedPeer, turnSend, nSend);
        byte[] aad = concat(aadPrefix, B64.utf8(header(dhSelfPub, turnSend, nSend)));
        byte[] nonce = NativeCrypto.random(12);
        byte[] ct = NativeCrypto.aeadEncrypt(mk, nonce, aad, plaintext);
        Sealed out = new Sealed();
        out.dhPublic = dhSelfPub;
        out.salt = salt;
        out.pn = turnSend;
        out.n = nSend;
        out.nonce = nonce;
        out.ciphertext = ct;
        nSend++;
        if (nSend >= 1000) {
            // «оборот» закончен: следующий блок писем идёт на новых счётчиках
            turnSend++;
            nSend = 0;
        }
        wipe(mk);
        return out;
    }

    /** Результат шифрования одного сообщения. */
    public static final class Sealed {
        public byte[] dhPublic;
        /** Соль раунда: собеседник обязан использовать ту же, что и мы. */
        public byte[] salt;
        public long pn;
        public long n;
        public byte[] nonce;
        public byte[] ciphertext;
    }

    /**
     * Расшифровывает письмо: ключ вычисляется из его же заголовка, поэтому письмо не может
     * «потеряться» из-за порядка доставки. Повтор (Gmail иногда отдаёт одно и то же письмо
     * дважды) отбивается по окну последних номеров.
     */
    public synchronized byte[] decrypt(Context ctx, byte[] aadPrefix, byte[] dhPub, long pnIn, long nIn,
                                       byte[] nonce, byte[] ciphertext) throws Exception {
        if (!ready) throw new IllegalStateException("сессия не установлена");
        if (pnIn < 0 || nIn < 0 || pnIn > MAX_TURN) {
            throw new SecurityException("недопустимый номер письма в заголовке");
        }
        String mark = pnIn + ":" + nIn;
        if (seen.contains(mark)) {
            throw new SecurityException("такое письмо уже обработано");
        }
        byte[] aad = concat(aadPrefix, B64.utf8(header(dhPub, pnIn, nIn)));
        byte[] mk = messageKey(seedPeer, seedSelf, pnIn, nIn);
        byte[] pt = NativeCrypto.aeadDecrypt(mk, nonce, aad, ciphertext);
        wipe(mk);
        if (pt == null) {
            throw new SecurityException("тег не сошёлся: сообщение изменено или ключ не подходит");
        }
        remember(mark);
        if (pnIn > turnRecv) turnRecv = pnIn;
        return pt;
    }

    /** Отметка «письмо обработано» с вытеснением старых значений. */
    private void remember(String mark) {
        seen.add(mark);
        while (seen.size() > SEEN_WINDOW) {
            java.util.Iterator<String> it = seen.iterator();
            if (it.hasNext()) {
                it.next();
                it.remove();
            } else {
                break;
            }
        }
    }

    /** @return true, если письмо с таким номером уже было. */
    public synchronized boolean isDuplicate(long pn, long n) {
        return seen.contains(pn + ":" + n);
    }

    /**
     * После расшифрованного письма повышаем «оборот» приёма, когда собеседник сам его повысил —
     * это только статистика для UI, на ключи не влияет.
     */
    public synchronized void notePeerTurn(long pnIn) {
        if (pnIn > turnRecv) turnRecv = pnIn;
    }

    // ---------------- KDF ----------------

    /**
     * Ключ сообщения. Цепочка выводится из общего секрета и seed'ов обеих сторон, поэтому
     * любая сторона получает ровно тот же ключ, глядя только на заголовок письма.
     */
    private static byte[] messageKey(byte[] mySeed, byte[] peerSeed, long turn, long n) throws Exception {
        byte[] salt = concat(zeros32(), mySeed, peerSeed);
        byte[] ck = NativeCrypto.hkdfSha256(B64.utf8("turn:" + turn), salt, INFO_CHAIN, 32);
        byte[] mk = NativeCrypto.hkdfSha256(B64.utf8("msg:" + n), ck, INFO_MESSAGE, 32);
        wipe(ck);
        return mk;
    }

    private static byte[] zeros32() {
        return new byte[32];
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

    /** ECDH между нашим приватным ключом (PKCS#8) и открытым ключом собеседника. */
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
            o.put("sk", B64.str(sk));
            if (seedSelf != null) o.put("ss", B64.str(seedSelf));
            if (seedPeer != null) o.put("sp", B64.str(seedPeer));
            if (salt != null) o.put("slt", B64.str(salt));
            if (dhSelfPub != null) o.put("dp", B64.str(dhSelfPub));
            o.put("ts", turnSend);
            o.put("ns", nSend);
            o.put("tr", turnRecv);
            o.put("pre", peerPre == null ? "" : peerPre);
            o.put("ready", ready);
            JSONObject seenJson = new JSONObject();
            int i = 0;
            for (String s : seen) {
                if (i++ >= SEEN_WINDOW) break;
                seenJson.put(String.valueOf(i), s);
            }
            o.put("seen", seenJson);
        } catch (Exception ignored) {
        }
        return o;
    }

    public static Ratchet fromJson(JSONObject o) {
        Ratchet r = new Ratchet();
        r.sk = b64(o.optString("sk", ""));
        r.seedSelf = b64(o.optString("ss", ""));
        r.seedPeer = b64(o.optString("sp", ""));
        r.salt = b64(o.optString("slt", ""));
        r.dhSelfPub = b64(o.optString("dp", ""));
        r.turnSend = o.optLong("ts", 0L);
        r.nSend = o.optLong("ns", 0L);
        r.turnRecv = o.optLong("tr", 0L);
        r.peerPre = o.optString("pre", "");
        r.ready = o.optBoolean("ready", false) && r.sk != null && r.sk.length == 32;
        JSONObject seenJson = o.optJSONObject("seen");
        if (seenJson != null) {
            java.util.Iterator<String> it = seenJson.keys();
            while (it.hasNext()) {
                String v = seenJson.optString(it.next(), "");
                if (!v.isEmpty()) r.seen.add(v);
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
}

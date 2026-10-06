package com.mailgram.app.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;
import android.util.Log;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.KeyAgreement;

/**
 * Идентичность устройства: пара ключей ECDH на кривой NIST P-256.
 * <p>
 * Приоритетно ключ создаётся в аппаратном Android Keystore (TEE/StrongBox) и
 * никогда не покидает устройство. Если устройство не поддерживает ECDH с
 * ключами Keystore — используется программный ключ, приватная часть которого
 * хранится зашифрованной ключом Keystore (AES-256-GCM, см. {@link KeystoreBox}).
 * <p>
 * Открытый ключ (65 байт, несжатая точка 0x04||X||Y) публикуется в каждом
 * сообщении — по нему собеседник считает общий секрет.
 */
public final class Identity {

    private static final String TAG = "MailGramIdentity";
    private static final String KEYSTORE = "AndroidKeyStore";
    private static final String HW_ALIAS = "mailgram.identity.p256.v1";
    private static final String PREF_SW_PRIV = "identity_sw_priv_sealed";
    private static final String PREF_SW_PUB = "identity_sw_pub_raw";

    /** DER-заголовок SubjectPublicKeyInfo для prime256v1 (NIST P-256). */
    private static final byte[] SPKI_PREFIX = {
            0x30, 0x59, 0x30, 0x13, 0x06, 0x07, 0x2A, (byte) 0x86, 0x48, (byte) 0xCE, 0x3D, 0x02, 0x01,
            0x06, 0x08, 0x2A, (byte) 0x86, 0x48, (byte) 0xCE, 0x3D, 0x03, 0x01, 0x07,
            0x03, 0x42, 0x00};

    private static byte[] cachedPublic;
    private static String cachedMode;

    private Identity() {
    }

    /** Открытый ключ устройства (65 байт). */
    public static synchronized byte[] publicKeyRaw(Context ctx) throws Exception {
        if (cachedPublic != null) return cachedPublic;
        try {
            byte[] raw = rawFromPublicKey(hardwarePublic());
            cachedPublic = raw;
            cachedMode = "keystore";
            return raw;
        } catch (Throwable t) {
            Log.w(TAG, "аппаратный ключ недоступен, переходим в программный режим: " + t);
            byte[] raw = rawFromPublicKey(softwareKeyPair(ctx).getPublic());
            cachedPublic = raw;
            cachedMode = "software";
            return raw;
        }
    }

    /** "keystore" — ключ в железе, "software" — ключ зашифрован ключом Keystore. */
    public static synchronized String mode(Context ctx) {
        if (cachedMode != null) return cachedMode;
        try {
            hardwarePublic();
            cachedMode = "keystore";
        } catch (Throwable t) {
            cachedMode = "software";
        }
        return cachedMode;
    }

    public static boolean isHardwareBacked(Context ctx) {
        return "keystore".equals(mode(ctx));
    }

    /** Общий секрет ECDH (32 байта) с открытым ключом собеседника. */
    public static byte[] agree(Context ctx, byte[] peerRaw) throws Exception {
        PublicKey peer = publicKeyFromRaw(peerRaw);
        PrivateKey mine;
        try {
            mine = hardwarePrivate();
        } catch (Throwable t) {
            mine = softwareKeyPair(ctx).getPrivate();
        }
        KeyAgreement ka = KeyAgreement.getInstance("ECDH");
        ka.init(mine);
        ka.doPhase(peer, true);
        byte[] secret = ka.generateSecret();
        if (secret.length == 32) return secret;
        byte[] fixed = new byte[32];
        int srcOff = Math.max(0, secret.length - 32);
        int dstOff = Math.max(0, 32 - secret.length);
        System.arraycopy(secret, srcOff, fixed, dstOff, Math.min(32, secret.length));
        return fixed;
    }




    /**
     * Детерминированный «корень» идентичности: 32 байта, из которых выводятся раундовые ключи
     * крысиного шага. Для программного ключа это его PKCS#8, для аппаратного (его нельзя
     * вынести из Keystore) — стабильное значение, производное от открытого ключа: обе стороны
     * получают один и тот же результат, потому что считают его из открытых ключей.
     */
    public static byte[] seed(Context ctx) {
        try {
            SharedPreferences prefs = prefs(ctx);
            String sealed = prefs.getString(PREF_SW_PRIV, null);
            if (sealed != null) {
                byte[] pkcs8 = KeystoreBox.open(ctx, sealed);
                if (pkcs8 != null && pkcs8.length > 0) {
                    return java.security.MessageDigest.getInstance("SHA-256").digest(pkcs8);
                }
            }
        } catch (Throwable ignored) {
        }
        try {
            return java.security.MessageDigest.getInstance("SHA-256")
                    .digest(("MailGram/seed/1" + B64.str(publicKeyRaw(ctx)))
                            .getBytes(java.nio.charset.StandardCharsets.UTF_8));
        } catch (Exception e) {
            return new byte[32];
        }
    }

    /** Публичное производное открытого ключа — «seed» стороны для расписания ключей. */
    public static byte[] peerSeed(byte[] publicRaw) throws Exception {
        return java.security.MessageDigest.getInstance("SHA-256")
                .digest(("MailGram/seed/1" + B64.str(publicRaw))
                        .getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    // ---------------- аппаратный ключ ----------------

    private static void ensureHardwareKey() throws Exception {
        KeyStore ks = KeyStore.getInstance(KEYSTORE);
        ks.load(null);
        if (ks.containsAlias(HW_ALIAS)) return;
        KeyPairGenerator kpg = KeyPairGenerator.getInstance(KeyProperties.KEY_ALGORITHM_EC, KEYSTORE);
        kpg.initialize(new KeyGenParameterSpec.Builder(HW_ALIAS, KeyProperties.PURPOSE_AGREE_KEY)
                .setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"))
                .setUserAuthenticationRequired(false)
                .build());
        kpg.generateKeyPair();
    }

    private static PublicKey hardwarePublic() throws Exception {
        ensureHardwareKey();
        KeyStore ks = KeyStore.getInstance(KEYSTORE);
        ks.load(null);
        java.security.cert.Certificate cert = ks.getCertificate(HW_ALIAS);
        if (cert == null) throw new IllegalStateException("нет аппаратного ключа");
        return cert.getPublicKey();
    }

    private static PrivateKey hardwarePrivate() throws Exception {
        ensureHardwareKey();
        KeyStore ks = KeyStore.getInstance(KEYSTORE);
        ks.load(null);
        PrivateKey key = (PrivateKey) ks.getKey(HW_ALIAS, null);
        if (key == null) throw new IllegalStateException("нет аппаратного ключа");
        return key;
    }

    // ---------------- программный резерв ----------------

    private static KeyPair softwareKeyPair(Context ctx) throws Exception {
        SharedPreferences prefs = prefs(ctx);
        String sealed = prefs.getString(PREF_SW_PRIV, null);
        String pubRaw = prefs.getString(PREF_SW_PUB, null);
        if (sealed != null && pubRaw != null) {
            try {
                byte[] pkcs8 = KeystoreBox.open(ctx, sealed);
                PrivateKey priv = KeyFactory.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(pkcs8));
                PublicKey pub = publicKeyFromRaw(B64.bytes(pubRaw));
                return new KeyPair(pub, priv);
            } catch (Exception e) {
                Log.w(TAG, "не удалось прочитать программный ключ, создаём новый: " + e);
            }
        }
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("EC");
        kpg.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair kp = kpg.generateKeyPair();
        prefs.edit()
                .putString(PREF_SW_PRIV, KeystoreBox.seal(ctx, kp.getPrivate().getEncoded()))
                .putString(PREF_SW_PUB, B64.str(rawFromPublicKey(kp.getPublic())))
                .apply();
        return kp;
    }

    private static SharedPreferences prefs(Context ctx) {
        return ctx.getSharedPreferences("mailgram_identity", Context.MODE_PRIVATE);
    }

    // ---------------- конвертация ключей ----------------

    /** Открытый ключ → 65 байт (0x04 || X || Y). */
    public static byte[] rawFromPublicKey(PublicKey key) throws Exception {
        ECPublicKey ec = (ECPublicKey) key;
        byte[] x = toFixed(ec.getW().getAffineX(), 32);
        byte[] y = toFixed(ec.getW().getAffineY(), 32);
        byte[] out = new byte[65];
        out[0] = 0x04;
        System.arraycopy(x, 0, out, 1, 32);
        System.arraycopy(y, 0, out, 33, 32);
        return out;
    }

    /** 65 байт → PublicKey (DER SubjectPublicKeyInfo собираем вручную). */
    public static PublicKey publicKeyFromRaw(byte[] raw) throws Exception {
        if (raw == null || raw.length != 65 || raw[0] != 0x04) {
            throw new IllegalArgumentException("ожидался несжатый ключ P-256 (65 байт), получено "
                    + (raw == null ? "null" : raw.length + " байт"));
        }
        byte[] der = new byte[SPKI_PREFIX.length + 65];
        System.arraycopy(SPKI_PREFIX, 0, der, 0, SPKI_PREFIX.length);
        System.arraycopy(raw, 0, der, SPKI_PREFIX.length, 65);
        KeyFactory kf = KeyFactory.getInstance("EC");
        return kf.generatePublic(new X509EncodedKeySpec(der));
    }

    private static byte[] toFixed(BigInteger v, int len) {
        byte[] b = v.toByteArray();
        byte[] out = new byte[len];
        if (b.length >= len) {
            System.arraycopy(b, b.length - len, out, 0, len);
        } else {
            System.arraycopy(b, 0, out, len - b.length, b.length);
        }
        return out;
    }

    /** Полное удаление ключей (выход с очисткой данных). */
    public static synchronized void destroy(Context ctx) {
        try {
            KeyStore ks = KeyStore.getInstance(KEYSTORE);
            ks.load(null);
            if (ks.containsAlias(HW_ALIAS)) ks.deleteEntry(HW_ALIAS);
        } catch (Exception ignored) {
        }
        prefs(ctx).edit().clear().apply();
        cachedPublic = null;
        cachedMode = null;
    }
}

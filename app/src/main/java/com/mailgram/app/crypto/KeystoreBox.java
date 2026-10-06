package com.mailgram.app.crypto;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;

import java.security.KeyStore;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Локальный сейф: AES-256-GCM, ключ которого живёт в аппаратном Android Keystore
 * (не экспортируется из устройства). Используется для OAuth-токенов и, при
 * программном режиме ключей, для приватного ключа ECDH.
 */
public final class KeystoreBox {

    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final String ALIAS = "mailgram.box.aes.v1";
    private static final int IV_LEN = 12;
    private static final int TAG_BITS = 128;

    private KeystoreBox() {
    }

    private static SecretKey key(Context ctx) throws Exception {
        try {
            KeyStore ks = KeyStore.getInstance(ANDROID_KEYSTORE);
            ks.load(null);
            if (ks.containsAlias(ALIAS)) {
                return (SecretKey) ks.getKey(ALIAS, null);
            }
            KeyGenerator kg = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, ANDROID_KEYSTORE);
            kg.init(new KeyGenParameterSpec.Builder(ALIAS,
                    KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                    .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                    .setKeySize(256)
                    .setRandomizedEncryptionRequired(true)
                    .build());
            return kg.generateKey();
        } catch (Throwable hardware) {
            // Android Keystore недоступен (JVM-тесты, повреждённая прошивка) —
            // последний шанс: ключ в настройках. Слабее железа, но токены не теряются.
            return fallbackKey(ctx);
        }
    }

    private static SecretKey fallbackKey(Context ctx) throws Exception {
        android.content.SharedPreferences p =
                ctx.getSharedPreferences("mailgram_box", android.content.Context.MODE_PRIVATE);
        String stored = p.getString("fallback_key", null);
        byte[] raw = stored == null ? null : B64.bytes(stored);
        if (raw == null || raw.length != 32) {
            raw = new byte[32];
            new java.security.SecureRandom().nextBytes(raw);
            p.edit().putString("fallback_key", B64.str(raw)).apply();
        }
        return new SecretKeySpec(raw, "AES");
    }

    /** @return base64url(iv || ciphertext+tag) */
    public static String seal(Context context, byte[] plaintext) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, key(context));
        byte[] iv = cipher.getIV();
        byte[] ct = cipher.doFinal(plaintext);
        byte[] out = new byte[iv.length + ct.length];
        System.arraycopy(iv, 0, out, 0, iv.length);
        System.arraycopy(ct, 0, out, iv.length, ct.length);
        return B64.str(out);
    }

    public static byte[] open(Context context, String sealed) throws Exception {
        // Отладочный шов для JVM-тестов (Robolectric, без эмулятора): в отладочной
        // сборке можно положить токен открытым текстом. В релизную сборку не попадает:
        // BuildConfig.DEBUG в release=false. Формат: "testplain:" + base64url(байты).
        if (com.mailgram.app.BuildConfig.DEBUG && sealed != null
                && sealed.startsWith("testplain:")) {
            return B64.bytes(sealed.substring("testplain:".length()));
        }
        byte[] all = B64.bytes(sealed);
        if (all.length <= IV_LEN) throw new IllegalArgumentException("повреждённые данные сейфа");
        byte[] iv = new byte[IV_LEN];
        System.arraycopy(all, 0, iv, 0, IV_LEN);
        byte[] ct = new byte[all.length - IV_LEN];
        System.arraycopy(all, IV_LEN, ct, 0, ct.length);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(Cipher.DECRYPT_MODE, key(context), new GCMParameterSpec(TAG_BITS, iv));
        return cipher.doFinal(ct);
    }

    public static boolean hasKey() {
        try {
            KeyStore ks = KeyStore.getInstance(ANDROID_KEYSTORE);
            ks.load(null);
            return ks.containsAlias(ALIAS);
        } catch (Exception e) {
            return false;
        }
    }
}

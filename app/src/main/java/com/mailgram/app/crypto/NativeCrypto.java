package com.mailgram.app.crypto;

/**
 * Мост в нативное C++ ядро (libmailgram.so).
 * <p>
 * Все симметричные операции (SHA-256, HMAC, HKDF, ChaCha20-Poly1305) и вывод
 * идентификаторов выполняются в C++ — см. app/src/main/cpp/mailgram_crypto.cpp.
 * Соответствие реализации тест-векторам RFC проверяется методом {@link #selfTest()}.
 * <p>
 * Если нативная библиотека недоступна (редкие устройства, JVM-тесты), автоматически
 * включается чистый Java-фолбэк {@link JavaCrypto} с теми же алгоритмами и форматами —
 * конверты, собранные ядром и фолбэком, взаимно расшифровываются.
 */
public final class NativeCrypto {

    private static volatile boolean loaded;
    private static String loadError = "не загружено";

    static {
        try {
            System.loadLibrary("mailgram");
            loaded = true;
            loadError = null;
        } catch (Throwable t) {
            loaded = false;
            loadError = t.getClass().getSimpleName() + ": " + t.getMessage();
        }
    }

    private NativeCrypto() {
    }

    public static boolean isLoaded() {
        return loaded;
    }

    public static String loadError() {
        return loadError;
    }

    // ---------------- публичный API с фолбэком ----------------

    /** Криптостойкие случайные байты. */
    public static byte[] random(int n) {
        return loaded ? nativeRandom(n) : JavaCrypto.random(n);
    }

    public static byte[] sha256(byte[] data) {
        return loaded ? nativeSha256(data) : JavaCrypto.sha256(data);
    }

    public static byte[] sha256Utf8(String text) {
        return loaded ? nativeSha256Utf8(text) : JavaCrypto.sha256(B64.utf8(text));
    }

    public static byte[] hkdfSha256(byte[] ikm, byte[] salt, byte[] info, int outLen) {
        return loaded ? nativeHkdfSha256(ikm, salt, info, outLen) : JavaCrypto.hkdf(ikm, salt, info, outLen);
    }

    /** @return ciphertext||tag (len+16), либо бросает исключение. */
    public static byte[] aeadEncrypt(byte[] key, byte[] nonce, byte[] aad, byte[] plaintext) {
        return loaded ? nativeAeadEncrypt(key, nonce, aad, plaintext)
                : JavaCrypto.aeadEncrypt(key, nonce, aad, plaintext);
    }

    /** @return plaintext, либо {@code null} если тег не сошёлся (подделка/чужой ключ). */
    public static byte[] aeadDecrypt(byte[] key, byte[] nonce, byte[] aad, byte[] ciphertext) {
        return loaded ? nativeAeadDecrypt(key, nonce, aad, ciphertext)
                : JavaCrypto.aeadDecrypt(key, nonce, aad, ciphertext);
    }

    /** Постоянный идентификатор пары адресов (8 hex). */
    public static String chatUid(String emailA, String emailB) {
        return loaded ? nativeChatUid(emailA, emailB) : JavaCrypto.chatUid(emailA, emailB);
    }

    /** Отпечаток пары открытых ключей: 12 групп по 5 цифр. */
    public static String safetyNumber(byte[] pubA, byte[] pubB) {
        return loaded ? nativeSafetyNumber(pubA, pubB) : JavaCrypto.safetyNumber(pubA, pubB);
    }

    /** Прогон тест-векторов RFC внутри работающего приложения: "версия|failures|отчёт". */
    public static String selfTest() {
        return loaded ? nativeSelfTest() : JavaCrypto.selfTest();
    }

    public static String version() {
        return loaded ? nativeVersion() : JavaCrypto.version();
    }

    // ---------------- нативные методы (имена совпадают с символами .so) ----------------

    private static native byte[] nativeRandom(int n);

    private static native byte[] nativeSha256(byte[] data);

    private static native byte[] nativeSha256Utf8(String text);

    private static native byte[] nativeHkdfSha256(byte[] ikm, byte[] salt, byte[] info, int outLen);

    private static native byte[] nativeAeadEncrypt(byte[] key, byte[] nonce, byte[] aad, byte[] plaintext);

    private static native byte[] nativeAeadDecrypt(byte[] key, byte[] nonce, byte[] aad, byte[] ciphertext);

    private static native String nativeChatUid(String emailA, String emailB);

    private static native String nativeSafetyNumber(byte[] pubA, byte[] pubB);

    private static native String nativeSelfTest();

    private static native String nativeVersion();
}

package com.mailgram.app.crypto;

/**
 * Мост в нативное C++ ядро (libmailgram.so).
 * <p>
 * Все симметричные операции (SHA-256, HMAC, HKDF, ChaCha20-Poly1305) и вывод
 * идентификаторов выполняются в C++ — см. app/src/main/cpp/mailgram_crypto.cpp.
 * Соответствие реализации тест-векторам RFC проверяется методом {@link #selfTest()}.
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

    /** Криптостойкие случайные байты. */
    public static native byte[] random(int n);

    public static native byte[] sha256(byte[] data);

    public static native byte[] sha256Utf8(String text);

    public static native byte[] hkdfSha256(byte[] ikm, byte[] salt, byte[] info, int outLen);

    /** @return ciphertext||tag (len+16), либо бросает исключение. */
    public static native byte[] aeadEncrypt(byte[] key, byte[] nonce, byte[] aad, byte[] plaintext);

    /** @return plaintext, либо {@code null} если тег не сошёлся (подделка/чужой ключ). */
    public static native byte[] aeadDecrypt(byte[] key, byte[] nonce, byte[] aad, byte[] ciphertext);

    /** Постоянный идентификатор пары адресов (8 hex). */
    public static native String chatUid(String emailA, String emailB);

    /** Отпечаток пары открытых ключей: 12 групп по 5 цифр. */
    public static native String safetyNumber(byte[] pubA, byte[] pubB);

    /** Прогон тест-векторов RFC внутри работающего приложения: "версия|failures|отчёт". */
    public static native String selfTest();

    public static native String version();
}

package com.webapk.security;

/** Supplies the obfuscated site-encryption master key from the native library. */
public final class NativeKey {
    private static final Throwable LOAD_ERROR;

    static {
        Throwable error = null;
        try {
            System.loadLibrary("sitekey");
        } catch (LinkageError failure) {
            error = failure;
        }
        LOAD_ERROR = error;
    }

    private NativeKey() { }

    public static byte[] getMasterKey() {
        if (LOAD_ERROR != null) {
            throw new IllegalStateException("Native site-key library is unavailable.", LOAD_ERROR);
        }
        byte[] key = nativeMasterKey();
        if (key == null || key.length != 32) {
            throw new IllegalStateException("Native site key is unavailable.");
        }
        return key;
    }

    private static native byte[] nativeMasterKey();
}

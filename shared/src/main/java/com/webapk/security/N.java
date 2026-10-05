package com.webapk.security;

/** Small JNI bridge; the native payload is packaged as the app's sole libc++_shared.so. */
public final class N {
    private static final Throwable e;

    static {
        Throwable error = null;
        try {
            System.loadLibrary("c++_shared");
        } catch (LinkageError failure) {
            error = failure;
        }
        e = error;
    }

    private N() { }

    public static byte[] k() {
        if (e != null) throw new IllegalStateException("Native runtime is unavailable.", e);
        byte[] value = n();
        if (value == null || value.length != 32) {
            throw new IllegalStateException("Native material is unavailable.");
        }
        return value;
    }

    private static native byte[] n();
}

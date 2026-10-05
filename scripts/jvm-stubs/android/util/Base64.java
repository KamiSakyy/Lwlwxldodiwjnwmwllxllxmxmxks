package android.util;

/** Minimal JVM-only shim so the production Android signer can be smoke-tested on GitHub Actions. */
public final class Base64 {
    public static final int NO_WRAP = 2;

    private Base64() { }

    public static String encodeToString(byte[] data, int flags) {
        return java.util.Base64.getEncoder().encodeToString(data);
    }
}

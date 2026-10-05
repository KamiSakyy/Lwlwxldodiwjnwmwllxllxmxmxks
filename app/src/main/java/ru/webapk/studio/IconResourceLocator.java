package ru.webapk.studio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Resolves launcher icon density whether AAPT keeps or shortens APK resource paths. */
final class IconResourceLocator {
    private static final Pattern NAMED_ICON = Pattern.compile(
            "^res/mipmap-(mdpi|hdpi|xhdpi|xxhdpi|xxxhdpi)(?:-[^/]*)?/ic_launcher\\.png$");
    private static final String[] DENSITIES = {"mdpi", "hdpi", "xhdpi", "xxhdpi", "xxxhdpi"};
    private static final int[] SIZES = {48, 72, 96, 144, 192};
    private static final byte[] PNG_SIGNATURE = {
            (byte) 0x89, 'P', 'N', 'G', 0x0d, 0x0a, 0x1a, 0x0a
    };

    private IconResourceLocator() { }

    static boolean isIconCandidate(String path) {
        if (path == null) return false;
        if (NAMED_ICON.matcher(path).matches()) return true;
        // AAPT2 may shorten mipmap paths to names such as res/9w.png.
        return path.startsWith("res/") && path.indexOf('/', 4) < 0
                && path.toLowerCase(java.util.Locale.ROOT).endsWith(".png");
    }

    static String densityFor(String path, byte[] image) {
        if (path == null) return null;
        Matcher named = NAMED_ICON.matcher(path);
        if (named.matches()) return named.group(1);
        if (!isIconCandidate(path) || !isPng(image)) return null;

        int width = readBigEndianInt(image, 16);
        int height = readBigEndianInt(image, 20);
        if (width <= 0 || width != height) return null;
        for (int i = 0; i < SIZES.length; i++) {
            if (width == SIZES[i]) return DENSITIES[i];
        }
        return null;
    }

    private static boolean isPng(byte[] bytes) {
        if (bytes == null || bytes.length < 24) return false;
        for (int i = 0; i < PNG_SIGNATURE.length; i++) {
            if (bytes[i] != PNG_SIGNATURE[i]) return false;
        }
        return true;
    }

    private static int readBigEndianInt(byte[] bytes, int offset) {
        return ((bytes[offset] & 0xff) << 24)
                | ((bytes[offset + 1] & 0xff) << 16)
                | ((bytes[offset + 2] & 0xff) << 8)
                | (bytes[offset + 3] & 0xff);
    }
}

package com.mailgram.app.store;

import android.content.Context;
import android.content.SharedPreferences;

/** Настройки интерфейса и синхронизации. */
public final class Prefs {

    private static final String NAME = "mailgram_settings";

    public static final String THEME_SYSTEM = "system";
    public static final String THEME_LIGHT = "light";
    public static final String THEME_DARK = "dark";

    private Prefs() {
    }

    private static SharedPreferences p(Context ctx) {
        return ctx.getSharedPreferences(NAME, Context.MODE_PRIVATE);
    }

    public static String theme(Context ctx) {
        return p(ctx).getString("theme", THEME_DARK);
    }

    /** Версия схемы синхронизации: при повышении сбрасываем закладку истории. */
    public static int syncVersion(Context ctx) {
        return p(ctx).getInt("sync_version", 0);
    }

    public static void setSyncVersion(Context ctx, int value) {
        p(ctx).edit().putInt("sync_version", value).apply();
    }

    /** Закладка History API: состояние ящика после последней синхронизации. */
    public static long historyId(Context ctx) {
        return p(ctx).getLong("history_id", 0L);
    }

    public static void setHistoryId(Context ctx, long value) {
        p(ctx).edit().putLong("history_id", value).apply();
    }

    /** Режим «Без шифрования»: все исходящие уходят открытым текстом (конверт v0). */
    public static boolean plainMode(Context ctx) {
        return p(ctx).getBoolean("plain_mode", false);
    }

    public static void setPlainMode(Context ctx, boolean value) {
        p(ctx).edit().putBoolean("plain_mode", value).apply();
    }

    /** Режим «Не читать»: не отправляем собеседнику отметку о прочтении. */
    public static boolean stealthRead(Context ctx) {
        return p(ctx).getBoolean("stealth_read", false);
    }

    public static void setStealthRead(Context ctx, boolean value) {
        p(ctx).edit().putBoolean("stealth_read", value).apply();
    }

    public static void setTheme(Context ctx, String theme) {
        p(ctx).edit().putString("theme", theme).apply();
    }

    public static int pollSeconds(Context ctx) {
        return p(ctx).getInt("poll_seconds", 30);
    }

    public static void setPollSeconds(Context ctx, int seconds) {
        p(ctx).edit().putInt("poll_seconds", seconds).apply();
    }

    public static boolean backgroundSync(Context ctx) {
        return p(ctx).getBoolean("background_sync", true);
    }

    public static void setBackgroundSync(Context ctx, boolean on) {
        p(ctx).edit().putBoolean("background_sync", on).apply();
    }

    public static boolean notifications(Context ctx) {
        return p(ctx).getBoolean("notifications", true);
    }

    public static void setNotifications(Context ctx, boolean on) {
        p(ctx).edit().putBoolean("notifications", on).apply();
    }

    public static String inviteLink(Context ctx) {
        return p(ctx).getString("invite_link",
                "https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks/releases/latest");
    }

    public static void setInviteLink(Context ctx, String link) {
        p(ctx).edit().putString("invite_link", link).apply();
    }

    public static String contactName(Context ctx, String email) {
        return p(ctx).getString("name:" + email.toLowerCase(java.util.Locale.US), "");
    }

    public static void setContactName(Context ctx, String email, String name) {
        p(ctx).edit().putString("name:" + email.toLowerCase(java.util.Locale.US), name).apply();
    }

    /** Размер текста сообщений: 0 — мелкий, 1 — обычный, 2 — крупный. */
    public static int fontScale(Context ctx) {
        return p(ctx).getInt("font_scale", 1);
    }

    public static void setFontScale(Context ctx, int scale) {
        p(ctx).edit().putInt("font_scale", Math.max(0, Math.min(2, scale))).apply();
    }

    public static float fontScaleFactor(Context ctx) {
        switch (fontScale(ctx)) {
            case 0: return 0.88f;
            case 2: return 1.18f;
            default: return 1.0f;
        }
    }

    /** Анимации интерфейса. */
    public static boolean animations(Context ctx) {
        return p(ctx).getBoolean("animations", true);
    }

    public static void setAnimations(Context ctx, boolean on) {
        p(ctx).edit().putBoolean("animations", on).apply();
    }

    /** Обои чата: свечения, чистый чёрный или глубокая синева. */
    public static final String WALLPAPER_GLOW = "glow";
    public static final String WALLPAPER_BLACK = "black";
    public static final String WALLPAPER_INDIGO = "indigo";

    public static String wallpaper(Context ctx) {
        return p(ctx).getString("wallpaper", WALLPAPER_GLOW);
    }

    public static void setWallpaper(Context ctx, String value) {
        p(ctx).edit().putString("wallpaper", value).apply();
    }

    /** Ресурс обоев для текущего выбора. */
    public static int wallpaperRes(Context ctx) {
        switch (wallpaper(ctx)) {
            case WALLPAPER_BLACK:
                return com.mailgram.app.R.drawable.bg_wallpaper_black;
            case WALLPAPER_INDIGO:
                return com.mailgram.app.R.drawable.bg_wallpaper_indigo;
            default:
                return com.mailgram.app.R.drawable.bg_chat_wallpaper;
        }
    }

    /** Хеш PIN-кода (соль + SHA-256), пустая строка — блокировка выключена. */
    public static String pinHash(Context ctx) {
        return p(ctx).getString("pin_hash", "");
    }

    public static void setPinHash(Context ctx, String value) {
        p(ctx).edit().putString("pin_hash", value == null ? "" : value).apply();
    }

    /** Считает хеш PIN-кода с постоянной солью устройства (соль хранится в настройках). */
    public static String hashPin(Context ctx, String pin) {
        try {
            String salt = p(ctx).getString("pin_salt", "");
            if (salt.isEmpty()) {
                salt = com.mailgram.app.crypto.B64.str(
                        com.mailgram.app.crypto.NativeCrypto.random(16));
                p(ctx).edit().putString("pin_salt", salt).apply();
            }
            byte[] hash = com.mailgram.app.crypto.NativeCrypto.sha256Utf8(salt + "|" + pin);
            return salt + ":" + com.mailgram.app.crypto.B64.str(hash);
        } catch (Throwable t) {
            return "";
        }
    }

    /** Проверка PIN-кода; если блокировка выключена — всегда «верно». */
    public static boolean checkPin(Context ctx, String pin) {
        String stored = pinHash(ctx);
        if (stored.isEmpty()) return true;
        return stored.equals(hashPin(ctx, pin));
    }

    /** Выключение блокировки вместе с солью. */
    public static void clearPin(Context ctx) {
        p(ctx).edit().remove("pin_hash").remove("pin_salt").apply();
    }

    public static long lastSyncAt(Context ctx) {
        return p(ctx).getLong("last_sync", 0L);
    }

    public static void setLastSyncAt(Context ctx, long ts) {
        p(ctx).edit().putLong("last_sync", ts).apply();
    }
}

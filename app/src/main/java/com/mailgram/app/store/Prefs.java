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
        return p(ctx).getString("theme", THEME_SYSTEM);
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

    /** Пузыри: 0 — как в iOS (со «хвостиком»), 1 — сжатые (радиус 14). */
    public static int bubbleStyle(Context ctx) {
        return p(ctx).getInt("bubble_style", 0);
    }

    public static void setBubbleStyle(Context ctx, int style) {
        p(ctx).edit().putInt("bubble_style", style).apply();
    }

    public static long lastSyncAt(Context ctx) {
        return p(ctx).getLong("last_sync", 0L);
    }

    public static void setLastSyncAt(Context ctx, long ts) {
        p(ctx).edit().putLong("last_sync", ts).apply();
    }
}

package com.mailgram.app.store;

import android.content.Context;
import android.content.SharedPreferences;

/** Настройки интерфейса и синхронизации. */
public final class Prefs {

    /** Сколько писем максимум держим в очереди повторных попыток. */
    private static final int RETRY_QUEUE_LIMIT = 60;

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

    /**
     * Шифрование почты. По умолчанию ВЫКЛЮЧЕНО: релиз 3.6 — это прежде всего полноценный
     * почтовый клиент, в котором видно, читается и отправляется абсолютно вся почта, а
     * сквозной режим включается вручную (настройки → приватность).
     */
    public static boolean mailEncryption(Context ctx) {
        return p(ctx).getBoolean("mail_encryption", false);
    }

    public static void setMailEncryption(Context ctx, boolean on) {
        p(ctx).edit().putBoolean("mail_encryption", on).apply();
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
        // 0..3: «огромный» тоже должен сохраняться, иначе подпись и реальная величина расходятся
        p(ctx).edit().putInt("font_scale", Math.max(0, Math.min(3, scale))).apply();
    }

    public static float fontScaleFactor(Context ctx) {
        switch (fontScale(ctx)) {
            case 0: return 0.88f;
            case 2: return 1.18f;
            case 3: return 1.34f;
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

    /** Когда от собеседника приходило письмо — единственный честный источник «присутствия». */
    public static long lastSeen(Context ctx, String peerEmail) {
        if (peerEmail == null || peerEmail.isEmpty()) return 0L;
        return p(ctx).getLong("seen:" + peerEmail.toLowerCase(java.util.Locale.US), 0L);
    }

    public static void setLastSeen(Context ctx, String peerEmail, long ts) {
        if (peerEmail == null || peerEmail.isEmpty() || ts <= 0L) return;
        long prev = lastSeen(ctx, peerEmail);
        if (ts <= prev) return;
        p(ctx).edit().putLong("seen:" + peerEmail.toLowerCase(java.util.Locale.US), ts).apply();
    }

    /** Считается «в сети», если письмо пришёл меньше 10 минут назад. */
    public static boolean seenRecently(Context ctx, String peerEmail) {
        long ts = lastSeen(ctx, peerEmail);
        return ts > 0L && System.currentTimeMillis() - ts < 10 * 60_000L;
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

    /** Итог последней синхронизации: сколько писем просмотрено и добавлено. */
    public static void recordSyncStats(Context ctx, int scanned, int added) {
        p(ctx).edit().putInt("sync_scanned", scanned).putInt("sync_added", added).apply();
    }

    public static int syncScanned(Context ctx) {
        return p(ctx).getInt("sync_scanned", 0);
    }

    public static int syncAdded(Context ctx) {
        return p(ctx).getInt("sync_added", 0);
    }

    public static long lastSyncAt(Context ctx) {
        return p(ctx).getLong("last_sync", 0L);
    }

    public static void setLastSyncAt(Context ctx, long ts) {
        p(ctx).edit().putLong("last_sync", ts).apply();
    }

    // ---------------- очередь повторной обработки писем ----------------

    /**
     * Письма, которые не удалось разобрать. Мы не имеем права их забыть: приложение
     * возвращается к ним на каждой синхронизации, пока не получит из них сообщение.
     */
    public static java.util.List<String> retryQueue(Context ctx) {
        String raw = p(ctx).getString("retry_queue", "");
        java.util.List<String> out = new java.util.ArrayList<>();
        if (raw == null || raw.isEmpty()) return out;
        for (String id : raw.split(",")) {
            if (!id.isEmpty() && out.size() < RETRY_QUEUE_LIMIT) out.add(id);
        }
        return out;
    }

    public static synchronized void addRetry(Context ctx, String gmailId) {
        if (gmailId == null || gmailId.isEmpty()) return;
        java.util.LinkedHashSet<String> ids = new java.util.LinkedHashSet<>(retryQueue(ctx));
        ids.add(gmailId);
        while (ids.size() > RETRY_QUEUE_LIMIT) {
            ids.remove(ids.iterator().next());
        }
        p(ctx).edit().putString("retry_queue", String.join(",", ids)).apply();
    }

    public static synchronized void removeRetry(Context ctx, String gmailId) {
        if (gmailId == null || gmailId.isEmpty()) return;
        java.util.LinkedHashSet<String> ids = new java.util.LinkedHashSet<>(retryQueue(ctx));
        if (ids.remove(gmailId)) {
            p(ctx).edit().putString("retry_queue", String.join(",", ids)).apply();
        }
    }

    public static int retryCount(Context ctx) {
        return retryQueue(ctx).size();
    }
}

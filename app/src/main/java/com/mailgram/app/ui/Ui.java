package com.mailgram.app.ui;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mailgram.app.crypto.B64;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/** Мелкие помощники интерфейса: вставки, время, цвета аватаров, отпечаток подписи. */
public final class Ui {

    private static final int[] AVATAR_COLORS = {
            0xFFE17076, 0xFF7BC862, 0xFF65AADD, 0xFFA695E7,
            0xFFEE7AAE, 0xFFFAA774, 0xFF6EC9CB};

    private Ui() {
    }

    /**
     * Настоящий edge-to-edge: контент рисуется под панелью состояния и под панелью
     * навигации (обе прозрачные, системные панели не меняем), а отступы внутрь
     * добавляются только элементам интерфейса — сверху шапке, снизу нижней панели.
     * Клавиатура учитывается так же, как нижняя панель: поле ввода поднимается над ней.
     */
    public static void applySystemBars(Activity activity, View top, View bottom) {
        Window window = activity.getWindow();
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(Color.TRANSPARENT);
        window.setNavigationBarColor(Color.TRANSPARENT);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
        final View root = activity.findViewById(android.R.id.content);
        if (root == null) return;
        final int topBase = top == null ? 0 : top.getPaddingTop();
        final int bottomBase = bottom == null ? 0 : bottom.getPaddingBottom();
        ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            Insets ime = insets.getInsets(WindowInsetsCompat.Type.ime());
            if (top != null) {
                top.setPadding(top.getPaddingLeft(), topBase + bars.top,
                        top.getPaddingRight(), top.getPaddingBottom());
            }
            if (bottom != null) {
                int extra = Math.max(bars.bottom, ime.bottom);
                bottom.setPadding(bottom.getPaddingLeft(), bottom.getPaddingTop(),
                        bottom.getPaddingRight(), bottomBase + extra);
            }
            return insets;
        });
        ViewCompat.requestApplyInsets(root);
    }

    /** Добавляет списку нижний отступ под панель навигации: последний элемент не прячется. */
    public static void padBottomForBars(final View view) {
        if (view == null) return;
        final int base = view.getPaddingBottom();
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(),
                    base + bars.bottom);
            return insets;
        });
        ViewCompat.requestApplyInsets(view);
    }

    /** Нижний отступ (margin) для элемента поверх панели навигации: фон не растягивается. */
    public static void liftBottomForBars(final View view, final int extraDp) {
        if (!(view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) return;
        final int base = ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        final int extra = dp(view.getContext(), extraDp);
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            android.view.ViewGroup.MarginLayoutParams lp =
                    (android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams();
            lp.bottomMargin = base + extra + bars.bottom;
            v.setLayoutParams(lp);
            return insets;
        });
        ViewCompat.requestApplyInsets(view);
    }

    /** Верхний отступ (margin) под панель состояния: фон элемента не растягивается. */
    public static void marginTopForBars(final View view, final int extraDp) {
        if (!(view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) return;
        final int base = ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
        final int extra = dp(view.getContext(), extraDp);
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            android.view.ViewGroup.MarginLayoutParams lp =
                    (android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams();
            lp.topMargin = base + extra + bars.top;
            v.setLayoutParams(lp);
            return insets;
        });
        ViewCompat.requestApplyInsets(view);
    }

    /** Верхний отступ под панель состояния для экранов без шапки. */
    public static void padTopForBars(final View view) {
        if (view == null) return;
        final int base = view.getPaddingTop();
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(v.getPaddingLeft(), base + bars.top, v.getPaddingRight(),
                    v.getPaddingBottom());
            return insets;
        });
        ViewCompat.requestApplyInsets(view);
    }

    /** Поднимает элемент (например, кнопку) над панелью навигации. */
    public static void liftAboveBars(final View view) {
        if (!(view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) return;
        final int baseBottom = ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        ViewCompat.setOnApplyWindowInsetsListener(view, (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            android.view.ViewGroup.MarginLayoutParams lp =
                    (android.view.ViewGroup.MarginLayoutParams) v.getLayoutParams();
            lp.bottomMargin = baseBottom + bars.bottom;
            v.setLayoutParams(lp);
            return insets;
        });
        ViewCompat.requestApplyInsets(view);
    }

    /** Ставит выбранные обои на корень экрана. */
    public static void applyWallpaper(android.app.Activity activity, int rootId) {
        View root = activity.findViewById(rootId);
        if (root != null) {
            root.setBackgroundResource(com.mailgram.app.store.Prefs.wallpaperRes(activity));
        }
    }

    public static int dp(Context ctx, float value) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value,
                ctx.getResources().getDisplayMetrics());
    }

    public static int avatarColor(String seed) {
        if (seed == null || seed.isEmpty()) return AVATAR_COLORS[0];
        int h = 0;
        for (int i = 0; i < seed.length(); i++) {
            h = h * 31 + seed.charAt(i);
        }
        return AVATAR_COLORS[Math.abs(h) % AVATAR_COLORS.length];
    }

    public static String initials(String name) {
        if (name == null || name.trim().isEmpty()) return "?";
        String clean = name.trim();
        int at = clean.indexOf('@');
        if (at > 0) clean = clean.substring(0, at);
        String[] parts = clean.split("[\\s._\\-]+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (p.isEmpty()) continue;
            sb.append(Character.toUpperCase(p.charAt(0)));
            if (sb.length() == 2) break;
        }
        if (sb.length() == 0) return "?";
        return sb.toString();
    }

    public static String timeShort(long ts) {
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(ts));
    }

    public static String dayLabel(long ts) {
        Calendar now = Calendar.getInstance();
        Calendar then = Calendar.getInstance();
        then.setTimeInMillis(ts);
        if (sameDay(now, then)) return "Сегодня";
        Calendar yesterday = Calendar.getInstance();
        yesterday.add(Calendar.DAY_OF_YEAR, -1);
        if (sameDay(yesterday, then)) return "Вчера";
        String pattern = now.get(Calendar.YEAR) == then.get(Calendar.YEAR) ? "d MMMM" : "d MMMM yyyy";
        return new SimpleDateFormat(pattern, new Locale("ru")).format(new Date(ts));
    }

    /** Время для списка чатов: сегодня — часы, вчера — «вчера», иначе дата. */
    public static String chatTime(long ts) {
        if (ts <= 0) return "";
        Calendar now = Calendar.getInstance();
        Calendar then = Calendar.getInstance();
        then.setTimeInMillis(ts);
        if (sameDay(now, then)) return timeShort(ts);
        Calendar yesterday = Calendar.getInstance();
        yesterday.add(Calendar.DAY_OF_YEAR, -1);
        if (sameDay(yesterday, then)) return "вчера";
        String pattern = now.get(Calendar.YEAR) == then.get(Calendar.YEAR) ? "d MMM" : "d.MM.yy";
        return new SimpleDateFormat(pattern, new Locale("ru")).format(new Date(ts));
    }

    private static boolean sameDay(Calendar a, Calendar b) {
        return a.get(Calendar.YEAR) == b.get(Calendar.YEAR)
                && a.get(Calendar.DAY_OF_YEAR) == b.get(Calendar.DAY_OF_YEAR);
    }

    public static void toast(Context ctx, String text) {
        Toast.makeText(ctx, text, Toast.LENGTH_SHORT).show();
    }

    public static void copy(Context ctx, String label, String value) {
        android.content.ClipboardManager cm =
                (android.content.ClipboardManager) ctx.getSystemService(Context.CLIPBOARD_SERVICE);
        if (cm != null) {
            cm.setPrimaryClip(android.content.ClipData.newPlainText(label, value));
            toast(ctx, ctx.getString(com.mailgram.app.R.string.copied));
        }
    }

    /** SHA-1 подписи приложения — именно это значение нужно указать в Google Cloud Console. */
    public static String signingSha1(Context ctx) {
        try {
            PackageManager pm = ctx.getPackageManager();
            String pkg = ctx.getPackageName();
            PackageInfo info;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                info = pm.getPackageInfo(pkg, PackageManager.GET_SIGNING_CERTIFICATES);
                if (info.signingInfo == null) return "нет подписи";
                android.content.pm.Signature[] signatures = info.signingInfo.hasMultipleSigners()
                        ? info.signingInfo.getApkContentsSigners()
                        : info.signingInfo.getSigningCertificateHistory();
                if (signatures == null || signatures.length == 0) return "нет подписи";
                return B64.hexColons(MessageDigest.getInstance("SHA-1").digest(signatures[0].toByteArray()));
            }
            @SuppressWarnings("deprecation")
            PackageInfo legacy = pm.getPackageInfo(pkg, PackageManager.GET_SIGNATURES);
            if (legacy.signatures == null || legacy.signatures.length == 0) return "нет подписи";
            return B64.hexColons(MessageDigest.getInstance("SHA-1").digest(legacy.signatures[0].toByteArray()));
        } catch (Exception e) {
            return "не удалось определить: " + e.getMessage();
        }
    }

    public static String versionName(Context ctx) {
        try {
            PackageInfo info = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0);
            return info.versionName;
        } catch (Exception e) {
            return "?";
        }
    }

    /**
     * Номер безопасности двух открытых ключей (как в Signal): 60 цифр, разбитых на группы.
     * Сверяется голосом или глазами — если совпал, посредника в канале нет.
     */
    public static String safetyNumber(String keyA, String keyB) {
        try {
            if (keyA == null || keyB == null || keyA.isEmpty() || keyB.isEmpty()) return "";
            String raw = com.mailgram.app.crypto.NativeCrypto.safetyNumber(
                    com.mailgram.app.crypto.B64.bytes(keyA),
                    com.mailgram.app.crypto.B64.bytes(keyB));
            return formatSafetyNumber(raw);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Приводит номер безопасности к виду «группы по пять цифр»: нативный код уже отдаёт
     * разделённые группы, поэтому сначала собираем только цифры, потом группируем заново.
     */
    public static String formatSafetyNumber(String raw) {
        if (raw == null || raw.isEmpty()) return "";
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < raw.length(); i++) {
            char c = raw.charAt(i);
            if (c >= '0' && c <= '9') digits.append(c);
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            if (i > 0 && i % 5 == 0) out.append(' ');
            out.append(digits.charAt(i));
        }
        return out.toString();
    }

    public static int color(String hex, int fallback) {
        try {
            return Color.parseColor(hex);
        } catch (Exception e) {
            return fallback;
        }
    }
}

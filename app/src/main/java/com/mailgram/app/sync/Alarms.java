package com.mailgram.app.sync;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

import com.mailgram.app.net.Auth;
import com.mailgram.app.store.Prefs;

/**
 * Резервный механизм доставки: если система остановила фоновую службу
 * (ограничения Android 15/16 на время работы), проверяем почту редкими
 * неточными пробуждениями (минимум 15 минут — так требует Android).
 */
public final class Alarms {

    private static final String TAG = "MailGramAlarms";
    private static final int REQUEST_CODE = 4211;

    private Alarms() {
    }

    public static void schedule(Context ctx, int minutes) {
        if (minutes < 15) minutes = 15;
        AlarmManager am = ctx.getSystemService(AlarmManager.class);
        if (am == null) return;
        PendingIntent pi = pendingIntent(ctx);
        long interval = minutes * 60_000L;
        try {
            am.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,
                    SystemClock.elapsedRealtime() + interval, interval, pi);
        } catch (SecurityException e) {
            Log.w(TAG, "нет разрешения на точные будильники, ставим неточный: " + e);
            am.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime() + interval, pi);
        }
    }

    public static void cancel(Context ctx) {
        AlarmManager am = ctx.getSystemService(AlarmManager.class);
        if (am != null) am.cancel(pendingIntent(ctx));
    }

    private static PendingIntent pendingIntent(Context ctx) {
        Intent intent = new Intent(ctx, SyncAlarmReceiver.class);
        return PendingIntent.getBroadcast(ctx, REQUEST_CODE, intent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
    }

    /** Тихая проверка почты по будильнику. */
    public static class SyncAlarmReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                if (!Auth.isSignedIn(context) || !Prefs.backgroundSync(context)) return;
                SyncEngine.get(context).syncNow();
            } catch (Throwable error) {
                // Сбой в приёмнике будильника закрывает всё приложение — не допускаем этого
                com.mailgram.app.util.CrashLog.record(context, error);
            }
        }
    }

    /** Запуск после перезагрузки устройства. */
    public static class BootReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                if (intent == null) return;
                String action = intent.getAction();
                if (Intent.ACTION_BOOT_COMPLETED.equals(action)
                        || Intent.ACTION_MY_PACKAGE_REPLACED.equals(action)) {
                    if (Auth.isSignedIn(context) && Prefs.backgroundSync(context)) {
                        SyncService.start(context);
                        schedule(context, 15);
                    }
                }
            } catch (Throwable error) {
                com.mailgram.app.util.CrashLog.record(context, error);
            }
        }
    }
}

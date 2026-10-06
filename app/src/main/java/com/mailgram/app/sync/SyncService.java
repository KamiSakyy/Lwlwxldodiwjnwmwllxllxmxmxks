package com.mailgram.app.sync;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.Log;

import androidx.core.content.ContextCompat;

import com.mailgram.app.R;
import com.mailgram.app.net.Auth;
import com.mailgram.app.store.Prefs;

/**
 * Фоновая синхронизация почты. Сервис держит приложение «живым» ровно настолько,
 * чтобы проверять новые письма каждые полминуты, и показывает тихое уведомление
 * (Android требует его для длительной фоновой работы).
 */
public class SyncService extends Service {

    private static final String TAG = "MailGramService";
    public static final String ACTION_START = "com.mailgram.app.action.SYNC_START";
    public static final String ACTION_STOP = "com.mailgram.app.action.SYNC_STOP";

    private final Handler handler = new Handler(Looper.getMainLooper());
    private final SyncEngine.Listener listener = result -> updateNotification();
    private Runnable tick;

    public static void start(Context ctx) {
        if (!Auth.isSignedIn(ctx)) return;
        try {
            ContextCompat.startForegroundService(ctx,
                    new Intent(ctx, SyncService.class).setAction(ACTION_START));
        } catch (Exception e) {
            Log.w(TAG, "не удалось запустить службу: " + e);
        }
    }

    public static void stop(Context ctx) {
        try {
            ctx.stopService(new Intent(ctx, SyncService.class));
        } catch (Exception ignored) {
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        try {
            if (intent != null && ACTION_STOP.equals(intent.getAction())) {
                stopSelf();
                return START_NOT_STICKY;
            }
            if (!Auth.isSignedIn(this)) {
                stopSelf();
                return START_NOT_STICKY;
            }
            Notifier.ensureChannels(this);
            if (!goForeground()) {
                stopSelf();
                return START_NOT_STICKY;
            }
            SyncEngine.get(this).addListener(listener);
            schedule();
            return START_STICKY;
        } catch (Throwable error) {
            // Служба не должна ронять приложение: пишем причину и тихо останавливаемся.
            com.mailgram.app.util.CrashLog.record(this, error);
            stopSelf();
            return START_NOT_STICKY;
        }
    }

    private boolean goForeground() {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(Notifier.SERVICE_NOTIFICATION_ID,
                        Notifier.serviceNotification(this, getString(R.string.sync_running)),
                        ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC);
            } else {
                startForeground(Notifier.SERVICE_NOTIFICATION_ID,
                        Notifier.serviceNotification(this, getString(R.string.sync_running)));
            }
            return true;
        } catch (Throwable t) {
            // например, исчерпан лимит времени для dataSync на Android 15+ —
            // тогда переходим на редкие пробуждения через AlarmManager
            Log.w(TAG, "foreground не разрешён: " + t);
            Alarms.schedule(this, 15);
            return false;
        }
    }

    private void schedule() {
        if (tick != null) handler.removeCallbacks(tick);
        tick = () -> {
            if (!Auth.isSignedIn(this)) {
                stopSelf();
                return;
            }
            SyncEngine.get(this).syncNow();
            long interval = Math.max(10, Prefs.pollSeconds(this)) * 1000L;
            handler.postDelayed(tick, interval);
        };
        handler.post(tick);
    }

    private void updateNotification() {
        try {
            String time = DateFormat.format("HH:mm", System.currentTimeMillis()).toString();
            android.app.Notification n = Notifier.serviceNotification(this,
                    getString(R.string.sync_last, time));
            android.app.NotificationManager nm = getSystemService(android.app.NotificationManager.class);
            if (nm != null) nm.notify(Notifier.SERVICE_NOTIFICATION_ID, n);
        } catch (Exception ignored) {
        }
    }

    @Override
    public void onDestroy() {
        SyncEngine.get(this).removeListener(listener);
        if (tick != null) handler.removeCallbacks(tick);
        if (Prefs.backgroundSync(this) && Auth.isSignedIn(this)) {
            Alarms.schedule(this, 15);
        }
        super.onDestroy();
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        if (Prefs.backgroundSync(this) && Auth.isSignedIn(this)) {
            Alarms.schedule(this, 15);
        }
        super.onTaskRemoved(rootIntent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

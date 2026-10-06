package com.kamisakyy.noxchat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.text.TextUtils;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

/** Foreground owner of the Firebase presence and WebRTC room while a chat is active. */
public final class ChatConnectionService extends Service {
    public static final String ACTION_CONNECT = "com.kamisakyy.noxchat.CONNECT";
    public static final String ACTION_LEAVE = "com.kamisakyy.noxchat.LEAVE";
    public static final String EXTRA_ROOM = "room";
    public static final String EXTRA_NAME = "name";
    private static final String PREFS = "nox_connection";
    private static final String KEY_ROOM = "active_room";
    private static final String KEY_NAME = "display_name";
    private static final int SESSION_NOTIFICATION_ID = 20261;
    private static final String CHANNEL_SESSION = "nox_session";
    private static final String CHANNEL_MESSAGES = "nox_messages";

    private final LocalBinder binder = new LocalBinder();
    private SharedPreferences preferences;
    private ChatSession session;
    private PowerManager.WakeLock wakeLock;
    private boolean uiVisible;
    private String roomCode = "";
    private String displayName = "Гость";
    private String stateText = "Синхронизируем комнату…";

    private final ChatSession.Listener serviceListener = new ChatSession.Listener() {
        @Override public void onState(String state, String detail) {
            stateText = detail == null || detail.isEmpty() ? "Чат активен" : detail;
            updateSessionNotification();
        }

        @Override public void onMessage(ChatMessage message) {
            if (message == null || message.outgoing || uiVisible) return;
            showMessageNotification(message);
        }
    };

    @Override public void onCreate() {
        super.onCreate();
        preferences = getSharedPreferences(PREFS, MODE_PRIVATE);
        createNotificationChannels();
    }

    @Override public int onStartCommand(Intent intent, int flags, int startId) {
        String action = intent == null ? null : intent.getAction();
        if (ACTION_LEAVE.equals(action)) {
            leaveRoom();
            return START_NOT_STICKY;
        }

        String requestedRoom = intent == null ? null : intent.getStringExtra(EXTRA_ROOM);
        String requestedName = intent == null ? null : intent.getStringExtra(EXTRA_NAME);
        if (TextUtils.isEmpty(requestedRoom)) requestedRoom = preferences.getString(KEY_ROOM, null);
        if (TextUtils.isEmpty(requestedName)) requestedName = preferences.getString(KEY_NAME, "Гость");
        if (TextUtils.isEmpty(requestedRoom)) {
            stopSelf(startId);
            return START_NOT_STICKY;
        }

        roomCode = requestedRoom;
        displayName = requestedName == null ? "Гость" : requestedName;
        preferences.edit().putString(KEY_ROOM, roomCode).putString(KEY_NAME, displayName).apply();
        startSessionForeground();
        if (session == null || !roomCode.equals(session.roomCode())) {
            replaceSession(roomCode, displayName);
        }
        return START_STICKY;
    }

    @Override public IBinder onBind(Intent intent) {
        return binder;
    }

    @Override public void onTaskRemoved(Intent rootIntent) {
        // The foreground service intentionally survives removing the activity from Recents.
        super.onTaskRemoved(rootIntent);
    }

    @Override public void onDestroy() {
        releaseWakeLock();
        if (session != null) {
            session.removeListener(serviceListener);
            session.close(true);
            session = null;
        }
        super.onDestroy();
    }

    public ChatSession getSession() {
        return session;
    }

    public void setUiVisible(boolean visible) {
        uiVisible = visible;
    }

    public void leaveRoom() {
        releaseWakeLock();
        if (session != null) {
            session.removeListener(serviceListener);
            session.close(true);
            session = null;
        }
        preferences.edit().remove(KEY_ROOM).remove(KEY_NAME).apply();
        stopForeground(STOP_FOREGROUND_REMOVE);
        stopSelf();
    }

    public static String storedRoom(android.content.Context context) {
        return context.getApplicationContext().getSharedPreferences(PREFS, MODE_PRIVATE).getString(KEY_ROOM, null);
    }

    public static String storedName(android.content.Context context) {
        return context.getApplicationContext().getSharedPreferences(PREFS, MODE_PRIVATE).getString(KEY_NAME, "Гость");
    }

    private void replaceSession(String room, String name) {
        if (session != null) {
            session.removeListener(serviceListener);
            session.close(true);
        }
        session = new ChatSession(this, room, name);
        session.addListener(serviceListener);
    }

    private void startSessionForeground() {
        Notification notification = buildSessionNotification();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            startForeground(SESSION_NOTIFICATION_ID, notification,
                    ServiceInfo.FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE);
        } else {
            startForeground(SESSION_NOTIFICATION_ID, notification);
        }
        acquireWakeLock();
    }

    private void acquireWakeLock() {
        if (wakeLock != null && wakeLock.isHeld()) return;
        PowerManager manager = (PowerManager) getSystemService(POWER_SERVICE);
        if (manager == null) return;
        wakeLock = manager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "Nox:ActiveP2PRoom");
        wakeLock.setReferenceCounted(false);
        wakeLock.acquire();
    }

    private void releaseWakeLock() {
        if (wakeLock != null && wakeLock.isHeld()) {
            try { wakeLock.release(); } catch (RuntimeException ignored) { }
        }
        wakeLock = null;
    }

    private void updateSessionNotification() {
        try {
            NotificationManagerCompat.from(this).notify(SESSION_NOTIFICATION_ID, buildSessionNotification());
        } catch (SecurityException ignored) { }
    }

    private Notification buildSessionNotification() {
        Intent open = new Intent(this, MainActivity.class)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)
                .putExtra(EXTRA_ROOM, roomCode);
        PendingIntent content = PendingIntent.getActivity(this, 10, open,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        Intent leave = new Intent(this, ChatConnectionService.class).setAction(ACTION_LEAVE);
        PendingIntent leavePending = PendingIntent.getService(this, 11, leave,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        return new NotificationCompat.Builder(this, CHANNEL_SESSION)
                .setSmallIcon(R.drawable.ic_stat_nox)
                .setContentTitle("Nox · комната " + shortRoom())
                .setContentText(stateText)
                .setContentIntent(content)
                .setOngoing(true)
                .setOnlyAlertOnce(true)
                .setCategory(NotificationCompat.CATEGORY_SERVICE)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .addAction(0, "Отключиться", leavePending)
                .build();
    }

    private String shortRoom() {
        return roomCode == null || roomCode.length() < 8 ? roomCode : roomCode.substring(0, 4) + "…" + roomCode.substring(roomCode.length() - 4);
    }

    private void showMessageNotification(ChatMessage message) {
        String title;
        String text;
        if (ChatMessage.TEXT.equals(message.kind)) {
            title = "Новое сообщение · Nox";
            text = message.text;
        } else {
            title = "Вложение · Nox";
            text = labelFor(message.kind) + (message.fileName.isEmpty() ? "" : " · " + message.fileName);
        }
        if (text.length() > 120) text = text.substring(0, 117) + "…";
        Intent open = new Intent(this, MainActivity.class)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)
                .putExtra(EXTRA_ROOM, roomCode);
        PendingIntent pending = PendingIntent.getActivity(this, 12, open,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        Notification notification = new NotificationCompat.Builder(this, CHANNEL_MESSAGES)
                .setSmallIcon(R.drawable.ic_stat_nox)
                .setContentTitle(title)
                .setContentText(text)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(text))
                .setContentIntent(pending)
                .setAutoCancel(true)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .build();
        try {
            NotificationManagerCompat.from(this).notify((int) (message.id.hashCode() & 0x7fffffff), notification);
        } catch (SecurityException ignored) { }
    }

    private String labelFor(String kind) {
        if (ChatMessage.PHOTO.equals(kind)) return "Фото";
        if (ChatMessage.VIDEO.equals(kind)) return "Видео";
        if (ChatMessage.CIRCLE.equals(kind)) return "Видеокружок";
        if (ChatMessage.VOICE.equals(kind)) return "Голосовое сообщение";
        if (ChatMessage.AUDIO.equals(kind)) return "Аудио";
        return "Файл";
    }

    private void createNotificationChannels() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return;
        NotificationManager manager = getSystemService(NotificationManager.class);
        if (manager == null) return;
        NotificationChannel sessionChannel = new NotificationChannel(CHANNEL_SESSION,
                getString(R.string.notification_channel_session), NotificationManager.IMPORTANCE_LOW);
        sessionChannel.setDescription("Показывает, что P2P-комната остаётся активной");
        sessionChannel.setShowBadge(false);
        NotificationChannel messageChannel = new NotificationChannel(CHANNEL_MESSAGES,
                getString(R.string.notification_channel_messages), NotificationManager.IMPORTANCE_HIGH);
        messageChannel.setDescription("Уведомления о новых сообщениях и вложениях");
        manager.createNotificationChannel(sessionChannel);
        manager.createNotificationChannel(messageChannel);
    }

    public final class LocalBinder extends Binder {
        ChatConnectionService getService() { return ChatConnectionService.this; }
    }
}

package com.mailgram.app.sync;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;

import com.mailgram.app.R;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Store;
import com.mailgram.app.ui.ChatActivity;
import com.mailgram.app.ui.MainActivity;

/** Уведомления: новые сообщения (с быстрым ответом) и тихая служба синхронизации. */
public final class Notifier {

    public static final String CHANNEL_MESSAGES = "mailgram_messages";
    public static final String CHANNEL_SYNC = "mailgram_sync";
    public static final int SERVICE_NOTIFICATION_ID = 1001;
    public static final String KEY_REPLY_TEXT = "mailgram_reply_text";
    public static final String EXTRA_CHAT_UID = "chat_uid";

    private Notifier() {
    }

    public static void ensureChannels(Context ctx) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return;
        NotificationManager nm = ctx.getSystemService(NotificationManager.class);
        if (nm == null) return;

        NotificationChannel messages = new NotificationChannel(CHANNEL_MESSAGES,
                ctx.getString(R.string.channel_messages), NotificationManager.IMPORTANCE_HIGH);
        messages.setDescription(ctx.getString(R.string.channel_messages_desc));
        messages.enableVibration(true);
        nm.createNotificationChannel(messages);

        NotificationChannel sync = new NotificationChannel(CHANNEL_SYNC,
                ctx.getString(R.string.channel_sync), NotificationManager.IMPORTANCE_MIN);
        sync.setDescription(ctx.getString(R.string.channel_sync_desc));
        sync.setShowBadge(false);
        nm.createNotificationChannel(sync);
    }

    public static Notification serviceNotification(Context ctx, String status) {
        ensureChannels(ctx);
        Intent open = new Intent(ctx, MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(ctx, 0, open,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        return new NotificationCompat.Builder(ctx, CHANNEL_SYNC)
                .setSmallIcon(R.drawable.ic_lock)
                .setContentTitle(ctx.getString(R.string.app_name))
                .setContentText(status)
                .setOngoing(true)
                .setShowWhen(false)
                .setPriority(NotificationCompat.PRIORITY_MIN)
                .setContentIntent(pi)
                .build();
    }

    /** Уведомление о новом сообщении с кнопкой быстрого ответа. */
    public static void showMessage(Context ctx, Chat chat, Msg msg) {
        if (!com.mailgram.app.store.Prefs.notifications(ctx)) return;
        if (chat == null) return;
        ensureChannels(ctx);

        String title = Store.displayName(ctx, chat.peer);
        String text = Store.preview(msg);

        Intent openIntent = new Intent(ctx, ChatActivity.class)
                .putExtra(ChatActivity.EXTRA_CHAT_UID, chat.uid)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent contentIntent = PendingIntent.getActivity(ctx, chat.uid.hashCode(), openIntent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        Person me = new Person.Builder().setName(ctx.getString(R.string.me)).build();
        Person peer = new Person.Builder()
                .setName(title)
                .setIcon(IconCompat.createWithResource(ctx, R.drawable.ic_person))
                .build();

        NotificationCompat.MessagingStyle style = new NotificationCompat.MessagingStyle(me)
                .setConversationTitle(title);
        for (Msg m : Store.get(ctx).messages(chat.uid)) {
            if (m.outgoing && m.state == Msg.STATE_SENDING) continue;
            style.addMessage(Store.preview(m), m.ts, m.outgoing ? me : peer);
        }

        RemoteInput remoteInput = new RemoteInput.Builder(KEY_REPLY_TEXT)
                .setLabel(ctx.getString(R.string.reply_hint))
                .build();
        Intent replyIntent = new Intent(ctx, ReplyReceiver.class)
                .setAction(ReplyReceiver.ACTION_REPLY)
                .putExtra(EXTRA_CHAT_UID, chat.uid);
        PendingIntent replyPi = PendingIntent.getBroadcast(ctx, chat.uid.hashCode() + 7, replyIntent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_MUTABLE);
        NotificationCompat.Action replyAction = new NotificationCompat.Action.Builder(
                R.drawable.ic_send, ctx.getString(R.string.reply), replyPi)
                .addRemoteInput(remoteInput)
                .setAllowGeneratedReplies(true)
                .build();

        Notification notification = new NotificationCompat.Builder(ctx, CHANNEL_MESSAGES)
                .setSmallIcon(R.drawable.ic_lock)
                .setStyle(style)
                .setContentTitle(title)
                .setContentText(text)
                .setAutoCancel(true)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(contentIntent)
                .addAction(replyAction)
                .build();

        try {
            NotificationManagerCompat.from(ctx).notify(chat.uid.hashCode(), notification);
        } catch (SecurityException e) {
            // нет разрешения на уведомления — молча пропускаем
        }
    }

    public static void clear(Context ctx, String chatUid) {
        NotificationManagerCompat.from(ctx).cancel(chatUid.hashCode());
    }
}

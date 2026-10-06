package com.mailgram.app.sync;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.mailgram.app.R;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Store;

/** Быстрый ответ прямо из уведомления. */
public class ReplyReceiver extends BroadcastReceiver {

    public static final String ACTION_REPLY = "com.mailgram.app.action.REPLY";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !ACTION_REPLY.equals(intent.getAction())) return;
        Bundle results = RemoteInput.getResultsFromIntent(intent);
        CharSequence text = results == null ? null : results.getCharSequence(Notifier.KEY_REPLY_TEXT);
        String uid = intent.getStringExtra(Notifier.EXTRA_CHAT_UID);
        if (text == null || text.length() == 0 || uid == null) return;

        Chat chat = Store.get(context).chat(uid);
        if (chat == null) return;
        SyncEngine.get(context).sendText(chat, text.toString(), new SyncEngine.SendCallback() {
            @Override
            public void onSent(com.mailgram.app.store.Msg message) {
            }

            @Override
            public void onError(String error) {
                Toast.makeText(context, context.getString(R.string.send_failed, error),
                        Toast.LENGTH_LONG).show();
            }
        });
        Notifier.clear(context, uid);
    }
}

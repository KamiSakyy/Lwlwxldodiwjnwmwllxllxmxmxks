package com.kamisakyy.noxchat;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Compact room-scoped history stored on-device, not in Firebase. */
final class MessageStore {
    private static final String PREFS = "local_chat_history";
    private static final int MAX_MESSAGES = 250;

    private final SharedPreferences preferences;
    private final String key;
    private final ArrayList<ChatMessage> messages = new ArrayList<>();

    MessageStore(Context context, String roomCode) {
        preferences = context.getApplicationContext().getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        key = "room_" + roomCode;
        load();
    }

    synchronized List<ChatMessage> all() {
        return Collections.unmodifiableList(new ArrayList<>(messages));
    }

    synchronized void add(ChatMessage message) {
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).id.equals(message.id)) {
                messages.set(i, message);
                persist();
                return;
            }
        }
        messages.add(message);
        while (messages.size() > MAX_MESSAGES) messages.remove(0);
        persist();
    }

    synchronized void update(ChatMessage message) {
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).id.equals(message.id)) {
                messages.set(i, message);
                persist();
                return;
            }
        }
        add(message);
    }

    private void load() {
        String raw = preferences.getString(key, "[]");
        try {
            JSONArray array = new JSONArray(raw);
            int start = Math.max(0, array.length() - MAX_MESSAGES);
            for (int i = start; i < array.length(); i++) {
                JSONObject item = array.optJSONObject(i);
                if (item != null) {
                    ChatMessage message = ChatMessage.fromJson(item);
                    if (message.status == ChatMessage.SENDING || message.status == ChatMessage.RECEIVING) {
                        message.status = ChatMessage.FAILED;
                    }
                    if (message.isAttachment() && message.status == ChatMessage.READY
                            && message.attachmentUri.startsWith("/")
                            && !new File(message.attachmentUri).exists()) {
                        message.status = ChatMessage.FAILED;
                    }
                    messages.add(message);
                }
            }
        } catch (Exception ignored) {
            messages.clear();
        }
    }

    private void persist() {
        JSONArray array = new JSONArray();
        for (ChatMessage message : messages) array.put(message.toJson());
        preferences.edit().putString(key, array.toString()).apply();
    }
}

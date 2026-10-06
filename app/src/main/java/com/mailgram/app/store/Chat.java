package com.mailgram.app.store;

import org.json.JSONObject;

/** Диалог: собеседник + последнее сообщение + счётчик непрочитанных. */
public final class Chat {

    public String uid = "";         // 8 hex — одинаков у обоих участников
    public String peer = "";        // адрес собеседника
    public String peerPublic = "";  // последний известный открытый ключ собеседника (base64url)
    public String name = "";    // локальное имя контакта
    public long lastTs;
    public String preview = "";
    public boolean lastOutgoing;
    public int unread;
    public int total;
    public boolean damaged;     // было сообщение, которое не удалось расшифровать
    public boolean pinned;      // закреплён в списке
    public boolean muted;       // без звука
    public boolean verified;    // отпечаток безопасности сверен вручную
    /** true — это «папка» обычной почты (переписка не через MailGram), шифрование не требуется. */
    public boolean generic;

    public JSONObject toJson() {
        JSONObject o = new JSONObject();
        try {
            o.put("uid", uid);
            o.put("peer", peer);
            o.put("pk", peerPublic);
            o.put("name", name);
            o.put("lastTs", lastTs);
            o.put("preview", preview);
            o.put("out", lastOutgoing);
            o.put("unread", unread);
            o.put("total", total);
            o.put("damaged", damaged);
            o.put("pinned", pinned);
            o.put("muted", muted);
            o.put("verified", verified);
            if (generic) o.put("generic", true);
        } catch (Exception ignored) {
        }
        return o;
    }

    /** Пустые строки вместо null: интерфейс читает эти поля без проверок. */
    public void sanitize() {
        if (uid == null) uid = "";
        if (peer == null) peer = "";
        if (peerPublic == null) peerPublic = "";
        if (name == null) name = "";
        if (preview == null) preview = "";
    }

    public static Chat fromJson(JSONObject o) {
        Chat c = new Chat();
        c.uid = o.optString("uid", "");
        c.peer = o.optString("peer", "");
        c.peerPublic = o.optString("pk", "");
        c.name = o.optString("name", "");
        c.lastTs = o.optLong("lastTs", 0L);
        c.preview = o.optString("preview", "");
        c.lastOutgoing = o.optBoolean("out", false);
        c.unread = o.optInt("unread", 0);
        c.total = o.optInt("total", 0);
        c.damaged = o.optBoolean("damaged", false);
        c.pinned = o.optBoolean("pinned", false);
        c.muted = o.optBoolean("muted", false);
        c.verified = o.optBoolean("verified", false);
        c.generic = o.optBoolean("generic", false);
        c.sanitize();
        return c;
    }
}

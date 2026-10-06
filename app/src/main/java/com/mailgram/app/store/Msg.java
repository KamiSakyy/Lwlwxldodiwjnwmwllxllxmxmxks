package com.mailgram.app.store;

import org.json.JSONObject;

/** Сообщение (локальная копия письма в зашифрованном виде). */
public final class Msg {

    public static final int STATE_SENDING = 1;
    public static final int STATE_SENT = 2;
    public static final int STATE_FAILED = 3;

    public String mid;          // UUID сообщения из конверта
    public String chat;         // идентификатор пары
    public String peer;         // адрес собеседника
    public String from;
    public String to;
    public long ts;
    public boolean outgoing;
    public String type = "text";// text | image
    public String text = "";
    public String imageB64 = "";
    public int state = STATE_SENT;
    public String gmailId = "";
    public String error = "";
    public boolean unread;

    public JSONObject toJson() {
        JSONObject o = new JSONObject();
        try {
            o.put("mid", mid);
            o.put("chat", chat);
            o.put("peer", peer);
            o.put("from", from);
            o.put("to", to);
            o.put("ts", ts);
            o.put("out", outgoing);
            o.put("type", type);
            o.put("text", text);
            if (imageB64 != null && !imageB64.isEmpty()) o.put("img", imageB64);
            o.put("state", state);
            o.put("gmail", gmailId);
            o.put("err", error);
            o.put("unread", unread);
        } catch (Exception ignored) {
        }
        return o;
    }

    public static Msg fromJson(JSONObject o) {
        Msg m = new Msg();
        m.mid = o.optString("mid", "");
        m.chat = o.optString("chat", "");
        m.peer = o.optString("peer", "");
        m.from = o.optString("from", "");
        m.to = o.optString("to", "");
        m.ts = o.optLong("ts", 0L);
        m.outgoing = o.optBoolean("out", false);
        m.type = o.optString("type", "text");
        m.text = o.optString("text", "");
        m.imageB64 = o.optString("img", "");
        m.state = o.optInt("state", STATE_SENT);
        m.gmailId = o.optString("gmail", "");
        m.error = o.optString("err", "");
        m.unread = o.optBoolean("unread", false);
        return m;
    }

    public boolean isImage() {
        return "image".equals(type) && imageB64 != null && !imageB64.isEmpty();
    }
}

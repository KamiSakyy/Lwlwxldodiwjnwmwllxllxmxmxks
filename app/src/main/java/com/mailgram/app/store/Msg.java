package com.mailgram.app.store;

import org.json.JSONObject;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Сообщение (локальная копия письма в зашифрованном виде).
 *
 * <p>Типы: {@code text}, {@code image}, {@code video} (в том числе кружок при {@link #round}),
 * {@code voice}, {@code file}, {@code invite}, а также служебные {@code react}, {@code edit},
 * {@code del} — они меняют уже существующее сообщение, а не создают новое.</p>
 */
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
    public String type = "text";
    public String text = "";
    /** Вложение: фото (JPEG), видео (MP4), голосовое (M4A) или файл — base64. */
    public String mediaB64 = "";
    public String mediaMime = "";
    public long durationMs;
    public String fileName = "";
    public long fileSize;
    public boolean round;       // видеокружок
    /** Амплитуды голосового для волны: "4,9,15,..." (пусто, если не голосовое). */
    public String wave = "";
    /** Ответ на сообщение: идентификатор и короткая цитата. */
    public String replyMid = "";
    public String replyPreview = "";
    public boolean edited;
    /** Сообщение закреплено в шапке чата. */
    public boolean pinned;
    public boolean deleted;
    /** Сообщение переслано из другого чата. */
    public boolean forwarded;
    /** Своя реакция на это сообщение (чтобы повторное нажатие её снимало). */
    public String myReaction = "";
    /** Реакции: эмодзи → сколько раз поставили. */
    public final Map<String, Integer> reactions = new LinkedHashMap<>();
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
            if (mediaB64 != null && !mediaB64.isEmpty()) o.put("media", mediaB64);
            if (mediaMime != null && !mediaMime.isEmpty()) o.put("mime", mediaMime);
            if (durationMs > 0) o.put("dur", durationMs);
            if (fileName != null && !fileName.isEmpty()) o.put("name", fileName);
            if (fileSize > 0) o.put("size", fileSize);
            if (round) o.put("round", true);
            if (wave != null && !wave.isEmpty()) o.put("wave", wave);
            if (replyMid != null && !replyMid.isEmpty()) o.put("rmid", replyMid);
            if (replyPreview != null && !replyPreview.isEmpty()) o.put("rpv", replyPreview);
            if (edited) o.put("edited", true);
            if (pinned) o.put("pin", true);
            if (deleted) o.put("del", true);
            if (forwarded) o.put("fwd", true);
            if (myReaction != null && !myReaction.isEmpty()) o.put("mre", myReaction);
            if (!reactions.isEmpty()) {
                JSONObject r = new JSONObject();
                for (Map.Entry<String, Integer> e : reactions.entrySet()) {
                    r.put(e.getKey(), e.getValue());
                }
                o.put("react", r);
            }
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
        m.mediaB64 = o.optString("media", "");
        if (m.mediaB64.isEmpty()) m.mediaB64 = o.optString("img", ""); // совместимость со старой базой
        m.mediaMime = o.optString("mime", "");
        m.durationMs = o.optLong("dur", 0L);
        m.fileName = o.optString("name", "");
        m.fileSize = o.optLong("size", 0L);
        m.round = o.optBoolean("round", false);
        m.wave = o.optString("wave", "");
        m.replyMid = o.optString("rmid", "");
        m.replyPreview = o.optString("rpv", "");
        m.edited = o.optBoolean("edited", false);
        m.pinned = o.optBoolean("pin", false);
        m.deleted = o.optBoolean("del", false);
        m.forwarded = o.optBoolean("fwd", false);
        m.myReaction = o.optString("mre", "");
        JSONObject react = o.optJSONObject("react");
        if (react != null) {
            java.util.Iterator<String> keys = react.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                int count = react.optInt(key, 0);
                if (count > 0) m.reactions.put(key, count);
            }
        }
        m.state = o.optInt("state", STATE_SENT);
        m.gmailId = o.optString("gmail", "");
        m.error = o.optString("err", "");
        m.unread = o.optBoolean("unread", false);
        return m;
    }

    public boolean hasMedia() {
        return mediaB64 != null && !mediaB64.isEmpty();
    }

    public boolean isImage() {
        return "image".equals(type) && hasMedia();
    }

    public boolean isVideo() {
        return "video".equals(type) && hasMedia();
    }

    public boolean isVoice() {
        return "voice".equals(type) && hasMedia();
    }

    public boolean isFile() {
        return "file".equals(type) && hasMedia();
    }

    /** Служебное сообщение: меняет другое сообщение, в ленте не показывается. */
    public boolean isControl() {
        return "react".equals(type) || "edit".equals(type) || "del".equals(type);
    }

    /** Короткое описание для списка чатов. */
    public String previewText() {
        if (deleted) return "Сообщение удалено";
        switch (type == null ? "" : type) {
            case "image":
                return text == null || text.isEmpty() ? "🖼 Фото" : "🖼 " + text;
            case "video":
                return round ? "⏺ Видеосообщение" : (text == null || text.isEmpty() ? "🎬 Видео" : "🎬 " + text);
            case "voice":
                return "🎤 Голосовое сообщение";
            case "file":
                return "📎 " + (fileName.isEmpty() ? "Файл" : fileName);
            default:
                return text == null ? "" : text;
        }
    }
}

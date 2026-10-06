package com.kamisakyy.noxchat;

import org.json.JSONObject;

/** Device-local message record. File bytes are stored only on the sender/receiver device. */
final class ChatMessage {
    static final String TEXT = "text";
    static final String PHOTO = "photo";
    static final String VIDEO = "video";
    static final String CIRCLE = "circle";
    static final String VOICE = "voice";
    static final String AUDIO = "audio";
    static final String FILE = "file";

    static final int RECEIVING = 0;
    static final int READY = 1;
    static final int SENDING = 2;
    static final int FAILED = 3;

    String id;
    String text;
    String kind;
    String fileName;
    String mimeType;
    String attachmentUri;
    boolean outgoing;
    long timeMs;
    long sizeBytes;
    int status;

    ChatMessage(String id, String text, String kind, String fileName, String mimeType,
                String attachmentUri, boolean outgoing, long timeMs, long sizeBytes, int status) {
        this.id = id;
        this.text = text == null ? "" : text;
        this.kind = kind == null ? TEXT : kind;
        this.fileName = fileName == null ? "" : fileName;
        this.mimeType = mimeType == null ? "application/octet-stream" : mimeType;
        this.attachmentUri = attachmentUri == null ? "" : attachmentUri;
        this.outgoing = outgoing;
        this.timeMs = timeMs;
        this.sizeBytes = sizeBytes;
        this.status = status;
    }

    JSONObject toJson() {
        JSONObject object = new JSONObject();
        try {
            object.put("id", id);
            object.put("text", text);
            object.put("kind", kind);
            object.put("fileName", fileName);
            object.put("mimeType", mimeType);
            object.put("attachmentUri", attachmentUri);
            object.put("outgoing", outgoing);
            object.put("timeMs", timeMs);
            object.put("sizeBytes", sizeBytes);
            object.put("status", status);
        } catch (Exception ignored) { }
        return object;
    }

    static ChatMessage fromJson(JSONObject object) {
        return new ChatMessage(
                object.optString("id", ""),
                object.optString("text", ""),
                object.optString("kind", TEXT),
                object.optString("fileName", ""),
                object.optString("mimeType", "application/octet-stream"),
                object.optString("attachmentUri", ""),
                object.optBoolean("outgoing", false),
                object.optLong("timeMs", System.currentTimeMillis()),
                object.optLong("sizeBytes", 0L),
                object.optInt("status", READY));
    }

    boolean isAttachment() {
        return !TEXT.equals(kind);
    }
}

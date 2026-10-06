package com.mailgram.app.net;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Обёртка над Gmail REST API (https://gmail.googleapis.com).
 * Никакого своего сервера: письмо пишется прямо в почтовый ящик пользователя.
 */
public final class GmailApi {

    private static final String BASE = "https://gmail.googleapis.com/gmail/v1/users/me";

    private GmailApi() {
    }

    public static final class Mail {
        public String id;
        public String threadId;
        public String subject = "";
        public String from = "";
        public String to = "";
        public String body = "";
        public long internalDate;
        public boolean unread;
        public final List<String> labels = new ArrayList<>();
    }

    public static String profileEmail(String token) throws IOException {
        String json = Http.get(BASE + "/profile", token);
        try {
            return new JSONObject(json).optString("emailAddress", "");
        } catch (Exception e) {
            return "";
        }
    }

    /** Список идентификаторов писем по поисковому запросу Gmail (с постраничностью). */
    public static List<String> listMessageIds(String token, String query, int max) throws IOException {
        List<String> ids = new ArrayList<>();
        String pageToken = null;
        do {
            StringBuilder url = new StringBuilder(BASE)
                    .append("/messages?maxResults=100&includeSpamTrash=true");
            if (query != null && !query.isEmpty()) {
                url.append("&q=").append(java.net.URLEncoder.encode(query, "UTF-8"));
            }
            if (pageToken != null) url.append("&pageToken=").append(pageToken);
            String json = Http.get(url.toString(), token);
            try {
                JSONObject obj = new JSONObject(json);
                JSONArray arr = obj.optJSONArray("messages");
                if (arr != null) {
                    for (int i = 0; i < arr.length(); i++) {
                        String id = arr.getJSONObject(i).optString("id", null);
                        if (id != null) ids.add(id);
                    }
                }
                pageToken = obj.optString("nextPageToken", null);
            } catch (Exception e) {
                throw new IOException("не удалось разобрать ответ Gmail: " + e.getMessage(), e);
            }
        } while (pageToken != null && ids.size() < max);
        return ids;
    }

    /** Полное письмо (заголовки + тело + метки). */
    public static Mail get(String token, String id) throws IOException {
        String json = Http.get(BASE + "/messages/" + id + "?format=full", token);
        try {
            return parseMessage(new JSONObject(json), id);
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw new IOException("не удалось разобрать письмо " + id + ": " + e.getMessage(), e);
        }
    }

    /** Один парсер на messages.get и messages.batchGet — ответы идентичны. */
    private static Mail parseMessage(JSONObject obj, String fallbackId) throws IOException {
        Mail mail = new Mail();
        mail.id = obj.optString("id", fallbackId);
        try {
            mail.threadId = obj.optString("threadId", null);
            mail.internalDate = obj.optLong("internalDate", 0L);
            JSONArray labels = obj.optJSONArray("labelIds");
            if (labels != null) {
                for (int i = 0; i < labels.length(); i++) {
                    String l = labels.optString(i, "");
                    mail.labels.add(l);
                    if ("UNREAD".equals(l)) mail.unread = true;
                }
            }
            JSONObject payload = obj.optJSONObject("payload");
            if (payload != null) {
                JSONArray headers = payload.optJSONArray("headers");
                if (headers != null) {
                    for (int i = 0; i < headers.length(); i++) {
                        JSONObject h = headers.getJSONObject(i);
                        String name = h.optString("name", "").toLowerCase(java.util.Locale.US);
                        String value = h.optString("value", "");
                        switch (name) {
                            case "subject": mail.subject = value; break;
                            case "from": mail.from = value; break;
                            case "to": mail.to = value; break;
                            default: break;
                        }
                    }
                }
                String body = extractText(payload);
                mail.body = body == null ? "" : body;
            }
        } catch (Exception e) {
            throw new IOException("не удалось разобрать письмо: " + e.getMessage(), e);
        }
        return mail;
    }

    /** Текущий historyId ящика — «закладка» для History API (users.me.getProfile, 1 юнит). */
    public static long profileHistoryId(String token) throws IOException {
        String json = Http.get(BASE + "/profile", token);
        try {
            return new JSONObject(json).optLong("historyId", 0L);
        } catch (Exception e) {
            throw new IOException("не удалось разобрать профиль: " + e.getMessage(), e);
        }
    }

    /**
     * History API (users.me.history): все новые письма с startHistoryId
     * (messageAdded — независимо от метки: INBOX, спам, фильтры). Стоимость —
     * 2 юнита за запрос вместо дорогого поиска q=. Новый historyId — в newHistoryOut[0].
     */
    public static List<String> historyChangedIds(String token, long startHistoryId, long[] newHistoryOut)
            throws IOException {
        List<String> ids = new ArrayList<>();
        String pageToken = null;
        do {
            StringBuilder url = new StringBuilder(BASE).append("/history?startHistoryId=")
                    .append(startHistoryId)
                    .append("&historyTypes=messageAdded&maxResults=500");
            if (pageToken != null) url.append("&pageToken=").append(pageToken);
            String json = Http.get(url.toString(), token);
            try {
                JSONObject obj = new JSONObject(json);
                JSONArray arr = obj.optJSONArray("history");
                if (arr != null) {
                    for (int i = 0; i < arr.length(); i++) {
                        JSONArray msgs = arr.getJSONObject(i).optJSONArray("messages");
                        if (msgs == null) continue;
                        for (int j = 0; j < msgs.length(); j++) {
                            String id = msgs.getJSONObject(j).optString("id", null);
                            if (id != null && !ids.contains(id)) ids.add(id);
                        }
                    }
                }
                pageToken = obj.optString("nextPageToken", null);
                long h = obj.optLong("historyId", 0L);
                if (h > 0 && newHistoryOut != null && newHistoryOut.length > 0) newHistoryOut[0] = h;
            } catch (Exception e) {
                throw new IOException("не удалось разобрать историю: " + e.getMessage(), e);
            }
        } while (pageToken != null);
        return ids;
    }

    private static String extractText(JSONObject part) {
        String mime = part.optString("mimeType", "");
        JSONObject body = part.optJSONObject("body");
        if ("text/plain".equals(mime) && body != null && body.optString("data", "").length() > 0) {
            return decode(body.optString("data"));
        }
        JSONArray parts = part.optJSONArray("parts");
        if (parts != null) {
            String html = null;
            for (int i = 0; i < parts.length(); i++) {
                JSONObject child = parts.optJSONObject(i);
                if (child == null) continue;
                String t = extractText(child);
                if (t == null) continue;
                if ("text/plain".equals(child.optString("mimeType", ""))) return t;
                if (html == null) html = t;
            }
            if (html != null) return stripHtml(html);
        }
        if (body != null && body.optString("data", "").length() > 0) {
            String decoded = decode(body.optString("data"));
            return "text/html".equals(mime) ? stripHtml(decoded) : decoded;
        }
        return null;
    }

    /**
     * Gmail отдаёт тело в base64url без «=» и с переносами строк — приводим к каноническому
     * виду, иначе декодер Android бросает IllegalArgumentException.
     */
    private static String decode(String data) {
        if (data == null) return "";
        try {
            String s = data.replaceAll("\\s+", "");
            int pad = (4 - s.length() % 4) % 4;
            if (pad > 0) s = s + "====".substring(0, pad);
            byte[] raw = android.util.Base64.decode(s, android.util.Base64.URL_SAFE | android.util.Base64.NO_WRAP);
            return new String(raw, java.nio.charset.StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "";
        }
    }

    private static String stripHtml(String html) {
        return html.replaceAll("(?s)<(script|style)[^>]*>.*?</\\1>", " ")
                .replaceAll("<br\\s*/?>", "\n")
                .replaceAll("<[^>]+>", " ")
                .replace("&nbsp;", " ")
                .replace("&amp;", "&")
                .replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("&quot;", "\"");
    }

    /** Отправка письма. rawBase64 — MIME-сообщение в base64url. */
    public static String send(String token, String rawBase64Url) throws IOException {
        JSONObject body = new JSONObject();
        try {
            body.put("raw", rawBase64Url);
        } catch (Exception e) {
            throw new IOException(e);
        }
        String json = Http.postJson(BASE + "/messages/send", token, body.toString());
        try {
            return new JSONObject(json).optString("id", "");
        } catch (Exception e) {
            return "";
        }
    }

    /** Снять метку UNREAD (синхронизирует «прочитано» с обычным Gmail). */
    public static void markRead(String token, String messageId) throws IOException {
        JSONObject body = new JSONObject();
        try {
            body.put("removeLabelIds", new JSONArray().put("UNREAD"));
        } catch (Exception e) {
            throw new IOException(e);
        }
        Http.postJson(BASE + "/messages/" + messageId + "/modify", token, body.toString());
    }

    public static String messageIdHeader(String token, String messageId) throws IOException {
        String json = Http.get(BASE + "/messages/" + messageId
                + "?format=metadata&metadataHeaders=Message-ID", token);
        try {
            JSONObject obj = new JSONObject(json);
            JSONArray headers = obj.getJSONObject("payload").optJSONArray("headers");
            if (headers != null) {
                for (int i = 0; i < headers.length(); i++) {
                    JSONObject h = headers.getJSONObject(i);
                    if ("Message-ID".equalsIgnoreCase(h.optString("name"))) {
                        return h.optString("value", "");
                    }
                }
            }
        } catch (Exception ignored) {
        }
        return "";
    }
}

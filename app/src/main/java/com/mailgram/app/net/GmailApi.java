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

    /** Один HTTP-запрос на 50 писем вместо 50 запросов — экономим квоту Gmail. */
    private static final int BATCH_SIZE = 50;
    private static final String BATCH_ENDPOINT = "https://gmail.googleapis.com/batch/gmail/v1";
    private static final String BATCH_BOUNDARY = "batch_MailGram_9a7c41";

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
            StringBuilder url = new StringBuilder(BASE).append("/messages?maxResults=100");
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
        return parseMessage(id, json);
    }

    /**
    * Пакетная загрузка писем: Google считает стоимость каждого запроса, а batch-эндпоинт
    * позволяет достать до 50 писем ОДНИМ запросом — так приложение не упирается в лимит
    * «Units per minute per user» и не спамит API.
    */
    public static java.util.Map<String, Mail> getBatch(String token, List<String> ids) {
        java.util.Map<String, Mail> out = new java.util.LinkedHashMap<>();
        if (ids == null || ids.isEmpty()) return out;
        int i = 0;
        while (i < ids.size()) {
            List<String> chunk = ids.subList(i, Math.min(ids.size(), i + BATCH_SIZE));
            try {
                sendBatch(token, chunk, out);
            } catch (Http.RateLimited rl) {
                throw rl;                      // про лимит сообщаем наверх — там поставят паузу
            } catch (Exception e) {
                // batch мог не подойти (формат ответа, одно битое письмо) — тихо добираем по одному
                for (String id : chunk) {
                    if (out.containsKey(id)) continue;
                    try {
                        out.put(id, get(token, id));
                    } catch (Http.RateLimited rl) {
                        throw rl;
                    } catch (Exception e2) {
                        com.mailgram.app.util.CrashLog.record(null, e2);
                    }
                }
            }
            i += BATCH_SIZE;
        }
        return out;
    }

    private static void sendBatch(String token, List<String> ids,
                                  java.util.Map<String, Mail> out) throws Exception {
        StringBuilder body = new StringBuilder();
        for (int k = 0; k < ids.size(); k++) {
            String id = ids.get(k);
            body.append("--").append(BATCH_BOUNDARY).append("\r\n")
                    .append("Content-Type: application/http\r\n")
                    .append("Content-ID: <item").append(k).append(">\r\n\r\n")
                    .append("GET ").append(BASE).append("/messages/").append(id)
                    .append("?format=full\r\n\r\n");
        }
        body.append("--").append(BATCH_BOUNDARY).append("--\r\n");
        Http.Response resp = Http.request("POST", BATCH_ENDPOINT, token,
                body.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8),
                "multipart/mixed; boundary=" + BATCH_BOUNDARY);
        java.util.Map<String, String> byCid = splitBatch(resp.body);
        for (int k = 0; k < ids.size(); k++) {
            String id = ids.get(k);
            String payload = byCid.get("item" + k);
            if (payload == null) continue;
            if (payload.startsWith("HTTP/")) {
                int sp = payload.indexOf(' ');
                int code = parseIntSafe(payload.substring(0, sp < 0 ? 3 : sp).replace("HTTP/", ""), 0);
                if (code >= 400) continue;
                int nl = payload.indexOf('\n');
                payload = payload.substring(nl + 1);
            }
            out.put(id, parseMessage(id, payload));
        }
    }

    /** Разбор multipart-ответа batch: CID -> текст (включая Possible malformed строку статуса). */
    private static java.util.Map<String, String> splitBatch(String raw) {
        java.util.Map<String, String> map = new java.util.LinkedHashMap<>();
        if (raw == null) return map;
        String[] blocks = raw.split("--batch_[A-Za-z0-9]+");
        for (String block : blocks) {
            String text = block;
            int hdrEnd = text.indexOf("\r\n\r\n");
            if (hdrEnd < 0) hdrEnd = text.indexOf("\n\n");
            if (hdrEnd < 0) continue;
            String headers = text.substring(0, hdrEnd);
            String cid = null;
            boolean status = false;
            for (String line : headers.split("\\r?\\n")) {
                String l = line.trim();
                if (l.regionMatches(true, 0, "Content-ID:", 0, 11)) {
                    cid = l.substring(11).trim().replaceAll("[<>]", "");
                } else if (l.startsWith("HTTP/")) {
                    status = true;
                }
            }
            if (cid == null) continue;
            String rest = text.substring(hdrEnd).replaceFirst("^(\\r\\n|\\n)+", "");
            map.put(cid, status ? rest : rest);
        }
        return map;
    }

    private static int parseIntSafe(String s, int def) {
        try {
            return Integer.parseInt(s.trim());
        } catch (Exception e) {
            return def;
        }
    }

    /** Разбирает JSON письма в Mail (используется и для одиночного, и для batch-ответа). */
    private static Mail parseMessage(String id, String json) throws IOException {
        Mail mail = new Mail();
        mail.id = id;
        try {
            JSONObject obj = new JSONObject(json);
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
                    for (int i = 0; i < headers.length; i++) {
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
            throw new IOException("не удалось разобрать письмо " + id + ": " + e.getMessage(), e);
        }
        return mail;
    }

    /** Рекурсивно ищет text/plain (иначе text/html) в MIME-структуре. */
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

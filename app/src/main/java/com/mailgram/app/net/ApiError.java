package com.mailgram.app.net;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разбирает ответ Google на понятный текст и подсказывает, что делать.
 *
 * <p>Раньше любая ошибка синхронизации показывалась как «сеть недоступна», хотя чаще всего
 * сеть как раз в порядке: Google отвечает 403 и объясняет причину в теле ответа
 * (выключенный Gmail API, нехватка прав у токена, лимит запросов). Теперь приложение
 * показывает именно то, что сказал Google, и даёт кнопку для решения.</p>
 */
public final class ApiError {

    /** Что делать пользователю. */
    public static final int ACTION_NONE = 0;
    /** Включить Gmail API в проекте (403 SERVICE_DISABLED). */
    public static final int ACTION_ENABLE_GMAIL_API = 1;
    /** Перевыдать права: войти заново и разрешить доступ к Gmail. */
    public static final int ACTION_REAUTH = 2;
    /** Лимит запросов — просто подождать. */
    public static final int ACTION_WAIT = 3;

    public static final class Info {
        public int httpCode;
        public String googleStatus = "";
        public String googleMessage = "";
        public String reason = "";
        public String projectId = "";
        public int action = ACTION_NONE;
        public String title = "Ошибка Google";
        public String text = "";
        public String url = "";
        /** Полный текст ответа Google — его можно скопировать и показать разработчику. */
        public String raw = "";
    }

    private static final Pattern PROJECT = Pattern.compile("project\\s+([0-9]+)");

    private ApiError() {
    }

    public static Info parse(Throwable throwable) {
        Info info = new Info();
        if (throwable == null) {
            info.text = "неизвестная ошибка";
            return info;
        }
        String message = throwable.getMessage() == null ? "" : throwable.getMessage();
        info.raw = message;
        if (throwable instanceof Http.HttpException) {
            Http.HttpException http = (Http.HttpException) throwable;
            info.httpCode = http.code;
            info.raw = http.body == null || http.body.isEmpty() ? message : http.body;
            fillFromJson(info, http.body);
        } else if (throwable instanceof IOException) {
            info.title = "Нет связи с Google";
            info.text = "Проверьте интернет и попробуйте снова.\n\n" + message;
            return info;
        }
        fillFromText(info, info.raw + " " + message);
        if (info.text.isEmpty()) {
            info.text = info.httpCode > 0 ? "Google ответил HTTP " + info.httpCode + ".\n\n" + info.raw : message;
        }
        return info;
    }

    private static void fillFromJson(Info info, String body) {
        if (body == null || body.trim().isEmpty()) return;
        try {
            JSONObject obj = new JSONObject(body);
            JSONObject error = obj.optJSONObject("error");
            JSONObject source = error == null ? obj : error;
            info.googleStatus = source.optString("status", "");
            info.googleMessage = source.optString("message", "");
            JSONArray errors = source.optJSONArray("errors");
            if (errors != null && errors.length() > 0) {
                JSONObject first = errors.optJSONObject(0);
                if (first != null) {
                    info.reason = first.optString("reason", "");
                    if (info.googleMessage.isEmpty()) info.googleMessage = first.optString("message", "");
                }
            }
        } catch (Exception ignored) {
            // ответ не JSON — разберём по тексту
        }
    }

    private static void fillFromText(Info info, String haystack) {
        String lower = haystack == null ? "" : haystack.toLowerCase(java.util.Locale.US);

        if (lower.contains("has not been used in project") || lower.contains("service_disabled")
                || lower.contains("accessnotconfigured") || lower.contains("is disabled")) {
            info.action = ACTION_ENABLE_GMAIL_API;
            info.title = "Gmail API выключен в проекте Google";
            Matcher m = PROJECT.matcher(haystack == null ? "" : haystack);
            if (m.find()) info.projectId = m.group(1);
            info.url = info.projectId.isEmpty()
                    ? "https://console.cloud.google.com/apis/library/gmail.googleapis.com"
                    : "https://console.developers.google.com/apis/api/gmail.googleapis.com/overview?project="
                      + info.projectId;
            info.text = "Google отвечает: Gmail API не включён" + (info.projectId.isEmpty()
                    ? " в проекте." : " в проекте " + info.projectId + ".")
                    + "\n\nВключите его — это разовая галочка:\n"
                    + (info.projectId.isEmpty() ? "APIs & Services → Library → Gmail API → Enable."
                                                : "кнопка ниже откроет нужную страницу.")
                    + "\n\nЧто сказал Google:\n" + shorten(info.googleMessage.isEmpty() ? haystack : info.googleMessage);
            return;
        }
        if (lower.contains("insufficient authentication scopes") || lower.contains("access_token_scope_insufficient")
                || lower.contains("insufficientpermissions") || lower.contains("scope_insufficient")) {
            info.action = ACTION_REAUTH;
            info.title = "Токену не хватает прав на Gmail";
            info.text = "Вход выполнен без доступа к Gmail (нужен scope gmail.modify).\n\n"
                    + "Выйдите из аккаунта и войдите заново, на экране согласия отметив доступ к Gmail "
                    + "(«Чтение, создание, отправка и удаление писем»).\n\n"
                    + "Ответ Google:\n" + shorten(info.googleMessage.isEmpty() ? haystack : info.googleMessage);
            return;
        }
        if (lower.contains("rate limit") || lower.contains("rateLimitExceeded".toLowerCase(java.util.Locale.US))
                || lower.contains("userratelimitexceeded") || lower.contains("quota")) {
            info.action = ACTION_WAIT;
            info.title = "Google ограничил частоту запросов";
            info.text = "Лимит на минуту исчерпан. Подождите 30–60 секунд — синхронизация повторится сама.\n\n"
                    + "Ответ Google:\n" + shorten(info.googleMessage.isEmpty() ? haystack : info.googleMessage);
            return;
        }
        if (lower.contains("invalid_grant") || lower.contains("invalid credentials")
                || lower.contains("401")) {
            info.action = ACTION_REAUTH;
            info.title = "Нужно войти заново";
            info.text = "Google больше не принимает сохранённый токен (истёк или отозван).\n\n"
                    + "Выйдите из аккаунта и войдите заново.\n\n"
                    + "Ответ Google:\n" + shorten(info.googleMessage.isEmpty() ? haystack : info.googleMessage);
            return;
        }
        if (info.httpCode == 403) {
            info.title = "Google запретил запрос (403)";
            info.text = "Ответ Google:\n" + shorten(info.googleMessage.isEmpty() ? haystack : info.googleMessage);
        }
    }

    private static String shorten(String text) {
        if (text == null) return "";
        String flat = text.replace('\n', ' ').replace('\r', ' ').trim();
        while (flat.contains("  ")) flat = flat.replace("  ", " ");
        return flat.length() > 400 ? flat.substring(0, 400) + "…" : flat;
    }

    /** Короткая строка для списка/тоста (имя метода не может быть ключевым словом Java). */
    public static String shortText(Throwable throwable) {
        try {
            Info info = parse(throwable);
            return info.title + (info.googleMessage.isEmpty() ? "" : ": " + shorten(info.googleMessage));
        } catch (Throwable error) {
            // разбор ошибки не должен становиться новой ошибкой (в т.ч. на пустом cause)
            return throwable == null ? "неизвестная ошибка"
                    : String.valueOf(throwable.getMessage() == null
                            ? throwable.getClass().getSimpleName() : throwable.getMessage());
        }
    }
}

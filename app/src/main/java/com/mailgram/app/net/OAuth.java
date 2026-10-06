package com.mailgram.app.net;

import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.NativeCrypto;

import org.json.JSONObject;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * OAuth 2.0 (Authorization Code + PKCE, RFC 7636) — без серверной части и без
 * client secret: публичный клиент не имеет секретов по определению.
 */
public final class OAuth {

    public static final String AUTH_ENDPOINT = "https://accounts.google.com/o/oauth2/v2/auth";
    public static final String TOKEN_ENDPOINT = "https://oauth2.googleapis.com/token";
    public static final String REVOKE_ENDPOINT = "https://oauth2.googleapis.com/revoke";
    public static final String USERINFO_ENDPOINT = "https://openidconnect.googleapis.com/v1/userinfo";

    /**
     * Минимальные права: адрес, а также чтение/отправка/разметка писем.
     * Права на удаление писем нет.
     */
    public static final String SCOPE = "openid email https://www.googleapis.com/auth/gmail.modify";

    /** Схема redirect для Android-клиента: com.googleusercontent.apps.<id>:/oauth2redirect */
    public static final String ANDROID_REDIRECT_SUFFIX = ":/oauth2redirect";
    public static final String ANDROID_SCHEME_PREFIX = "com.googleusercontent.apps.";

    private OAuth() {
    }

    public static String randomVerifier() {
        return B64.str(NativeCrypto.random(32));
    }

    public static String challenge(String verifier) {
        return B64.str(NativeCrypto.sha256(B64.utf8(verifier)));
    }

    public static String randomState() {
        return B64.str(NativeCrypto.random(16));
    }

    public static String redirectForAndroidClient(String clientId) {
        String id = clientId == null ? "" : clientId.trim();
        String suffix = id.endsWith(".apps.googleusercontent.com")
                ? id.substring(0, id.length() - ".apps.googleusercontent.com".length())
                : id;
        return ANDROID_SCHEME_PREFIX + suffix + ANDROID_REDIRECT_SUFFIX;
    }

    public static String androidScheme(String clientId) {
        String uri = redirectForAndroidClient(clientId);
        return uri.substring(0, uri.indexOf(":/"));
    }

    public static String authUrl(String clientId, String redirectUri, String state,
                                 String verifier, String loginHint) {
        StringBuilder sb = new StringBuilder(AUTH_ENDPOINT);
        sb.append("?client_id=").append(enc(clientId));
        sb.append("&redirect_uri=").append(enc(redirectUri));
        sb.append("&response_type=code");
        sb.append("&scope=").append(enc(SCOPE));
        sb.append("&code_challenge=").append(enc(challenge(verifier)));
        sb.append("&code_challenge_method=S256");
        sb.append("&state=").append(enc(state));
        sb.append("&access_type=offline");
        sb.append("&prompt=consent");
        sb.append("&include_granted_scopes=true");
        sb.append("&hl=ru");
        if (loginHint != null && !loginHint.isEmpty()) {
            sb.append("&login_hint=").append(enc(loginHint));
        }
        return sb.toString();
    }

    public static final class Tokens {
        public String accessToken = "";
        public String refreshToken = "";
        public long expiresAt; // мс epoch
        public String scope = "";
        public String idToken = "";

        public boolean isValid() {
            return accessToken != null && !accessToken.isEmpty()
                    && expiresAt > System.currentTimeMillis() + 60_000L;
        }
    }

    private static Tokens parse(String json, String oldRefresh) throws Exception {
        JSONObject obj = new JSONObject(json);
        if (obj.has("error")) {
            throw new IllegalStateException(obj.optString("error") + ": " + obj.optString("error_description"));
        }
        Tokens t = new Tokens();
        t.accessToken = obj.optString("access_token", "");
        t.refreshToken = obj.optString("refresh_token", oldRefresh == null ? "" : oldRefresh);
        long expiresIn = obj.optLong("expires_in", 3600L);
        t.expiresAt = System.currentTimeMillis() + expiresIn * 1000L - 30_000L;
        t.scope = obj.optString("scope", "");
        t.idToken = obj.optString("id_token", "");
        return t;
    }

    public static Tokens exchangeCode(String clientId, String code, String verifier, String redirectUri)
            throws Exception {
        String form = "client_id=" + enc(clientId)
                + "&code=" + enc(code)
                + "&code_verifier=" + enc(verifier)
                + "&grant_type=authorization_code"
                + "&redirect_uri=" + enc(redirectUri);
        return parse(Http.postForm(TOKEN_ENDPOINT, form), null);
    }

    public static Tokens refresh(String clientId, String refreshToken) throws Exception {
        String form = "client_id=" + enc(clientId)
                + "&refresh_token=" + enc(refreshToken)
                + "&grant_type=refresh_token";
        return parse(Http.postForm(TOKEN_ENDPOINT, form), refreshToken);
    }

    public static void revoke(String token) throws Exception {
        Http.postForm(REVOKE_ENDPOINT, "token=" + enc(token));
    }

    /** Адрес аккаунта по access-токену (scope email/openid). */
    public static String userEmail(String accessToken) throws Exception {
        String json = Http.get(USERINFO_ENDPOINT, accessToken);
        JSONObject obj = new JSONObject(json);
        String email = obj.optString("email", "");
        if (email.isEmpty()) throw new IllegalStateException("Google не вернул адрес аккаунта");
        return email;
    }

    private static String enc(String s) {
        return URLEncoder.encode(s == null ? "" : s, StandardCharsets.UTF_8);
    }
}

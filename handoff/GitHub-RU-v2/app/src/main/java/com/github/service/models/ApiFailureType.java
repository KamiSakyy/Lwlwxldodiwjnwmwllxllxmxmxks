package com.github.service.models;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ApiFailureType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ApiFailureType[] $VALUES;
    public static final ApiFailureType NO_NETWORK = new ApiFailureType("NO_NETWORK", 0);
    public static final ApiFailureType RESPONSE_ERROR = new ApiFailureType("RESPONSE_ERROR", 1);
    public static final ApiFailureType HTTP_ERROR = new ApiFailureType("HTTP_ERROR", 2);
    public static final ApiFailureType SERVER_ERROR = new ApiFailureType("SERVER_ERROR", 3);
    public static final ApiFailureType PARSE_ERROR = new ApiFailureType("PARSE_ERROR", 4);
    public static final ApiFailureType CANCELED = new ApiFailureType("CANCELED", 5);
    public static final ApiFailureType UNAUTHORIZED = new ApiFailureType("UNAUTHORIZED", 6);
    public static final ApiFailureType INSUFFICIENT_SCOPES = new ApiFailureType("INSUFFICIENT_SCOPES", 7);
    public static final ApiFailureType TRADE_CONTROLS = new ApiFailureType("TRADE_CONTROLS", 8);
    public static final ApiFailureType NOT_FOUND = new ApiFailureType("NOT_FOUND", 9);
    public static final ApiFailureType SAML = new ApiFailureType("SAML", 10);
    public static final ApiFailureType IP_ALLOW_LIST = new ApiFailureType("IP_ALLOW_LIST", 11);
    public static final ApiFailureType UNKNOWN = new ApiFailureType("UNKNOWN", 12);
    public static final ApiFailureType SERVER_VERSION = new ApiFailureType("SERVER_VERSION", 13);
    public static final ApiFailureType UNSUPPORTED = new ApiFailureType("UNSUPPORTED", 14);
    public static final ApiFailureType TWO_FACTOR = new ApiFailureType("TWO_FACTOR", 15);
    public static final ApiFailureType ALIVE_IO = new ApiFailureType("ALIVE_IO", 16);
    public static final ApiFailureType OAUTH_ERROR = new ApiFailureType("OAUTH_ERROR", 17);
    public static final ApiFailureType NO_ROOT_COMMIT = new ApiFailureType("NO_ROOT_COMMIT", 18);
    public static final ApiFailureType SSL_ERROR = new ApiFailureType("SSL_ERROR", 19);
    public static final ApiFailureType UNKNOWN_IO = new ApiFailureType("UNKNOWN_IO", 20);
    public static final ApiFailureType EXPIRED_CHECK_LOG_URL = new ApiFailureType("EXPIRED_CHECK_LOG_URL", 21);

    private static final /* synthetic */ ApiFailureType[] $values() {
        return new ApiFailureType[]{NO_NETWORK, RESPONSE_ERROR, HTTP_ERROR, SERVER_ERROR, PARSE_ERROR, CANCELED, UNAUTHORIZED, INSUFFICIENT_SCOPES, TRADE_CONTROLS, NOT_FOUND, SAML, IP_ALLOW_LIST, UNKNOWN, SERVER_VERSION, UNSUPPORTED, TWO_FACTOR, ALIVE_IO, OAUTH_ERROR, NO_ROOT_COMMIT, SSL_ERROR, UNKNOWN_IO, EXPIRED_CHECK_LOG_URL};
    }

    static {
        ApiFailureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ApiFailureType(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ApiFailureType valueOf(String str) {
        return (ApiFailureType) Enum.valueOf(ApiFailureType.class, str);
    }

    public static ApiFailureType[] values() {
        return (ApiFailureType[]) $VALUES.clone();
    }
}

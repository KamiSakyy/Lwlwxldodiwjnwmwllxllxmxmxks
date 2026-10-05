package dn;

import com.github.service.models.ApiFailureType;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract /* synthetic */ class a0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ApiFailureType.values().length];
        try {
            iArr[ApiFailureType.NO_NETWORK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApiFailureType.HTTP_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApiFailureType.EXPIRED_CHECK_LOG_URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApiFailureType.CANCELED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ApiFailureType.RESPONSE_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ApiFailureType.SERVER_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ApiFailureType.PARSE_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ApiFailureType.OAUTH_ERROR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ApiFailureType.UNAUTHORIZED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ApiFailureType.TRADE_CONTROLS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ApiFailureType.SAML.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ApiFailureType.IP_ALLOW_LIST.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ApiFailureType.UNKNOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ApiFailureType.SERVER_VERSION.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ApiFailureType.UNSUPPORTED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[ApiFailureType.INSUFFICIENT_SCOPES.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[ApiFailureType.ALIVE_IO.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[ApiFailureType.NOT_FOUND.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[ApiFailureType.NO_ROOT_COMMIT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[ApiFailureType.SSL_ERROR.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[ApiFailureType.UNKNOWN_IO.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[ApiFailureType.TWO_FACTOR.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        a = iArr;
    }
}

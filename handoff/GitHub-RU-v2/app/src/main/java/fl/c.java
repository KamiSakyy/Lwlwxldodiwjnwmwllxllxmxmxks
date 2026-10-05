package fl;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;
    public static final c I;
    public static final c J;
    public static final c K;
    public static final c L;
    public static final /* synthetic */ c[] M;
    public static final c r;
    public static final c s;
    public static final c t;
    public static final c u;
    public static final c v;
    public static final c w;
    public static final c x;
    public static final c y;
    public static final c z;

    static {
        c cVar = new c("NO_NETWORK", 0);
        r = cVar;
        c cVar2 = new c("RESPONSE_ERROR", 1);
        s = cVar2;
        c cVar3 = new c("HTTP_ERROR", 2);
        t = cVar3;
        c cVar4 = new c("SERVER_ERROR", 3);
        u = cVar4;
        c cVar5 = new c("PARSE_ERROR", 4);
        v = cVar5;
        c cVar6 = new c("CANCELED", 5);
        w = cVar6;
        c cVar7 = new c("UNAUTHORIZED", 6);
        x = cVar7;
        c cVar8 = new c("INSUFFICIENT_SCOPES", 7);
        y = cVar8;
        c cVar9 = new c("TRADE_CONTROLS", 8);
        z = cVar9;
        c cVar10 = new c("NOT_FOUND", 9);
        A = cVar10;
        c cVar11 = new c("SAML", 10);
        B = cVar11;
        c cVar12 = new c("IP_ALLOW_LIST", 11);
        C = cVar12;
        c cVar13 = new c("UNKNOWN", 12);
        D = cVar13;
        c cVar14 = new c("SERVER_VERSION", 13);
        E = cVar14;
        c cVar15 = new c("UNSUPPORTED", 14);
        F = cVar15;
        c cVar16 = new c("TWO_FACTOR", 15);
        G = cVar16;
        c cVar17 = new c("ALIVE_IO", 16);
        H = cVar17;
        c cVar18 = new c("OAUTH_ERROR", 17);
        I = cVar18;
        c cVar19 = new c("SSL_ERROR", 18);
        J = cVar19;
        c cVar20 = new c("UNKNOWN_IO", 19);
        K = cVar20;
        c cVar21 = new c("EXPIRED_CHECK_LOG_URL", 20);
        L = cVar21;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21};
        M = cVarArr;
        l0.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) M.clone();
    }
}

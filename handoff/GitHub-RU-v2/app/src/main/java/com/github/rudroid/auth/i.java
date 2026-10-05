package com.github.rudroid.auth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class i {
    public static final i A;
    public static final i B;
    public static final i C;
    public static final /* synthetic */ i[] D;

    /* renamed from: r, reason: collision with root package name */
    public static final i f8541r;

    /* renamed from: s, reason: collision with root package name */
    public static final i f8542s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f8543t;

    /* renamed from: u, reason: collision with root package name */
    public static final i f8544u;

    /* renamed from: v, reason: collision with root package name */
    public static final i f8545v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f8546w;

    /* renamed from: x, reason: collision with root package name */
    public static final i f8547x;

    /* renamed from: y, reason: collision with root package name */
    public static final i f8548y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f8549z;

    static {
        i iVar = new i("NULL_AUTH_RESPONSE_FROM_INTENT", 0);
        f8541r = iVar;
        i iVar2 = new i("INVALID_AUTH_CODE_FROM_INTENT", 1);
        f8542s = iVar2;
        i iVar3 = new i("INVALID_AUTH_STATE_FROM_INTENT", 2);
        f8543t = iVar3;
        i iVar4 = new i("OAUTH_EXCEPTION_FROM_INTENT", 3);
        f8544u = iVar4;
        i iVar5 = new i("FETCH_ACCESS_TOKEN", 4);
        f8545v = iVar5;
        i iVar6 = new i("SERVER_VERIFICATION", 5);
        f8546w = iVar6;
        i iVar7 = new i("USER_VERIFICATION", 6);
        f8547x = iVar7;
        i iVar8 = new i("GRAPHQL_VERIFICATION", 7);
        i iVar9 = new i("ACCOUNT_INFORMATION", 8);
        f8548y = iVar9;
        i iVar10 = new i("CAPABILITIES", 9);
        f8549z = iVar10;
        i iVar11 = new i("ACCOUNT_MANAGER_SECURITY_EXCEPTION", 10);
        i iVar12 = new i("TWO_FACTOR_SECURITY_EXCEPTION", 11);
        A = iVar12;
        i iVar13 = new i("CREATE_USER_LOCALLY", 12);
        B = iVar13;
        i iVar14 = new i("LOGIN_REVIEW_LAB_FAILED", 13);
        C = iVar14;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14};
        D = iVarArr;
        v8.l0.t(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) D.clone();
    }
}

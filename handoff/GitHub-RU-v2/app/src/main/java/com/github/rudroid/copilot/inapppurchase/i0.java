package com.github.rudroid.copilot.inapppurchase;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class i0 {

    /* renamed from: r, reason: collision with root package name */
    public static final i0 f9698r;

    /* renamed from: s, reason: collision with root package name */
    public static final i0 f9699s;

    /* renamed from: t, reason: collision with root package name */
    public static final i0 f9700t;

    /* renamed from: u, reason: collision with root package name */
    public static final i0 f9701u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ i0[] f9702v;

    static {
        i0 i0Var = new i0("ACKNOWLEDGE_PURCHASE_ERROR", 0);
        f9698r = i0Var;
        i0 i0Var2 = new i0("EXISTING_PURCHASE_NOT_FOUND_ERROR", 1);
        f9699s = i0Var2;
        i0 i0Var3 = new i0("ACTIVATE_PURCHASE_ON_SERVER_ERROR", 2);
        f9700t = i0Var3;
        i0 i0Var4 = new i0("OFFER_TOKEN_NOT_FOUND_ERROR", 3);
        f9701u = i0Var4;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4};
        f9702v = i0VarArr;
        v8.l0.t(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f9702v.clone();
    }

    public static com.github.rudroid.copilot.inapppurchase.i0 r;
}

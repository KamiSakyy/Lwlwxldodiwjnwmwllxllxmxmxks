package com.github.rudroid.copilot.inapppurchase;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class j0 {

    /* renamed from: r, reason: collision with root package name */
    public static final j0 f9708r;

    /* renamed from: s, reason: collision with root package name */
    public static final j0 f9709s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ j0[] f9710t;

    static {
        j0 j0Var = new j0("RESTORE_PURCHASE_LOADING", 0);
        f9708r = j0Var;
        j0 j0Var2 = new j0("ACTIVATE_PURCHASE_LOADING", 1);
        f9709s = j0Var2;
        j0[] j0VarArr = {j0Var, j0Var2};
        f9710t = j0VarArr;
        v8.l0.t(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f9710t.clone();
    }
}

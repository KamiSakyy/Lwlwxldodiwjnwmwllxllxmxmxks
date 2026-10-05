package com.github.rudroid.copilot.inapppurchase;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class k0 {

    /* renamed from: r, reason: collision with root package name */
    public static final k0 f9712r;

    /* renamed from: s, reason: collision with root package name */
    public static final k0 f9713s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ k0[] f9714t;

    static {
        k0 k0Var = new k0("PURCHASED", 0);
        f9712r = k0Var;
        k0 k0Var2 = new k0("RESTORED", 1);
        f9713s = k0Var2;
        k0[] k0VarArr = {k0Var, k0Var2};
        f9714t = k0VarArr;
        v8.l0.t(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f9714t.clone();
    }
}

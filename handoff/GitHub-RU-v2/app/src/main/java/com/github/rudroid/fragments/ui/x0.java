package com.github.rudroid.fragments.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class x0 {

    /* renamed from: r, reason: collision with root package name */
    public static final x0 f14744r;

    /* renamed from: s, reason: collision with root package name */
    public static final x0 f14745s;

    /* renamed from: t, reason: collision with root package name */
    public static final x0 f14746t;

    /* renamed from: u, reason: collision with root package name */
    public static final x0 f14747u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ x0[] f14748v;

    static {
        x0 x0Var = new x0("MARK_AS_READ", 0);
        f14744r = x0Var;
        x0 x0Var2 = new x0("MARK_AS_UNREAD", 1);
        f14745s = x0Var2;
        x0 x0Var3 = new x0("MARK_AS_DONE", 2);
        f14746t = x0Var3;
        x0 x0Var4 = new x0("MARK_AS_UNDONE", 3);
        f14747u = x0Var4;
        x0[] x0VarArr = {x0Var, x0Var2, x0Var3, x0Var4};
        f14748v = x0VarArr;
        v8.l0.t(x0VarArr);
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f14748v.clone();
    }
}

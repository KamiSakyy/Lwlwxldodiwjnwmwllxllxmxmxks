package com.github.rudroid.settings.copilot.paywall.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public static final h0 r;
    public static final h0 s;
    public static final h0 t;
    public static final h0 u;
    public static final /* synthetic */ h0[] v;

    static {
        h0 h0Var = new h0("INCLUDED", 0);
        r = h0Var;
        h0 h0Var2 = new h0("NOT_INCLUDED", 1);
        s = h0Var2;
        h0 h0Var3 = new h0("TBD", 2);
        t = h0Var3;
        h0 h0Var4 = new h0("INFINITE", 3);
        u = h0Var4;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4};
        v = h0VarArr;
        v8.l0.t(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) v.clone();
    }
    public Object ordinal() { return null; }
}

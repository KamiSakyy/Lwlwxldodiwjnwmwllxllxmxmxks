package com.github.rudroid.uitoolkit.swipetodismiss;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public static final h0 r;
    public static final h0 s;
    public static final h0 t;
    public static final /* synthetic */ h0[] u;

    static {
        h0 h0Var = new h0("StartToEnd", 0);
        r = h0Var;
        h0 h0Var2 = new h0("EndToStart", 1);
        s = h0Var2;
        h0 h0Var3 = new h0("Settled", 2);
        t = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        u = h0VarArr;
        v8.l0.t(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) u.clone();
    }
}

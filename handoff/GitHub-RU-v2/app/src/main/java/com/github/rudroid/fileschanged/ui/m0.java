package com.github.rudroid.fileschanged.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class m0 {

    /* renamed from: r, reason: collision with root package name */
    public static final m0 f13548r;

    /* renamed from: s, reason: collision with root package name */
    public static final m0 f13549s;

    /* renamed from: t, reason: collision with root package name */
    public static final m0 f13550t;

    /* renamed from: u, reason: collision with root package name */
    public static final m0 f13551u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ m0[] f13552v;

    static {
        m0 m0Var = new m0("UP", 0);
        f13548r = m0Var;
        m0 m0Var2 = new m0("DOWN", 1);
        f13549s = m0Var2;
        m0 m0Var3 = new m0("BOTH", 2);
        f13550t = m0Var3;
        m0 m0Var4 = new m0("NONE", 3);
        f13551u = m0Var4;
        m0[] m0VarArr = {m0Var, m0Var2, m0Var3, m0Var4};
        f13552v = m0VarArr;
        v8.l0.t(m0VarArr);
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f13552v.clone();
    }

    public static com.github.rudroid.fileschanged.ui.m0 t;

    public static com.github.rudroid.fileschanged.ui.m0 s;

    public static Object t;
}

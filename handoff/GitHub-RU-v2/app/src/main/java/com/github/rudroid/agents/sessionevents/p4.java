package com.github.rudroid.agents.sessionevents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class p4 {

    /* renamed from: r, reason: collision with root package name */
    public static final p4 f7771r;

    /* renamed from: s, reason: collision with root package name */
    public static final p4 f7772s;

    /* renamed from: t, reason: collision with root package name */
    public static final p4 f7773t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ p4[] f7774u;

    static {
        p4 p4Var = new p4("PR_MERGED", 0);
        f7771r = p4Var;
        p4 p4Var2 = new p4("BLOCKED", 1);
        f7772s = p4Var2;
        p4 p4Var3 = new p4("BLOCKED_CLI", 2);
        f7773t = p4Var3;
        p4[] p4VarArr = {p4Var, p4Var2, p4Var3};
        f7774u = p4VarArr;
        v8.l0.t(p4VarArr);
    }

    public static p4 valueOf(String str) {
        return (p4) Enum.valueOf(p4.class, str);
    }

    public static p4[] values() {
        return (p4[]) f7774u.clone();
    }
}

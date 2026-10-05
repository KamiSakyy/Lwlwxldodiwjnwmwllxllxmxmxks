package com.google.android.gms.measurement.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 {
    public static final a4 r;
    public static final a4 s;
    public static final /* synthetic */ a4[] t;

    static {
        a4 a4Var = new a4("CONSENT", 0);
        r = a4Var;
        a4 a4Var2 = new a4("LEGITIMATE_INTEREST", 1);
        a4 a4Var3 = new a4("FLEXIBLE_CONSENT", 2);
        a4 a4Var4 = new a4("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        s = a4Var4;
        t = new a4[]{a4Var, a4Var2, a4Var3, a4Var4};
    }

    public static a4[] values() {
        return (a4[]) t.clone();
    }
}

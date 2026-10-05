package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l8 implements k8 {
    public static final m4 a;
    public static final m4 b;
    public static final m4 c;
    public static final m4 d;
    public static final m4 e;
    public static final m4 f;

    static {
        n4 n4Var = new n4(l4.a(), true, true);
        a = n4Var.t("measurement.test.boolean_flag", false);
        b = n4Var.s("measurement.test.cached_long_flag", -1L);
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = m4.g;
        c = new m4(n4Var, "measurement.test.double_flag", valueOf, 2);
        d = n4Var.s("measurement.test.int_flag", -2L);
        e = n4Var.s("measurement.test.long_flag", -1L);
        f = n4Var.u("measurement.test.string_flag", "---");
    }
}

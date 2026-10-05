package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q7 implements p7 {
    public static final m4 a;
    public static final m4 b;

    static {
        n4 n4Var = new n4(l4.a(), true, true);
        n4Var.t("measurement.collection.event_safelist", true);
        a = n4Var.t("measurement.service.store_null_safelist", true);
        b = n4Var.t("measurement.service.store_safelist", true);
    }
}

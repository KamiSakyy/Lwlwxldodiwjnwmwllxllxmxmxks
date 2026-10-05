package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h7 implements g7 {
    public static final m4 a;
    public static final m4 b;

    static {
        n4 n4Var = new n4(l4.a(), true, true);
        n4Var.t("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        n4Var.t("measurement.set_default_event_parameters_with_backfill.service", true);
        n4Var.s("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        a = n4Var.t("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = n4Var.t("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        n4Var.t("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}

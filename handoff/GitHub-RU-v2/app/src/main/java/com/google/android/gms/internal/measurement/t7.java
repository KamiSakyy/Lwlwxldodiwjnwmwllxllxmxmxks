package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t7 implements s7 {
    public static final m4 a;
    public static final m4 b;
    public static final m4 c;

    static {
        n4 n4Var = new n4(l4.a(), true, true);
        n4Var.t("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = n4Var.t("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = n4Var.t("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = n4Var.t("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}

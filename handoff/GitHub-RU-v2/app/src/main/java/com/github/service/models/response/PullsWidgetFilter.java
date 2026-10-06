package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullsWidgetFilter {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ PullsWidgetFilter[] $VALUES;
    public static final PullsWidgetFilter CREATED = new PullsWidgetFilter("CREATED", 0);
    public static final PullsWidgetFilter REVIEW_REQUESTED = new PullsWidgetFilter("REVIEW_REQUESTED", 1);
    public static final PullsWidgetFilter ASSIGNED = new PullsWidgetFilter("ASSIGNED", 2);
    public static final PullsWidgetFilter MENTIONED = new PullsWidgetFilter("MENTIONED", 3);

    private static final /* synthetic */ PullsWidgetFilter[] $values() {
        return new PullsWidgetFilter[]{CREATED, REVIEW_REQUESTED, ASSIGNED, MENTIONED};
    }

    static {
        PullsWidgetFilter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private PullsWidgetFilter(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static PullsWidgetFilter valueOf(String str) {
        return (PullsWidgetFilter) Enum.valueOf(PullsWidgetFilter.class, str);
    }

    public static PullsWidgetFilter[] values() {
        return (PullsWidgetFilter[]) $VALUES.clone();
    }

    public <T0> T0 name(Object... a) {
        return null;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

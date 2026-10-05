package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class TimelineItem$LinkedItemConnectorType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ TimelineItem$LinkedItemConnectorType[] $VALUES;
    public static final TimelineItem$LinkedItemConnectorType LINKED = new TimelineItem$LinkedItemConnectorType("LINKED", 0);
    public static final TimelineItem$LinkedItemConnectorType UNLINKED = new TimelineItem$LinkedItemConnectorType("UNLINKED", 1);

    private static final /* synthetic */ TimelineItem$LinkedItemConnectorType[] $values() {
        return new TimelineItem$LinkedItemConnectorType[]{LINKED, UNLINKED};
    }

    static {
        TimelineItem$LinkedItemConnectorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private TimelineItem$LinkedItemConnectorType(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static TimelineItem$LinkedItemConnectorType valueOf(String str) {
        return (TimelineItem$LinkedItemConnectorType) Enum.valueOf(TimelineItem$LinkedItemConnectorType.class, str);
    }

    public static TimelineItem$LinkedItemConnectorType[] values() {
        return (TimelineItem$LinkedItemConnectorType[]) $VALUES.clone();
    }
}

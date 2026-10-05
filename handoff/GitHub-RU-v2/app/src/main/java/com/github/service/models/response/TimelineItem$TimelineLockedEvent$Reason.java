package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class TimelineItem$TimelineLockedEvent$Reason {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ TimelineItem$TimelineLockedEvent$Reason[] $VALUES;
    public static final TimelineItem$TimelineLockedEvent$Reason OFF_TOPIC = new TimelineItem$TimelineLockedEvent$Reason("OFF_TOPIC", 0);
    public static final TimelineItem$TimelineLockedEvent$Reason TOO_HEATED = new TimelineItem$TimelineLockedEvent$Reason("TOO_HEATED", 1);
    public static final TimelineItem$TimelineLockedEvent$Reason RESOLVED = new TimelineItem$TimelineLockedEvent$Reason("RESOLVED", 2);
    public static final TimelineItem$TimelineLockedEvent$Reason SPAM = new TimelineItem$TimelineLockedEvent$Reason("SPAM", 3);
    public static final TimelineItem$TimelineLockedEvent$Reason UNKNOWN = new TimelineItem$TimelineLockedEvent$Reason("UNKNOWN", 4);

    private static final /* synthetic */ TimelineItem$TimelineLockedEvent$Reason[] $values() {
        return new TimelineItem$TimelineLockedEvent$Reason[]{OFF_TOPIC, TOO_HEATED, RESOLVED, SPAM, UNKNOWN};
    }

    static {
        TimelineItem$TimelineLockedEvent$Reason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private TimelineItem$TimelineLockedEvent$Reason(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static TimelineItem$TimelineLockedEvent$Reason valueOf(String str) {
        return (TimelineItem$TimelineLockedEvent$Reason) Enum.valueOf(TimelineItem$TimelineLockedEvent$Reason.class, str);
    }

    public static TimelineItem$TimelineLockedEvent$Reason[] values() {
        return (TimelineItem$TimelineLockedEvent$Reason[]) $VALUES.clone();
    }
}

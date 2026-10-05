package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class TimelineItem$TimelinePullRequestReview$ReviewState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ TimelineItem$TimelinePullRequestReview$ReviewState[] $VALUES;
    public static final TimelineItem$TimelinePullRequestReview$ReviewState PENDING = new TimelineItem$TimelinePullRequestReview$ReviewState("PENDING", 0);
    public static final TimelineItem$TimelinePullRequestReview$ReviewState COMMENTED = new TimelineItem$TimelinePullRequestReview$ReviewState("COMMENTED", 1);
    public static final TimelineItem$TimelinePullRequestReview$ReviewState APPROVED = new TimelineItem$TimelinePullRequestReview$ReviewState("APPROVED", 2);
    public static final TimelineItem$TimelinePullRequestReview$ReviewState CHANGES_REQUESTED = new TimelineItem$TimelinePullRequestReview$ReviewState("CHANGES_REQUESTED", 3);
    public static final TimelineItem$TimelinePullRequestReview$ReviewState DISMISSED = new TimelineItem$TimelinePullRequestReview$ReviewState("DISMISSED", 4);
    public static final TimelineItem$TimelinePullRequestReview$ReviewState UNKNOWN = new TimelineItem$TimelinePullRequestReview$ReviewState("UNKNOWN", 5);

    private static final /* synthetic */ TimelineItem$TimelinePullRequestReview$ReviewState[] $values() {
        return new TimelineItem$TimelinePullRequestReview$ReviewState[]{PENDING, COMMENTED, APPROVED, CHANGES_REQUESTED, DISMISSED, UNKNOWN};
    }

    static {
        TimelineItem$TimelinePullRequestReview$ReviewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private TimelineItem$TimelinePullRequestReview$ReviewState(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static TimelineItem$TimelinePullRequestReview$ReviewState valueOf(String str) {
        return (TimelineItem$TimelinePullRequestReview$ReviewState) Enum.valueOf(TimelineItem$TimelinePullRequestReview$ReviewState.class, str);
    }

    public static TimelineItem$TimelinePullRequestReview$ReviewState[] values() {
        return (TimelineItem$TimelinePullRequestReview$ReviewState[]) $VALUES.clone();
    }
}

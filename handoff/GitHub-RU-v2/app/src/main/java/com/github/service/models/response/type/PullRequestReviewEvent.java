package com.github.service.models.response.type;

import d71.a;
import r01.q;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestReviewEvent {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestReviewEvent[] $VALUES;
    public static final q Companion;
    private final String rawValue;
    public static final PullRequestReviewEvent COMMENT = new PullRequestReviewEvent("COMMENT", 0, "COMMENT");
    public static final PullRequestReviewEvent APPROVE = new PullRequestReviewEvent("APPROVE", 1, "APPROVE");
    public static final PullRequestReviewEvent REQUEST_CHANGES = new PullRequestReviewEvent("REQUEST_CHANGES", 2, "REQUEST_CHANGES");
    public static final PullRequestReviewEvent DISMISS = new PullRequestReviewEvent("DISMISS", 3, "DISMISS");
    public static final PullRequestReviewEvent UNKNOWN__ = new PullRequestReviewEvent("UNKNOWN__", 4, "UNKNOWN__");

    private static final /* synthetic */ PullRequestReviewEvent[] $values() {
        return new PullRequestReviewEvent[]{COMMENT, APPROVE, REQUEST_CHANGES, DISMISS, UNKNOWN__};
    }

    static {
        PullRequestReviewEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new q();
    }

    private PullRequestReviewEvent(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestReviewEvent valueOf(String str) {
        return (PullRequestReviewEvent) Enum.valueOf(PullRequestReviewEvent.class, str);
    }

    public static PullRequestReviewEvent[] values() {
        return (PullRequestReviewEvent[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

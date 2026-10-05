package com.github.service.models.response.type;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ReviewDecision {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReviewDecision[] $VALUES;
    public static final ReviewDecision CHANGES_REQUESTED = new ReviewDecision("CHANGES_REQUESTED", 0);
    public static final ReviewDecision APPROVED = new ReviewDecision("APPROVED", 1);
    public static final ReviewDecision REVIEW_REQUIRED = new ReviewDecision("REVIEW_REQUIRED", 2);
    public static final ReviewDecision UNKNOWN = new ReviewDecision("UNKNOWN", 3);

    private static final /* synthetic */ ReviewDecision[] $values() {
        return new ReviewDecision[]{CHANGES_REQUESTED, APPROVED, REVIEW_REQUIRED, UNKNOWN};
    }

    static {
        ReviewDecision[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ReviewDecision(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ReviewDecision valueOf(String str) {
        return (ReviewDecision) Enum.valueOf(ReviewDecision.class, str);
    }

    public static ReviewDecision[] values() {
        return (ReviewDecision[]) $VALUES.clone();
    }
}

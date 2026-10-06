package com.github.service.models.response.type;

import d71.a;
import r01.p;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestReviewDecision {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestReviewDecision[] $VALUES;
    public static final p Companion;
    private String rawValue;
    public static final PullRequestReviewDecision CHANGES_REQUESTED = new PullRequestReviewDecision("CHANGES_REQUESTED", 0, "CHANGES_REQUESTED");
    public static final PullRequestReviewDecision APPROVED = new PullRequestReviewDecision("APPROVED", 1, "APPROVED");
    public static final PullRequestReviewDecision REVIEW_REQUIRED = new PullRequestReviewDecision("REVIEW_REQUIRED", 2, "REVIEW_REQUIRED");
    public static final PullRequestReviewDecision UNKNOWN__ = new PullRequestReviewDecision("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ PullRequestReviewDecision[] $values() {
        return new PullRequestReviewDecision[]{CHANGES_REQUESTED, APPROVED, REVIEW_REQUIRED, UNKNOWN__};
    }

    static {
        PullRequestReviewDecision[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new p();
    }

    private PullRequestReviewDecision(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestReviewDecision valueOf(String str) {
        return (PullRequestReviewDecision) Enum.valueOf(PullRequestReviewDecision.class, str);
    }

    public static PullRequestReviewDecision[] values() {
        return (PullRequestReviewDecision[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

package com.github.service.models.response.type;

import d71.a;
import r01.o;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestReviewCommentState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestReviewCommentState[] $VALUES;
    public static final o Companion;
    public static final PullRequestReviewCommentState PENDING = new PullRequestReviewCommentState("PENDING", 0, "PENDING");
    public static final PullRequestReviewCommentState SUBMITTED = new PullRequestReviewCommentState("SUBMITTED", 1, "SUBMITTED");
    public static final PullRequestReviewCommentState UNKNOWN__ = new PullRequestReviewCommentState("UNKNOWN__", 2, "UNKNOWN__");
    private final String rawValue;

    private static final /* synthetic */ PullRequestReviewCommentState[] $values() {
        return new PullRequestReviewCommentState[]{PENDING, SUBMITTED, UNKNOWN__};
    }

    static {
        PullRequestReviewCommentState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new o();
    }

    private PullRequestReviewCommentState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestReviewCommentState valueOf(String str) {
        return (PullRequestReviewCommentState) Enum.valueOf(PullRequestReviewCommentState.class, str);
    }

    public static PullRequestReviewCommentState[] values() {
        return (PullRequestReviewCommentState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class IssueOrPullRequest$ReviewerReviewState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ IssueOrPullRequest$ReviewerReviewState[] $VALUES;
    public static final IssueOrPullRequest$ReviewerReviewState PENDING = new IssueOrPullRequest$ReviewerReviewState("PENDING", 0);
    public static final IssueOrPullRequest$ReviewerReviewState COMMENTED = new IssueOrPullRequest$ReviewerReviewState("COMMENTED", 1);
    public static final IssueOrPullRequest$ReviewerReviewState APPROVED = new IssueOrPullRequest$ReviewerReviewState("APPROVED", 2);
    public static final IssueOrPullRequest$ReviewerReviewState CHANGES_REQUESTED = new IssueOrPullRequest$ReviewerReviewState("CHANGES_REQUESTED", 3);
    public static final IssueOrPullRequest$ReviewerReviewState DISMISSED = new IssueOrPullRequest$ReviewerReviewState("DISMISSED", 4);
    public static final IssueOrPullRequest$ReviewerReviewState UNKNOWN = new IssueOrPullRequest$ReviewerReviewState("UNKNOWN", 5);

    private static final /* synthetic */ IssueOrPullRequest$ReviewerReviewState[] $values() {
        return new IssueOrPullRequest$ReviewerReviewState[]{PENDING, COMMENTED, APPROVED, CHANGES_REQUESTED, DISMISSED, UNKNOWN};
    }

    static {
        IssueOrPullRequest$ReviewerReviewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private IssueOrPullRequest$ReviewerReviewState(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static IssueOrPullRequest$ReviewerReviewState valueOf(String str) {
        return (IssueOrPullRequest$ReviewerReviewState) Enum.valueOf(IssueOrPullRequest$ReviewerReviewState.class, str);
    }

    public static IssueOrPullRequest$ReviewerReviewState[] values() {
        return (IssueOrPullRequest$ReviewerReviewState[]) $VALUES.clone();
    }
}

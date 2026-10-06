package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class IssueOrPullRequestState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ IssueOrPullRequestState[] $VALUES;
    public static final IssueOrPullRequestState PULL_REQUEST_OPEN = new IssueOrPullRequestState("PULL_REQUEST_OPEN", 0);
    public static final IssueOrPullRequestState PULL_REQUEST_CLOSED = new IssueOrPullRequestState("PULL_REQUEST_CLOSED", 1);
    public static final IssueOrPullRequestState PULL_REQUEST_MERGED = new IssueOrPullRequestState("PULL_REQUEST_MERGED", 2);
    public static final IssueOrPullRequestState PULL_REQUEST_DRAFT = new IssueOrPullRequestState("PULL_REQUEST_DRAFT", 3);
    public static final IssueOrPullRequestState ISSUE_OPEN = new IssueOrPullRequestState("ISSUE_OPEN", 4);
    public static final IssueOrPullRequestState ISSUE_CLOSED = new IssueOrPullRequestState("ISSUE_CLOSED", 5);
    public static final IssueOrPullRequestState UNKNOWN = new IssueOrPullRequestState("UNKNOWN", 6);

    private static final /* synthetic */ IssueOrPullRequestState[] $values() {
        return new IssueOrPullRequestState[]{PULL_REQUEST_OPEN, PULL_REQUEST_CLOSED, PULL_REQUEST_MERGED, PULL_REQUEST_DRAFT, ISSUE_OPEN, ISSUE_CLOSED, UNKNOWN};
    }

    static {
        IssueOrPullRequestState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private IssueOrPullRequestState(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static IssueOrPullRequestState valueOf(String str) {
        return (IssueOrPullRequestState) Enum.valueOf(IssueOrPullRequestState.class, str);
    }

    public static IssueOrPullRequestState[] values() {
        return (IssueOrPullRequestState[]) $VALUES.clone();
    }

    public static Object name(Object... a) {
        return null;
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

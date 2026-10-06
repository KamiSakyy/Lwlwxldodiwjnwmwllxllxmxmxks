package com.github.service.models.response.issueorpullrequest;

import d71.a;
import h01.g;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class IssueOrPullRequestType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IssueOrPullRequestType[] $VALUES;
    public static final g Companion;
    public static final IssueOrPullRequestType ISSUE = new IssueOrPullRequestType("ISSUE", 0, "Issue");
    public static final IssueOrPullRequestType PULL_REQUEST = new IssueOrPullRequestType("PULL_REQUEST", 1, "PullRequest");
    public static final IssueOrPullRequestType UNKNOWN__ = new IssueOrPullRequestType("UNKNOWN__", 2, "UNKNOWN__");
    private String rawValue;

    private static final /* synthetic */ IssueOrPullRequestType[] $values() {
        return new IssueOrPullRequestType[]{ISSUE, PULL_REQUEST, UNKNOWN__};
    }

    static {
        IssueOrPullRequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new g();
    }

    private IssueOrPullRequestType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static IssueOrPullRequestType valueOf(String str) {
        return (IssueOrPullRequestType) Enum.valueOf(IssueOrPullRequestType.class, str);
    }

    public static IssueOrPullRequestType[] values() {
        return (IssueOrPullRequestType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

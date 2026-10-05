package com.github.service.models.response.issueorpullrequest;

import d71.a;
import h01.m;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestMergeRequirementsState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestMergeRequirementsState[] $VALUES;
    public static final m Companion;
    private final String rawValue;
    public static final PullRequestMergeRequirementsState MERGEABLE = new PullRequestMergeRequirementsState("MERGEABLE", 0, "MERGEABLE");
    public static final PullRequestMergeRequirementsState UNMERGEABLE = new PullRequestMergeRequirementsState("UNMERGEABLE", 1, "UNMERGEABLE");
    public static final PullRequestMergeRequirementsState UNKNOWN = new PullRequestMergeRequirementsState("UNKNOWN", 2, "UNKNOWN");
    public static final PullRequestMergeRequirementsState UNKNOWN__ = new PullRequestMergeRequirementsState("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ PullRequestMergeRequirementsState[] $values() {
        return new PullRequestMergeRequirementsState[]{MERGEABLE, UNMERGEABLE, UNKNOWN, UNKNOWN__};
    }

    static {
        PullRequestMergeRequirementsState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new m();
    }

    private PullRequestMergeRequirementsState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestMergeRequirementsState valueOf(String str) {
        return (PullRequestMergeRequirementsState) Enum.valueOf(PullRequestMergeRequirementsState.class, str);
    }

    public static PullRequestMergeRequirementsState[] values() {
        return (PullRequestMergeRequirementsState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

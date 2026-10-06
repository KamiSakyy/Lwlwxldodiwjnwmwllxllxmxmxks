package com.github.service.models.response.issueorpullrequest;

import d71.a;
import h01.k;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestMergeAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestMergeAction[] $VALUES;
    public static final k Companion;
    public static final PullRequestMergeAction DIRECT_MERGE = new PullRequestMergeAction("DIRECT_MERGE", 0, "DIRECT_MERGE");
    public static final PullRequestMergeAction MERGE_QUEUE = new PullRequestMergeAction("MERGE_QUEUE", 1, "MERGE_QUEUE");
    public static final PullRequestMergeAction UNKNOWN__ = new PullRequestMergeAction("UNKNOWN__", 2, "UNKNOWN__");
    private final String rawValue;

    private static final /* synthetic */ PullRequestMergeAction[] $values() {
        return new PullRequestMergeAction[]{DIRECT_MERGE, MERGE_QUEUE, UNKNOWN__};
    }

    static {
        PullRequestMergeAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new k();
    }

    private PullRequestMergeAction(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestMergeAction valueOf(String str) {
        return (PullRequestMergeAction) Enum.valueOf(PullRequestMergeAction.class, str);
    }

    public static PullRequestMergeAction[] values() {
        return (PullRequestMergeAction[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

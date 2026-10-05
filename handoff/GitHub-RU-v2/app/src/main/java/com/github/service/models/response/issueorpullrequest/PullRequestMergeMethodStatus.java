package com.github.service.models.response.issueorpullrequest;

import d71.a;
import h01.l;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestMergeMethodStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestMergeMethodStatus[] $VALUES;
    public static final l Companion;
    private final String rawValue;
    public static final PullRequestMergeMethodStatus ALLOWED = new PullRequestMergeMethodStatus("ALLOWED", 0, "ALLOWED");
    public static final PullRequestMergeMethodStatus BLOCKED = new PullRequestMergeMethodStatus("BLOCKED", 1, "BLOCKED");
    public static final PullRequestMergeMethodStatus ALLOWED_WITH_BYPASS = new PullRequestMergeMethodStatus("ALLOWED_WITH_BYPASS", 2, "ALLOWED_WITH_BYPASS");
    public static final PullRequestMergeMethodStatus UNKNOWN__ = new PullRequestMergeMethodStatus("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ PullRequestMergeMethodStatus[] $values() {
        return new PullRequestMergeMethodStatus[]{ALLOWED, BLOCKED, ALLOWED_WITH_BYPASS, UNKNOWN__};
    }

    static {
        PullRequestMergeMethodStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new l();
    }

    private PullRequestMergeMethodStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestMergeMethodStatus valueOf(String str) {
        return (PullRequestMergeMethodStatus) Enum.valueOf(PullRequestMergeMethodStatus.class, str);
    }

    public static PullRequestMergeMethodStatus[] values() {
        return (PullRequestMergeMethodStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

package com.github.service.models.response.type;

import d71.a;
import r01.n;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestMergeMethod {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestMergeMethod[] $VALUES;
    public static final n Companion;
    private final String rawValue;
    public static final PullRequestMergeMethod MERGE = new PullRequestMergeMethod("MERGE", 0, "MERGE");
    public static final PullRequestMergeMethod SQUASH = new PullRequestMergeMethod("SQUASH", 1, "SQUASH");
    public static final PullRequestMergeMethod REBASE = new PullRequestMergeMethod("REBASE", 2, "REBASE");
    public static final PullRequestMergeMethod UNKNOWN__ = new PullRequestMergeMethod("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ PullRequestMergeMethod[] $values() {
        return new PullRequestMergeMethod[]{MERGE, SQUASH, REBASE, UNKNOWN__};
    }

    static {
        PullRequestMergeMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new n();
    }

    private PullRequestMergeMethod(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestMergeMethod valueOf(String str) {
        return (PullRequestMergeMethod) Enum.valueOf(PullRequestMergeMethod.class, str);
    }

    public static PullRequestMergeMethod[] values() {
        return (PullRequestMergeMethod[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

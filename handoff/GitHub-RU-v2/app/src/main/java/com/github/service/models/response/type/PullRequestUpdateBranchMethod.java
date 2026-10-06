package com.github.service.models.response.type;

import d71.a;
import r01.r;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestUpdateBranchMethod {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestUpdateBranchMethod[] $VALUES;
    public static final r Companion;
    public static final PullRequestUpdateBranchMethod MERGE = new PullRequestUpdateBranchMethod("MERGE", 0, "MERGE");
    public static final PullRequestUpdateBranchMethod REBASE = new PullRequestUpdateBranchMethod("REBASE", 1, "REBASE");
    public static final PullRequestUpdateBranchMethod UNKNOWN__ = new PullRequestUpdateBranchMethod("UNKNOWN__", 2, "UNKNOWN__");
    private final String rawValue;

    private static final /* synthetic */ PullRequestUpdateBranchMethod[] $values() {
        return new PullRequestUpdateBranchMethod[]{MERGE, REBASE, UNKNOWN__};
    }

    static {
        PullRequestUpdateBranchMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new r();
    }

    private PullRequestUpdateBranchMethod(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestUpdateBranchMethod valueOf(String str) {
        return (PullRequestUpdateBranchMethod) Enum.valueOf(PullRequestUpdateBranchMethod.class, str);
    }

    public static PullRequestUpdateBranchMethod[] values() {
        return (PullRequestUpdateBranchMethod[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

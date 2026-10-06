package com.github.service.models.response.type;

import d71.a;
import r01.s;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestUpdateState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PullRequestUpdateState[] $VALUES;
    public static final s Companion;
    private final String rawValue;
    public static final PullRequestUpdateState OPEN = new PullRequestUpdateState("OPEN", 0, "OPEN");
    public static final PullRequestUpdateState CLOSED = new PullRequestUpdateState("CLOSED", 1, "CLOSED");
    public static final PullRequestUpdateState UNKNOWN__ = new PullRequestUpdateState("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ PullRequestUpdateState[] $values() {
        return new PullRequestUpdateState[]{OPEN, CLOSED, UNKNOWN__};
    }

    static {
        PullRequestUpdateState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new s();
    }

    private PullRequestUpdateState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestUpdateState valueOf(String str) {
        return (PullRequestUpdateState) Enum.valueOf(PullRequestUpdateState.class, str);
    }

    public static PullRequestUpdateState[] values() {
        return (PullRequestUpdateState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

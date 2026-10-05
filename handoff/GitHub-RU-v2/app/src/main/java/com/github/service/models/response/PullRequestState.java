package com.github.service.models.response;

import v8.l0;
import yz0.o3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ PullRequestState[] $VALUES;
    public static final o3 Companion;
    private final String rawValue;
    public static final PullRequestState OPEN = new PullRequestState("OPEN", 0, "OPEN");
    public static final PullRequestState CLOSED = new PullRequestState("CLOSED", 1, "CLOSED");
    public static final PullRequestState MERGED = new PullRequestState("MERGED", 2, "MERGED");
    public static final PullRequestState UNKNOWN__ = new PullRequestState("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ PullRequestState[] $values() {
        return new PullRequestState[]{OPEN, CLOSED, MERGED, UNKNOWN__};
    }

    static {
        PullRequestState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new o3();
    }

    private PullRequestState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static PullRequestState valueOf(String str) {
        return (PullRequestState) Enum.valueOf(PullRequestState.class, str);
    }

    public static PullRequestState[] values() {
        return (PullRequestState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

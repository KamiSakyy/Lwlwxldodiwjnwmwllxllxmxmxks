package com.github.service.models.response;

import v8.l0;
import yz0.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class CheckConclusionState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ CheckConclusionState[] $VALUES;
    public static final k Companion;
    private final String rawValue;
    public static final CheckConclusionState ACTION_REQUIRED = new CheckConclusionState("ACTION_REQUIRED", 0, "ACTION_REQUIRED");
    public static final CheckConclusionState TIMED_OUT = new CheckConclusionState("TIMED_OUT", 1, "TIMED_OUT");
    public static final CheckConclusionState CANCELLED = new CheckConclusionState("CANCELLED", 2, "CANCELLED");
    public static final CheckConclusionState FAILURE = new CheckConclusionState("FAILURE", 3, "FAILURE");
    public static final CheckConclusionState SUCCESS = new CheckConclusionState("SUCCESS", 4, "SUCCESS");
    public static final CheckConclusionState NEUTRAL = new CheckConclusionState("NEUTRAL", 5, "NEUTRAL");
    public static final CheckConclusionState SKIPPED = new CheckConclusionState("SKIPPED", 6, "SKIPPED");
    public static final CheckConclusionState STARTUP_FAILURE = new CheckConclusionState("STARTUP_FAILURE", 7, "STARTUP_FAILURE");
    public static final CheckConclusionState STALE = new CheckConclusionState("STALE", 8, "STALE");
    public static final CheckConclusionState UNKNOWN__ = new CheckConclusionState("UNKNOWN__", 9, "UNKNOWN__");

    private static final /* synthetic */ CheckConclusionState[] $values() {
        return new CheckConclusionState[]{ACTION_REQUIRED, TIMED_OUT, CANCELLED, FAILURE, SUCCESS, NEUTRAL, SKIPPED, STARTUP_FAILURE, STALE, UNKNOWN__};
    }

    static {
        CheckConclusionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new k();
    }

    private CheckConclusionState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static CheckConclusionState valueOf(String str) {
        return (CheckConclusionState) Enum.valueOf(CheckConclusionState.class, str);
    }

    public static CheckConclusionState[] values() {
        return (CheckConclusionState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

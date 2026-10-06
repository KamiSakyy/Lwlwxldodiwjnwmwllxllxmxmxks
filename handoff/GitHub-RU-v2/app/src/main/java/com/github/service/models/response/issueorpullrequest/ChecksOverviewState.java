package com.github.service.models.response.issueorpullrequest;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ChecksOverviewState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ChecksOverviewState[] $VALUES;
    private final String rawValue;
    public static final ChecksOverviewState EXPECTED = new ChecksOverviewState("EXPECTED", 0, "EXPECTED");
    public static final ChecksOverviewState ERROR = new ChecksOverviewState("ERROR", 1, "ERROR");
    public static final ChecksOverviewState FAILURE = new ChecksOverviewState("FAILURE", 2, "FAILURE");
    public static final ChecksOverviewState PENDING = new ChecksOverviewState("PENDING", 3, "PENDING");
    public static final ChecksOverviewState SUCCESS = new ChecksOverviewState("SUCCESS", 4, "SUCCESS");
    public static final ChecksOverviewState ACTION_REQUIRED = new ChecksOverviewState("ACTION_REQUIRED", 5, "ACTION_REQUIRED");
    public static final ChecksOverviewState UNKNOWN = new ChecksOverviewState("UNKNOWN", 6, "UNKNOWN__");

    private static final /* synthetic */ ChecksOverviewState[] $values() {
        return new ChecksOverviewState[]{EXPECTED, ERROR, FAILURE, PENDING, SUCCESS, ACTION_REQUIRED, UNKNOWN};
    }

    static {
        ChecksOverviewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ChecksOverviewState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ChecksOverviewState valueOf(String str) {
        return (ChecksOverviewState) Enum.valueOf(ChecksOverviewState.class, str);
    }

    public static ChecksOverviewState[] values() {
        return (ChecksOverviewState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

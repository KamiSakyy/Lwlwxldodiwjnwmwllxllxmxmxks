package com.github.service.models.response.type;

import d71.a;
import r01.x;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class StatusState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StatusState[] $VALUES;
    public static final x Companion;
    private final String rawValue;
    public static final StatusState EXPECTED = new StatusState("EXPECTED", 0, "EXPECTED");
    public static final StatusState ERROR = new StatusState("ERROR", 1, "ERROR");
    public static final StatusState FAILURE = new StatusState("FAILURE", 2, "FAILURE");
    public static final StatusState PENDING = new StatusState("PENDING", 3, "PENDING");
    public static final StatusState SUCCESS = new StatusState("SUCCESS", 4, "SUCCESS");
    public static final StatusState UNKNOWN__ = new StatusState("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ StatusState[] $values() {
        return new StatusState[]{EXPECTED, ERROR, FAILURE, PENDING, SUCCESS, UNKNOWN__};
    }

    static {
        StatusState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new x();
    }

    private StatusState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static StatusState valueOf(String str) {
        return (StatusState) Enum.valueOf(StatusState.class, str);
    }

    public static StatusState[] values() {
        return (StatusState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

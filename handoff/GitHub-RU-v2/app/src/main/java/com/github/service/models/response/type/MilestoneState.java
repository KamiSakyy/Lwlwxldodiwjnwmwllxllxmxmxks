package com.github.service.models.response.type;

import d71.a;
import r01.g;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class MilestoneState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MilestoneState[] $VALUES;
    public static final g Companion;
    private String rawValue;
    public static final MilestoneState OPEN = new MilestoneState("OPEN", 0, "OPEN");
    public static final MilestoneState CLOSED = new MilestoneState("CLOSED", 1, "CLOSED");
    public static final MilestoneState UNKNOWN__ = new MilestoneState("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ MilestoneState[] $values() {
        return new MilestoneState[]{OPEN, CLOSED, UNKNOWN__};
    }

    static {
        MilestoneState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new g();
    }

    private MilestoneState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MilestoneState valueOf(String str) {
        return (MilestoneState) Enum.valueOf(MilestoneState.class, str);
    }

    public static MilestoneState[] values() {
        return (MilestoneState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object name(Object... a) {
        return null;
    }
}

package com.github.service.models.response.type;

import d71.a;
import r01.c;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class DiffSide {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DiffSide[] $VALUES;
    public static final c Companion;
    public static final DiffSide LEFT = new DiffSide("LEFT", 0, "LEFT");
    public static final DiffSide RIGHT = new DiffSide("RIGHT", 1, "RIGHT");
    public static final DiffSide UNKNOWN__ = new DiffSide("UNKNOWN__", 2, "UNKNOWN__");
    private final String rawValue;

    private static final /* synthetic */ DiffSide[] $values() {
        return new DiffSide[]{LEFT, RIGHT, UNKNOWN__};
    }

    static {
        DiffSide[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new c();
    }

    private DiffSide(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DiffSide valueOf(String str) {
        return (DiffSide) Enum.valueOf(DiffSide.class, str);
    }

    public static DiffSide[] values() {
        return (DiffSide[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

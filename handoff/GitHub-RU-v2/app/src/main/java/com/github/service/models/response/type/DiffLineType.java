package com.github.service.models.response.type;

import d71.a;
import r01.b;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class DiffLineType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DiffLineType[] $VALUES;
    public static final b Companion;
    private final String rawValue;
    public static final DiffLineType HUNK = new DiffLineType("HUNK", 0, "HUNK");
    public static final DiffLineType CONTEXT = new DiffLineType("CONTEXT", 1, "CONTEXT");
    public static final DiffLineType ADDITION = new DiffLineType("ADDITION", 2, "ADDITION");
    public static final DiffLineType DELETION = new DiffLineType("DELETION", 3, "DELETION");
    public static final DiffLineType INJECTED_CONTEXT = new DiffLineType("INJECTED_CONTEXT", 4, "INJECTED_CONTEXT");
    public static final DiffLineType UNKNOWN__ = new DiffLineType("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ DiffLineType[] $values() {
        return new DiffLineType[]{HUNK, CONTEXT, ADDITION, DELETION, INJECTED_CONTEXT, UNKNOWN__};
    }

    static {
        DiffLineType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new b();
    }

    private DiffLineType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DiffLineType valueOf(String str) {
        return (DiffLineType) Enum.valueOf(DiffLineType.class, str);
    }

    public static DiffLineType[] values() {
        return (DiffLineType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

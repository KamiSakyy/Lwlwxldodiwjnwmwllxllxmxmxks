package com.github.service.models.response.type;

import d71.a;
import r01.f;
import v8.l0;
import w61.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class MergeStateStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MergeStateStatus[] $VALUES;
    public static final f Companion;
    private final String rawValue;
    public static final MergeStateStatus DIRTY = new MergeStateStatus("DIRTY", 0, "DIRTY");
    public static final MergeStateStatus UNKNOWN = new MergeStateStatus("UNKNOWN", 1, "UNKNOWN");
    public static final MergeStateStatus BLOCKED = new MergeStateStatus("BLOCKED", 2, "BLOCKED");
    public static final MergeStateStatus BEHIND = new MergeStateStatus("BEHIND", 3, "BEHIND");
    public static final MergeStateStatus UNSTABLE = new MergeStateStatus("UNSTABLE", 4, "UNSTABLE");
    public static final MergeStateStatus HAS_HOOKS = new MergeStateStatus("HAS_HOOKS", 5, "HAS_HOOKS");
    public static final MergeStateStatus CLEAN = new MergeStateStatus("CLEAN", 6, "CLEAN");
    public static final MergeStateStatus UNKNOWN__ = new MergeStateStatus("UNKNOWN__", 7, "UNKNOWN__");

    @c
    public static final MergeStateStatus DRAFT = new MergeStateStatus("DRAFT", 8, "DRAFT");

    private static final /* synthetic */ MergeStateStatus[] $values() {
        return new MergeStateStatus[]{DIRTY, UNKNOWN, BLOCKED, BEHIND, UNSTABLE, HAS_HOOKS, CLEAN, UNKNOWN__, DRAFT};
    }

    static {
        MergeStateStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new f();
    }

    private MergeStateStatus(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MergeStateStatus valueOf(String str) {
        return (MergeStateStatus) Enum.valueOf(MergeStateStatus.class, str);
    }

    public static MergeStateStatus[] values() {
        return (MergeStateStatus[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

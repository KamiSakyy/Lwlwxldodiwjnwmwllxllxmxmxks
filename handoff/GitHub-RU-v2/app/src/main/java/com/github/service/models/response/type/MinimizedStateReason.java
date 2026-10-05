package com.github.service.models.response.type;

import d71.a;
import r01.h;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class MinimizedStateReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MinimizedStateReason[] $VALUES;
    public static final h Companion;
    private final String rawValue;
    public static final MinimizedStateReason ABUSE = new MinimizedStateReason("ABUSE", 0, "abuse");
    public static final MinimizedStateReason OFFTOPIC = new MinimizedStateReason("OFFTOPIC", 1, "off-topic");
    public static final MinimizedStateReason OUTDATED = new MinimizedStateReason("OUTDATED", 2, "outdated");
    public static final MinimizedStateReason RESOLVED = new MinimizedStateReason("RESOLVED", 3, "resolved");
    public static final MinimizedStateReason SPAM = new MinimizedStateReason("SPAM", 4, "spam");
    public static final MinimizedStateReason DUPLICATE = new MinimizedStateReason("DUPLICATE", 5, "duplicate");
    public static final MinimizedStateReason UNKNOWN = new MinimizedStateReason("UNKNOWN", 6, "unknown");

    private static final /* synthetic */ MinimizedStateReason[] $values() {
        return new MinimizedStateReason[]{ABUSE, OFFTOPIC, OUTDATED, RESOLVED, SPAM, DUPLICATE, UNKNOWN};
    }

    static {
        MinimizedStateReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new h();
    }

    private MinimizedStateReason(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MinimizedStateReason valueOf(String str) {
        return (MinimizedStateReason) Enum.valueOf(MinimizedStateReason.class, str);
    }

    public static MinimizedStateReason[] values() {
        return (MinimizedStateReason[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

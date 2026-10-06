package com.github.service.models;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class BlockDuration {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BlockDuration[] $VALUES;
    public static final BlockDuration Indefinite = new BlockDuration("Indefinite", 0);
    public static final BlockDuration OneDay = new BlockDuration("OneDay", 1);
    public static final BlockDuration ThreeDays = new BlockDuration("ThreeDays", 2);
    public static final BlockDuration SevenDays = new BlockDuration("SevenDays", 3);
    public static final BlockDuration ThirtyDays = new BlockDuration("ThirtyDays", 4);

    private static final /* synthetic */ BlockDuration[] $values() {
        return new BlockDuration[]{Indefinite, OneDay, ThreeDays, SevenDays, ThirtyDays};
    }

    static {
        BlockDuration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private BlockDuration(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static BlockDuration valueOf(String str) {
        return (BlockDuration) Enum.valueOf(BlockDuration.class, str);
    }

    public static BlockDuration[] values() {
        return (BlockDuration[]) $VALUES.clone();
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

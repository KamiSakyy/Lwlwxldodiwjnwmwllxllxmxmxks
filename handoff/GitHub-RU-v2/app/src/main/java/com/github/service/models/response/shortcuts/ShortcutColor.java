package com.github.service.models.response.shortcuts;

import q01.l;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ShortcutColor {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ShortcutColor[] $VALUES;
    public static final l Companion;
    private final String value;
    public static final ShortcutColor GRAY = new ShortcutColor("GRAY", 0, "GRAY");
    public static final ShortcutColor BLUE = new ShortcutColor("BLUE", 1, "BLUE");
    public static final ShortcutColor GREEN = new ShortcutColor("GREEN", 2, "GREEN");
    public static final ShortcutColor ORANGE = new ShortcutColor("ORANGE", 3, "ORANGE");
    public static final ShortcutColor RED = new ShortcutColor("RED", 4, "RED");
    public static final ShortcutColor PINK = new ShortcutColor("PINK", 5, "PINK");
    public static final ShortcutColor PURPLE = new ShortcutColor("PURPLE", 6, "PURPLE");

    private static final /* synthetic */ ShortcutColor[] $values() {
        return new ShortcutColor[]{GRAY, BLUE, GREEN, ORANGE, RED, PINK, PURPLE};
    }

    static {
        ShortcutColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new l();
    }

    private ShortcutColor(String str, int i, String str2) {
        this.value = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ShortcutColor valueOf(String str) {
        return (ShortcutColor) Enum.valueOf(ShortcutColor.class, str);
    }

    public static ShortcutColor[] values() {
        return (ShortcutColor[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

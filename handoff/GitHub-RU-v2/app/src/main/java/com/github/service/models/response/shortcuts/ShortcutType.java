package com.github.service.models.response.shortcuts;

import q01.q;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ShortcutType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ShortcutType[] $VALUES;
    public static final q Companion;
    private String value;
    public static final ShortcutType ISSUE = new ShortcutType("ISSUE", 0, "ISSUE");
    public static final ShortcutType PULL_REQUEST = new ShortcutType("PULL_REQUEST", 1, "PULL_REQUEST");
    public static final ShortcutType DISCUSSION = new ShortcutType("DISCUSSION", 2, "DISCUSSION");
    public static final ShortcutType REPOSITORIES = new ShortcutType("REPOSITORIES", 3, "REPOSITORIES");

    private static final /* synthetic */ ShortcutType[] $values() {
        return new ShortcutType[]{ISSUE, PULL_REQUEST, DISCUSSION, REPOSITORIES};
    }

    static {
        ShortcutType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new q();
    }

    private ShortcutType(String str, int i, String str2) {
        this.value = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ShortcutType valueOf(String str) {
        return (ShortcutType) Enum.valueOf(ShortcutType.class, str);
    }

    public static ShortcutType[] values() {
        return (ShortcutType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static Object ordinal(Object... a) {
        return null;
    }

    public static Object name(Object... a) {
        return null;
    }
}

package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class Entry$EntryType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ Entry$EntryType[] $VALUES;
    public static final Entry$EntryType BLOB = new Entry$EntryType("BLOB", 0);
    public static final Entry$EntryType TREE = new Entry$EntryType("TREE", 1);
    public static final Entry$EntryType COMMIT = new Entry$EntryType("COMMIT", 2);
    public static final Entry$EntryType UNKNOWN = new Entry$EntryType("UNKNOWN", 3);

    private static final /* synthetic */ Entry$EntryType[] $values() {
        return new Entry$EntryType[]{BLOB, TREE, COMMIT, UNKNOWN};
    }

    static {
        Entry$EntryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private Entry$EntryType(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static Entry$EntryType valueOf(String str) {
        return (Entry$EntryType) Enum.valueOf(Entry$EntryType.class, str);
    }

    public static Entry$EntryType[] values() {
        return (Entry$EntryType[]) $VALUES.clone();
    }
}

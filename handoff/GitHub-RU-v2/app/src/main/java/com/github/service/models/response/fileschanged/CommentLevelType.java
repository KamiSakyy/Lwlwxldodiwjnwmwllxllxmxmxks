package com.github.service.models.response.fileschanged;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class CommentLevelType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CommentLevelType[] $VALUES;
    public static final CommentLevelType LINE = new CommentLevelType("LINE", 0);
    public static final CommentLevelType FILE = new CommentLevelType("FILE", 1);
    public static final CommentLevelType UNKNOWN__ = new CommentLevelType("UNKNOWN__", 2);

    private static final /* synthetic */ CommentLevelType[] $values() {
        return new CommentLevelType[]{LINE, FILE, UNKNOWN__};
    }

    static {
        CommentLevelType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private CommentLevelType(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CommentLevelType valueOf(String str) {
        return (CommentLevelType) Enum.valueOf(CommentLevelType.class, str);
    }

    public static CommentLevelType[] values() {
        return (CommentLevelType[]) $VALUES.clone();
    }
}

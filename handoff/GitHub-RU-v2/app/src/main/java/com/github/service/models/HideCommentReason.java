package com.github.service.models;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class HideCommentReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HideCommentReason[] $VALUES;
    public static final HideCommentReason Spam = new HideCommentReason("Spam", 0);
    public static final HideCommentReason Abuse = new HideCommentReason("Abuse", 1);
    public static final HideCommentReason OffTopic = new HideCommentReason("OffTopic", 2);
    public static final HideCommentReason Outdated = new HideCommentReason("Outdated", 3);
    public static final HideCommentReason Duplicate = new HideCommentReason("Duplicate", 4);
    public static final HideCommentReason Resolved = new HideCommentReason("Resolved", 5);

    private static final /* synthetic */ HideCommentReason[] $values() {
        return new HideCommentReason[]{Spam, Abuse, OffTopic, Outdated, Duplicate, Resolved};
    }

    static {
        HideCommentReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private HideCommentReason(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static HideCommentReason valueOf(String str) {
        return (HideCommentReason) Enum.valueOf(HideCommentReason.class, str);
    }

    public static HideCommentReason[] values() {
        return (HideCommentReason[]) $VALUES.clone();
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

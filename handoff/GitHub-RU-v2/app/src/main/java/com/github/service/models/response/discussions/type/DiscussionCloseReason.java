package com.github.service.models.response.discussions.type;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class DiscussionCloseReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DiscussionCloseReason[] $VALUES;
    public static final DiscussionCloseReason DUPLICATE = new DiscussionCloseReason("DUPLICATE", 0);
    public static final DiscussionCloseReason OUTDATED = new DiscussionCloseReason("OUTDATED", 1);
    public static final DiscussionCloseReason RESOLVED = new DiscussionCloseReason("RESOLVED", 2);
    public static final DiscussionCloseReason UNKNOWN__ = new DiscussionCloseReason("UNKNOWN__", 3);

    private static final /* synthetic */ DiscussionCloseReason[] $values() {
        return new DiscussionCloseReason[]{DUPLICATE, OUTDATED, RESOLVED, UNKNOWN__};
    }

    static {
        DiscussionCloseReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private DiscussionCloseReason(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DiscussionCloseReason valueOf(String str) {
        return (DiscussionCloseReason) Enum.valueOf(DiscussionCloseReason.class, str);
    }

    public static DiscussionCloseReason[] values() {
        return (DiscussionCloseReason[]) $VALUES.clone();
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

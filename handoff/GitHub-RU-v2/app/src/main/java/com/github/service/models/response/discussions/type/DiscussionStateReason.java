package com.github.service.models.response.discussions.type;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class DiscussionStateReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DiscussionStateReason[] $VALUES;
    public static final DiscussionStateReason DUPLICATE = new DiscussionStateReason("DUPLICATE", 0);
    public static final DiscussionStateReason OUTDATED = new DiscussionStateReason("OUTDATED", 1);
    public static final DiscussionStateReason RESOLVED = new DiscussionStateReason("RESOLVED", 2);
    public static final DiscussionStateReason REOPENED = new DiscussionStateReason("REOPENED", 3);
    public static final DiscussionStateReason UNKNOWN__ = new DiscussionStateReason("UNKNOWN__", 4);

    private static final /* synthetic */ DiscussionStateReason[] $values() {
        return new DiscussionStateReason[]{DUPLICATE, OUTDATED, RESOLVED, REOPENED, UNKNOWN__};
    }

    static {
        DiscussionStateReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private DiscussionStateReason(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static DiscussionStateReason valueOf(String str) {
        return (DiscussionStateReason) Enum.valueOf(DiscussionStateReason.class, str);
    }

    public static DiscussionStateReason[] values() {
        return (DiscussionStateReason[]) $VALUES.clone();
    }

    public <T0> T0 name(Object... a) {
        return null;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

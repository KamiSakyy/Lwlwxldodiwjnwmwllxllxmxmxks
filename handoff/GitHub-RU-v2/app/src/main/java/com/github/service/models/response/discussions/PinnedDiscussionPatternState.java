package com.github.service.models.response.discussions;

import b01.q;
import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class PinnedDiscussionPatternState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PinnedDiscussionPatternState[] $VALUES;
    public static final q Companion;
    private final String rawValue;
    public static final PinnedDiscussionPatternState DOT_FILL = new PinnedDiscussionPatternState("DOT_FILL", 0, "DOT_FILL");
    public static final PinnedDiscussionPatternState PLUS = new PinnedDiscussionPatternState("PLUS", 1, "PLUS");
    public static final PinnedDiscussionPatternState ZAP = new PinnedDiscussionPatternState("ZAP", 2, "ZAP");
    public static final PinnedDiscussionPatternState CHEVRON_UP = new PinnedDiscussionPatternState("CHEVRON_UP", 3, "CHEVRON_UP");
    public static final PinnedDiscussionPatternState DOT = new PinnedDiscussionPatternState("DOT", 4, "DOT");
    public static final PinnedDiscussionPatternState HEART_FILL = new PinnedDiscussionPatternState("HEART_FILL", 5, "HEART_FILL");
    public static final PinnedDiscussionPatternState UNKNOWN__ = new PinnedDiscussionPatternState("UNKNOWN__", 6, "UNKNOWN__");

    private static final /* synthetic */ PinnedDiscussionPatternState[] $values() {
        return new PinnedDiscussionPatternState[]{DOT_FILL, PLUS, ZAP, CHEVRON_UP, DOT, HEART_FILL, UNKNOWN__};
    }

    static {
        PinnedDiscussionPatternState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new q();
    }

    private PinnedDiscussionPatternState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static PinnedDiscussionPatternState valueOf(String str) {
        return (PinnedDiscussionPatternState) Enum.valueOf(PinnedDiscussionPatternState.class, str);
    }

    public static PinnedDiscussionPatternState[] values() {
        return (PinnedDiscussionPatternState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

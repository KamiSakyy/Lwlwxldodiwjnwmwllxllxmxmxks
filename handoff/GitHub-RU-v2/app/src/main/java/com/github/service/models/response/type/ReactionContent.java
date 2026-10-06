package com.github.service.models.response.type;

import d71.a;
import r01.t;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ReactionContent {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ReactionContent[] $VALUES;
    public static final t Companion;
    private final String rawValue;
    public static final ReactionContent THUMBS_UP = new ReactionContent("THUMBS_UP", 0, "THUMBS_UP");
    public static final ReactionContent THUMBS_DOWN = new ReactionContent("THUMBS_DOWN", 1, "THUMBS_DOWN");
    public static final ReactionContent LAUGH = new ReactionContent("LAUGH", 2, "LAUGH");
    public static final ReactionContent HOORAY = new ReactionContent("HOORAY", 3, "HOORAY");
    public static final ReactionContent CONFUSED = new ReactionContent("CONFUSED", 4, "CONFUSED");
    public static final ReactionContent HEART = new ReactionContent("HEART", 5, "HEART");
    public static final ReactionContent ROCKET = new ReactionContent("ROCKET", 6, "ROCKET");
    public static final ReactionContent EYES = new ReactionContent("EYES", 7, "EYES");
    public static final ReactionContent UNKNOWN__ = new ReactionContent("UNKNOWN__", 8, "UNKNOWN__");

    private static final /* synthetic */ ReactionContent[] $values() {
        return new ReactionContent[]{THUMBS_UP, THUMBS_DOWN, LAUGH, HOORAY, CONFUSED, HEART, ROCKET, EYES, UNKNOWN__};
    }

    static {
        ReactionContent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new t();
    }

    private ReactionContent(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static ReactionContent valueOf(String str) {
        return (ReactionContent) Enum.valueOf(ReactionContent.class, str);
    }

    public static ReactionContent[] values() {
        return (ReactionContent[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

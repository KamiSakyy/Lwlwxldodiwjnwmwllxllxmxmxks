package com.github.service.models.response.type;

import d71.a;
import r01.i;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class MobileAppAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MobileAppAction[] $VALUES;
    public static final i Companion;
    private final String rawValue;
    public static final MobileAppAction PRESS = new MobileAppAction("PRESS", 0, "PRESS");
    public static final MobileAppAction SWIPE = new MobileAppAction("SWIPE", 1, "SWIPE");
    public static final MobileAppAction LEFT_SWIPE = new MobileAppAction("LEFT_SWIPE", 2, "LEFT_SWIPE");
    public static final MobileAppAction RIGHT_SWIPE = new MobileAppAction("RIGHT_SWIPE", 3, "RIGHT_SWIPE");
    public static final MobileAppAction LONG_PRESS = new MobileAppAction("LONG_PRESS", 4, "LONG_PRESS");
    public static final MobileAppAction GESTURE = new MobileAppAction("GESTURE", 5, "GESTURE");
    public static final MobileAppAction KEY_COMMAND = new MobileAppAction("KEY_COMMAND", 6, "KEY_COMMAND");
    public static final MobileAppAction UNKNOWN__ = new MobileAppAction("UNKNOWN__", 7, "UNKNOWN__");

    private static final /* synthetic */ MobileAppAction[] $values() {
        return new MobileAppAction[]{PRESS, SWIPE, LEFT_SWIPE, RIGHT_SWIPE, LONG_PRESS, GESTURE, KEY_COMMAND, UNKNOWN__};
    }

    static {
        MobileAppAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new i();
    }

    private MobileAppAction(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MobileAppAction valueOf(String str) {
        return (MobileAppAction) Enum.valueOf(MobileAppAction.class, str);
    }

    public static MobileAppAction[] values() {
        return (MobileAppAction[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

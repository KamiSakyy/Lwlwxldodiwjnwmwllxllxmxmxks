package com.github.service.models.response.type;

import d71.a;
import r01.y;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class SubscriptionState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SubscriptionState[] $VALUES;
    public static final y Companion;
    private final String rawValue;
    public static final SubscriptionState UNSUBSCRIBED = new SubscriptionState("UNSUBSCRIBED", 0, "UNSUBSCRIBED");
    public static final SubscriptionState RELEASES_ONLY = new SubscriptionState("RELEASES_ONLY", 1, "RELEASES_ONLY");
    public static final SubscriptionState SUBSCRIBED = new SubscriptionState("SUBSCRIBED", 2, "SUBSCRIBED");
    public static final SubscriptionState IGNORED = new SubscriptionState("IGNORED", 3, "IGNORED");
    public static final SubscriptionState CUSTOM = new SubscriptionState("CUSTOM", 4, "CUSTOM");
    public static final SubscriptionState UNKNOWN__ = new SubscriptionState("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ SubscriptionState[] $values() {
        return new SubscriptionState[]{UNSUBSCRIBED, RELEASES_ONLY, SUBSCRIBED, IGNORED, CUSTOM, UNKNOWN__};
    }

    static {
        SubscriptionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new y();
    }

    private SubscriptionState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionState valueOf(String str) {
        return (SubscriptionState) Enum.valueOf(SubscriptionState.class, str);
    }

    public static SubscriptionState[] values() {
        return (SubscriptionState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

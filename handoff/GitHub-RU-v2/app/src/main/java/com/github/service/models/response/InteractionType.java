package com.github.service.models.response;

import v8.l0;
import yz0.x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class InteractionType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ InteractionType[] $VALUES;
    public static final x1 Companion;
    private final String rawValue;
    public static final InteractionType AUTHORED = new InteractionType("AUTHORED", 0, "AUTHORED");
    public static final InteractionType REOPENED = new InteractionType("REOPENED", 1, "REOPENED");
    public static final InteractionType COMMENTED = new InteractionType("COMMENTED", 2, "COMMENTED");
    public static final InteractionType RECEIVED_COMMENT = new InteractionType("RECEIVED_COMMENT", 3, "RECEIVED_COMMENT");
    public static final InteractionType COMMENT_EDITED = new InteractionType("COMMENT_EDITED", 4, "COMMENT_EDITED");
    public static final InteractionType RECEIVED_COMMENT_EDITED = new InteractionType("RECEIVED_COMMENT_EDITED", 5, "RECEIVED_COMMENT_EDITED");
    public static final InteractionType REVIEW_REQUESTED = new InteractionType("REVIEW_REQUESTED", 6, "REVIEW_REQUESTED");
    public static final InteractionType REVIEW_RECEIVED = new InteractionType("REVIEW_RECEIVED", 7, "REVIEW_RECEIVED");
    public static final InteractionType DEPLOYED = new InteractionType("DEPLOYED", 8, "DEPLOYED");
    public static final InteractionType ASSIGNED = new InteractionType("ASSIGNED", 9, "ASSIGNED");
    public static final InteractionType REFERENCED = new InteractionType("REFERENCED", 10, "REFERENCED");
    public static final InteractionType UNKNOWN__ = new InteractionType("UNKNOWN__", 11, "UNKNOWN__");

    private static final /* synthetic */ InteractionType[] $values() {
        return new InteractionType[]{AUTHORED, REOPENED, COMMENTED, RECEIVED_COMMENT, COMMENT_EDITED, RECEIVED_COMMENT_EDITED, REVIEW_REQUESTED, REVIEW_RECEIVED, DEPLOYED, ASSIGNED, REFERENCED, UNKNOWN__};
    }

    static {
        InteractionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new x1();
    }

    private InteractionType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static InteractionType valueOf(String str) {
        return (InteractionType) Enum.valueOf(InteractionType.class, str);
    }

    public static InteractionType[] values() {
        return (InteractionType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

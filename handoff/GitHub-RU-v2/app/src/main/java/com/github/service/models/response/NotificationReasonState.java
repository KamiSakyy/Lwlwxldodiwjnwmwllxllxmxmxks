package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class NotificationReasonState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ NotificationReasonState[] $VALUES;
    public static final NotificationReasonState ASSIGN = new NotificationReasonState("ASSIGN", 0);
    public static final NotificationReasonState AUTHOR = new NotificationReasonState("AUTHOR", 1);
    public static final NotificationReasonState COMMENT = new NotificationReasonState("COMMENT", 2);
    public static final NotificationReasonState INVITATION = new NotificationReasonState("INVITATION", 3);
    public static final NotificationReasonState MANUAL = new NotificationReasonState("MANUAL", 4);
    public static final NotificationReasonState MENTION = new NotificationReasonState("MENTION", 5);
    public static final NotificationReasonState REVIEW_REQUESTED = new NotificationReasonState("REVIEW_REQUESTED", 6);
    public static final NotificationReasonState SECURITY_ADVISORY_CREDIT = new NotificationReasonState("SECURITY_ADVISORY_CREDIT", 7);
    public static final NotificationReasonState SECURITY_ALERT = new NotificationReasonState("SECURITY_ALERT", 8);
    public static final NotificationReasonState STATE_CHANGE = new NotificationReasonState("STATE_CHANGE", 9);
    public static final NotificationReasonState SUBSCRIBED = new NotificationReasonState("SUBSCRIBED", 10);
    public static final NotificationReasonState TEAM_MENTION = new NotificationReasonState("TEAM_MENTION", 11);
    public static final NotificationReasonState CI_ACTIVITY = new NotificationReasonState("CI_ACTIVITY", 12);
    public static final NotificationReasonState APPROVAL_REQUESTED = new NotificationReasonState("APPROVAL_REQUESTED", 13);
    public static final NotificationReasonState SAVE = new NotificationReasonState("SAVE", 14);
    public static final NotificationReasonState READY_FOR_REVIEW = new NotificationReasonState("READY_FOR_REVIEW", 15);
    public static final NotificationReasonState UNKNOWN = new NotificationReasonState("UNKNOWN", 16);

    private static final /* synthetic */ NotificationReasonState[] $values() {
        return new NotificationReasonState[]{ASSIGN, AUTHOR, COMMENT, INVITATION, MANUAL, MENTION, REVIEW_REQUESTED, SECURITY_ADVISORY_CREDIT, SECURITY_ALERT, STATE_CHANGE, SUBSCRIBED, TEAM_MENTION, CI_ACTIVITY, APPROVAL_REQUESTED, SAVE, READY_FOR_REVIEW, UNKNOWN};
    }

    static {
        NotificationReasonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private NotificationReasonState(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static NotificationReasonState valueOf(String str) {
        return (NotificationReasonState) Enum.valueOf(NotificationReasonState.class, str);
    }

    public static NotificationReasonState[] values() {
        return (NotificationReasonState[]) $VALUES.clone();
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

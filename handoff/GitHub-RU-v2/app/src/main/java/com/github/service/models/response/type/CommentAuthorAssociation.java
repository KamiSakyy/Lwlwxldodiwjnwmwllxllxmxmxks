package com.github.service.models.response.type;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class CommentAuthorAssociation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CommentAuthorAssociation[] $VALUES;
    public static final r01.a Companion;
    private final String rawValue;
    public static final CommentAuthorAssociation MEMBER = new CommentAuthorAssociation("MEMBER", 0, "MEMBER");
    public static final CommentAuthorAssociation OWNER = new CommentAuthorAssociation("OWNER", 1, "OWNER");
    public static final CommentAuthorAssociation MANNEQUIN = new CommentAuthorAssociation("MANNEQUIN", 2, "MANNEQUIN");
    public static final CommentAuthorAssociation COLLABORATOR = new CommentAuthorAssociation("COLLABORATOR", 3, "COLLABORATOR");
    public static final CommentAuthorAssociation CONTRIBUTOR = new CommentAuthorAssociation("CONTRIBUTOR", 4, "CONTRIBUTOR");
    public static final CommentAuthorAssociation FIRST_TIME_CONTRIBUTOR = new CommentAuthorAssociation("FIRST_TIME_CONTRIBUTOR", 5, "FIRST_TIME_CONTRIBUTOR");
    public static final CommentAuthorAssociation FIRST_TIMER = new CommentAuthorAssociation("FIRST_TIMER", 6, "FIRST_TIMER");
    public static final CommentAuthorAssociation NONE = new CommentAuthorAssociation("NONE", 7, "NONE");
    public static final CommentAuthorAssociation UNKNOWN__ = new CommentAuthorAssociation("UNKNOWN__", 8, "UNKNOWN__");

    private static final /* synthetic */ CommentAuthorAssociation[] $values() {
        return new CommentAuthorAssociation[]{MEMBER, OWNER, MANNEQUIN, COLLABORATOR, CONTRIBUTOR, FIRST_TIME_CONTRIBUTOR, FIRST_TIMER, NONE, UNKNOWN__};
    }

    static {
        CommentAuthorAssociation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new r01.a();
    }

    private CommentAuthorAssociation(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CommentAuthorAssociation valueOf(String str) {
        return (CommentAuthorAssociation) Enum.valueOf(CommentAuthorAssociation.class, str);
    }

    public static CommentAuthorAssociation[] values() {
        return (CommentAuthorAssociation[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }
}

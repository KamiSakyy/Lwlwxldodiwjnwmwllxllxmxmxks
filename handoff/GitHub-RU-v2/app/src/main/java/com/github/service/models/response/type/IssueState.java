package com.github.service.models.response.type;

import d71.a;
import r01.e;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class IssueState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IssueState[] $VALUES;
    public static final e Companion;
    private final String rawValue;
    public static final IssueState OPEN = new IssueState("OPEN", 0, "OPEN");
    public static final IssueState CLOSED = new IssueState("CLOSED", 1, "CLOSED");
    public static final IssueState UNKNOWN__ = new IssueState("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ IssueState[] $values() {
        return new IssueState[]{OPEN, CLOSED, UNKNOWN__};
    }

    static {
        IssueState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new e();
    }

    private IssueState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static IssueState valueOf(String str) {
        return (IssueState) Enum.valueOf(IssueState.class, str);
    }

    public static IssueState[] values() {
        return (IssueState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }

    public static Object name(Object... a) {
        return null;
    }
}

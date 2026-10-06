package com.github.service.models.response.issueorpullrequest;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class IssueTypeColor {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IssueTypeColor[] $VALUES;
    public static final IssueTypeColor GRAY = new IssueTypeColor("GRAY", 0);
    public static final IssueTypeColor BLUE = new IssueTypeColor("BLUE", 1);
    public static final IssueTypeColor GREEN = new IssueTypeColor("GREEN", 2);
    public static final IssueTypeColor YELLOW = new IssueTypeColor("YELLOW", 3);
    public static final IssueTypeColor RED = new IssueTypeColor("RED", 4);
    public static final IssueTypeColor PINK = new IssueTypeColor("PINK", 5);
    public static final IssueTypeColor PURPLE = new IssueTypeColor("PURPLE", 6);
    public static final IssueTypeColor UNKNOWN = new IssueTypeColor("UNKNOWN", 7);

    private static final /* synthetic */ IssueTypeColor[] $values() {
        return new IssueTypeColor[]{GRAY, BLUE, GREEN, YELLOW, RED, PINK, PURPLE, UNKNOWN};
    }

    static {
        IssueTypeColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private IssueTypeColor(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static IssueTypeColor valueOf(String str) {
        return (IssueTypeColor) Enum.valueOf(IssueTypeColor.class, str);
    }

    public static IssueTypeColor[] values() {
        return (IssueTypeColor[]) $VALUES.clone();
    }
    public Object name() { return null; }
}

package com.github.service.models.response.issueorpullrequest;

import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class CloseReason {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CloseReason[] $VALUES;
    public static final CloseReason Completed = new CloseReason("Completed", 0);
    public static final CloseReason NotPlanned = new CloseReason("NotPlanned", 1);
    public static final CloseReason Duplicate = new CloseReason("Duplicate", 2);

    private static final /* synthetic */ CloseReason[] $values() {
        return new CloseReason[]{Completed, NotPlanned, Duplicate};
    }

    static {
        CloseReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private CloseReason(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CloseReason valueOf(String str) {
        return (CloseReason) Enum.valueOf(CloseReason.class, str);
    }

    public static CloseReason[] values() {
        return (CloseReason[]) $VALUES.clone();
    }

    public <T0> T0 ordinal(Object... a) {
        return null;
    }

    public <T0> T0 name(Object... a) {
        return null;
    }

    public <T0> T0 w(Object... a) {
        return null;
    }
}

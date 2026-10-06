package com.github.service.models.response;

import v8.l0;
import yz0.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class CheckStatusState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ CheckStatusState[] $VALUES;
    public static final m Companion;
    private final String rawValue;
    public static final CheckStatusState QUEUED = new CheckStatusState("QUEUED", 0, "QUEUED");
    public static final CheckStatusState IN_PROGRESS = new CheckStatusState("IN_PROGRESS", 1, "IN_PROGRESS");
    public static final CheckStatusState COMPLETED = new CheckStatusState("COMPLETED", 2, "COMPLETED");
    public static final CheckStatusState WAITING = new CheckStatusState("WAITING", 3, "WAITING");
    public static final CheckStatusState REQUESTED = new CheckStatusState("REQUESTED", 4, "REQUESTED");
    public static final CheckStatusState UNKNOWN__ = new CheckStatusState("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ CheckStatusState[] $values() {
        return new CheckStatusState[]{QUEUED, IN_PROGRESS, COMPLETED, WAITING, REQUESTED, UNKNOWN__};
    }

    static {
        CheckStatusState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new m();
    }

    private CheckStatusState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static CheckStatusState valueOf(String str) {
        return (CheckStatusState) Enum.valueOf(CheckStatusState.class, str);
    }

    public static CheckStatusState[] values() {
        return (CheckStatusState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static  F(Object... a) {
        return null;
    }

    public static  ordinal(Object... a) {
        return null;
    }
}

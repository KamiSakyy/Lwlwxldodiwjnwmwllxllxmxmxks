package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ProjectState[] $VALUES;
    private final String rawValue;
    public static final ProjectState OPEN = new ProjectState("OPEN", 0, "OPEN");
    public static final ProjectState CLOSED = new ProjectState("CLOSED", 1, "CLOSED");
    public static final ProjectState UNKNOWN__ = new ProjectState("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ ProjectState[] $values() {
        return new ProjectState[]{OPEN, CLOSED, UNKNOWN__};
    }

    static {
        ProjectState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ProjectState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ProjectState valueOf(String str) {
        return (ProjectState) Enum.valueOf(ProjectState.class, str);
    }

    public static ProjectState[] values() {
        return (ProjectState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
    public Object name() { return null; }
}

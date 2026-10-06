package com.github.service.models.response;

import v8.l0;
import yz0.s8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class WorkflowState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ WorkflowState[] $VALUES;
    public static final s8 Companion;
    private String rawValue;
    public static final WorkflowState ACTIVE = new WorkflowState("ACTIVE", 0, "ACTIVE");
    public static final WorkflowState DELETED = new WorkflowState("DELETED", 1, "DELETED");
    public static final WorkflowState DISABLED_FORK = new WorkflowState("DISABLED_FORK", 2, "DISABLED_FORK");
    public static final WorkflowState DISABLED_INACTIVITY = new WorkflowState("DISABLED_INACTIVITY", 3, "DISABLED_INACTIVITY");
    public static final WorkflowState DISABLED_MANUALLY = new WorkflowState("DISABLED_MANUALLY", 4, "DISABLED_MANUALLY");
    public static final WorkflowState UNKNOWN__ = new WorkflowState("UNKNOWN__", 5, "UNKNOWN__");

    private static final /* synthetic */ WorkflowState[] $values() {
        return new WorkflowState[]{ACTIVE, DELETED, DISABLED_FORK, DISABLED_INACTIVITY, DISABLED_MANUALLY, UNKNOWN__};
    }

    static {
        WorkflowState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new s8();
    }

    private WorkflowState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static WorkflowState valueOf(String str) {
        return (WorkflowState) Enum.valueOf(WorkflowState.class, str);
    }

    public static WorkflowState[] values() {
        return (WorkflowState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

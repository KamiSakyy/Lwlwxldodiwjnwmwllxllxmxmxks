package com.github.service.models.response;

import v8.l0;
import yz0.a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class DeploymentStatusState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ DeploymentStatusState[] $VALUES;
    public static final a1 Companion;
    private String rawValue;
    public static final DeploymentStatusState PENDING = new DeploymentStatusState("PENDING", 0, "PENDING");
    public static final DeploymentStatusState SUCCESS = new DeploymentStatusState("SUCCESS", 1, "SUCCESS");
    public static final DeploymentStatusState FAILURE = new DeploymentStatusState("FAILURE", 2, "FAILURE");
    public static final DeploymentStatusState INACTIVE = new DeploymentStatusState("INACTIVE", 3, "INACTIVE");
    public static final DeploymentStatusState ERROR = new DeploymentStatusState("ERROR", 4, "ERROR");
    public static final DeploymentStatusState QUEUED = new DeploymentStatusState("QUEUED", 5, "QUEUED");
    public static final DeploymentStatusState IN_PROGRESS = new DeploymentStatusState("IN_PROGRESS", 6, "IN_PROGRESS");
    public static final DeploymentStatusState WAITING = new DeploymentStatusState("WAITING", 7, "WAITING");
    public static final DeploymentStatusState UNKNOWN__ = new DeploymentStatusState("UNKNOWN__", 8, "UNKNOWN__");

    private static final /* synthetic */ DeploymentStatusState[] $values() {
        return new DeploymentStatusState[]{PENDING, SUCCESS, FAILURE, INACTIVE, ERROR, QUEUED, IN_PROGRESS, WAITING, UNKNOWN__};
    }

    static {
        DeploymentStatusState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new a1();
    }

    private DeploymentStatusState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static DeploymentStatusState valueOf(String str) {
        return (DeploymentStatusState) Enum.valueOf(DeploymentStatusState.class, str);
    }

    public static DeploymentStatusState[] values() {
        return (DeploymentStatusState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

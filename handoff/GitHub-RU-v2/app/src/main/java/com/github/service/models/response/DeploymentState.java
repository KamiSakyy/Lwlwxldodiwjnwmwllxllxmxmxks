package com.github.service.models.response;

import v8.l0;
import yz0.z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class DeploymentState {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ DeploymentState[] $VALUES;
    public static final z0 Companion;
    private final String rawValue;
    public static final DeploymentState ABANDONED = new DeploymentState("ABANDONED", 0, "ABANDONED");
    public static final DeploymentState ACTIVE = new DeploymentState("ACTIVE", 1, "ACTIVE");
    public static final DeploymentState DESTROYED = new DeploymentState("DESTROYED", 2, "DESTROYED");
    public static final DeploymentState ERROR = new DeploymentState("ERROR", 3, "ERROR");
    public static final DeploymentState FAILURE = new DeploymentState("FAILURE", 4, "FAILURE");
    public static final DeploymentState INACTIVE = new DeploymentState("INACTIVE", 5, "INACTIVE");
    public static final DeploymentState PENDING = new DeploymentState("PENDING", 6, "PENDING");
    public static final DeploymentState QUEUED = new DeploymentState("QUEUED", 7, "QUEUED");
    public static final DeploymentState IN_PROGRESS = new DeploymentState("IN_PROGRESS", 8, "IN_PROGRESS");
    public static final DeploymentState SUCCESS = new DeploymentState("SUCCESS", 9, "SUCCESS");
    public static final DeploymentState WAITING = new DeploymentState("WAITING", 10, "WAITING");
    public static final DeploymentState UNKNOWN__ = new DeploymentState("UNKNOWN__", 11, "UNKNOWN__");

    private static final /* synthetic */ DeploymentState[] $values() {
        return new DeploymentState[]{ABANDONED, ACTIVE, DESTROYED, ERROR, FAILURE, INACTIVE, PENDING, QUEUED, IN_PROGRESS, SUCCESS, WAITING, UNKNOWN__};
    }

    static {
        DeploymentState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new z0();
    }

    private DeploymentState(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static DeploymentState valueOf(String str) {
        return (DeploymentState) Enum.valueOf(DeploymentState.class, str);
    }

    public static DeploymentState[] values() {
        return (DeploymentState[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

package com.github.service.models.response.projects;

import l01.r0;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectViewLayoutType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ProjectViewLayoutType[] $VALUES;
    public static final r0 Companion;
    private final String rawValue;
    public static final ProjectViewLayoutType BOARD = new ProjectViewLayoutType("BOARD", 0, "BOARD_LAYOUT");
    public static final ProjectViewLayoutType TABLE = new ProjectViewLayoutType("TABLE", 1, "TABLE_LAYOUT");
    public static final ProjectViewLayoutType ROADMAP = new ProjectViewLayoutType("ROADMAP", 2, "ROADMAP_LAYOUT");
    public static final ProjectViewLayoutType UNKNOWN = new ProjectViewLayoutType("UNKNOWN", 3, "UNKNOWN");

    private static final /* synthetic */ ProjectViewLayoutType[] $values() {
        return new ProjectViewLayoutType[]{BOARD, TABLE, ROADMAP, UNKNOWN};
    }

    static {
        ProjectViewLayoutType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new r0();
    }

    private ProjectViewLayoutType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ProjectViewLayoutType valueOf(String str) {
        return (ProjectViewLayoutType) Enum.valueOf(ProjectViewLayoutType.class, str);
    }

    public static ProjectViewLayoutType[] values() {
        return (ProjectViewLayoutType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

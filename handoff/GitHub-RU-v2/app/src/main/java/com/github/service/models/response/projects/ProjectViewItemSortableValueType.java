package com.github.service.models.response.projects;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectViewItemSortableValueType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ProjectViewItemSortableValueType[] $VALUES;
    public static final ProjectViewItemSortableValueType FLOAT = new ProjectViewItemSortableValueType("FLOAT", 0);
    public static final ProjectViewItemSortableValueType STRING = new ProjectViewItemSortableValueType("STRING", 1);
    public static final ProjectViewItemSortableValueType INTEGER = new ProjectViewItemSortableValueType("INTEGER", 2);
    public static final ProjectViewItemSortableValueType NULL = new ProjectViewItemSortableValueType("NULL", 3);

    private static final /* synthetic */ ProjectViewItemSortableValueType[] $values() {
        return new ProjectViewItemSortableValueType[]{FLOAT, STRING, INTEGER, NULL};
    }

    static {
        ProjectViewItemSortableValueType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ProjectViewItemSortableValueType(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ProjectViewItemSortableValueType valueOf(String str) {
        return (ProjectViewItemSortableValueType) Enum.valueOf(ProjectViewItemSortableValueType.class, str);
    }

    public static ProjectViewItemSortableValueType[] values() {
        return (ProjectViewItemSortableValueType[]) $VALUES.clone();
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

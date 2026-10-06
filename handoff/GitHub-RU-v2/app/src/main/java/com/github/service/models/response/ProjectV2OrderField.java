package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectV2OrderField {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ProjectV2OrderField[] $VALUES;
    public static final ProjectV2OrderField RECENTLY_VIEWED = new ProjectV2OrderField("RECENTLY_VIEWED", 0);
    public static final ProjectV2OrderField CREATED_AT = new ProjectV2OrderField("CREATED_AT", 1);
    public static final ProjectV2OrderField NUMBER = new ProjectV2OrderField("NUMBER", 2);
    public static final ProjectV2OrderField RELEVANCE = new ProjectV2OrderField("RELEVANCE", 3);
    public static final ProjectV2OrderField TITLE = new ProjectV2OrderField("TITLE", 4);
    public static final ProjectV2OrderField UPDATED_AT = new ProjectV2OrderField("UPDATED_AT", 5);

    private static final /* synthetic */ ProjectV2OrderField[] $values() {
        return new ProjectV2OrderField[]{RECENTLY_VIEWED, CREATED_AT, NUMBER, RELEVANCE, TITLE, UPDATED_AT};
    }

    static {
        ProjectV2OrderField[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private ProjectV2OrderField(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ProjectV2OrderField valueOf(String str) {
        return (ProjectV2OrderField) Enum.valueOf(ProjectV2OrderField.class, str);
    }

    public static ProjectV2OrderField[] values() {
        return (ProjectV2OrderField[]) $VALUES.clone();
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

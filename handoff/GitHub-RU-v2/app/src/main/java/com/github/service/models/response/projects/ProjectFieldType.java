package com.github.service.models.response.projects;

import l01.a0Shadow;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectFieldType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ ProjectFieldType[] $VALUES;
    public static final a0Shadow Companion;
    private String rawValue;
    public static final ProjectFieldType ASSIGNEES = new ProjectFieldType("ASSIGNEES", 0, "ASSIGNEES");
    public static final ProjectFieldType LINKED_PULL_REQUESTS = new ProjectFieldType("LINKED_PULL_REQUESTS", 1, "LINKED_PULL_REQUESTS");
    public static final ProjectFieldType REVIEWERS = new ProjectFieldType("REVIEWERS", 2, "REVIEWERS");
    public static final ProjectFieldType LABELS = new ProjectFieldType("LABELS", 3, "LABELS");
    public static final ProjectFieldType MILESTONE = new ProjectFieldType("MILESTONE", 4, "MILESTONE");
    public static final ProjectFieldType REPOSITORY = new ProjectFieldType("REPOSITORY", 5, "REPOSITORY");
    public static final ProjectFieldType TITLE = new ProjectFieldType("TITLE", 6, "TITLE");
    public static final ProjectFieldType TEXT = new ProjectFieldType("TEXT", 7, "TEXT");
    public static final ProjectFieldType SINGLE_SELECT = new ProjectFieldType("SINGLE_SELECT", 8, "SINGLE_SELECT");
    public static final ProjectFieldType NUMBER = new ProjectFieldType("NUMBER", 9, "NUMBER");
    public static final ProjectFieldType DATE = new ProjectFieldType("DATE", 10, "DATE");
    public static final ProjectFieldType ITERATION = new ProjectFieldType("ITERATION", 11, "ITERATION");
    public static final ProjectFieldType TRACKS = new ProjectFieldType("TRACKS", 12, "TRACKS");
    public static final ProjectFieldType UNKNOWN = new ProjectFieldType("UNKNOWN", 13, "UNKNOWN");

    private static final /* synthetic */ ProjectFieldType[] $values() {
        return new ProjectFieldType[]{ASSIGNEES, LINKED_PULL_REQUESTS, REVIEWERS, LABELS, MILESTONE, REPOSITORY, TITLE, TEXT, SINGLE_SELECT, NUMBER, DATE, ITERATION, TRACKS, UNKNOWN};
    }

    static {
        ProjectFieldType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new a0Shadow();
    }

    private ProjectFieldType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static ProjectFieldType valueOf(String str) {
        return (ProjectFieldType) Enum.valueOf(ProjectFieldType.class, str);
    }

    public static ProjectFieldType[] values() {
        return (ProjectFieldType[]) $VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public static Object ordinal(Object... a) {
        return null;
    }

    public static Object name(Object... a) {
        return null;
    }
    public Object name() { return null; }
}

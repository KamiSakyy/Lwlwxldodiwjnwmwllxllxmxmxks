package com.github.service.models.response;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class RepoFileType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ RepoFileType[] $VALUES;
    public static final RepoFileType IMAGE = new RepoFileType("IMAGE", 0);
    public static final RepoFileType PDF = new RepoFileType("PDF", 1);
    public static final RepoFileType MARKDOWN = new RepoFileType("MARKDOWN", 2);
    public static final RepoFileType TEXT = new RepoFileType("TEXT", 3);
    public static final RepoFileType UNKNOWN = new RepoFileType("UNKNOWN", 4);

    private static final /* synthetic */ RepoFileType[] $values() {
        return new RepoFileType[]{IMAGE, PDF, MARKDOWN, TEXT, UNKNOWN};
    }

    static {
        RepoFileType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private RepoFileType(String str, int i) {
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static RepoFileType valueOf(String str) {
        return (RepoFileType) Enum.valueOf(RepoFileType.class, str);
    }

    public static RepoFileType[] values() {
        return (RepoFileType[]) $VALUES.clone();
    }
}

package com.github.service.models.response;

import v8.l0;
import yz0.s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class GitObjectType {
    private static final /* synthetic */ d71.a $ENTRIES;
    private static final /* synthetic */ GitObjectType[] $VALUES;
    public static final s1 Companion;
    private String rawTypeNameValue;
    public static final GitObjectType BLOB = new GitObjectType("BLOB", 0, "blob");
    public static final GitObjectType TREE = new GitObjectType("TREE", 1, "tree");
    public static final GitObjectType COMMIT = new GitObjectType("COMMIT", 2, "commit");
    public static final GitObjectType TAG = new GitObjectType("TAG", 3, "tag");
    public static final GitObjectType UNKNOWN__ = new GitObjectType("UNKNOWN__", 4, "unknown__");

    private static final /* synthetic */ GitObjectType[] $values() {
        return new GitObjectType[]{BLOB, TREE, COMMIT, TAG, UNKNOWN__};
    }

    static {
        GitObjectType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
        Companion = new s1();
    }

    private GitObjectType(String str, int i, String str2) {
        this.rawTypeNameValue = str2;
    }

    public static d71.a getEntries() {
        return $ENTRIES;
    }

    public static GitObjectType valueOf(String str) {
        return (GitObjectType) Enum.valueOf(GitObjectType.class, str);
    }

    public static GitObjectType[] values() {
        return (GitObjectType[]) $VALUES.clone();
    }

    public final String getRawTypeNameValue() {
        return this.rawTypeNameValue;
    }
}

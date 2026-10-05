package sn;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final /* synthetic */ b[] r;

    static {
        b[] bVarArr = {new b("DEPLOYED", 0), new b("HEAD_REF", 1), new b("MERGEABILITY", 2), new b("MERGE_QUEUE", 3), new b("REVIEW_STATE", 4), new b("STATE", 5), new b("TIMELINE", 6), new b("UPDATED", 7), new b("WORKFLOWS", 8)};
        r = bVarArr;
        l0.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) r.clone();
    }
}

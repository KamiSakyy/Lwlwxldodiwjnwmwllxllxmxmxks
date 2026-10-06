package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bt {
    public static final at Companion;
    public static final bt s;
    public static final /* synthetic */ bt[] t;
    public final String r;

    static {
        bt btVar = new bt("BASE_REF", 0, "BASE_REF");
        bt btVar2 = new bt("COMMIT_HEAD_SHA", 1, "COMMIT_HEAD_SHA");
        bt btVar3 = new bt("DEPLOYED", 2, "DEPLOYED");
        bt btVar4 = new bt("GIT_MERGE_STATE", 3, "GIT_MERGE_STATE");
        bt btVar5 = new bt("HEAD_REF", 4, "HEAD_REF");
        bt btVar6 = new bt("MERGEABILITY", 5, "MERGEABILITY");
        bt btVar7 = new bt("MERGE_QUEUE", 6, "MERGE_QUEUE");
        bt btVar8 = new bt("PRESENCE", 7, "PRESENCE");
        bt btVar9 = new bt("REVIEW_STATE", 8, "REVIEW_STATE");
        bt btVar10 = new bt("STATE", 9, "STATE");
        bt btVar11 = new bt("TIMELINE", 10, "TIMELINE");
        bt btVar12 = new bt("UPDATED", 11, "UPDATED");
        s = btVar12;
        bt[] btVarArr = {btVar, btVar2, btVar3, btVar4, btVar5, btVar6, btVar7, btVar8, btVar9, btVar10, btVar11, btVar12, new bt("WORKFLOWS", 12, "WORKFLOWS"), new bt("UNKNOWN__", 13, "UNKNOWN__")};
        t = btVarArr;
        v8.l0.t(btVarArr);
        Companion = new at();
        sy.d0.o(new String[]{"BASE_REF", "COMMIT_HEAD_SHA", "DEPLOYED", "GIT_MERGE_STATE", "HEAD_REF", "MERGEABILITY", "MERGE_QUEUE", "PRESENCE", "REVIEW_STATE", "STATE", "TIMELINE", "UPDATED", "WORKFLOWS"});
    }

    public bt(String str, int i, String str2) {
        this.r = str2;
    }

    public static bt valueOf(String str) {
        return (bt) Enum.valueOf(bt.class, str);
    }

    public static bt[] values() {
        return (bt[]) t.clone();
    }
}

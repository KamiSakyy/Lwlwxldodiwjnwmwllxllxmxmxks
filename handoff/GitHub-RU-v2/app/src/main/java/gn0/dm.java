package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class dm {
    public static final cm Companion;
    public static final dm s;
    public static final /* synthetic */ dm[] t;
    public final String r;

    static {
        dm dmVar = new dm("BASE_REF", 0, "BASE_REF");
        dm dmVar2 = new dm("COMMIT_HEAD_SHA", 1, "COMMIT_HEAD_SHA");
        dm dmVar3 = new dm("DEPLOYED", 2, "DEPLOYED");
        dm dmVar4 = new dm("GIT_MERGE_STATE", 3, "GIT_MERGE_STATE");
        dm dmVar5 = new dm("HEAD_REF", 4, "HEAD_REF");
        dm dmVar6 = new dm("MERGEABILITY", 5, "MERGEABILITY");
        dm dmVar7 = new dm("MERGE_QUEUE", 6, "MERGE_QUEUE");
        dm dmVar8 = new dm("PRESENCE", 7, "PRESENCE");
        dm dmVar9 = new dm("REVIEW_STATE", 8, "REVIEW_STATE");
        dm dmVar10 = new dm("STATE", 9, "STATE");
        dm dmVar11 = new dm("TIMELINE", 10, "TIMELINE");
        dm dmVar12 = new dm("UPDATED", 11, "UPDATED");
        s = dmVar12;
        dm[] dmVarArr = {dmVar, dmVar2, dmVar3, dmVar4, dmVar5, dmVar6, dmVar7, dmVar8, dmVar9, dmVar10, dmVar11, dmVar12, new dm("WORKFLOWS", 12, "WORKFLOWS"), new dm("UNKNOWN__", 13, "UNKNOWN__")};
        t = dmVarArr;
        v8.l0.t(dmVarArr);
        Companion = new cm();
        sy.d0.o(new String[]{"BASE_REF", "COMMIT_HEAD_SHA", "DEPLOYED", "GIT_MERGE_STATE", "HEAD_REF", "MERGEABILITY", "MERGE_QUEUE", "PRESENCE", "REVIEW_STATE", "STATE", "TIMELINE", "UPDATED", "WORKFLOWS"});
    }

    public dm(String str, int i, String str2) {
        this.r = str2;
    }

    public static dm valueOf(String str) {
        return (dm) Enum.valueOf(dm.class, str);
    }

    public static dm[] values() {
        return (dm[]) t.clone();
    }
}

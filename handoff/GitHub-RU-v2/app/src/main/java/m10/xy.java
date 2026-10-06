package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class xy {
    public static final wy Companion;
    public static final xy s;
    public static final /* synthetic */ xy[] t;
    public String r;

    static {
        xy xyVar = new xy("BASE_REF", 0, "BASE_REF");
        xy xyVar2 = new xy("COMMIT_HEAD_SHA", 1, "COMMIT_HEAD_SHA");
        xy xyVar3 = new xy("DEPLOYED", 2, "DEPLOYED");
        xy xyVar4 = new xy("GIT_MERGE_STATE", 3, "GIT_MERGE_STATE");
        xy xyVar5 = new xy("HEAD_REF", 4, "HEAD_REF");
        xy xyVar6 = new xy("MERGEABILITY", 5, "MERGEABILITY");
        xy xyVar7 = new xy("MERGE_QUEUE", 6, "MERGE_QUEUE");
        xy xyVar8 = new xy("PRESENCE", 7, "PRESENCE");
        xy xyVar9 = new xy("REVIEW_STATE", 8, "REVIEW_STATE");
        xy xyVar10 = new xy("STATE", 9, "STATE");
        xy xyVar11 = new xy("TIMELINE", 10, "TIMELINE");
        xy xyVar12 = new xy("UPDATED", 11, "UPDATED");
        s = xyVar12;
        xy[] xyVarArr = {xyVar, xyVar2, xyVar3, xyVar4, xyVar5, xyVar6, xyVar7, xyVar8, xyVar9, xyVar10, xyVar11, xyVar12, new xy("WORKFLOWS", 12, "WORKFLOWS"), new xy("UNKNOWN__", 13, "UNKNOWN__")};
        t = xyVarArr;
        v8.l0.t(xyVarArr);
        Companion = new wy();
        sy.d0Shadow.o("BASE_REF", "COMMIT_HEAD_SHA", "DEPLOYED", "GIT_MERGE_STATE", "HEAD_REF", "MERGEABILITY", "MERGE_QUEUE", "PRESENCE", "REVIEW_STATE", "STATE", "TIMELINE", "UPDATED", "WORKFLOWS");
    }

    public xy(String str, int i, String str2) {
        this.r = str2;
    }

    public static xy valueOf(String str) {
        return (xy) Enum.valueOf(xy.class, str);
    }

    public static xy[] values() {
        return (xy[]) t.clone();
    }
}

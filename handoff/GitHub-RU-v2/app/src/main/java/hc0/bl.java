package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bl {
    public static final al Companion;
    public static final bl s;
    public static final /* synthetic */ bl[] t;
    public final String r;

    static {
        bl blVar = new bl("DEPLOYED", 0, "DEPLOYED");
        bl blVar2 = new bl("HEAD_REF", 1, "HEAD_REF");
        bl blVar3 = new bl("MERGEABILITY", 2, "MERGEABILITY");
        bl blVar4 = new bl("MERGE_QUEUE", 3, "MERGE_QUEUE");
        bl blVar5 = new bl("PRESENCE", 4, "PRESENCE");
        bl blVar6 = new bl("REVIEW_STATE", 5, "REVIEW_STATE");
        bl blVar7 = new bl("STATE", 6, "STATE");
        bl blVar8 = new bl("TIMELINE", 7, "TIMELINE");
        bl blVar9 = new bl("UPDATED", 8, "UPDATED");
        s = blVar9;
        bl[] blVarArr = {blVar, blVar2, blVar3, blVar4, blVar5, blVar6, blVar7, blVar8, blVar9, new bl("WORKFLOWS", 9, "WORKFLOWS"), new bl("UNKNOWN__", 10, "UNKNOWN__")};
        t = blVarArr;
        v8.l0.t(blVarArr);
        Companion = new al();
        sy.d0.o(new String[]{"DEPLOYED", "HEAD_REF", "MERGEABILITY", "MERGE_QUEUE", "PRESENCE", "REVIEW_STATE", "STATE", "TIMELINE", "UPDATED", "WORKFLOWS"});
    }

    public bl(String str, int i, String str2) {
        this.r = str2;
    }

    public static bl valueOf(String str) {
        return (bl) Enum.valueOf(bl.class, str);
    }

    public static bl[] values() {
        return (bl[]) t.clone();
    }
}

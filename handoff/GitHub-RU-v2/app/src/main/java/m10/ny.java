package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ny {
    public static final my Companion;
    public static final aa.a0 s;
    public static final ny t;
    public static final ny u;
    public static final ny v;
    public static final /* synthetic */ ny[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        ny nyVar = new ny("DIRECT_MERGE", 0, "DIRECT_MERGE");
        t = nyVar;
        ny nyVar2 = new ny("MERGE_QUEUE", 1, "MERGE_QUEUE");
        u = nyVar2;
        ny nyVar3 = new ny("UNKNOWN__", 2, "UNKNOWN__");
        v = nyVar3;
        ny[] nyVarArr = {nyVar, nyVar2, nyVar3};
        w = nyVarArr;
        x = v8.l0.t(nyVarArr);
        Companion = new my();
        x61.l.r(new String[]{"DIRECT_MERGE", "MERGE_QUEUE"});
        s = new aa.a0("PullRequestMergeAction");
    }

    public ny(String str, int i, String str2) {
        this.r = str2;
    }

    public static ny valueOf(String str) {
        return (ny) Enum.valueOf(ny.class, str);
    }

    public static ny[] values() {
        return (ny[]) w.clone();
    }
}

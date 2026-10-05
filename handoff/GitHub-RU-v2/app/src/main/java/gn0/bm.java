package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bm {
    public static final am Companion;
    public static final aa.a0 s;
    public static final bm t;
    public static final bm u;
    public static final bm v;
    public static final bm w;
    public static final /* synthetic */ bm[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        bm bmVar = new bm("MERGE", 0, "MERGE");
        t = bmVar;
        bm bmVar2 = new bm("REBASE", 1, "REBASE");
        u = bmVar2;
        bm bmVar3 = new bm("SQUASH", 2, "SQUASH");
        v = bmVar3;
        bm bmVar4 = new bm("UNKNOWN__", 3, "UNKNOWN__");
        w = bmVar4;
        bm[] bmVarArr = {bmVar, bmVar2, bmVar3, bmVar4};
        x = bmVarArr;
        y = v8.l0.t(bmVarArr);
        Companion = new am();
        x61.l.r(new String[]{"MERGE", "REBASE", "SQUASH"});
        s = new aa.a0("PullRequestMergeMethod");
    }

    public bm(String str, int i, String str2) {
        this.r = str2;
    }

    public static bm valueOf(String str) {
        return (bm) Enum.valueOf(bm.class, str);
    }

    public static bm[] values() {
        return (bm[]) x.clone();
    }
}

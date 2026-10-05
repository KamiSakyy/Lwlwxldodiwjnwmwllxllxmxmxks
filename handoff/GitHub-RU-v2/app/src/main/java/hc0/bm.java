package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bm {
    public static final am Companion;
    public static final aa.a0 s;
    public static final bm t;
    public static final bm u;
    public static final bm v;
    public static final /* synthetic */ bm[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        bm bmVar = new bm("FILE", 0, "FILE");
        t = bmVar;
        bm bmVar2 = new bm("LINE", 1, "LINE");
        u = bmVar2;
        bm bmVar3 = new bm("UNKNOWN__", 2, "UNKNOWN__");
        v = bmVar3;
        bm[] bmVarArr = {bmVar, bmVar2, bmVar3};
        w = bmVarArr;
        x = v8.l0.t(bmVarArr);
        Companion = new am();
        x61.l.r(new String[]{"FILE", "LINE"});
        s = new aa.a0("PullRequestReviewThreadSubjectType");
    }

    public bm(String str, int i, String str2) {
        this.r = str2;
    }

    public static bm valueOf(String str) {
        return (bm) Enum.valueOf(bm.class, str);
    }

    public static bm[] values() {
        return (bm[]) w.clone();
    }
}

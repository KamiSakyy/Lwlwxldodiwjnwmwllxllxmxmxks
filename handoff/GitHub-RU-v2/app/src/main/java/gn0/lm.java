package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class lm {
    public static final km Companion;
    public static final aa.a0 s;
    public static final lm t;
    public static final /* synthetic */ lm[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        lm lmVar = new lm("PENDING", 0, "PENDING");
        lm lmVar2 = new lm("SUBMITTED", 1, "SUBMITTED");
        lm lmVar3 = new lm("UNKNOWN__", 2, "UNKNOWN__");
        t = lmVar3;
        lm[] lmVarArr = {lmVar, lmVar2, lmVar3};
        u = lmVarArr;
        v = v8.l0.t(lmVarArr);
        Companion = new km();
        x61.l.r(new String[]{"PENDING", "SUBMITTED"});
        s = new aa.a0("PullRequestReviewCommentState");
    }

    public lm(String str, int i, String str2) {
        this.r = str2;
    }

    public static lm valueOf(String str) {
        return (lm) Enum.valueOf(lm.class, str);
    }

    public static lm[] values() {
        return (lm[]) u.clone();
    }
}

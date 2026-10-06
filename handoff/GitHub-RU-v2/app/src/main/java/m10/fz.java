package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class fz {
    public static final ez Companion;
    public static final aa.a0 s;
    public static final fz t;
    public static final /* synthetic */ fz[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        fz fzVar = new fz("PENDING", 0, "PENDING");
        fz fzVar2 = new fz("SUBMITTED", 1, "SUBMITTED");
        fz fzVar3 = new fz("UNKNOWN__", 2, "UNKNOWN__");
        t = fzVar3;
        fz[] fzVarArr = {fzVar, fzVar2, fzVar3};
        u = fzVarArr;
        v = v8.l0.t(fzVarArr);
        Companion = new ez();
        x61.l.r(new String[]{"PENDING", "SUBMITTED"});
        s = new aa.a0("PullRequestReviewCommentState");
    }

    public fz(String str, int i, String str2) {
        this.r = str2;
    }

    public static fz valueOf(String str) {
        return (fz) Enum.valueOf(fz.class, str);
    }

    public static fz[] values() {
        return (fz[]) u.clone();
    }
    public Object ordinal() { return null; }
}

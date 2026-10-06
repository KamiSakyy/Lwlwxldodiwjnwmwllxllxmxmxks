package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class kt {
    public static final jt Companion;
    public static final aa.a0 s;
    public static final kt t;
    public static final /* synthetic */ kt[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        kt ktVar = new kt("PENDING", 0, "PENDING");
        kt ktVar2 = new kt("SUBMITTED", 1, "SUBMITTED");
        kt ktVar3 = new kt("UNKNOWN__", 2, "UNKNOWN__");
        t = ktVar3;
        kt[] ktVarArr = {ktVar, ktVar2, ktVar3};
        u = ktVarArr;
        v = v8.l0.t(ktVarArr);
        Companion = new jt();
        x61.l.r(new String[]{"PENDING", "SUBMITTED"});
        s = new aa.a0("PullRequestReviewCommentState");
    }

    public kt(String str, int i, String str2) {
        this.r = str2;
    }

    public static kt valueOf(String str) {
        return (kt) Enum.valueOf(kt.class, str);
    }

    public static kt[] values() {
        return (kt[]) u.clone();
    }
    public Object ordinal() { return null; }
}

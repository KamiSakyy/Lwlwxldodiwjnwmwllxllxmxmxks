package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class xm {
    public static final wm Companion;
    public static final aa.a0 s;
    public static final xm t;
    public static final /* synthetic */ xm[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        xm xmVar = new xm("APPROVED", 0, "APPROVED");
        xm xmVar2 = new xm("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        xm xmVar3 = new xm("COMMENTED", 2, "COMMENTED");
        xm xmVar4 = new xm("DISMISSED", 3, "DISMISSED");
        xm xmVar5 = new xm("PENDING", 4, "PENDING");
        xm xmVar6 = new xm("UNKNOWN__", 5, "UNKNOWN__");
        t = xmVar6;
        xm[] xmVarArr = {xmVar, xmVar2, xmVar3, xmVar4, xmVar5, xmVar6};
        u = xmVarArr;
        v = v8.l0.t(xmVarArr);
        Companion = new wm();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "COMMENTED", "DISMISSED", "PENDING"});
        s = new aa.a0("PullRequestReviewState");
    }

    public xm(String str, int i, String str2) {
        this.r = str2;
    }

    public static xm valueOf(String str) {
        return (xm) Enum.valueOf(xm.class, str);
    }

    public static xm[] values() {
        return (xm[]) u.clone();
    }
}

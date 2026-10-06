package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class vl {
    public static final ul Companion;
    public static final aa.a0 s;
    public static final vl t;
    public static final /* synthetic */ vl[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        vl vlVar = new vl("APPROVED", 0, "APPROVED");
        vl vlVar2 = new vl("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        vl vlVar3 = new vl("COMMENTED", 2, "COMMENTED");
        vl vlVar4 = new vl("DISMISSED", 3, "DISMISSED");
        vl vlVar5 = new vl("PENDING", 4, "PENDING");
        vl vlVar6 = new vl("UNKNOWN__", 5, "UNKNOWN__");
        t = vlVar6;
        vl[] vlVarArr = {vlVar, vlVar2, vlVar3, vlVar4, vlVar5, vlVar6};
        u = vlVarArr;
        v = v8.l0.t(vlVarArr);
        Companion = new ul();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "COMMENTED", "DISMISSED", "PENDING"});
        s = new aa.a0("PullRequestReviewState");
    }

    public vl(String str, int i, String str2) {
        this.r = str2;
    }

    public static vl valueOf(String str) {
        return (vl) Enum.valueOf(vl.class, str);
    }

    public static vl[] values() {
        return (vl[]) u.clone();
    }
}

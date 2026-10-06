package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class wt {
    public static final vt Companion;
    public static final aa.a0 s;
    public static final wt t;
    public static final /* synthetic */ wt[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        wt wtVar = new wt("APPROVED", 0, "APPROVED");
        wt wtVar2 = new wt("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        wt wtVar3 = new wt("COMMENTED", 2, "COMMENTED");
        wt wtVar4 = new wt("DISMISSED", 3, "DISMISSED");
        wt wtVar5 = new wt("PENDING", 4, "PENDING");
        wt wtVar6 = new wt("UNKNOWN__", 5, "UNKNOWN__");
        t = wtVar6;
        wt[] wtVarArr = {wtVar, wtVar2, wtVar3, wtVar4, wtVar5, wtVar6};
        u = wtVarArr;
        v = v8.l0.t(wtVarArr);
        Companion = new vt();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "COMMENTED", "DISMISSED", "PENDING"});
        s = new aa.a0("PullRequestReviewState");
    }

    public wt(String str, int i, String str2) {
        this.r = str2;
    }

    public static wt valueOf(String str) {
        return (wt) Enum.valueOf(wt.class, str);
    }

    public static wt[] values() {
        return (wt[]) u.clone();
    }
}

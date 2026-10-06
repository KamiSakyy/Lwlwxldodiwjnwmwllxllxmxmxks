package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class pm {
    public static final om Companion;
    public static final aa.a0 s;
    public static final pm t;
    public static final /* synthetic */ pm[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        pm pmVar = new pm("APPROVED", 0, "APPROVED");
        pm pmVar2 = new pm("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        pm pmVar3 = new pm("REVIEW_REQUIRED", 2, "REVIEW_REQUIRED");
        pm pmVar4 = new pm("UNKNOWN__", 3, "UNKNOWN__");
        t = pmVar4;
        pm[] pmVarArr = {pmVar, pmVar2, pmVar3, pmVar4};
        u = pmVarArr;
        v = v8.l0.t(pmVarArr);
        Companion = new om();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "REVIEW_REQUIRED"});
        s = new aa.a0("PullRequestReviewDecision");
    }

    public pm(String str, int i, String str2) {
        this.r = str2;
    }

    public static pm valueOf(String str) {
        return (pm) Enum.valueOf(pm.class, str);
    }

    public static pm[] values() {
        return (pm[]) u.clone();
    }
    public Object ordinal() { return null; }
}

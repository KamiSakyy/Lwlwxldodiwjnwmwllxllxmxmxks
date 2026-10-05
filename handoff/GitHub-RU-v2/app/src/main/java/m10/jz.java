package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class jz {
    public static final iz Companion;
    public static final aa.a0 s;
    public static final jz t;
    public static final /* synthetic */ jz[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        jz jzVar = new jz("APPROVED", 0, "APPROVED");
        jz jzVar2 = new jz("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        jz jzVar3 = new jz("REVIEW_REQUIRED", 2, "REVIEW_REQUIRED");
        jz jzVar4 = new jz("UNKNOWN__", 3, "UNKNOWN__");
        t = jzVar4;
        jz[] jzVarArr = {jzVar, jzVar2, jzVar3, jzVar4};
        u = jzVarArr;
        v = v8.l0.t(jzVarArr);
        Companion = new iz();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "REVIEW_REQUIRED"});
        s = new aa.a0("PullRequestReviewDecision");
    }

    public jz(String str, int i, String str2) {
        this.r = str2;
    }

    public static jz valueOf(String str) {
        return (jz) Enum.valueOf(jz.class, str);
    }

    public static jz[] values() {
        return (jz[]) u.clone();
    }
}

package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ot {
    public static final nt Companion;
    public static final aa.a0 s;
    public static final ot t;
    public static final /* synthetic */ ot[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        ot otVar = new ot("APPROVED", 0, "APPROVED");
        ot otVar2 = new ot("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        ot otVar3 = new ot("REVIEW_REQUIRED", 2, "REVIEW_REQUIRED");
        ot otVar4 = new ot("UNKNOWN__", 3, "UNKNOWN__");
        t = otVar4;
        ot[] otVarArr = {otVar, otVar2, otVar3, otVar4};
        u = otVarArr;
        v = v8.l0.t(otVarArr);
        Companion = new nt();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "REVIEW_REQUIRED"});
        s = new aa.a0("PullRequestReviewDecision");
    }

    public ot(String str, int i, String str2) {
        this.r = str2;
    }

    public static ot valueOf(String str) {
        return (ot) Enum.valueOf(ot.class, str);
    }

    public static ot[] values() {
        return (ot[]) u.clone();
    }
    public Object ordinal() { return null; }
}

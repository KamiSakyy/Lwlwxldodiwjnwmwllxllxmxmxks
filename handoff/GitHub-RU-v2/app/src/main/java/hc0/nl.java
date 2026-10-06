package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class nl {
    public static final ml Companion;
    public static final aa.a0 s;
    public static final nl t;
    public static final /* synthetic */ nl[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        nl nlVar = new nl("APPROVED", 0, "APPROVED");
        nl nlVar2 = new nl("CHANGES_REQUESTED", 1, "CHANGES_REQUESTED");
        nl nlVar3 = new nl("REVIEW_REQUIRED", 2, "REVIEW_REQUIRED");
        nl nlVar4 = new nl("UNKNOWN__", 3, "UNKNOWN__");
        t = nlVar4;
        nl[] nlVarArr = {nlVar, nlVar2, nlVar3, nlVar4};
        u = nlVarArr;
        v = v8.l0.t(nlVarArr);
        Companion = new ml();
        x61.l.r(new String[]{"APPROVED", "CHANGES_REQUESTED", "REVIEW_REQUIRED"});
        s = new aa.a0("PullRequestReviewDecision");
    }

    public nl(String str, int i, String str2) {
        this.r = str2;
    }

    public static nl valueOf(String str) {
        return (nl) Enum.valueOf(nl.class, str);
    }

    public static nl[] values() {
        return (nl[]) u.clone();
    }
    public Object ordinal() { return null; }
    public Object i = null;
}

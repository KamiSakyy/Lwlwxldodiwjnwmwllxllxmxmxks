package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class dn {
    public static final cn Companion;
    public static final aa.a0 s;
    public static final dn t;
    public static final dn u;
    public static final dn v;
    public static final /* synthetic */ dn[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        dn dnVar = new dn("FILE", 0, "FILE");
        t = dnVar;
        dn dnVar2 = new dn("LINE", 1, "LINE");
        u = dnVar2;
        dn dnVar3 = new dn("UNKNOWN__", 2, "UNKNOWN__");
        v = dnVar3;
        dn[] dnVarArr = {dnVar, dnVar2, dnVar3};
        w = dnVarArr;
        x = v8.l0.t(dnVarArr);
        Companion = new cn();
        x61.l.r(new String[]{"FILE", "LINE"});
        s = new aa.a0("PullRequestReviewThreadSubjectType");
    }

    public dn(String str, int i, String str2) {
        this.r = str2;
    }

    public static dn valueOf(String str) {
        return (dn) Enum.valueOf(dn.class, str);
    }

    public static dn[] values() {
        return (dn[]) w.clone();
    }
}

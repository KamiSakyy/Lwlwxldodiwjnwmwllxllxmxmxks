package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class cu {
    public static final bu Companion;
    public static final aa.a0 s;
    public static final cu t;
    public static final cu u;
    public static final cu v;
    public static final /* synthetic */ cu[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        cu cuVar = new cu("FILE", 0, "FILE");
        t = cuVar;
        cu cuVar2 = new cu("LINE", 1, "LINE");
        u = cuVar2;
        cu cuVar3 = new cu("UNKNOWN__", 2, "UNKNOWN__");
        v = cuVar3;
        cu[] cuVarArr = {cuVar, cuVar2, cuVar3};
        w = cuVarArr;
        x = v8.l0.t(cuVarArr);
        Companion = new bu();
        x61.l.r(new String[]{"FILE", "LINE"});
        s = new aa.a0("PullRequestReviewThreadSubjectType");
    }

    public cu(String str, int i, String str2) {
        this.r = str2;
    }

    public static cu valueOf(String str) {
        return (cu) Enum.valueOf(cu.class, str);
    }

    public static cu[] values() {
        return (cu[]) w.clone();
    }
    public Object ordinal() { return null; }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class dg0 {
    public static final dg0 A;
    public static final /* synthetic */ dg0[] B;
    public static final /* synthetic */ d71.b C;
    public static final cg0 Companion;
    public static final aa.a0 s;
    public static final dg0 t;
    public static final dg0 u;
    public static final dg0 v;
    public static final dg0 w;
    public static final dg0 x;
    public static final dg0 y;
    public static final dg0 z;
    public final String r;

    static {
        dg0 dg0Var = new dg0("DISCUSSIONS", 0, "DISCUSSIONS");
        t = dg0Var;
        dg0 dg0Var2 = new dg0("ISSUES", 1, "ISSUES");
        u = dg0Var2;
        dg0 dg0Var3 = new dg0("ORGANIZATIONS", 2, "ORGANIZATIONS");
        v = dg0Var3;
        dg0 dg0Var4 = new dg0("PROJECTS", 3, "PROJECTS");
        w = dg0Var4;
        dg0 dg0Var5 = new dg0("PULL_REQUESTS", 4, "PULL_REQUESTS");
        x = dg0Var5;
        dg0 dg0Var6 = new dg0("REPOSITORIES", 5, "REPOSITORIES");
        y = dg0Var6;
        dg0 dg0Var7 = new dg0("STARRED", 6, "STARRED");
        z = dg0Var7;
        dg0 dg0Var8 = new dg0("UNKNOWN__", 7, "UNKNOWN__");
        A = dg0Var8;
        dg0[] dg0VarArr = {dg0Var, dg0Var2, dg0Var3, dg0Var4, dg0Var5, dg0Var6, dg0Var7, dg0Var8};
        B = dg0VarArr;
        C = v8.l0.t(dg0VarArr);
        Companion = new cg0();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "ORGANIZATIONS", "PROJECTS", "PULL_REQUESTS", "REPOSITORIES", "STARRED"});
        s = new aa.a0("UserDashboardNavLinkIdentifier");
    }

    public dg0(String str, int i, String str2) {
        this.r = str2;
    }

    public static dg0 valueOf(String str) {
        return (dg0) Enum.valueOf(dg0.class, str);
    }

    public static dg0[] values() {
        return (dg0[]) B.clone();
    }
}

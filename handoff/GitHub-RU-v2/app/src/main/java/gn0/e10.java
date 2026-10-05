package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class e10 {
    public static final e10 A;
    public static final /* synthetic */ e10[] B;
    public static final /* synthetic */ d71.b C;
    public static final d10 Companion;
    public static final aa.a0 s;
    public static final e10 t;
    public static final e10 u;
    public static final e10 v;
    public static final e10 w;
    public static final e10 x;
    public static final e10 y;
    public static final e10 z;
    public final String r;

    static {
        e10 e10Var = new e10("DISCUSSIONS", 0, "DISCUSSIONS");
        t = e10Var;
        e10 e10Var2 = new e10("ISSUES", 1, "ISSUES");
        u = e10Var2;
        e10 e10Var3 = new e10("ORGANIZATIONS", 2, "ORGANIZATIONS");
        v = e10Var3;
        e10 e10Var4 = new e10("PROJECTS", 3, "PROJECTS");
        w = e10Var4;
        e10 e10Var5 = new e10("PULL_REQUESTS", 4, "PULL_REQUESTS");
        x = e10Var5;
        e10 e10Var6 = new e10("REPOSITORIES", 5, "REPOSITORIES");
        y = e10Var6;
        e10 e10Var7 = new e10("STARRED", 6, "STARRED");
        z = e10Var7;
        e10 e10Var8 = new e10("UNKNOWN__", 7, "UNKNOWN__");
        A = e10Var8;
        e10[] e10VarArr = {e10Var, e10Var2, e10Var3, e10Var4, e10Var5, e10Var6, e10Var7, e10Var8};
        B = e10VarArr;
        C = v8.l0.t(e10VarArr);
        Companion = new d10();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "ORGANIZATIONS", "PROJECTS", "PULL_REQUESTS", "REPOSITORIES", "STARRED"});
        s = new aa.a0("UserDashboardNavLinkIdentifier");
    }

    public e10(String str, int i, String str2) {
        this.r = str2;
    }

    public static e10 valueOf(String str) {
        return (e10) Enum.valueOf(e10.class, str);
    }

    public static e10[] values() {
        return (e10[]) B.clone();
    }
}

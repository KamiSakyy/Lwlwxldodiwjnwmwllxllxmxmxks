package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class i90 {
    public static final i90 A;
    public static final /* synthetic */ i90[] B;
    public static final /* synthetic */ d71.b C;
    public static final h90 Companion;
    public static final aa.a0 s;
    public static final i90 t;
    public static final i90 u;
    public static final i90 v;
    public static final i90 w;
    public static final i90 x;
    public static final i90 y;
    public static final i90 z;
    public final String r;

    static {
        i90 i90Var = new i90("DISCUSSIONS", 0, "DISCUSSIONS");
        t = i90Var;
        i90 i90Var2 = new i90("ISSUES", 1, "ISSUES");
        u = i90Var2;
        i90 i90Var3 = new i90("ORGANIZATIONS", 2, "ORGANIZATIONS");
        v = i90Var3;
        i90 i90Var4 = new i90("PROJECTS", 3, "PROJECTS");
        w = i90Var4;
        i90 i90Var5 = new i90("PULL_REQUESTS", 4, "PULL_REQUESTS");
        x = i90Var5;
        i90 i90Var6 = new i90("REPOSITORIES", 5, "REPOSITORIES");
        y = i90Var6;
        i90 i90Var7 = new i90("STARRED", 6, "STARRED");
        z = i90Var7;
        i90 i90Var8 = new i90("UNKNOWN__", 7, "UNKNOWN__");
        A = i90Var8;
        i90[] i90VarArr = {i90Var, i90Var2, i90Var3, i90Var4, i90Var5, i90Var6, i90Var7, i90Var8};
        B = i90VarArr;
        C = v8.l0.t(i90VarArr);
        Companion = new h90();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "ORGANIZATIONS", "PROJECTS", "PULL_REQUESTS", "REPOSITORIES", "STARRED"});
        s = new aa.a0("UserDashboardNavLinkIdentifier");
    }

    public i90(String str, int i, String str2) {
        this.r = str2;
    }

    public static i90 valueOf(String str) {
        return (i90) Enum.valueOf(i90.class, str);
    }

    public static i90[] values() {
        return (i90[]) B.clone();
    }
}

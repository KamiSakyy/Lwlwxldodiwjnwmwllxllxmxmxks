package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class g7 {
    public static final g7 A;
    public static final g7 B;
    public static final /* synthetic */ g7[] C;
    public static final f7 Companion;
    public static final /* synthetic */ d71.b D;
    public static final aa.a0 s;
    public static final g7 t;
    public static final g7 u;
    public static final g7 v;
    public static final g7 w;
    public static final g7 x;
    public static final g7 y;
    public static final g7 z;
    public final String r;

    static {
        g7 g7Var = new g7("ANNOUNCEMENTS", 0, "ANNOUNCEMENTS");
        t = g7Var;
        g7 g7Var2 = new g7("EXPLICITONLY", 1, "EXPLICITONLY");
        g7 g7Var3 = new g7("FOLLOWS", 2, "FOLLOWS");
        u = g7Var3;
        g7 g7Var4 = new g7("POSTS", 3, "POSTS");
        v = g7Var4;
        g7 g7Var5 = new g7("RECOMMENDATIONS", 4, "RECOMMENDATIONS");
        w = g7Var5;
        g7 g7Var6 = new g7("RELEASES", 5, "RELEASES");
        x = g7Var6;
        g7 g7Var7 = new g7("REPOSITORIES", 6, "REPOSITORIES");
        y = g7Var7;
        g7 g7Var8 = new g7("REPOSITORYACTIVITY", 7, "REPOSITORYACTIVITY");
        g7 g7Var9 = new g7("SPONSORS", 8, "SPONSORS");
        z = g7Var9;
        g7 g7Var10 = new g7("STARREDRELATIONSHIPS", 9, "STARREDRELATIONSHIPS");
        g7 g7Var11 = new g7("STARS", 10, "STARS");
        A = g7Var11;
        g7 g7Var12 = new g7("UNKNOWN__", 11, "UNKNOWN__");
        B = g7Var12;
        g7[] g7VarArr = {g7Var, g7Var2, g7Var3, g7Var4, g7Var5, g7Var6, g7Var7, g7Var8, g7Var9, g7Var10, g7Var11, g7Var12};
        C = g7VarArr;
        D = v8.l0.t(g7VarArr);
        Companion = new f7();
        x61.l.r(new String[]{"ANNOUNCEMENTS", "EXPLICITONLY", "FOLLOWS", "POSTS", "RECOMMENDATIONS", "RELEASES", "REPOSITORIES", "REPOSITORYACTIVITY", "SPONSORS", "STARREDRELATIONSHIPS", "STARS"});
        s = new aa.a0("DashboardFeedFilterGroup");
    }

    public g7(String str, int i, String str2) {
        this.r = str2;
    }

    public static g7 valueOf(String str) {
        return (g7) Enum.valueOf(g7.class, str);
    }

    public static g7[] values() {
        return (g7[]) C.clone();
    }
    public Object ordinal() { return null; }
}

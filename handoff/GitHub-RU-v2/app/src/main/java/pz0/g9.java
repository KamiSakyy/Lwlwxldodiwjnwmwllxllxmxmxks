package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class g9 {
    public static final f9 Companion;
    public static final aa.a0 s;
    public static final g9 t;
    public static final /* synthetic */ g9[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        g9 g9Var = new g9("ABANDONED", 0, "ABANDONED");
        g9 g9Var2 = new g9("ACTIVE", 1, "ACTIVE");
        g9 g9Var3 = new g9("DESTROYED", 2, "DESTROYED");
        g9 g9Var4 = new g9("ERROR", 3, "ERROR");
        g9 g9Var5 = new g9("FAILURE", 4, "FAILURE");
        g9 g9Var6 = new g9("INACTIVE", 5, "INACTIVE");
        g9 g9Var7 = new g9("IN_PROGRESS", 6, "IN_PROGRESS");
        g9 g9Var8 = new g9("PENDING", 7, "PENDING");
        g9 g9Var9 = new g9("QUEUED", 8, "QUEUED");
        g9 g9Var10 = new g9("SUCCESS", 9, "SUCCESS");
        g9 g9Var11 = new g9("WAITING", 10, "WAITING");
        g9 g9Var12 = new g9("UNKNOWN__", 11, "UNKNOWN__");
        t = g9Var12;
        g9[] g9VarArr = {g9Var, g9Var2, g9Var3, g9Var4, g9Var5, g9Var6, g9Var7, g9Var8, g9Var9, g9Var10, g9Var11, g9Var12};
        u = g9VarArr;
        v = v8.l0.t(g9VarArr);
        Companion = new f9();
        x61.l.r(new String[]{"ABANDONED", "ACTIVE", "DESTROYED", "ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentState");
    }

    public g9(String str, int i, String str2) {
        this.r = str2;
    }

    public static g9 valueOf(String str) {
        return (g9) Enum.valueOf(g9.class, str);
    }

    public static g9[] values() {
        return (g9[]) u.clone();
    }
}

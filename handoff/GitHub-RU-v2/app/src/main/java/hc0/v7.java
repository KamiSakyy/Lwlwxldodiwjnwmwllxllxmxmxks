package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class v7 {
    public static final u7 Companion;
    public static final aa.a0 s;
    public static final v7 t;
    public static final /* synthetic */ v7[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        v7 v7Var = new v7("ABANDONED", 0, "ABANDONED");
        v7 v7Var2 = new v7("ACTIVE", 1, "ACTIVE");
        v7 v7Var3 = new v7("DESTROYED", 2, "DESTROYED");
        v7 v7Var4 = new v7("ERROR", 3, "ERROR");
        v7 v7Var5 = new v7("FAILURE", 4, "FAILURE");
        v7 v7Var6 = new v7("INACTIVE", 5, "INACTIVE");
        v7 v7Var7 = new v7("IN_PROGRESS", 6, "IN_PROGRESS");
        v7 v7Var8 = new v7("PENDING", 7, "PENDING");
        v7 v7Var9 = new v7("QUEUED", 8, "QUEUED");
        v7 v7Var10 = new v7("SUCCESS", 9, "SUCCESS");
        v7 v7Var11 = new v7("WAITING", 10, "WAITING");
        v7 v7Var12 = new v7("UNKNOWN__", 11, "UNKNOWN__");
        t = v7Var12;
        v7[] v7VarArr = {v7Var, v7Var2, v7Var3, v7Var4, v7Var5, v7Var6, v7Var7, v7Var8, v7Var9, v7Var10, v7Var11, v7Var12};
        u = v7VarArr;
        v = v8.l0.t(v7VarArr);
        Companion = new u7();
        x61.l.r(new String[]{"ABANDONED", "ACTIVE", "DESTROYED", "ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentState");
    }

    public v7(String str, int i, String str2) {
        this.r = str2;
    }

    public static v7 valueOf(String str) {
        return (v7) Enum.valueOf(v7.class, str);
    }

    public static v7[] values() {
        return (v7[]) u.clone();
    }
}

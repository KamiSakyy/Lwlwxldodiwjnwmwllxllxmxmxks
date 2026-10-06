package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class z7 {
    public static final y7 Companion;
    public static final aa.a0 s;
    public static final z7 t;
    public static final /* synthetic */ z7[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        z7 z7Var = new z7("ERROR", 0, "ERROR");
        z7 z7Var2 = new z7("FAILURE", 1, "FAILURE");
        z7 z7Var3 = new z7("INACTIVE", 2, "INACTIVE");
        z7 z7Var4 = new z7("IN_PROGRESS", 3, "IN_PROGRESS");
        z7 z7Var5 = new z7("PENDING", 4, "PENDING");
        z7 z7Var6 = new z7("QUEUED", 5, "QUEUED");
        z7 z7Var7 = new z7("SUCCESS", 6, "SUCCESS");
        z7 z7Var8 = new z7("WAITING", 7, "WAITING");
        z7 z7Var9 = new z7("UNKNOWN__", 8, "UNKNOWN__");
        t = z7Var9;
        z7[] z7VarArr = {z7Var, z7Var2, z7Var3, z7Var4, z7Var5, z7Var6, z7Var7, z7Var8, z7Var9};
        u = z7VarArr;
        v = v8.l0.t(z7VarArr);
        Companion = new y7();
        x61.l.r(new String[]{"ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentStatusState");
    }

    public z7(String str, int i, String str2) {
        this.r = str2;
    }

    public static z7 valueOf(String str) {
        return (z7) Enum.valueOf(z7.class, str);
    }

    public static z7[] values() {
        return (z7[]) u.clone();
    }
}

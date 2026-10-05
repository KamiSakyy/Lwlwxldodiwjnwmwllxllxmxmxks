package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class k9 {
    public static final j9 Companion;
    public static final aa.a0 s;
    public static final k9 t;
    public static final /* synthetic */ k9[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        k9 k9Var = new k9("ERROR", 0, "ERROR");
        k9 k9Var2 = new k9("FAILURE", 1, "FAILURE");
        k9 k9Var3 = new k9("INACTIVE", 2, "INACTIVE");
        k9 k9Var4 = new k9("IN_PROGRESS", 3, "IN_PROGRESS");
        k9 k9Var5 = new k9("PENDING", 4, "PENDING");
        k9 k9Var6 = new k9("QUEUED", 5, "QUEUED");
        k9 k9Var7 = new k9("SUCCESS", 6, "SUCCESS");
        k9 k9Var8 = new k9("WAITING", 7, "WAITING");
        k9 k9Var9 = new k9("UNKNOWN__", 8, "UNKNOWN__");
        t = k9Var9;
        k9[] k9VarArr = {k9Var, k9Var2, k9Var3, k9Var4, k9Var5, k9Var6, k9Var7, k9Var8, k9Var9};
        u = k9VarArr;
        v = v8.l0.t(k9VarArr);
        Companion = new j9();
        x61.l.r(new String[]{"ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentStatusState");
    }

    public k9(String str, int i, String str2) {
        this.r = str2;
    }

    public static k9 valueOf(String str) {
        return (k9) Enum.valueOf(k9.class, str);
    }

    public static k9[] values() {
        return (k9[]) u.clone();
    }
}

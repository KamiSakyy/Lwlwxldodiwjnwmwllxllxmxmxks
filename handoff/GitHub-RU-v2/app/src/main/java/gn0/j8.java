package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class j8 {
    public static final i8 Companion;
    public static final aa.a0 s;
    public static final j8 t;
    public static final /* synthetic */ j8[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        j8 j8Var = new j8("ERROR", 0, "ERROR");
        j8 j8Var2 = new j8("FAILURE", 1, "FAILURE");
        j8 j8Var3 = new j8("INACTIVE", 2, "INACTIVE");
        j8 j8Var4 = new j8("IN_PROGRESS", 3, "IN_PROGRESS");
        j8 j8Var5 = new j8("PENDING", 4, "PENDING");
        j8 j8Var6 = new j8("QUEUED", 5, "QUEUED");
        j8 j8Var7 = new j8("SUCCESS", 6, "SUCCESS");
        j8 j8Var8 = new j8("WAITING", 7, "WAITING");
        j8 j8Var9 = new j8("UNKNOWN__", 8, "UNKNOWN__");
        t = j8Var9;
        j8[] j8VarArr = {j8Var, j8Var2, j8Var3, j8Var4, j8Var5, j8Var6, j8Var7, j8Var8, j8Var9};
        u = j8VarArr;
        v = v8.l0.t(j8VarArr);
        Companion = new i8();
        x61.l.r(new String[]{"ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentStatusState");
    }

    public j8(String str, int i, String str2) {
        this.r = str2;
    }

    public static j8 valueOf(String str) {
        return (j8) Enum.valueOf(j8.class, str);
    }

    public static j8[] values() {
        return (j8[]) u.clone();
    }
}

package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 {
    public static final /* synthetic */ d71.b A;
    public static final y5 Companion;
    public static final aa.a0 s;
    public static final z5 t;
    public static final z5 u;
    public static final z5 v;
    public static final z5 w;
    public static final z5 x;
    public static final z5 y;
    public static final /* synthetic */ z5[] z;
    public final String r;

    static {
        z5 z5Var = new z5("DISCUSSION", 0, "DISCUSSION");
        t = z5Var;
        z5 z5Var2 = new z5("ISSUE", 1, "ISSUE");
        u = z5Var2;
        z5 z5Var3 = new z5("PULL_REQUEST", 2, "PULL_REQUEST");
        v = z5Var3;
        z5 z5Var4 = new z5("RELEASE", 3, "RELEASE");
        w = z5Var4;
        z5 z5Var5 = new z5("SECURITY_ALERT", 4, "SECURITY_ALERT");
        x = z5Var5;
        z5 z5Var6 = new z5("UNKNOWN__", 5, "UNKNOWN__");
        y = z5Var6;
        z5[] z5VarArr = {z5Var, z5Var2, z5Var3, z5Var4, z5Var5, z5Var6};
        z = z5VarArr;
        A = v8.l0.t(z5VarArr);
        Companion = new y5();
        x61.l.r(new String[]{"DISCUSSION", "ISSUE", "PULL_REQUEST", "RELEASE", "SECURITY_ALERT"});
        s = new aa.a0("CustomSubscriptionType");
    }

    public z5(String str, int i, String str2) {
        this.r = str2;
    }

    public static z5 valueOf(String str) {
        return (z5) Enum.valueOf(z5.class, str);
    }

    public static z5[] values() {
        return (z5[]) z.clone();
    }
}

package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class e7 {
    public static final /* synthetic */ d71.b A;
    public static final d7 Companion;
    public static final aa.a0 s;
    public static final e7 t;
    public static final e7 u;
    public static final e7 v;
    public static final e7 w;
    public static final e7 x;
    public static final e7 y;
    public static final /* synthetic */ e7[] z;
    public final String r;

    static {
        e7 e7Var = new e7("DISCUSSION", 0, "DISCUSSION");
        t = e7Var;
        e7 e7Var2 = new e7("ISSUE", 1, "ISSUE");
        u = e7Var2;
        e7 e7Var3 = new e7("PULL_REQUEST", 2, "PULL_REQUEST");
        v = e7Var3;
        e7 e7Var4 = new e7("RELEASE", 3, "RELEASE");
        w = e7Var4;
        e7 e7Var5 = new e7("SECURITY_ALERT", 4, "SECURITY_ALERT");
        x = e7Var5;
        e7 e7Var6 = new e7("UNKNOWN__", 5, "UNKNOWN__");
        y = e7Var6;
        e7[] e7VarArr = {e7Var, e7Var2, e7Var3, e7Var4, e7Var5, e7Var6};
        z = e7VarArr;
        A = v8.l0.t(e7VarArr);
        Companion = new d7();
        x61.l.r(new String[]{"DISCUSSION", "ISSUE", "PULL_REQUEST", "RELEASE", "SECURITY_ALERT"});
        s = new aa.a0("CustomSubscriptionType");
    }

    public e7(String str, int i, String str2) {
        this.r = str2;
    }

    public static e7 valueOf(String str) {
        return (e7) Enum.valueOf(e7.class, str);
    }

    public static e7[] values() {
        return (e7[]) z.clone();
    }
}

package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class j6 {
    public static final /* synthetic */ d71.b A;
    public static final i6 Companion;
    public static final aa.a0 s;
    public static final j6 t;
    public static final j6 u;
    public static final j6 v;
    public static final j6 w;
    public static final j6 x;
    public static final j6 y;
    public static final /* synthetic */ j6[] z;
    public final String r;

    static {
        j6 j6Var = new j6("DISCUSSION", 0, "DISCUSSION");
        t = j6Var;
        j6 j6Var2 = new j6("ISSUE", 1, "ISSUE");
        u = j6Var2;
        j6 j6Var3 = new j6("PULL_REQUEST", 2, "PULL_REQUEST");
        v = j6Var3;
        j6 j6Var4 = new j6("RELEASE", 3, "RELEASE");
        w = j6Var4;
        j6 j6Var5 = new j6("SECURITY_ALERT", 4, "SECURITY_ALERT");
        x = j6Var5;
        j6 j6Var6 = new j6("UNKNOWN__", 5, "UNKNOWN__");
        y = j6Var6;
        j6[] j6VarArr = {j6Var, j6Var2, j6Var3, j6Var4, j6Var5, j6Var6};
        z = j6VarArr;
        A = v8.l0.t(j6VarArr);
        Companion = new i6();
        x61.l.r(new String[]{"DISCUSSION", "ISSUE", "PULL_REQUEST", "RELEASE", "SECURITY_ALERT"});
        s = new aa.a0("CustomSubscriptionType");
    }

    public j6(String str, int i, String str2) {
        this.r = str2;
    }

    public static j6 valueOf(String str) {
        return (j6) Enum.valueOf(j6.class, str);
    }

    public static j6[] values() {
        return (j6[]) z.clone();
    }
}

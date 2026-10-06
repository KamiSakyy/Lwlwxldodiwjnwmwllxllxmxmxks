package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class y10 {
    public static final x10 Companion;
    public static final aa.a0 s;
    public static final y10 t;
    public static final y10 u;
    public static final y10 v;
    public static final y10 w;
    public static final /* synthetic */ y10[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        y10 y10Var = new y10("DISCUSSIONS", 0, "DISCUSSIONS");
        t = y10Var;
        y10 y10Var2 = new y10("ISSUES", 1, "ISSUES");
        u = y10Var2;
        y10 y10Var3 = new y10("PULL_REQUESTS", 2, "PULL_REQUESTS");
        v = y10Var3;
        y10 y10Var4 = new y10("UNKNOWN__", 3, "UNKNOWN__");
        w = y10Var4;
        y10[] y10VarArr = {y10Var, y10Var2, y10Var3, y10Var4};
        x = y10VarArr;
        y = v8.l0.t(y10VarArr);
        Companion = new x10();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS"});
        s = new aa.a0("SearchShortcutType");
    }

    public y10(String str, int i, String str2) {
        this.r = str2;
    }

    public static y10 valueOf(String str) {
        return (y10) Enum.valueOf(y10.class, str);
    }

    public static y10[] values() {
        return (y10[]) x.clone();
    }
}

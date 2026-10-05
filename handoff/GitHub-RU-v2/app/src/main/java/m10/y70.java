package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class y70 {
    public static final x70 Companion;
    public static final aa.a0 s;
    public static final y70 t;
    public static final y70 u;
    public static final y70 v;
    public static final y70 w;
    public static final y70 x;
    public static final /* synthetic */ y70[] y;
    public static final /* synthetic */ d71.b z;
    public final String r;

    static {
        y70 y70Var = new y70("DISCUSSIONS", 0, "DISCUSSIONS");
        t = y70Var;
        y70 y70Var2 = new y70("ISSUES", 1, "ISSUES");
        u = y70Var2;
        y70 y70Var3 = new y70("PULL_REQUESTS", 2, "PULL_REQUESTS");
        v = y70Var3;
        y70 y70Var4 = new y70("REPOSITORIES", 3, "REPOSITORIES");
        w = y70Var4;
        y70 y70Var5 = new y70("UNKNOWN__", 4, "UNKNOWN__");
        x = y70Var5;
        y70[] y70VarArr = {y70Var, y70Var2, y70Var3, y70Var4, y70Var5};
        y = y70VarArr;
        z = v8.l0.t(y70VarArr);
        Companion = new x70();
        x61.l.r(new String[]{"DISCUSSIONS", "ISSUES", "PULL_REQUESTS", "REPOSITORIES"});
        s = new aa.a0("SearchShortcutType");
    }

    public y70(String str, int i, String str2) {
        this.r = str2;
    }

    public static y70 valueOf(String str) {
        return (y70) Enum.valueOf(y70.class, str);
    }

    public static y70[] values() {
        return (y70[]) y.clone();
    }
}

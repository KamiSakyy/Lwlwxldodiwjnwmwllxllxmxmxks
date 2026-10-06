package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class g9 {
    public static final f9 Companion;
    public static final g9 s;
    public static final g9 t;
    public static final g9 u;
    public static final g9 v;
    public static final /* synthetic */ g9[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        g9 g9Var = new g9("DUPLICATE", 0, "DUPLICATE");
        s = g9Var;
        g9 g9Var2 = new g9("OUTDATED", 1, "OUTDATED");
        t = g9Var2;
        g9 g9Var3 = new g9("RESOLVED", 2, "RESOLVED");
        u = g9Var3;
        g9 g9Var4 = new g9("UNKNOWN__", 3, "UNKNOWN__");
        v = g9Var4;
        g9[] g9VarArr = {g9Var, g9Var2, g9Var3, g9Var4};
        w = g9VarArr;
        x = v8.l0.t(g9VarArr);
        Companion = new f9();
        sy.d0.o(new String[]{"DUPLICATE", "OUTDATED", "RESOLVED"});
    }

    public g9(String str, int i, String str2) {
        this.r = str2;
    }

    public static g9 valueOf(String str) {
        return (g9) Enum.valueOf(g9.class, str);
    }

    public static g9[] values() {
        return (g9[]) w.clone();
    }
}

package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public static final g0 r;
    public static final /* synthetic */ g0[] s;
    public static final /* synthetic */ d71.b t;

    static {
        g0 g0Var = new g0("OFFENSIVE_OR_DISCRIMINATORY", 0);
        g0 g0Var2 = new g0("POORLY_FORMATTED", 1);
        g0 g0Var3 = new g0("NOT_TRUE", 2);
        g0 g0Var4 = new g0("UNHELPFUL", 3);
        g0 g0Var5 = new g0("UNKNOWN", 4);
        r = g0Var5;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5};
        s = g0VarArr;
        t = v8.l0.t(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) s.clone();
    }
}

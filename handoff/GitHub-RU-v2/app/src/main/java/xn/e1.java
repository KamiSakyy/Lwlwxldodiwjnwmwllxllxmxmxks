package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 {
    public static final /* synthetic */ e1[] A;
    public static final /* synthetic */ d71.b B;
    public static final d1 Companion;
    public static final e1 s;
    public static final e1 t;
    public static final e1 u;
    public static final e1 v;
    public static final e1 w;
    public static final e1 x;
    public static final e1 y;
    public static final e1 z;
    public String r;

    static {
        e1 e1Var = new e1("NO_ACCESS", 0, "NO_ACCESS");
        s = e1Var;
        e1 e1Var2 = new e1("COPILOT_FREE", 1, "COPILOT_FREE");
        t = e1Var2;
        e1 e1Var3 = new e1("INDIVIDUAL", 2, "COPILOT_INDIVIDUAL");
        u = e1Var3;
        e1 e1Var4 = new e1("COPILOT_INDIVIDUAL_PRO_PLUS", 3, "COPILOT_INDIVIDUAL_PRO_PLUS");
        v = e1Var4;
        e1 e1Var5 = new e1("COPILOT_INDIVIDUAL_MAX", 4, "COPILOT_INDIVIDUAL_MAX");
        w = e1Var5;
        e1 e1Var6 = new e1("BUSINESS", 5, "COPILOT_BUSINESS");
        x = e1Var6;
        e1 e1Var7 = new e1("ENTERPRISE", 6, "COPILOT_ENTERPRISE");
        y = e1Var7;
        e1 e1Var8 = new e1("UNKNOWN__", 7, "UNKNOWN__");
        z = e1Var8;
        e1[] e1VarArr = {e1Var, e1Var2, e1Var3, e1Var4, e1Var5, e1Var6, e1Var7, e1Var8};
        A = e1VarArr;
        B = v8.l0.t(e1VarArr);
        Companion = new d1();
    }

    public e1(String str, int i, String str2) {
        this.r = str2;
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) A.clone();
    }
    public Object j(Object p1) { return null; }
    public Object ordinal() { return null; }
    public Object a = null;
}

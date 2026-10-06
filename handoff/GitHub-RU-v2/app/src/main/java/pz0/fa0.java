package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class fa0 {
    public static final ea0 Companion;
    public static final aa.a0 s;
    public static final fa0 t;
    public static final /* synthetic */ fa0[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        fa0 fa0Var = new fa0("BOOLEAN", 0, "BOOLEAN");
        fa0 fa0Var2 = new fa0("CHOICE", 1, "CHOICE");
        fa0 fa0Var3 = new fa0("ENVIRONMENT", 2, "ENVIRONMENT");
        fa0 fa0Var4 = new fa0("NUMBER", 3, "NUMBER");
        fa0 fa0Var5 = new fa0("STRING", 4, "STRING");
        fa0 fa0Var6 = new fa0("UNKNOWN__", 5, "UNKNOWN__");
        t = fa0Var6;
        fa0[] fa0VarArr = {fa0Var, fa0Var2, fa0Var3, fa0Var4, fa0Var5, fa0Var6};
        u = fa0VarArr;
        v = v8.l0.t(fa0VarArr);
        Companion = new ea0();
        x61.l.r(new String[]{"BOOLEAN", "CHOICE", "ENVIRONMENT", "NUMBER", "STRING"});
        s = new aa.a0("WorkflowInputType");
    }

    public fa0(String str, int i, String str2) {
        this.r = str2;
    }

    public static fa0 valueOf(String str) {
        return (fa0) Enum.valueOf(fa0.class, str);
    }

    public static fa0[] values() {
        return (fa0[]) u.clone();
    }
}

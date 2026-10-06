package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class x1 {
    public static final w1 Companion;
    public static final x1 s;
    public static final x1 t;
    public static final x1 u;
    public static final x1 v;
    public static final x1 w;
    public static final /* synthetic */ x1[] x;
    public String r;

    static {
        x1 x1Var = new x1("INDEFINITE", 0, "INDEFINITE");
        s = x1Var;
        x1 x1Var2 = new x1("ONE_DAY", 1, "ONE_DAY");
        t = x1Var2;
        x1 x1Var3 = new x1("SEVEN_DAYS", 2, "SEVEN_DAYS");
        u = x1Var3;
        x1 x1Var4 = new x1("THIRTY_DAYS", 3, "THIRTY_DAYS");
        v = x1Var4;
        x1 x1Var5 = new x1("THREE_DAYS", 4, "THREE_DAYS");
        w = x1Var5;
        x1[] x1VarArr = {x1Var, x1Var2, x1Var3, x1Var4, x1Var5, new x1("UNKNOWN__", 5, "UNKNOWN__")};
        x = x1VarArr;
        v8.l0.t(x1VarArr);
        Companion = new w1();
        sy.d0Shadow.o(new String[]{"INDEFINITE", "ONE_DAY", "SEVEN_DAYS", "THIRTY_DAYS", "THREE_DAYS"});
    }

    public x1(String str, int i, String str2) {
        this.r = str2;
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) x.clone();
    }
}

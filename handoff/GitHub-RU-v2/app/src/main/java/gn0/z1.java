package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class z1 {
    public static final y1 Companion;
    public static final z1 s;
    public static final z1 t;
    public static final z1 u;
    public static final z1 v;
    public static final z1 w;
    public static final /* synthetic */ z1[] x;
    public String r;

    static {
        z1 z1Var = new z1("INDEFINITE", 0, "INDEFINITE");
        s = z1Var;
        z1 z1Var2 = new z1("ONE_DAY", 1, "ONE_DAY");
        t = z1Var2;
        z1 z1Var3 = new z1("SEVEN_DAYS", 2, "SEVEN_DAYS");
        u = z1Var3;
        z1 z1Var4 = new z1("THIRTY_DAYS", 3, "THIRTY_DAYS");
        v = z1Var4;
        z1 z1Var5 = new z1("THREE_DAYS", 4, "THREE_DAYS");
        w = z1Var5;
        z1[] z1VarArr = {z1Var, z1Var2, z1Var3, z1Var4, z1Var5, new z1("UNKNOWN__", 5, "UNKNOWN__")};
        x = z1VarArr;
        v8.l0.t(z1VarArr);
        Companion = new y1();
        sy.d0.o(new String[]{"INDEFINITE", "ONE_DAY", "SEVEN_DAYS", "THIRTY_DAYS", "THREE_DAYS"});
    }

    public z1(String str, int i, String str2) {
        this.r = str2;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) x.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 {
    public static final y2 Companion;
    public static final z2 s;
    public static final z2 t;
    public static final z2 u;
    public static final z2 v;
    public static final z2 w;
    public static final /* synthetic */ z2[] x;
    public String r;

    static {
        z2 z2Var = new z2("INDEFINITE", 0, "INDEFINITE");
        s = z2Var;
        z2 z2Var2 = new z2("ONE_DAY", 1, "ONE_DAY");
        t = z2Var2;
        z2 z2Var3 = new z2("SEVEN_DAYS", 2, "SEVEN_DAYS");
        u = z2Var3;
        z2 z2Var4 = new z2("THIRTY_DAYS", 3, "THIRTY_DAYS");
        v = z2Var4;
        z2 z2Var5 = new z2("THREE_DAYS", 4, "THREE_DAYS");
        w = z2Var5;
        z2[] z2VarArr = {z2Var, z2Var2, z2Var3, z2Var4, z2Var5, new z2("UNKNOWN__", 5, "UNKNOWN__")};
        x = z2VarArr;
        v8.l0.t(z2VarArr);
        Companion = new y2();
        sy.d0.o("INDEFINITE", "ONE_DAY", "SEVEN_DAYS", "THIRTY_DAYS", "THREE_DAYS");
    }

    public z2(String str, int i, String str2) {
        this.r = str2;
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) x.clone();
    }
}

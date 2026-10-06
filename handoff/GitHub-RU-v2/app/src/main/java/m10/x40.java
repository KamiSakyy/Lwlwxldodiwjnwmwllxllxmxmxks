package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class x40 {
    public static final /* synthetic */ x40[] A;
    public static final /* synthetic */ d71.b B;
    public static final w40 Companion;
    public static final x40 s;
    public static final x40 t;
    public static final x40 u;
    public static final x40 v;
    public static final x40 w;
    public static final x40 x;
    public static final x40 y;
    public static final x40 z;
    public String r;

    static {
        x40 x40Var = new x40("ARCHIVED", 0, "ARCHIVED");
        s = x40Var;
        x40 x40Var2 = new x40("FORK", 1, "FORK");
        t = x40Var2;
        x40 x40Var3 = new x40("MIRROR", 2, "MIRROR");
        u = x40Var3;
        x40 x40Var4 = new x40("PRIVATE", 3, "PRIVATE");
        v = x40Var4;
        x40 x40Var5 = new x40("PUBLIC", 4, "PUBLIC");
        w = x40Var5;
        x40 x40Var6 = new x40("SOURCE", 5, "SOURCE");
        x = x40Var6;
        x40 x40Var7 = new x40("SPONSORABLE", 6, "SPONSORABLE");
        x40 x40Var8 = new x40("TEMPLATE", 7, "TEMPLATE");
        y = x40Var8;
        x40 x40Var9 = new x40("UNKNOWN__", 8, "UNKNOWN__");
        z = x40Var9;
        x40[] x40VarArr = {x40Var, x40Var2, x40Var3, x40Var4, x40Var5, x40Var6, x40Var7, x40Var8, x40Var9};
        A = x40VarArr;
        B = v8.l0.t(x40VarArr);
        Companion = new w40();
        sy.d0.o("ARCHIVED", "FORK", "MIRROR", "PRIVATE", "PUBLIC", "SOURCE", "SPONSORABLE", "TEMPLATE");
    }

    public x40(String str, int i, String str2) {
        this.r = str2;
    }

    public static x40 valueOf(String str) {
        return (x40) Enum.valueOf(x40.class, str);
    }

    public static x40[] values() {
        return (x40[]) A.clone();
    }
}

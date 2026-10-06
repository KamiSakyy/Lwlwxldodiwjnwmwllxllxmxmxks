package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class z40 {
    public static final y40 Companion;
    public static final z40 s;
    public static final z40 t;
    public static final z40 u;
    public static final /* synthetic */ z40[] v;
    public final String r;

    static {
        z40 z40Var = new z40("INTERNAL", 0, "INTERNAL");
        s = z40Var;
        z40 z40Var2 = new z40("PRIVATE", 1, "PRIVATE");
        t = z40Var2;
        z40 z40Var3 = new z40("PUBLIC", 2, "PUBLIC");
        u = z40Var3;
        z40[] z40VarArr = {z40Var, z40Var2, z40Var3, new z40("UNKNOWN__", 3, "UNKNOWN__")};
        v = z40VarArr;
        v8.l0.t(z40VarArr);
        Companion = new y40();
        sy.d0.o("INTERNAL", "PRIVATE", "PUBLIC");
    }

    public z40(String str, int i, String str2) {
        this.r = str2;
    }

    public static z40 valueOf(String str) {
        return (z40) Enum.valueOf(z40.class, str);
    }

    public static z40[] values() {
        return (z40[]) v.clone();
    }
}

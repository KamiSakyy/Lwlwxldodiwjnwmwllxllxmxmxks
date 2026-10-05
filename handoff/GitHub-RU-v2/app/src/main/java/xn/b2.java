package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 {
    public static final b2 r;
    public static final b2 s;
    public static final b2 t;
    public static final b2 u;
    public static final /* synthetic */ b2[] v;

    static {
        b2 b2Var = new b2("STARTED", 0);
        r = b2Var;
        b2 b2Var2 = new b2("ERROR", 1);
        s = b2Var2;
        b2 b2Var3 = new b2("COMPLETED", 2);
        t = b2Var3;
        b2 b2Var4 = new b2("UNKNOWN", 3);
        u = b2Var4;
        b2[] b2VarArr = {b2Var, b2Var2, b2Var3, b2Var4};
        v = b2VarArr;
        v8.l0.t(b2VarArr);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) v.clone();
    }
}

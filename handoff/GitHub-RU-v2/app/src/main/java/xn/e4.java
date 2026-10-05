package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class e4 {
    public static final e4 r;
    public static final e4 s;
    public static final e4 t;
    public static final e4 u;
    public static final /* synthetic */ e4[] v;

    static {
        e4 e4Var = new e4("EMAIL", 0);
        r = e4Var;
        e4 e4Var2 = new e4("URI", 1);
        s = e4Var2;
        e4 e4Var3 = new e4("DATE", 2);
        t = e4Var3;
        e4 e4Var4 = new e4("DATE_TIME", 3);
        u = e4Var4;
        e4[] e4VarArr = {e4Var, e4Var2, e4Var3, e4Var4};
        v = e4VarArr;
        v8.l0.t(e4VarArr);
    }

    public static e4 valueOf(String str) {
        return (e4) Enum.valueOf(e4.class, str);
    }

    public static e4[] values() {
        return (e4[]) v.clone();
    }
}

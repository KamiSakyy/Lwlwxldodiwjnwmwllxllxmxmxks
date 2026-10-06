package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    public static final n0 r;
    public static final n0 s;
    public static final n0 t;
    public static final /* synthetic */ n0[] u;

    static {
        n0 n0Var = new n0("ORGANIZATION", 0);
        r = n0Var;
        n0 n0Var2 = new n0("USER", 1);
        s = n0Var2;
        n0 n0Var3 = new n0("UNKNOWN", 2);
        t = n0Var3;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3};
        u = n0VarArr;
        v8.l0.t(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) u.clone();
    }
    public Object name() { return null; }
}

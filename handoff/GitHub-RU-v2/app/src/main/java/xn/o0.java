package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public static final o0 r;
    public static final o0 s;
    public static final o0 t;
    public static final /* synthetic */ o0[] u;

    static {
        o0 o0Var = new o0("PUBLIC", 0);
        r = o0Var;
        o0 o0Var2 = new o0("PRIVATE", 1);
        s = o0Var2;
        o0 o0Var3 = new o0("UNKNOWN", 2);
        t = o0Var3;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3};
        u = o0VarArr;
        v8.l0.t(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) u.clone();
    }
}

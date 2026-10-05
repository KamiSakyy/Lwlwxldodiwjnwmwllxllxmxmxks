package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public static final c0 r;
    public static final c0 s;
    public static final c0 t;
    public static final /* synthetic */ c0[] u;

    static {
        c0 c0Var = new c0("ACCEPTED", 0);
        r = c0Var;
        c0 c0Var2 = new c0("DISMISSED", 1);
        s = c0Var2;
        c0 c0Var3 = new c0("UNKNOWN", 2);
        t = c0Var3;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        u = c0VarArr;
        v8.l0.t(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) u.clone();
    }
}

package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 {
    public static final r0 r;
    public static final r0 s;
    public static final r0 t;
    public static final /* synthetic */ r0[] u;

    static {
        r0 r0Var = new r0("EXCEPTION", 0);
        r = r0Var;
        r0 r0Var2 = new r0("RATE_LIMIT", 1);
        s = r0Var2;
        r0 r0Var3 = new r0("UNKNOWN", 2);
        t = r0Var3;
        r0[] r0VarArr = {r0Var, r0Var2, r0Var3};
        u = r0VarArr;
        v8.l0.t(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) u.clone();
    }
}

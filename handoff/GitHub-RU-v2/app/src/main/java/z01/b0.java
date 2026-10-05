package z01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 {
    public static final b0 r;
    public static final b0 s;
    public static final b0 t;
    public static final /* synthetic */ b0[] u;

    static {
        b0 b0Var = new b0("UPWARD", 0);
        r = b0Var;
        b0 b0Var2 = new b0("DOWNWARD", 1);
        s = b0Var2;
        b0 b0Var3 = new b0("FOCUSED_SINGLE", 2);
        t = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3};
        u = b0VarArr;
        v8.l0.t(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) u.clone();
    }
}

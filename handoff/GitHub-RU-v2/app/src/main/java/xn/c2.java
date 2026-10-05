package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c2 {
    public static final c2 r;
    public static final c2 s;
    public static final c2 t;
    public static final /* synthetic */ c2[] u;

    static {
        c2 c2Var = new c2("BING_SEARCH", 0);
        r = c2Var;
        c2 c2Var2 = new c2("CODE_SEARCH", 1);
        s = c2Var2;
        c2 c2Var3 = new c2("UNKNOWN", 2);
        t = c2Var3;
        c2[] c2VarArr = {c2Var, c2Var2, c2Var3};
        u = c2VarArr;
        v8.l0.t(c2VarArr);
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) u.clone();
    }
}

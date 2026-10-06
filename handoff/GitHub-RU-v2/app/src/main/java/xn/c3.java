package xn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c3 {
    public static final b3 Companion;
    public static final c3 s;
    public static final /* synthetic */ c3[] t;
    public static final /* synthetic */ d71.b u;
    public String r;

    static {
        c3 c3Var = new c3("RELOAD", 0, "RELOAD");
        c3 c3Var2 = new c3("CHECK", 1, "CHECK");
        c3 c3Var3 = new c3("UNLIMITED", 2, "UNLIMITED");
        c3 c3Var4 = new c3("NONE", 3, "NONE");
        c3 c3Var5 = new c3("UNKNOWN__", 4, "UNKNOWN__");
        s = c3Var5;
        c3[] c3VarArr = {c3Var, c3Var2, c3Var3, c3Var4, c3Var5};
        t = c3VarArr;
        u = v8.l0.t(c3VarArr);
        Companion = new b3();
    }

    public c3(String str, int i, String str2) {
        this.r = str2;
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) t.clone();
    }
}

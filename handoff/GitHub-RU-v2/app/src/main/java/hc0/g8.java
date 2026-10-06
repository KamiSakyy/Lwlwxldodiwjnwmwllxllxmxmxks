package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class g8 {
    public static final f8 Companion;
    public static final aa.a0 s;
    public static final g8 t;
    public static final g8 u;
    public static final /* synthetic */ g8[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        g8 g8Var = new g8("ADDITION", 0, "ADDITION");
        g8 g8Var2 = new g8("CONTEXT", 1, "CONTEXT");
        g8 g8Var3 = new g8("DELETION", 2, "DELETION");
        t = g8Var3;
        g8 g8Var4 = new g8("HUNK", 3, "HUNK");
        g8 g8Var5 = new g8("INJECTED_CONTEXT", 4, "INJECTED_CONTEXT");
        g8 g8Var6 = new g8("UNKNOWN__", 5, "UNKNOWN__");
        u = g8Var6;
        g8[] g8VarArr = {g8Var, g8Var2, g8Var3, g8Var4, g8Var5, g8Var6};
        v = g8VarArr;
        w = v8.l0.t(g8VarArr);
        Companion = new f8();
        x61.l.r(new String[]{"ADDITION", "CONTEXT", "DELETION", "HUNK", "INJECTED_CONTEXT"});
        s = new aa.a0("DiffLineType");
    }

    public g8(String str, int i, String str2) {
        this.r = str2;
    }

    public static g8 valueOf(String str) {
        return (g8) Enum.valueOf(g8.class, str);
    }

    public static g8[] values() {
        return (g8[]) v.clone();
    }
}

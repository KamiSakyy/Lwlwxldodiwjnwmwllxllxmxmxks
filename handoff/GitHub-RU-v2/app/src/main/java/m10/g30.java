package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g30 {
    public static final /* synthetic */ d71.b A;
    public static final f30 Companion;
    public static final g30 s;
    public static final g30 t;
    public static final g30 u;
    public static final g30 v;
    public static final g30 w;
    public static final g30 x;
    public static final g30 y;
    public static final /* synthetic */ g30[] z;
    public String r;

    static {
        g30 g30Var = new g30("ABUSE", 0, "ABUSE");
        s = g30Var;
        g30 g30Var2 = new g30("DUPLICATE", 1, "DUPLICATE");
        t = g30Var2;
        g30 g30Var3 = new g30("OFF_TOPIC", 2, "OFF_TOPIC");
        u = g30Var3;
        g30 g30Var4 = new g30("OUTDATED", 3, "OUTDATED");
        v = g30Var4;
        g30 g30Var5 = new g30("RESOLVED", 4, "RESOLVED");
        w = g30Var5;
        g30 g30Var6 = new g30("SPAM", 5, "SPAM");
        x = g30Var6;
        g30 g30Var7 = new g30("UNKNOWN__", 6, "UNKNOWN__");
        y = g30Var7;
        g30[] g30VarArr = {g30Var, g30Var2, g30Var3, g30Var4, g30Var5, g30Var6, g30Var7};
        z = g30VarArr;
        A = v8.l0.t(g30VarArr);
        Companion = new f30();
        sy.d0.o("ABUSE", "DUPLICATE", "OFF_TOPIC", "OUTDATED", "RESOLVED", "SPAM");
    }

    public g30(String str, int i, String str2) {
        this.r = str2;
    }

    public static g30 valueOf(String str) {
        return (g30) Enum.valueOf(g30.class, str);
    }

    public static g30[] values() {
        return (g30[]) z.clone();
    }
}

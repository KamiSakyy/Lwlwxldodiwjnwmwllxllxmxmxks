package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class y80 {
    public static final x80 Companion;
    public static final aa.a0 s;
    public static final y80 t;
    public static final y80 u;
    public static final /* synthetic */ y80[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        y80 y80Var = new y80("ONE_DAY", 0, "ONE_DAY");
        y80 y80Var2 = new y80("ONE_MONTH", 1, "ONE_MONTH");
        y80 y80Var3 = new y80("ONE_WEEK", 2, "ONE_WEEK");
        y80 y80Var4 = new y80("PERMANENT", 3, "PERMANENT");
        t = y80Var4;
        y80 y80Var5 = new y80("THREE_DAYS", 4, "THREE_DAYS");
        y80 y80Var6 = new y80("UNKNOWN__", 5, "UNKNOWN__");
        u = y80Var6;
        y80[] y80VarArr = {y80Var, y80Var2, y80Var3, y80Var4, y80Var5, y80Var6};
        v = y80VarArr;
        w = v8.l0.t(y80VarArr);
        Companion = new x80();
        x61.l.r(new String[]{"ONE_DAY", "ONE_MONTH", "ONE_WEEK", "PERMANENT", "THREE_DAYS"});
        s = new aa.a0("UserBlockDuration");
    }

    public y80(String str, int i, String str2) {
        this.r = str2;
    }

    public static y80 valueOf(String str) {
        return (y80) Enum.valueOf(y80.class, str);
    }

    public static y80[] values() {
        return (y80[]) v.clone();
    }
}

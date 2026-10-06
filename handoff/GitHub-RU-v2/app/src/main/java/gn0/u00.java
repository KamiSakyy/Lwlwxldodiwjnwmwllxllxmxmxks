package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class u00 {
    public static final t00 Companion;
    public static final aa.a0 s;
    public static final u00 t;
    public static final u00 u;
    public static final /* synthetic */ u00[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        u00 u00Var = new u00("ONE_DAY", 0, "ONE_DAY");
        u00 u00Var2 = new u00("ONE_MONTH", 1, "ONE_MONTH");
        u00 u00Var3 = new u00("ONE_WEEK", 2, "ONE_WEEK");
        u00 u00Var4 = new u00("PERMANENT", 3, "PERMANENT");
        t = u00Var4;
        u00 u00Var5 = new u00("THREE_DAYS", 4, "THREE_DAYS");
        u00 u00Var6 = new u00("UNKNOWN__", 5, "UNKNOWN__");
        u = u00Var6;
        u00[] u00VarArr = {u00Var, u00Var2, u00Var3, u00Var4, u00Var5, u00Var6};
        v = u00VarArr;
        w = v8.l0.t(u00VarArr);
        Companion = new t00();
        x61.l.r(new String[]{"ONE_DAY", "ONE_MONTH", "ONE_WEEK", "PERMANENT", "THREE_DAYS"});
        s = new aa.a0("UserBlockDuration");
    }

    public u00(String str, int i, String str2) {
        this.r = str2;
    }

    public static u00 valueOf(String str) {
        return (u00) Enum.valueOf(u00.class, str);
    }

    public static u00[] values() {
        return (u00[]) v.clone();
    }
}

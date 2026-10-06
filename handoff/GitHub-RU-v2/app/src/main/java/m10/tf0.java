package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class tf0 {
    public static final sf0 Companion;
    public static final aa.a0 s;
    public static final tf0 t;
    public static final tf0 u;
    public static final /* synthetic */ tf0[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        tf0 tf0Var = new tf0("ONE_DAY", 0, "ONE_DAY");
        tf0 tf0Var2 = new tf0("ONE_MONTH", 1, "ONE_MONTH");
        tf0 tf0Var3 = new tf0("ONE_WEEK", 2, "ONE_WEEK");
        tf0 tf0Var4 = new tf0("PERMANENT", 3, "PERMANENT");
        t = tf0Var4;
        tf0 tf0Var5 = new tf0("THREE_DAYS", 4, "THREE_DAYS");
        tf0 tf0Var6 = new tf0("UNKNOWN__", 5, "UNKNOWN__");
        u = tf0Var6;
        tf0[] tf0VarArr = {tf0Var, tf0Var2, tf0Var3, tf0Var4, tf0Var5, tf0Var6};
        v = tf0VarArr;
        w = v8.l0.t(tf0VarArr);
        Companion = new sf0();
        x61.l.r(new String[]{"ONE_DAY", "ONE_MONTH", "ONE_WEEK", "PERMANENT", "THREE_DAYS"});
        s = new aa.a0("UserBlockDuration");
    }

    public tf0(String str, int i, String str2) {
        this.r = str2;
    }

    public static tf0 valueOf(String str) {
        return (tf0) Enum.valueOf(tf0.class, str);
    }

    public static tf0[] values() {
        return (tf0[]) v.clone();
    }
}

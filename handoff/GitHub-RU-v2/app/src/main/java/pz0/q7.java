package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class q7 {
    public static final q7 A;
    public static final /* synthetic */ q7[] B;
    public static final /* synthetic */ d71.b C;
    public static final p7 Companion;
    public static final aa.a0 s;
    public static final q7 t;
    public static final q7 u;
    public static final q7 v;
    public static final q7 w;
    public static final q7 x;
    public static final q7 y;
    public static final q7 z;
    public final String r;

    static {
        q7 q7Var = new q7("FRIDAY", 0, "FRIDAY");
        t = q7Var;
        q7 q7Var2 = new q7("MONDAY", 1, "MONDAY");
        u = q7Var2;
        q7 q7Var3 = new q7("SATURDAY", 2, "SATURDAY");
        v = q7Var3;
        q7 q7Var4 = new q7("SUNDAY", 3, "SUNDAY");
        w = q7Var4;
        q7 q7Var5 = new q7("THURSDAY", 4, "THURSDAY");
        x = q7Var5;
        q7 q7Var6 = new q7("TUESDAY", 5, "TUESDAY");
        y = q7Var6;
        q7 q7Var7 = new q7("WEDNESDAY", 6, "WEDNESDAY");
        z = q7Var7;
        q7 q7Var8 = new q7("UNKNOWN__", 7, "UNKNOWN__");
        A = q7Var8;
        q7[] q7VarArr = {q7Var, q7Var2, q7Var3, q7Var4, q7Var5, q7Var6, q7Var7, q7Var8};
        B = q7VarArr;
        C = v8.l0.t(q7VarArr);
        Companion = new p7();
        x61.l.r(new String[]{"FRIDAY", "MONDAY", "SATURDAY", "SUNDAY", "THURSDAY", "TUESDAY", "WEDNESDAY"});
        s = new aa.a0("DayOfWeek");
    }

    public q7(String str, int i, String str2) {
        this.r = str2;
    }

    public static q7 valueOf(String str) {
        return (q7) Enum.valueOf(q7.class, str);
    }

    public static q7[] values() {
        return (q7[]) B.clone();
    }
}

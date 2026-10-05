package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class t6 {
    public static final t6 A;
    public static final /* synthetic */ t6[] B;
    public static final /* synthetic */ d71.b C;
    public static final s6 Companion;
    public static final aa.a0 s;
    public static final t6 t;
    public static final t6 u;
    public static final t6 v;
    public static final t6 w;
    public static final t6 x;
    public static final t6 y;
    public static final t6 z;
    public final String r;

    static {
        t6 t6Var = new t6("FRIDAY", 0, "FRIDAY");
        t = t6Var;
        t6 t6Var2 = new t6("MONDAY", 1, "MONDAY");
        u = t6Var2;
        t6 t6Var3 = new t6("SATURDAY", 2, "SATURDAY");
        v = t6Var3;
        t6 t6Var4 = new t6("SUNDAY", 3, "SUNDAY");
        w = t6Var4;
        t6 t6Var5 = new t6("THURSDAY", 4, "THURSDAY");
        x = t6Var5;
        t6 t6Var6 = new t6("TUESDAY", 5, "TUESDAY");
        y = t6Var6;
        t6 t6Var7 = new t6("WEDNESDAY", 6, "WEDNESDAY");
        z = t6Var7;
        t6 t6Var8 = new t6("UNKNOWN__", 7, "UNKNOWN__");
        A = t6Var8;
        t6[] t6VarArr = {t6Var, t6Var2, t6Var3, t6Var4, t6Var5, t6Var6, t6Var7, t6Var8};
        B = t6VarArr;
        C = v8.l0.t(t6VarArr);
        Companion = new s6();
        x61.l.r(new String[]{"FRIDAY", "MONDAY", "SATURDAY", "SUNDAY", "THURSDAY", "TUESDAY", "WEDNESDAY"});
        s = new aa.a0("DayOfWeek");
    }

    public t6(String str, int i, String str2) {
        this.r = str2;
    }

    public static t6 valueOf(String str) {
        return (t6) Enum.valueOf(t6.class, str);
    }

    public static t6[] values() {
        return (t6[]) B.clone();
    }
}

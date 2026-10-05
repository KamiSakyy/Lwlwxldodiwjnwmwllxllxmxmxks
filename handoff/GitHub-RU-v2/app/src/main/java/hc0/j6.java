package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class j6 {
    public static final j6 A;
    public static final /* synthetic */ j6[] B;
    public static final /* synthetic */ d71.b C;
    public static final i6 Companion;
    public static final aa.a0 s;
    public static final j6 t;
    public static final j6 u;
    public static final j6 v;
    public static final j6 w;
    public static final j6 x;
    public static final j6 y;
    public static final j6 z;
    public final String r;

    static {
        j6 j6Var = new j6("FRIDAY", 0, "FRIDAY");
        t = j6Var;
        j6 j6Var2 = new j6("MONDAY", 1, "MONDAY");
        u = j6Var2;
        j6 j6Var3 = new j6("SATURDAY", 2, "SATURDAY");
        v = j6Var3;
        j6 j6Var4 = new j6("SUNDAY", 3, "SUNDAY");
        w = j6Var4;
        j6 j6Var5 = new j6("THURSDAY", 4, "THURSDAY");
        x = j6Var5;
        j6 j6Var6 = new j6("TUESDAY", 5, "TUESDAY");
        y = j6Var6;
        j6 j6Var7 = new j6("WEDNESDAY", 6, "WEDNESDAY");
        z = j6Var7;
        j6 j6Var8 = new j6("UNKNOWN__", 7, "UNKNOWN__");
        A = j6Var8;
        j6[] j6VarArr = {j6Var, j6Var2, j6Var3, j6Var4, j6Var5, j6Var6, j6Var7, j6Var8};
        B = j6VarArr;
        C = v8.l0.t(j6VarArr);
        Companion = new i6();
        x61.l.r(new String[]{"FRIDAY", "MONDAY", "SATURDAY", "SUNDAY", "THURSDAY", "TUESDAY", "WEDNESDAY"});
        s = new aa.a0("DayOfWeek");
    }

    public j6(String str, int i, String str2) {
        this.r = str2;
    }

    public static j6 valueOf(String str) {
        return (j6) Enum.valueOf(j6.class, str);
    }

    public static j6[] values() {
        return (j6[]) B.clone();
    }
}

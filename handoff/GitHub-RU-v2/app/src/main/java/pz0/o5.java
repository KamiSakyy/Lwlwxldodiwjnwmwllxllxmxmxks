package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class o5 {
    public static final n5 Companion;
    public static final aa.a0 s;
    public static final o5 t;
    public static final /* synthetic */ o5[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        o5 o5Var = new o5("FIRST_QUARTILE", 0, "FIRST_QUARTILE");
        o5 o5Var2 = new o5("FOURTH_QUARTILE", 1, "FOURTH_QUARTILE");
        o5 o5Var3 = new o5("NONE", 2, "NONE");
        o5 o5Var4 = new o5("SECOND_QUARTILE", 3, "SECOND_QUARTILE");
        o5 o5Var5 = new o5("THIRD_QUARTILE", 4, "THIRD_QUARTILE");
        o5 o5Var6 = new o5("UNKNOWN__", 5, "UNKNOWN__");
        t = o5Var6;
        o5[] o5VarArr = {o5Var, o5Var2, o5Var3, o5Var4, o5Var5, o5Var6};
        u = o5VarArr;
        v = v8.l0.t(o5VarArr);
        Companion = new n5();
        x61.l.r(new String[]{"FIRST_QUARTILE", "FOURTH_QUARTILE", "NONE", "SECOND_QUARTILE", "THIRD_QUARTILE"});
        s = new aa.a0("ContributionLevel");
    }

    public o5(String str, int i, String str2) {
        this.r = str2;
    }

    public static o5 valueOf(String str) {
        return (o5) Enum.valueOf(o5.class, str);
    }

    public static o5[] values() {
        return (o5[]) u.clone();
    }
}

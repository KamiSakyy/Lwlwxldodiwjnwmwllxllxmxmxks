package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 {
    public static final o4 Companion;
    public static final aa.a0 s;
    public static final p4 t;
    public static final /* synthetic */ p4[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        p4 p4Var = new p4("FIRST_QUARTILE", 0, "FIRST_QUARTILE");
        p4 p4Var2 = new p4("FOURTH_QUARTILE", 1, "FOURTH_QUARTILE");
        p4 p4Var3 = new p4("NONE", 2, "NONE");
        p4 p4Var4 = new p4("SECOND_QUARTILE", 3, "SECOND_QUARTILE");
        p4 p4Var5 = new p4("THIRD_QUARTILE", 4, "THIRD_QUARTILE");
        p4 p4Var6 = new p4("UNKNOWN__", 5, "UNKNOWN__");
        t = p4Var6;
        p4[] p4VarArr = {p4Var, p4Var2, p4Var3, p4Var4, p4Var5, p4Var6};
        u = p4VarArr;
        v = v8.l0.t(p4VarArr);
        Companion = new o4();
        x61.l.r(new String[]{"FIRST_QUARTILE", "FOURTH_QUARTILE", "NONE", "SECOND_QUARTILE", "THIRD_QUARTILE"});
        s = new aa.a0("ContributionLevel");
    }

    public p4(String str, int i, String str2) {
        this.r = str2;
    }

    public static p4 valueOf(String str) {
        return (p4) Enum.valueOf(p4.class, str);
    }

    public static p4[] values() {
        return (p4[]) u.clone();
    }
}

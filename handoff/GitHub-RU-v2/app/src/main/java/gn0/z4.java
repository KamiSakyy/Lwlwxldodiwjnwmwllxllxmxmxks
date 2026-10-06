package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class z4 {
    public static final y4 Companion;
    public static final aa.a0 s;
    public static final z4 t;
    public static final /* synthetic */ z4[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        z4 z4Var = new z4("FIRST_QUARTILE", 0, "FIRST_QUARTILE");
        z4 z4Var2 = new z4("FOURTH_QUARTILE", 1, "FOURTH_QUARTILE");
        z4 z4Var3 = new z4("NONE", 2, "NONE");
        z4 z4Var4 = new z4("SECOND_QUARTILE", 3, "SECOND_QUARTILE");
        z4 z4Var5 = new z4("THIRD_QUARTILE", 4, "THIRD_QUARTILE");
        z4 z4Var6 = new z4("UNKNOWN__", 5, "UNKNOWN__");
        t = z4Var6;
        z4[] z4VarArr = {z4Var, z4Var2, z4Var3, z4Var4, z4Var5, z4Var6};
        u = z4VarArr;
        v = v8.l0.t(z4VarArr);
        Companion = new y4();
        x61.l.r(new String[]{"FIRST_QUARTILE", "FOURTH_QUARTILE", "NONE", "SECOND_QUARTILE", "THIRD_QUARTILE"});
        s = new aa.a0("ContributionLevel");
    }

    public z4(String str, int i, String str2) {
        this.r = str2;
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) u.clone();
    }
}

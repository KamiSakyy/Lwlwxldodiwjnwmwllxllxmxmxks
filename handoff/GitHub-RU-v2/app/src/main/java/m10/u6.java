package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class u6 {
    public static final t6 Companion;
    public static final aa.a0 s;
    public static final u6 t;
    public static final /* synthetic */ u6[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        u6 u6Var = new u6("FIRST_QUARTILE", 0, "FIRST_QUARTILE");
        u6 u6Var2 = new u6("FOURTH_QUARTILE", 1, "FOURTH_QUARTILE");
        u6 u6Var3 = new u6("NONE", 2, "NONE");
        u6 u6Var4 = new u6("SECOND_QUARTILE", 3, "SECOND_QUARTILE");
        u6 u6Var5 = new u6("THIRD_QUARTILE", 4, "THIRD_QUARTILE");
        u6 u6Var6 = new u6("UNKNOWN__", 5, "UNKNOWN__");
        t = u6Var6;
        u6[] u6VarArr = {u6Var, u6Var2, u6Var3, u6Var4, u6Var5, u6Var6};
        u = u6VarArr;
        v = v8.l0.t(u6VarArr);
        Companion = new t6();
        x61.l.r(new String[]{"FIRST_QUARTILE", "FOURTH_QUARTILE", "NONE", "SECOND_QUARTILE", "THIRD_QUARTILE"});
        s = new aa.a0("ContributionLevel");
    }

    public u6(String str, int i, String str2) {
        this.r = str2;
    }

    public static u6 valueOf(String str) {
        return (u6) Enum.valueOf(u6.class, str);
    }

    public static u6[] values() {
        return (u6[]) u.clone();
    }

    public static Object ordinal(Object... a) {
        return null;
    }
}

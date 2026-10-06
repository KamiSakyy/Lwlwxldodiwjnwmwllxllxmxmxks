package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class j40 {
    public static final i40 Companion;
    public static final j40 s;
    public static final j40 t;
    public static final j40 u;
    public static final j40 v;
    public static final j40 w;
    public static final j40 x;
    public static final /* synthetic */ j40[] y;
    public static final /* synthetic */ d71.b z;
    public String r;

    static {
        j40 j40Var = new j40("CREATED_AT", 0, "CREATED_AT");
        s = j40Var;
        j40 j40Var2 = new j40("NAME", 1, "NAME");
        t = j40Var2;
        j40 j40Var3 = new j40("PUSHED_AT", 2, "PUSHED_AT");
        u = j40Var3;
        j40 j40Var4 = new j40("STARGAZERS", 3, "STARGAZERS");
        v = j40Var4;
        j40 j40Var5 = new j40("UPDATED_AT", 4, "UPDATED_AT");
        w = j40Var5;
        j40 j40Var6 = new j40("UNKNOWN__", 5, "UNKNOWN__");
        x = j40Var6;
        j40[] j40VarArr = {j40Var, j40Var2, j40Var3, j40Var4, j40Var5, j40Var6};
        y = j40VarArr;
        z = v8.l0.t(j40VarArr);
        Companion = new i40();
        sy.d0.o("CREATED_AT", "NAME", "PUSHED_AT", "STARGAZERS", "UPDATED_AT");
    }

    public j40(String str, int i, String str2) {
        this.r = str2;
    }

    public static j40 valueOf(String str) {
        return (j40) Enum.valueOf(j40.class, str);
    }

    public static j40[] values() {
        return (j40[]) y.clone();
    }
}

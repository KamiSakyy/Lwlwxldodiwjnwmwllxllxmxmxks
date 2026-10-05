package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class j1 {

    /* renamed from: r, reason: collision with root package name */
    public static final j1 f22308r;

    /* renamed from: s, reason: collision with root package name */
    public static final j1 f22309s;

    /* renamed from: t, reason: collision with root package name */
    public static final j1 f22310t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ j1[] f22311u;

    static {
        j1 j1Var = new j1("Default", 0);
        f22308r = j1Var;
        j1 j1Var2 = new j1("UserInput", 1);
        f22309s = j1Var2;
        j1 j1Var3 = new j1("PreventUserInput", 2);
        f22310t = j1Var3;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3};
        f22311u = j1VarArr;
        v8.l0.t(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f22311u.clone();
    }
}

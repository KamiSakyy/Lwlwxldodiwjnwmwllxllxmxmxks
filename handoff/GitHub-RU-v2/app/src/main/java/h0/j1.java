package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class j1 {

    /* renamed from: r, reason: collision with root package name */
    public static final j1 f25037r;

    /* renamed from: s, reason: collision with root package name */
    public static final j1 f25038s;

    /* renamed from: t, reason: collision with root package name */
    public static final j1 f25039t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ j1[] f25040u;

    static {
        j1 j1Var = new j1("Yes", 0);
        f25037r = j1Var;
        j1 j1Var2 = new j1("No", 1);
        f25038s = j1Var2;
        j1 j1Var3 = new j1("NotInitialized", 2);
        f25039t = j1Var3;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3};
        f25040u = j1VarArr;
        v8.l0.t(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f25040u.clone();
    }
}

package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class p0 {

    /* renamed from: r, reason: collision with root package name */
    public static final p0 f25401r;

    /* renamed from: s, reason: collision with root package name */
    public static final p0 f25402s;

    /* renamed from: t, reason: collision with root package name */
    public static final p0 f25403t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ p0[] f25404u;

    static {
        p0 p0Var = new p0("Focused", 0);
        f25401r = p0Var;
        p0 p0Var2 = new p0("UnfocusedEmpty", 1);
        f25402s = p0Var2;
        p0 p0Var3 = new p0("UnfocusedNotEmpty", 2);
        f25403t = p0Var3;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        f25404u = p0VarArr;
        v8.l0.t(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f25404u.clone();
    }
}

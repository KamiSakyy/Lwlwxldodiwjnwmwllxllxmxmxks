package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class b1 {

    /* renamed from: r, reason: collision with root package name */
    public static final b1 f21r;

    /* renamed from: s, reason: collision with root package name */
    public static final b1 f22s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b1[] f23t;

    static {
        b1 b1Var = new b1("Restart", 0);
        f21r = b1Var;
        b1 b1Var2 = new b1("Reverse", 1);
        f22s = b1Var2;
        b1[] b1VarArr = {b1Var, b1Var2};
        f23t = b1VarArr;
        v8.l0.t(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f23t.clone();
    }

    public b1(Object... a) {
    }
}

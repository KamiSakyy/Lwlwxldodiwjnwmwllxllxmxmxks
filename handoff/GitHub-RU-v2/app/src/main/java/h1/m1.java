package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class m1 {

    /* renamed from: r, reason: collision with root package name */
    public static final m1 f25379r;

    /* renamed from: s, reason: collision with root package name */
    public static final m1 f25380s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ m1[] f25381t;

    static {
        m1 m1Var = new m1("Filled", 0);
        f25379r = m1Var;
        m1 m1Var2 = new m1("Outlined", 1);
        f25380s = m1Var2;
        m1[] m1VarArr = {m1Var, m1Var2};
        f25381t = m1VarArr;
        v8.l0.t(m1VarArr);
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) f25381t.clone();
    }
}

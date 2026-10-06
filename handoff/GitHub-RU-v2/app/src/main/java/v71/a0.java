package v71;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class a0 {
    public static final a0 r;
    public static final a0 s;
    public static final a0 t;
    public static final a0 u;
    public static final /* synthetic */ a0[] v;

    static {
        a0 a0Var = new a0("DEFAULT", 0);
        r = a0Var;
        a0 a0Var2 = new a0("LAZY", 1);
        s = a0Var2;
        a0 a0Var3 = new a0("ATOMIC", 2);
        t = a0Var3;
        a0 a0Var4 = new a0("UNDISPATCHED", 3);
        u = a0Var4;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        v = a0VarArr;
        v8.l0.t(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) v.clone();
    }

    public a0(Object... a) {
    }
    public Object ordinal() { return null; }
}

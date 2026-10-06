package v71;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class a0Shadow {
    public static final a0Shadow r;
    public static final a0Shadow s;
    public static final a0Shadow t;
    public static final a0Shadow u;
    public static final /* synthetic */ a0Shadow[] v;

    static {
        a0Shadow a0Var = new a0Shadow("DEFAULT", 0);
        r = a0Var;
        a0Shadow a0Var2 = new a0Shadow("LAZY", 1);
        s = a0Var2;
        a0Shadow a0Var3 = new a0Shadow("ATOMIC", 2);
        t = a0Var3;
        a0Shadow a0Var4 = new a0Shadow("UNDISPATCHED", 3);
        u = a0Var4;
        a0Shadow[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        v = a0VarArr;
        v8.l0.t(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0Shadow) Enum.valueOf(a0Shadow.class, str);
    }

    public static a0Shadow[] values() {
        return (a0Shadow[]) v.clone();
    }

    public a0(Object... a) {
    }
    public Object ordinal() { return null; }
}

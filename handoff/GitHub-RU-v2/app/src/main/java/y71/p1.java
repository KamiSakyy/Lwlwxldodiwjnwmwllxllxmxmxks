package y71;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class p1 {
    public static final p1 r;
    public static final p1 s;
    public static final p1 t;
    public static final /* synthetic */ p1[] u;

    static {
        p1 p1Var = new p1("START", 0);
        r = p1Var;
        p1 p1Var2 = new p1("STOP", 1);
        s = p1Var2;
        p1 p1Var3 = new p1("STOP_AND_RESET_REPLAY_CACHE", 2);
        t = p1Var3;
        p1[] p1VarArr = {p1Var, p1Var2, p1Var3};
        u = p1VarArr;
        v8.l0.t(p1VarArr);
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) u.clone();
    }
}

package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ac0 {
    public static final zb0 Companion;
    public static final ac0 s;
    public static final ac0 t;
    public static final ac0 u;
    public static final ac0 v;
    public static final /* synthetic */ ac0[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        ac0 ac0Var = new ac0("DAILY", 0, "DAILY");
        s = ac0Var;
        ac0 ac0Var2 = new ac0("MONTHLY", 1, "MONTHLY");
        t = ac0Var2;
        ac0 ac0Var3 = new ac0("WEEKLY", 2, "WEEKLY");
        u = ac0Var3;
        ac0 ac0Var4 = new ac0("UNKNOWN__", 3, "UNKNOWN__");
        v = ac0Var4;
        ac0[] ac0VarArr = {ac0Var, ac0Var2, ac0Var3, ac0Var4};
        w = ac0VarArr;
        x = v8.l0.t(ac0VarArr);
        Companion = new zb0();
        sy.d0.o("DAILY", "MONTHLY", "WEEKLY");
    }

    public ac0(String str, int i, String str2) {
        this.r = str2;
    }

    public static ac0 valueOf(String str) {
        return (ac0) Enum.valueOf(ac0.class, str);
    }

    public static ac0[] values() {
        return (ac0[]) w.clone();
    }
}

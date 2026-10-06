package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 {
    public static final l2 Companion;
    public static final m2 s;
    public static final m2 t;
    public static final m2 u;
    public static final m2 v;
    public static final m2 w;
    public static final /* synthetic */ m2[] x;
    public String r;

    static {
        m2 m2Var = new m2("INDEFINITE", 0, "INDEFINITE");
        s = m2Var;
        m2 m2Var2 = new m2("ONE_DAY", 1, "ONE_DAY");
        t = m2Var2;
        m2 m2Var3 = new m2("SEVEN_DAYS", 2, "SEVEN_DAYS");
        u = m2Var3;
        m2 m2Var4 = new m2("THIRTY_DAYS", 3, "THIRTY_DAYS");
        v = m2Var4;
        m2 m2Var5 = new m2("THREE_DAYS", 4, "THREE_DAYS");
        w = m2Var5;
        m2[] m2VarArr = {m2Var, m2Var2, m2Var3, m2Var4, m2Var5, new m2("UNKNOWN__", 5, "UNKNOWN__")};
        x = m2VarArr;
        v8.l0.t(m2VarArr);
        Companion = new l2();
        sy.d0Shadow.o(new String[]{"INDEFINITE", "ONE_DAY", "SEVEN_DAYS", "THIRTY_DAYS", "THREE_DAYS"});
    }

    public m2(String str, int i, String str2) {
        this.r = str2;
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) x.clone();
    }
}

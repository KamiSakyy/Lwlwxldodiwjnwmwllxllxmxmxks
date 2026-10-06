package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class f50 {
    public static final e50 Companion;
    public static final f50 s;
    public static final f50 t;
    public static final f50 u;
    public static final f50 v;
    public static final /* synthetic */ f50[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        f50 f50Var = new f50("DAILY", 0, "DAILY");
        s = f50Var;
        f50 f50Var2 = new f50("MONTHLY", 1, "MONTHLY");
        t = f50Var2;
        f50 f50Var3 = new f50("WEEKLY", 2, "WEEKLY");
        u = f50Var3;
        f50 f50Var4 = new f50("UNKNOWN__", 3, "UNKNOWN__");
        v = f50Var4;
        f50[] f50VarArr = {f50Var, f50Var2, f50Var3, f50Var4};
        w = f50VarArr;
        x = v8.l0.t(f50VarArr);
        Companion = new e50();
        sy.d0.o(new String[]{"DAILY", "MONTHLY", "WEEKLY"});
    }

    public f50(String str, int i, String str2) {
        this.r = str2;
    }

    public static f50 valueOf(String str) {
        return (f50) Enum.valueOf(f50.class, str);
    }

    public static f50[] values() {
        return (f50[]) w.clone();
    }
}

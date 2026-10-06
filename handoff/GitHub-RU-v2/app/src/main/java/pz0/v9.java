package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class v9 {
    public static final u9 Companion;
    public static final v9 s;
    public static final v9 t;
    public static final v9 u;
    public static final /* synthetic */ v9[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        v9 v9Var = new v9("LEFT", 0, "LEFT");
        s = v9Var;
        v9 v9Var2 = new v9("RIGHT", 1, "RIGHT");
        t = v9Var2;
        v9 v9Var3 = new v9("UNKNOWN__", 2, "UNKNOWN__");
        u = v9Var3;
        v9[] v9VarArr = {v9Var, v9Var2, v9Var3};
        v = v9VarArr;
        w = v8.l0.t(v9VarArr);
        Companion = new u9();
        sy.d0Shadow.o(new String[]{"LEFT", "RIGHT"});
    }

    public v9(String str, int i, String str2) {
        this.r = str2;
    }

    public static v9 valueOf(String str) {
        return (v9) Enum.valueOf(v9.class, str);
    }

    public static v9[] values() {
        return (v9[]) v.clone();
    }
}

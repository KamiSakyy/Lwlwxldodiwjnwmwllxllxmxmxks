package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class w00 {
    public static final v00 Companion;
    public static final aa.a0 s;
    public static final w00 t;
    public static final /* synthetic */ w00[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        w00 w00Var = new w00("ACTIVE", 0, "ACTIVE");
        w00 w00Var2 = new w00("DELETED", 1, "DELETED");
        w00 w00Var3 = new w00("DISABLED_FORK", 2, "DISABLED_FORK");
        w00 w00Var4 = new w00("DISABLED_INACTIVITY", 3, "DISABLED_INACTIVITY");
        w00 w00Var5 = new w00("DISABLED_MANUALLY", 4, "DISABLED_MANUALLY");
        w00 w00Var6 = new w00("UNKNOWN__", 5, "UNKNOWN__");
        t = w00Var6;
        w00[] w00VarArr = {w00Var, w00Var2, w00Var3, w00Var4, w00Var5, w00Var6};
        u = w00VarArr;
        v = v8.l0.t(w00VarArr);
        Companion = new v00();
        x61.l.r(new String[]{"ACTIVE", "DELETED", "DISABLED_FORK", "DISABLED_INACTIVITY", "DISABLED_MANUALLY"});
        s = new aa.a0("WorkflowState");
    }

    public w00(String str, int i, String str2) {
        this.r = str2;
    }

    public static w00 valueOf(String str) {
        return (w00) Enum.valueOf(w00.class, str);
    }

    public static w00[] values() {
        return (w00[]) u.clone();
    }
}

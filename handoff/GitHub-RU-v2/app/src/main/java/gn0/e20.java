package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class e20 {
    public static final d20 Companion;
    public static final aa.a0 s;
    public static final e20 t;
    public static final /* synthetic */ e20[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        e20 e20Var = new e20("ACTIVE", 0, "ACTIVE");
        e20 e20Var2 = new e20("DELETED", 1, "DELETED");
        e20 e20Var3 = new e20("DISABLED_FORK", 2, "DISABLED_FORK");
        e20 e20Var4 = new e20("DISABLED_INACTIVITY", 3, "DISABLED_INACTIVITY");
        e20 e20Var5 = new e20("DISABLED_MANUALLY", 4, "DISABLED_MANUALLY");
        e20 e20Var6 = new e20("UNKNOWN__", 5, "UNKNOWN__");
        t = e20Var6;
        e20[] e20VarArr = {e20Var, e20Var2, e20Var3, e20Var4, e20Var5, e20Var6};
        u = e20VarArr;
        v = v8.l0.t(e20VarArr);
        Companion = new d20();
        x61.l.r(new String[]{"ACTIVE", "DELETED", "DISABLED_FORK", "DISABLED_INACTIVITY", "DISABLED_MANUALLY"});
        s = new aa.a0("WorkflowState");
    }

    public e20(String str, int i, String str2) {
        this.r = str2;
    }

    public static e20 valueOf(String str) {
        return (e20) Enum.valueOf(e20.class, str);
    }

    public static e20[] values() {
        return (e20[]) u.clone();
    }
}

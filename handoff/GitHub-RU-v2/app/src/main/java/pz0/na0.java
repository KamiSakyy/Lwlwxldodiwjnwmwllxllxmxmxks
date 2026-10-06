package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class na0 {
    public static final ma0 Companion;
    public static final aa.a0 s;
    public static final na0 t;
    public static final /* synthetic */ na0[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        na0 na0Var = new na0("ACTIVE", 0, "ACTIVE");
        na0 na0Var2 = new na0("DELETED", 1, "DELETED");
        na0 na0Var3 = new na0("DISABLED_FORK", 2, "DISABLED_FORK");
        na0 na0Var4 = new na0("DISABLED_INACTIVITY", 3, "DISABLED_INACTIVITY");
        na0 na0Var5 = new na0("DISABLED_MANUALLY", 4, "DISABLED_MANUALLY");
        na0 na0Var6 = new na0("UNKNOWN__", 5, "UNKNOWN__");
        t = na0Var6;
        na0[] na0VarArr = {na0Var, na0Var2, na0Var3, na0Var4, na0Var5, na0Var6};
        u = na0VarArr;
        v = v8.l0.t(na0VarArr);
        Companion = new ma0();
        x61.l.r(new String[]{"ACTIVE", "DELETED", "DISABLED_FORK", "DISABLED_INACTIVITY", "DISABLED_MANUALLY"});
        s = new aa.a0("WorkflowState");
    }

    public na0(String str, int i, String str2) {
        this.r = str2;
    }

    public static na0 valueOf(String str) {
        return (na0) Enum.valueOf(na0.class, str);
    }

    public static na0[] values() {
        return (na0[]) u.clone();
    }
}

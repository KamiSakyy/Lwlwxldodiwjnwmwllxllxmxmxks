package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ih0 {
    public static final hh0 Companion;
    public static final aa.a0 s;
    public static final ih0 t;
    public static final /* synthetic */ ih0[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        ih0 ih0Var = new ih0("ACTIVE", 0, "ACTIVE");
        ih0 ih0Var2 = new ih0("DELETED", 1, "DELETED");
        ih0 ih0Var3 = new ih0("DISABLED_FORK", 2, "DISABLED_FORK");
        ih0 ih0Var4 = new ih0("DISABLED_INACTIVITY", 3, "DISABLED_INACTIVITY");
        ih0 ih0Var5 = new ih0("DISABLED_MANUALLY", 4, "DISABLED_MANUALLY");
        ih0 ih0Var6 = new ih0("UNKNOWN__", 5, "UNKNOWN__");
        t = ih0Var6;
        ih0[] ih0VarArr = {ih0Var, ih0Var2, ih0Var3, ih0Var4, ih0Var5, ih0Var6};
        u = ih0VarArr;
        v = v8.l0.t(ih0VarArr);
        Companion = new hh0();
        x61.l.r(new String[]{"ACTIVE", "DELETED", "DISABLED_FORK", "DISABLED_INACTIVITY", "DISABLED_MANUALLY"});
        s = new aa.a0("WorkflowState");
    }

    public ih0(String str, int i, String str2) {
        this.r = str2;
    }

    public static ih0 valueOf(String str) {
        return (ih0) Enum.valueOf(ih0.class, str);
    }

    public static ih0[] values() {
        return (ih0[]) u.clone();
    }
}

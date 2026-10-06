package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ah0 {
    public static final zg0 Companion;
    public static final aa.a0 s;
    public static final ah0 t;
    public static final /* synthetic */ ah0[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        ah0 ah0Var = new ah0("BOOLEAN", 0, "BOOLEAN");
        ah0 ah0Var2 = new ah0("CHOICE", 1, "CHOICE");
        ah0 ah0Var3 = new ah0("ENVIRONMENT", 2, "ENVIRONMENT");
        ah0 ah0Var4 = new ah0("NUMBER", 3, "NUMBER");
        ah0 ah0Var5 = new ah0("STRING", 4, "STRING");
        ah0 ah0Var6 = new ah0("UNKNOWN__", 5, "UNKNOWN__");
        t = ah0Var6;
        ah0[] ah0VarArr = {ah0Var, ah0Var2, ah0Var3, ah0Var4, ah0Var5, ah0Var6};
        u = ah0VarArr;
        v = v8.l0.t(ah0VarArr);
        Companion = new zg0();
        x61.l.r(new String[]{"BOOLEAN", "CHOICE", "ENVIRONMENT", "NUMBER", "STRING"});
        s = new aa.a0("WorkflowInputType");
    }

    public ah0(String str, int i, String str2) {
        this.r = str2;
    }

    public static ah0 valueOf(String str) {
        return (ah0) Enum.valueOf(ah0.class, str);
    }

    public static ah0[] values() {
        return (ah0[]) u.clone();
    }
}

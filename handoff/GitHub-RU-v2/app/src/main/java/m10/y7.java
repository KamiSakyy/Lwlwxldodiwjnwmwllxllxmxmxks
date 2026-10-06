package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class y7 {
    public static final x7 Companion;
    public static final aa.a0 s;
    public static final y7 t;
    public static final /* synthetic */ y7[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        y7 y7Var = new y7("CLI", 0, "CLI");
        y7 y7Var2 = new y7("CLOUD", 1, "CLOUD");
        y7 y7Var3 = new y7("UNKNOWN__", 2, "UNKNOWN__");
        t = y7Var3;
        y7[] y7VarArr = {y7Var, y7Var2, y7Var3};
        u = y7VarArr;
        v = v8.l0.t(y7VarArr);
        Companion = new x7();
        x61.l.r(new String[]{"CLI", "CLOUD"});
        s = new aa.a0("CopilotAgentType");
    }

    public y7(String str, int i, String str2) {
        this.r = str2;
    }

    public static y7 valueOf(String str) {
        return (y7) Enum.valueOf(y7.class, str);
    }

    public static y7[] values() {
        return (y7[]) u.clone();
    }
}

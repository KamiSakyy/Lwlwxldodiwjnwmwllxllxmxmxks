package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g7 {
    public static final f7 Companion;
    public static final g7 s;
    public static final g7 t;
    public static final /* synthetic */ g7[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        g7 g7Var = new g7("CHAT_THREAD", 0, "CHAT_THREAD");
        g7 g7Var2 = new g7("PULL_REQUEST", 1, "PULL_REQUEST");
        s = g7Var2;
        g7 g7Var3 = new g7("UNKNOWN__", 2, "UNKNOWN__");
        t = g7Var3;
        g7[] g7VarArr = {g7Var, g7Var2, g7Var3};
        u = g7VarArr;
        v = v8.l0.t(g7VarArr);
        Companion = new f7();
        sy.d0.o("CHAT_THREAD", "PULL_REQUEST");
    }

    public g7(String str, int i, String str2) {
        this.r = str2;
    }

    public static g7 valueOf(String str) {
        return (g7) Enum.valueOf(g7.class, str);
    }

    public static g7[] values() {
        return (g7[]) u.clone();
    }
}

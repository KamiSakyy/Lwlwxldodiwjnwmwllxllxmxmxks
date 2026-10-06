package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class o7 {
    public static final o7 A;
    public static final o7 B;
    public static final /* synthetic */ o7[] C;
    public static final n7 Companion;
    public static final /* synthetic */ d71.b D;
    public static final aa.a0 s;
    public static final o7 t;
    public static final o7 u;
    public static final o7 v;
    public static final o7 w;
    public static final o7 x;
    public static final o7 y;
    public static final o7 z;
    public String r;

    static {
        o7 o7Var = new o7("CANCELLED", 0, "CANCELLED");
        t = o7Var;
        o7 o7Var2 = new o7("COMPLETED", 1, "COMPLETED");
        u = o7Var2;
        o7 o7Var3 = new o7("FAILED", 2, "FAILED");
        v = o7Var3;
        o7 o7Var4 = new o7("IDLE", 3, "IDLE");
        w = o7Var4;
        o7 o7Var5 = new o7("IN_PROGRESS", 4, "IN_PROGRESS");
        x = o7Var5;
        o7 o7Var6 = new o7("QUEUED", 5, "QUEUED");
        y = o7Var6;
        o7 o7Var7 = new o7("TIMED_OUT", 6, "TIMED_OUT");
        z = o7Var7;
        o7 o7Var8 = new o7("WAITING_FOR_USER", 7, "WAITING_FOR_USER");
        A = o7Var8;
        o7 o7Var9 = new o7("UNKNOWN__", 8, "UNKNOWN__");
        B = o7Var9;
        o7[] o7VarArr = {o7Var, o7Var2, o7Var3, o7Var4, o7Var5, o7Var6, o7Var7, o7Var8, o7Var9};
        C = o7VarArr;
        D = v8.l0.t(o7VarArr);
        Companion = new n7();
        x61.l.r(new String[]{"CANCELLED", "COMPLETED", "FAILED", "IDLE", "IN_PROGRESS", "QUEUED", "TIMED_OUT", "WAITING_FOR_USER"});
        s = new aa.a0("CopilotAgentSessionState");
    }

    public o7(String str, int i, String str2) {
        this.r = str2;
    }

    public static o7 valueOf(String str) {
        return (o7) Enum.valueOf(o7.class, str);
    }

    public static o7[] values() {
        return (o7[]) C.clone();
    }
    public Object ordinal() { return null; }
}

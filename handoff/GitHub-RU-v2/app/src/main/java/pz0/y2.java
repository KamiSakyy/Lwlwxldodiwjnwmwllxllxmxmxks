package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class y2 {
    public static final x2 Companion;
    public static final aa.a0 s;
    public static final y2 t;
    public static final /* synthetic */ y2[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        y2 y2Var = new y2("ACTION_REQUIRED", 0, "ACTION_REQUIRED");
        y2 y2Var2 = new y2("CANCELLED", 1, "CANCELLED");
        y2 y2Var3 = new y2("FAILURE", 2, "FAILURE");
        y2 y2Var4 = new y2("NEUTRAL", 3, "NEUTRAL");
        y2 y2Var5 = new y2("SKIPPED", 4, "SKIPPED");
        y2 y2Var6 = new y2("STALE", 5, "STALE");
        y2 y2Var7 = new y2("STARTUP_FAILURE", 6, "STARTUP_FAILURE");
        y2 y2Var8 = new y2("SUCCESS", 7, "SUCCESS");
        y2 y2Var9 = new y2("TIMED_OUT", 8, "TIMED_OUT");
        y2 y2Var10 = new y2("UNKNOWN__", 9, "UNKNOWN__");
        t = y2Var10;
        y2[] y2VarArr = {y2Var, y2Var2, y2Var3, y2Var4, y2Var5, y2Var6, y2Var7, y2Var8, y2Var9, y2Var10};
        u = y2VarArr;
        v = v8.l0.t(y2VarArr);
        Companion = new x2();
        x61.l.r(new String[]{"ACTION_REQUIRED", "CANCELLED", "FAILURE", "NEUTRAL", "SKIPPED", "STALE", "STARTUP_FAILURE", "SUCCESS", "TIMED_OUT"});
        s = new aa.a0("CheckConclusionState");
    }

    public y2(String str, int i, String str2) {
        this.r = str2;
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) u.clone();
    }
    public Object ordinal() { return null; }
}

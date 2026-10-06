package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class t3 {
    public static final s3 Companion;
    public static final aa.a0 s;
    public static final t3 t;
    public static final /* synthetic */ t3[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        t3 t3Var = new t3("ACTION_REQUIRED", 0, "ACTION_REQUIRED");
        t3 t3Var2 = new t3("CANCELLED", 1, "CANCELLED");
        t3 t3Var3 = new t3("FAILURE", 2, "FAILURE");
        t3 t3Var4 = new t3("NEUTRAL", 3, "NEUTRAL");
        t3 t3Var5 = new t3("SKIPPED", 4, "SKIPPED");
        t3 t3Var6 = new t3("STALE", 5, "STALE");
        t3 t3Var7 = new t3("STARTUP_FAILURE", 6, "STARTUP_FAILURE");
        t3 t3Var8 = new t3("SUCCESS", 7, "SUCCESS");
        t3 t3Var9 = new t3("TIMED_OUT", 8, "TIMED_OUT");
        t3 t3Var10 = new t3("UNKNOWN__", 9, "UNKNOWN__");
        t = t3Var10;
        t3[] t3VarArr = {t3Var, t3Var2, t3Var3, t3Var4, t3Var5, t3Var6, t3Var7, t3Var8, t3Var9, t3Var10};
        u = t3VarArr;
        v = v8.l0.t(t3VarArr);
        Companion = new s3();
        x61.l.r(new String[]{"ACTION_REQUIRED", "CANCELLED", "FAILURE", "NEUTRAL", "SKIPPED", "STALE", "STARTUP_FAILURE", "SUCCESS", "TIMED_OUT"});
        s = new aa.a0("CheckConclusionState");
    }

    public t3(String str, int i, String str2) {
        this.r = str2;
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) u.clone();
    }
    public Object ordinal() { return null; }
}

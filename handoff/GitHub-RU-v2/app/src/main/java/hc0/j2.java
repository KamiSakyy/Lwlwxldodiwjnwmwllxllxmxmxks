package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 {
    public static final i2 Companion;
    public static final aa.a0 s;
    public static final j2 t;
    public static final /* synthetic */ j2[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        j2 j2Var = new j2("ACTION_REQUIRED", 0, "ACTION_REQUIRED");
        j2 j2Var2 = new j2("CANCELLED", 1, "CANCELLED");
        j2 j2Var3 = new j2("FAILURE", 2, "FAILURE");
        j2 j2Var4 = new j2("NEUTRAL", 3, "NEUTRAL");
        j2 j2Var5 = new j2("SKIPPED", 4, "SKIPPED");
        j2 j2Var6 = new j2("STALE", 5, "STALE");
        j2 j2Var7 = new j2("STARTUP_FAILURE", 6, "STARTUP_FAILURE");
        j2 j2Var8 = new j2("SUCCESS", 7, "SUCCESS");
        j2 j2Var9 = new j2("TIMED_OUT", 8, "TIMED_OUT");
        j2 j2Var10 = new j2("UNKNOWN__", 9, "UNKNOWN__");
        t = j2Var10;
        j2[] j2VarArr = {j2Var, j2Var2, j2Var3, j2Var4, j2Var5, j2Var6, j2Var7, j2Var8, j2Var9, j2Var10};
        u = j2VarArr;
        v = v8.l0.t(j2VarArr);
        Companion = new i2();
        x61.l.r(new String[]{"ACTION_REQUIRED", "CANCELLED", "FAILURE", "NEUTRAL", "SKIPPED", "STALE", "STARTUP_FAILURE", "SUCCESS", "TIMED_OUT"});
        s = new aa.a0("CheckConclusionState");
    }

    public j2(String str, int i, String str2) {
        this.r = str2;
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) u.clone();
    }
    public Object ordinal() { return null; }
}

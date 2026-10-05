package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 {
    public static final k2 Companion;
    public static final aa.a0 s;
    public static final l2 t;
    public static final /* synthetic */ l2[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        l2 l2Var = new l2("ACTION_REQUIRED", 0, "ACTION_REQUIRED");
        l2 l2Var2 = new l2("CANCELLED", 1, "CANCELLED");
        l2 l2Var3 = new l2("FAILURE", 2, "FAILURE");
        l2 l2Var4 = new l2("NEUTRAL", 3, "NEUTRAL");
        l2 l2Var5 = new l2("SKIPPED", 4, "SKIPPED");
        l2 l2Var6 = new l2("STALE", 5, "STALE");
        l2 l2Var7 = new l2("STARTUP_FAILURE", 6, "STARTUP_FAILURE");
        l2 l2Var8 = new l2("SUCCESS", 7, "SUCCESS");
        l2 l2Var9 = new l2("TIMED_OUT", 8, "TIMED_OUT");
        l2 l2Var10 = new l2("UNKNOWN__", 9, "UNKNOWN__");
        t = l2Var10;
        l2[] l2VarArr = {l2Var, l2Var2, l2Var3, l2Var4, l2Var5, l2Var6, l2Var7, l2Var8, l2Var9, l2Var10};
        u = l2VarArr;
        v = v8.l0.t(l2VarArr);
        Companion = new k2();
        x61.l.r(new String[]{"ACTION_REQUIRED", "CANCELLED", "FAILURE", "NEUTRAL", "SKIPPED", "STALE", "STARTUP_FAILURE", "SUCCESS", "TIMED_OUT"});
        s = new aa.a0("CheckConclusionState");
    }

    public l2(String str, int i, String str2) {
        this.r = str2;
    }

    public static l2 valueOf(String str) {
        return (l2) Enum.valueOf(l2.class, str);
    }

    public static l2[] values() {
        return (l2[]) u.clone();
    }
}

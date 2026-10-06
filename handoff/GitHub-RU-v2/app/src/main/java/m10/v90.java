package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class v90 {
    public static final u90 Companion;
    public static final aa.a0 s;
    public static final v90 t;
    public static final /* synthetic */ v90[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        v90 v90Var = new v90("ACTION_REQUIRED", 0, "ACTION_REQUIRED");
        v90 v90Var2 = new v90("CANCELLED", 1, "CANCELLED");
        v90 v90Var3 = new v90("COMPLETED", 2, "COMPLETED");
        v90 v90Var4 = new v90("ERROR", 3, "ERROR");
        v90 v90Var5 = new v90("EXPECTED", 4, "EXPECTED");
        v90 v90Var6 = new v90("FAILURE", 5, "FAILURE");
        v90 v90Var7 = new v90("IN_PROGRESS", 6, "IN_PROGRESS");
        v90 v90Var8 = new v90("NEUTRAL", 7, "NEUTRAL");
        v90 v90Var9 = new v90("PENDING", 8, "PENDING");
        v90 v90Var10 = new v90("QUEUED", 9, "QUEUED");
        v90 v90Var11 = new v90("REQUESTED", 10, "REQUESTED");
        v90 v90Var12 = new v90("SKIPPED", 11, "SKIPPED");
        v90 v90Var13 = new v90("STALE", 12, "STALE");
        v90 v90Var14 = new v90("STARTUP_FAILURE", 13, "STARTUP_FAILURE");
        v90 v90Var15 = new v90("SUCCESS", 14, "SUCCESS");
        v90 v90Var16 = new v90("TIMED_OUT", 15, "TIMED_OUT");
        v90 v90Var17 = new v90("WAITING", 16, "WAITING");
        v90 v90Var18 = new v90("UNKNOWN__", 17, "UNKNOWN__");
        t = v90Var18;
        v90[] v90VarArr = {v90Var, v90Var2, v90Var3, v90Var4, v90Var5, v90Var6, v90Var7, v90Var8, v90Var9, v90Var10, v90Var11, v90Var12, v90Var13, v90Var14, v90Var15, v90Var16, v90Var17, v90Var18};
        u = v90VarArr;
        v = v8.l0.t(v90VarArr);
        Companion = new u90();
        x61.l.r(new String[]{"ACTION_REQUIRED", "CANCELLED", "COMPLETED", "ERROR", "EXPECTED", "FAILURE", "IN_PROGRESS", "NEUTRAL", "PENDING", "QUEUED", "REQUESTED", "SKIPPED", "STALE", "STARTUP_FAILURE", "SUCCESS", "TIMED_OUT", "WAITING"});
        s = new aa.a0("StatusCheckState");
    }

    public v90(String str, int i, String str2) {
        this.r = str2;
    }

    public static v90 valueOf(String str) {
        return (v90) Enum.valueOf(v90.class, str);
    }

    public static v90[] values() {
        return (v90[]) u.clone();
    }
    public Object ordinal() { return null; }
}

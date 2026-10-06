package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ba0 {
    public static final aa0 Companion;
    public static final aa.a0 s;
    public static final ba0 t;
    public static final /* synthetic */ ba0[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        ba0 ba0Var = new ba0("FAILED", 0, "FAILED");
        ba0 ba0Var2 = new ba0("PASSED", 1, "PASSED");
        ba0 ba0Var3 = new ba0("PENDING", 2, "PENDING");
        ba0 ba0Var4 = new ba0("PENDING_APPROVAL", 3, "PENDING_APPROVAL");
        ba0 ba0Var5 = new ba0("PENDING_FAILED", 4, "PENDING_FAILED");
        ba0 ba0Var6 = new ba0("SOME_FAILED", 5, "SOME_FAILED");
        ba0 ba0Var7 = new ba0("UNKNOWN__", 6, "UNKNOWN__");
        t = ba0Var7;
        ba0[] ba0VarArr = {ba0Var, ba0Var2, ba0Var3, ba0Var4, ba0Var5, ba0Var6, ba0Var7};
        u = ba0VarArr;
        v = v8.l0.t(ba0VarArr);
        Companion = new aa0();
        x61.l.r(new String[]{"FAILED", "PASSED", "PENDING", "PENDING_APPROVAL", "PENDING_FAILED", "SOME_FAILED"});
        s = new aa.a0("StatusRollupCombinedState");
    }

    public ba0(String str, int i, String str2) {
        this.r = str2;
    }

    public static ba0 valueOf(String str) {
        return (ba0) Enum.valueOf(ba0.class, str);
    }

    public static ba0[] values() {
        return (ba0[]) u.clone();
    }
}

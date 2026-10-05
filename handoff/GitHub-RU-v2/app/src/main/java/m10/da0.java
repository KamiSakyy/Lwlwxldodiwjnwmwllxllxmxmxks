package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class da0 {
    public static final ca0 Companion;
    public static final aa.a0 s;
    public static final da0 t;
    public static final /* synthetic */ da0[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        da0 da0Var = new da0("ERROR", 0, "ERROR");
        da0 da0Var2 = new da0("EXPECTED", 1, "EXPECTED");
        da0 da0Var3 = new da0("FAILURE", 2, "FAILURE");
        da0 da0Var4 = new da0("PENDING", 3, "PENDING");
        da0 da0Var5 = new da0("SUCCESS", 4, "SUCCESS");
        da0 da0Var6 = new da0("UNKNOWN__", 5, "UNKNOWN__");
        t = da0Var6;
        da0[] da0VarArr = {da0Var, da0Var2, da0Var3, da0Var4, da0Var5, da0Var6};
        u = da0VarArr;
        v = v8.l0.t(da0VarArr);
        Companion = new ca0();
        x61.l.r(new String[]{"ERROR", "EXPECTED", "FAILURE", "PENDING", "SUCCESS"});
        s = new aa.a0("StatusState");
    }

    public da0(String str, int i, String str2) {
        this.r = str2;
    }

    public static da0 valueOf(String str) {
        return (da0) Enum.valueOf(da0.class, str);
    }

    public static da0[] values() {
        return (da0[]) u.clone();
    }
}

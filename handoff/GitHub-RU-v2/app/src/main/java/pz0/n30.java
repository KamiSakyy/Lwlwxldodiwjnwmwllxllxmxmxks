package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class n30 {
    public static final m30 Companion;
    public static final aa.a0 s;
    public static final n30 t;
    public static final /* synthetic */ n30[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        n30 n30Var = new n30("ERROR", 0, "ERROR");
        n30 n30Var2 = new n30("EXPECTED", 1, "EXPECTED");
        n30 n30Var3 = new n30("FAILURE", 2, "FAILURE");
        n30 n30Var4 = new n30("PENDING", 3, "PENDING");
        n30 n30Var5 = new n30("SUCCESS", 4, "SUCCESS");
        n30 n30Var6 = new n30("UNKNOWN__", 5, "UNKNOWN__");
        t = n30Var6;
        n30[] n30VarArr = {n30Var, n30Var2, n30Var3, n30Var4, n30Var5, n30Var6};
        u = n30VarArr;
        v = v8.l0.t(n30VarArr);
        Companion = new m30();
        x61.l.r(new String[]{"ERROR", "EXPECTED", "FAILURE", "PENDING", "SUCCESS"});
        s = new aa.a0("StatusState");
    }

    public n30(String str, int i, String str2) {
        this.r = str2;
    }

    public static n30 valueOf(String str) {
        return (n30) Enum.valueOf(n30.class, str);
    }

    public static n30[] values() {
        return (n30[]) u.clone();
    }
}

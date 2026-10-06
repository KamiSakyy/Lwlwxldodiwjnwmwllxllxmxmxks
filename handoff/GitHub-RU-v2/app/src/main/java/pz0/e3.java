package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 {
    public static final d3 Companion;
    public static final aa.a0 s;
    public static final e3 t;
    public static final /* synthetic */ e3[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        e3 e3Var = new e3("COMPLETED", 0, "COMPLETED");
        e3 e3Var2 = new e3("IN_PROGRESS", 1, "IN_PROGRESS");
        e3 e3Var3 = new e3("PENDING", 2, "PENDING");
        e3 e3Var4 = new e3("QUEUED", 3, "QUEUED");
        e3 e3Var5 = new e3("REQUESTED", 4, "REQUESTED");
        e3 e3Var6 = new e3("WAITING", 5, "WAITING");
        e3 e3Var7 = new e3("UNKNOWN__", 6, "UNKNOWN__");
        t = e3Var7;
        e3[] e3VarArr = {e3Var, e3Var2, e3Var3, e3Var4, e3Var5, e3Var6, e3Var7};
        u = e3VarArr;
        v = v8.l0.t(e3VarArr);
        Companion = new d3();
        x61.l.r(new String[]{"COMPLETED", "IN_PROGRESS", "PENDING", "QUEUED", "REQUESTED", "WAITING"});
        s = new aa.a0("CheckStatusState");
    }

    public e3(String str, int i, String str2) {
        this.r = str2;
    }

    public static e3 valueOf(String str) {
        return (e3) Enum.valueOf(e3.class, str);
    }

    public static e3[] values() {
        return (e3[]) u.clone();
    }
    public Object ordinal() { return null; }
}

package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 {
    public static final o2 Companion;
    public static final aa.a0 s;
    public static final p2 t;
    public static final /* synthetic */ p2[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        p2 p2Var = new p2("COMPLETED", 0, "COMPLETED");
        p2 p2Var2 = new p2("IN_PROGRESS", 1, "IN_PROGRESS");
        p2 p2Var3 = new p2("PENDING", 2, "PENDING");
        p2 p2Var4 = new p2("QUEUED", 3, "QUEUED");
        p2 p2Var5 = new p2("REQUESTED", 4, "REQUESTED");
        p2 p2Var6 = new p2("WAITING", 5, "WAITING");
        p2 p2Var7 = new p2("UNKNOWN__", 6, "UNKNOWN__");
        t = p2Var7;
        p2[] p2VarArr = {p2Var, p2Var2, p2Var3, p2Var4, p2Var5, p2Var6, p2Var7};
        u = p2VarArr;
        v = v8.l0.t(p2VarArr);
        Companion = new o2();
        x61.l.r(new String[]{"COMPLETED", "IN_PROGRESS", "PENDING", "QUEUED", "REQUESTED", "WAITING"});
        s = new aa.a0("CheckStatusState");
    }

    public p2(String str, int i, String str2) {
        this.r = str2;
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) u.clone();
    }
    public Object ordinal() { return null; }
}

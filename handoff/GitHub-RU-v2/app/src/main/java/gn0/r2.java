package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class r2 {
    public static final q2 Companion;
    public static final aa.a0 s;
    public static final r2 t;
    public static final /* synthetic */ r2[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        r2 r2Var = new r2("COMPLETED", 0, "COMPLETED");
        r2 r2Var2 = new r2("IN_PROGRESS", 1, "IN_PROGRESS");
        r2 r2Var3 = new r2("PENDING", 2, "PENDING");
        r2 r2Var4 = new r2("QUEUED", 3, "QUEUED");
        r2 r2Var5 = new r2("REQUESTED", 4, "REQUESTED");
        r2 r2Var6 = new r2("WAITING", 5, "WAITING");
        r2 r2Var7 = new r2("UNKNOWN__", 6, "UNKNOWN__");
        t = r2Var7;
        r2[] r2VarArr = {r2Var, r2Var2, r2Var3, r2Var4, r2Var5, r2Var6, r2Var7};
        u = r2VarArr;
        v = v8.l0.t(r2VarArr);
        Companion = new q2();
        x61.l.r(new String[]{"COMPLETED", "IN_PROGRESS", "PENDING", "QUEUED", "REQUESTED", "WAITING"});
        s = new aa.a0("CheckStatusState");
    }

    public r2(String str, int i, String str2) {
        this.r = str2;
    }

    public static r2 valueOf(String str) {
        return (r2) Enum.valueOf(r2.class, str);
    }

    public static r2[] values() {
        return (r2[]) u.clone();
    }
    public Object ordinal() { return null; }
}

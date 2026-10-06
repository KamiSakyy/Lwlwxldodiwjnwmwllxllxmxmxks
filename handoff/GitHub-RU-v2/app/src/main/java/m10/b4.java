package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 {
    public static final a4 Companion;
    public static final aa.a0 s;
    public static final b4 t;
    public static final /* synthetic */ b4[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        b4 b4Var = new b4("COMPLETED", 0, "COMPLETED");
        b4 b4Var2 = new b4("IN_PROGRESS", 1, "IN_PROGRESS");
        b4 b4Var3 = new b4("PENDING", 2, "PENDING");
        b4 b4Var4 = new b4("QUEUED", 3, "QUEUED");
        b4 b4Var5 = new b4("REQUESTED", 4, "REQUESTED");
        b4 b4Var6 = new b4("WAITING", 5, "WAITING");
        b4 b4Var7 = new b4("UNKNOWN__", 6, "UNKNOWN__");
        t = b4Var7;
        b4[] b4VarArr = {b4Var, b4Var2, b4Var3, b4Var4, b4Var5, b4Var6, b4Var7};
        u = b4VarArr;
        v = v8.l0.t(b4VarArr);
        Companion = new a4();
        x61.l.r(new String[]{"COMPLETED", "IN_PROGRESS", "PENDING", "QUEUED", "REQUESTED", "WAITING"});
        s = new aa.a0("CheckStatusState");
    }

    public b4(String str, int i, String str2) {
        this.r = str2;
    }

    public static b4 valueOf(String str) {
        return (b4) Enum.valueOf(b4.class, str);
    }

    public static b4[] values() {
        return (b4[]) u.clone();
    }
}

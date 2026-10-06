package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class f8 {
    public static final e8 Companion;
    public static final aa.a0 s;
    public static final f8 t;
    public static final /* synthetic */ f8[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        f8 f8Var = new f8("ABANDONED", 0, "ABANDONED");
        f8 f8Var2 = new f8("ACTIVE", 1, "ACTIVE");
        f8 f8Var3 = new f8("DESTROYED", 2, "DESTROYED");
        f8 f8Var4 = new f8("ERROR", 3, "ERROR");
        f8 f8Var5 = new f8("FAILURE", 4, "FAILURE");
        f8 f8Var6 = new f8("INACTIVE", 5, "INACTIVE");
        f8 f8Var7 = new f8("IN_PROGRESS", 6, "IN_PROGRESS");
        f8 f8Var8 = new f8("PENDING", 7, "PENDING");
        f8 f8Var9 = new f8("QUEUED", 8, "QUEUED");
        f8 f8Var10 = new f8("SUCCESS", 9, "SUCCESS");
        f8 f8Var11 = new f8("WAITING", 10, "WAITING");
        f8 f8Var12 = new f8("UNKNOWN__", 11, "UNKNOWN__");
        t = f8Var12;
        f8[] f8VarArr = {f8Var, f8Var2, f8Var3, f8Var4, f8Var5, f8Var6, f8Var7, f8Var8, f8Var9, f8Var10, f8Var11, f8Var12};
        u = f8VarArr;
        v = v8.l0.t(f8VarArr);
        Companion = new e8();
        x61.l.r(new String[]{"ABANDONED", "ACTIVE", "DESTROYED", "ERROR", "FAILURE", "INACTIVE", "IN_PROGRESS", "PENDING", "QUEUED", "SUCCESS", "WAITING"});
        s = new aa.a0("DeploymentState");
    }

    public f8(String str, int i, String str2) {
        this.r = str2;
    }

    public static f8 valueOf(String str) {
        return (f8) Enum.valueOf(f8.class, str);
    }

    public static f8[] values() {
        return (f8[]) u.clone();
    }
    public Object ordinal() { return null; }
}

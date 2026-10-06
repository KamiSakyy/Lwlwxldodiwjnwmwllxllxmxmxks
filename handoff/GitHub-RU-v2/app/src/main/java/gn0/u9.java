package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class u9 {
    public static final t9 Companion;
    public static final aa.a0 s;
    public static final u9 t;
    public static final u9 u;
    public static final u9 v;
    public static final u9 w;
    public static final /* synthetic */ u9[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        u9 u9Var = new u9("DUPLICATE", 0, "DUPLICATE");
        t = u9Var;
        u9 u9Var2 = new u9("OUTDATED", 1, "OUTDATED");
        u = u9Var2;
        u9 u9Var3 = new u9("REOPENED", 2, "REOPENED");
        u9 u9Var4 = new u9("RESOLVED", 3, "RESOLVED");
        v = u9Var4;
        u9 u9Var5 = new u9("UNKNOWN__", 4, "UNKNOWN__");
        w = u9Var5;
        u9[] u9VarArr = {u9Var, u9Var2, u9Var3, u9Var4, u9Var5};
        x = u9VarArr;
        y = v8.l0.t(u9VarArr);
        Companion = new t9();
        x61.l.r(new String[]{"DUPLICATE", "OUTDATED", "REOPENED", "RESOLVED"});
        s = new aa.a0("DiscussionStateReason");
    }

    public u9(String str, int i, String str2) {
        this.r = str2;
    }

    public static u9 valueOf(String str) {
        return (u9) Enum.valueOf(u9.class, str);
    }

    public static u9[] values() {
        return (u9[]) x.clone();
    }
    public Object ordinal() { return null; }
}

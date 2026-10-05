package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class i9 {
    public static final h9 Companion;
    public static final aa.a0 s;
    public static final i9 t;
    public static final i9 u;
    public static final i9 v;
    public static final i9 w;
    public static final /* synthetic */ i9[] x;
    public static final /* synthetic */ d71.b y;
    public final String r;

    static {
        i9 i9Var = new i9("DUPLICATE", 0, "DUPLICATE");
        t = i9Var;
        i9 i9Var2 = new i9("OUTDATED", 1, "OUTDATED");
        u = i9Var2;
        i9 i9Var3 = new i9("REOPENED", 2, "REOPENED");
        i9 i9Var4 = new i9("RESOLVED", 3, "RESOLVED");
        v = i9Var4;
        i9 i9Var5 = new i9("UNKNOWN__", 4, "UNKNOWN__");
        w = i9Var5;
        i9[] i9VarArr = {i9Var, i9Var2, i9Var3, i9Var4, i9Var5};
        x = i9VarArr;
        y = v8.l0.t(i9VarArr);
        Companion = new h9();
        x61.l.r(new String[]{"DUPLICATE", "OUTDATED", "REOPENED", "RESOLVED"});
        s = new aa.a0("DiscussionStateReason");
    }

    public i9(String str, int i, String str2) {
        this.r = str2;
    }

    public static i9 valueOf(String str) {
        return (i9) Enum.valueOf(i9.class, str);
    }

    public static i9[] values() {
        return (i9[]) x.clone();
    }
}

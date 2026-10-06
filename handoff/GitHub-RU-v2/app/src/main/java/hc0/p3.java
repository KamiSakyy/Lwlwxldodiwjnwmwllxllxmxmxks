package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class p3 {
    public static final o3 Companion;
    public static final aa.a0 s;
    public static final p3 t;
    public static final /* synthetic */ p3[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        p3 p3Var = new p3("COLLABORATOR", 0, "COLLABORATOR");
        p3 p3Var2 = new p3("CONTRIBUTOR", 1, "CONTRIBUTOR");
        p3 p3Var3 = new p3("FIRST_TIMER", 2, "FIRST_TIMER");
        p3 p3Var4 = new p3("FIRST_TIME_CONTRIBUTOR", 3, "FIRST_TIME_CONTRIBUTOR");
        p3 p3Var5 = new p3("MANNEQUIN", 4, "MANNEQUIN");
        p3 p3Var6 = new p3("MEMBER", 5, "MEMBER");
        p3 p3Var7 = new p3("NONE", 6, "NONE");
        p3 p3Var8 = new p3("OWNER", 7, "OWNER");
        p3 p3Var9 = new p3("UNKNOWN__", 8, "UNKNOWN__");
        t = p3Var9;
        p3[] p3VarArr = {p3Var, p3Var2, p3Var3, p3Var4, p3Var5, p3Var6, p3Var7, p3Var8, p3Var9};
        u = p3VarArr;
        v = v8.l0.t(p3VarArr);
        Companion = new o3();
        x61.l.r(new String[]{"COLLABORATOR", "CONTRIBUTOR", "FIRST_TIMER", "FIRST_TIME_CONTRIBUTOR", "MANNEQUIN", "MEMBER", "NONE", "OWNER"});
        s = new aa.a0("CommentAuthorAssociation");
    }

    public p3(String str, int i, String str2) {
        this.r = str2;
    }

    public static p3 valueOf(String str) {
        return (p3) Enum.valueOf(p3.class, str);
    }

    public static p3[] values() {
        return (p3[]) u.clone();
    }
    public Object b(Object p1, Object p2) { return null; }
    public Object g(Object p1, Object p2) { return null; }
}

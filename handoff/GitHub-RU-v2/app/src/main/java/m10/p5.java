package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class p5 {
    public static final o5 Companion;
    public static final aa.a0 s;
    public static final p5 t;
    public static final /* synthetic */ p5[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        p5 p5Var = new p5("COLLABORATOR", 0, "COLLABORATOR");
        p5 p5Var2 = new p5("CONTRIBUTOR", 1, "CONTRIBUTOR");
        p5 p5Var3 = new p5("FIRST_TIMER", 2, "FIRST_TIMER");
        p5 p5Var4 = new p5("FIRST_TIME_CONTRIBUTOR", 3, "FIRST_TIME_CONTRIBUTOR");
        p5 p5Var5 = new p5("MANNEQUIN", 4, "MANNEQUIN");
        p5 p5Var6 = new p5("MEMBER", 5, "MEMBER");
        p5 p5Var7 = new p5("NONE", 6, "NONE");
        p5 p5Var8 = new p5("OWNER", 7, "OWNER");
        p5 p5Var9 = new p5("UNKNOWN__", 8, "UNKNOWN__");
        t = p5Var9;
        p5[] p5VarArr = {p5Var, p5Var2, p5Var3, p5Var4, p5Var5, p5Var6, p5Var7, p5Var8, p5Var9};
        u = p5VarArr;
        v = v8.l0.t(p5VarArr);
        Companion = new o5();
        x61.l.r(new String[]{"COLLABORATOR", "CONTRIBUTOR", "FIRST_TIMER", "FIRST_TIME_CONTRIBUTOR", "MANNEQUIN", "MEMBER", "NONE", "OWNER"});
        s = new aa.a0("CommentAuthorAssociation");
    }

    public p5(String str, int i, String str2) {
        this.r = str2;
    }

    public static p5 valueOf(String str) {
        return (p5) Enum.valueOf(p5.class, str);
    }

    public static p5[] values() {
        return (p5[]) u.clone();
    }
}

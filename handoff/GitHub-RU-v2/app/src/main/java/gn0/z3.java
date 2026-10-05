package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class z3 {
    public static final y3 Companion;
    public static final aa.a0 s;
    public static final z3 t;
    public static final /* synthetic */ z3[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        z3 z3Var = new z3("COLLABORATOR", 0, "COLLABORATOR");
        z3 z3Var2 = new z3("CONTRIBUTOR", 1, "CONTRIBUTOR");
        z3 z3Var3 = new z3("FIRST_TIMER", 2, "FIRST_TIMER");
        z3 z3Var4 = new z3("FIRST_TIME_CONTRIBUTOR", 3, "FIRST_TIME_CONTRIBUTOR");
        z3 z3Var5 = new z3("MANNEQUIN", 4, "MANNEQUIN");
        z3 z3Var6 = new z3("MEMBER", 5, "MEMBER");
        z3 z3Var7 = new z3("NONE", 6, "NONE");
        z3 z3Var8 = new z3("OWNER", 7, "OWNER");
        z3 z3Var9 = new z3("UNKNOWN__", 8, "UNKNOWN__");
        t = z3Var9;
        z3[] z3VarArr = {z3Var, z3Var2, z3Var3, z3Var4, z3Var5, z3Var6, z3Var7, z3Var8, z3Var9};
        u = z3VarArr;
        v = v8.l0.t(z3VarArr);
        Companion = new y3();
        x61.l.r(new String[]{"COLLABORATOR", "CONTRIBUTOR", "FIRST_TIMER", "FIRST_TIME_CONTRIBUTOR", "MANNEQUIN", "MEMBER", "NONE", "OWNER"});
        s = new aa.a0("CommentAuthorAssociation");
    }

    public z3(String str, int i, String str2) {
        this.r = str2;
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) u.clone();
    }
}

package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 {
    public static final n4 Companion;
    public static final aa.a0 s;
    public static final o4 t;
    public static final /* synthetic */ o4[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        o4 o4Var = new o4("COLLABORATOR", 0, "COLLABORATOR");
        o4 o4Var2 = new o4("CONTRIBUTOR", 1, "CONTRIBUTOR");
        o4 o4Var3 = new o4("FIRST_TIMER", 2, "FIRST_TIMER");
        o4 o4Var4 = new o4("FIRST_TIME_CONTRIBUTOR", 3, "FIRST_TIME_CONTRIBUTOR");
        o4 o4Var5 = new o4("MANNEQUIN", 4, "MANNEQUIN");
        o4 o4Var6 = new o4("MEMBER", 5, "MEMBER");
        o4 o4Var7 = new o4("NONE", 6, "NONE");
        o4 o4Var8 = new o4("OWNER", 7, "OWNER");
        o4 o4Var9 = new o4("UNKNOWN__", 8, "UNKNOWN__");
        t = o4Var9;
        o4[] o4VarArr = {o4Var, o4Var2, o4Var3, o4Var4, o4Var5, o4Var6, o4Var7, o4Var8, o4Var9};
        u = o4VarArr;
        v = v8.l0.t(o4VarArr);
        Companion = new n4();
        x61.l.r(new String[]{"COLLABORATOR", "CONTRIBUTOR", "FIRST_TIMER", "FIRST_TIME_CONTRIBUTOR", "MANNEQUIN", "MEMBER", "NONE", "OWNER"});
        s = new aa.a0("CommentAuthorAssociation");
    }

    public o4(String str, int i, String str2) {
        this.r = str2;
    }

    public static o4 valueOf(String str) {
        return (o4) Enum.valueOf(o4.class, str);
    }

    public static o4[] values() {
        return (o4[]) u.clone();
    }
}

package z01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 {
    public static final i0 r;
    public static final i0 s;
    public static final i0 t;
    public static final /* synthetic */ i0[] u;

    static {
        i0 i0Var = new i0("Issue", 0);
        r = i0Var;
        i0 i0Var2 = new i0("PullRequest", 1);
        s = i0Var2;
        i0 i0Var3 = new i0("Discussion", 2);
        t = i0Var3;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3};
        u = i0VarArr;
        v8.l0.t(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) u.clone();
    }
}

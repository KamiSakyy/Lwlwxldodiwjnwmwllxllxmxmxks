package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class t9 {
    public static final s9 Companion;
    public static final aa.a0 s;
    public static final t9 t;
    public static final t9 u;
    public static final /* synthetic */ t9[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        t9 t9Var = new t9("ADDITION", 0, "ADDITION");
        t9 t9Var2 = new t9("CONTEXT", 1, "CONTEXT");
        t9 t9Var3 = new t9("DELETION", 2, "DELETION");
        t = t9Var3;
        t9 t9Var4 = new t9("HUNK", 3, "HUNK");
        t9 t9Var5 = new t9("INJECTED_CONTEXT", 4, "INJECTED_CONTEXT");
        t9 t9Var6 = new t9("UNKNOWN__", 5, "UNKNOWN__");
        u = t9Var6;
        t9[] t9VarArr = {t9Var, t9Var2, t9Var3, t9Var4, t9Var5, t9Var6};
        v = t9VarArr;
        w = v8.l0.t(t9VarArr);
        Companion = new s9();
        x61.l.r(new String[]{"ADDITION", "CONTEXT", "DELETION", "HUNK", "INJECTED_CONTEXT"});
        s = new aa.a0("DiffLineType");
    }

    public t9(String str, int i, String str2) {
        this.r = str2;
    }

    public static t9 valueOf(String str) {
        return (t9) Enum.valueOf(t9.class, str);
    }

    public static t9[] values() {
        return (t9[]) v.clone();
    }
    public Object ordinal() { return null; }
}

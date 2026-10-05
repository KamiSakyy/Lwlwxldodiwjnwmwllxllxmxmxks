package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class s8 {
    public static final r8 Companion;
    public static final aa.a0 s;
    public static final s8 t;
    public static final s8 u;
    public static final /* synthetic */ s8[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        s8 s8Var = new s8("ADDITION", 0, "ADDITION");
        s8 s8Var2 = new s8("CONTEXT", 1, "CONTEXT");
        s8 s8Var3 = new s8("DELETION", 2, "DELETION");
        t = s8Var3;
        s8 s8Var4 = new s8("HUNK", 3, "HUNK");
        s8 s8Var5 = new s8("INJECTED_CONTEXT", 4, "INJECTED_CONTEXT");
        s8 s8Var6 = new s8("UNKNOWN__", 5, "UNKNOWN__");
        u = s8Var6;
        s8[] s8VarArr = {s8Var, s8Var2, s8Var3, s8Var4, s8Var5, s8Var6};
        v = s8VarArr;
        w = v8.l0.t(s8VarArr);
        Companion = new r8();
        x61.l.r(new String[]{"ADDITION", "CONTEXT", "DELETION", "HUNK", "INJECTED_CONTEXT"});
        s = new aa.a0("DiffLineType");
    }

    public s8(String str, int i, String str2) {
        this.r = str2;
    }

    public static s8 valueOf(String str) {
        return (s8) Enum.valueOf(s8.class, str);
    }

    public static s8[] values() {
        return (s8[]) v.clone();
    }
}

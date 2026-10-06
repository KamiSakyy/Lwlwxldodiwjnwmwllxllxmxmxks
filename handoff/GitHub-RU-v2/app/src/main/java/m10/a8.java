package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class a8 {
    public static final a8 A;
    public static final a8 B;
    public static final /* synthetic */ a8[] C;
    public static final z7 Companion;
    public static final /* synthetic */ d71.b D;
    public static final a8 s;
    public static final a8 t;
    public static final a8 u;
    public static final a8 v;
    public static final a8 w;
    public static final a8 x;
    public static final a8 y;
    public static final a8 z;
    public String r;

    static {
        a8 a8Var = new a8("DUPLICATE", 0, "DUPLICATE");
        a8 a8Var2 = new a8("INCORRECT", 1, "INCORRECT");
        s = a8Var2;
        a8 a8Var3 = new a8("INCORRECT_LINE", 2, "INCORRECT_LINE");
        t = a8Var3;
        a8 a8Var4 = new a8("OFFENSIVE_OR_DISCRIMINATORY", 3, "OFFENSIVE_OR_DISCRIMINATORY");
        u = a8Var4;
        a8 a8Var5 = new a8("POORLY_FORMATTED", 4, "POORLY_FORMATTED");
        v = a8Var5;
        a8 a8Var6 = new a8("SUGGESTION_INVALID", 5, "SUGGESTION_INVALID");
        w = a8Var6;
        a8 a8Var7 = new a8("SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY", 6, "SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY");
        x = a8Var7;
        a8 a8Var8 = new a8("SUGGESTION_POORLY_FORMATTED", 7, "SUGGESTION_POORLY_FORMATTED");
        y = a8Var8;
        a8 a8Var9 = new a8("SUGGESTION_UNHELPFUL", 8, "SUGGESTION_UNHELPFUL");
        z = a8Var9;
        a8 a8Var10 = new a8("UNHELPFUL", 9, "UNHELPFUL");
        A = a8Var10;
        a8 a8Var11 = new a8("UNKNOWN__", 10, "UNKNOWN__");
        B = a8Var11;
        a8[] a8VarArr = {a8Var, a8Var2, a8Var3, a8Var4, a8Var5, a8Var6, a8Var7, a8Var8, a8Var9, a8Var10, a8Var11};
        C = a8VarArr;
        D = v8.l0.t(a8VarArr);
        Companion = new z7();
        sy.d0Shadow.o("DUPLICATE", "INCORRECT", "INCORRECT_LINE", "OFFENSIVE_OR_DISCRIMINATORY", "POORLY_FORMATTED", "SUGGESTION_INVALID", "SUGGESTION_OFFENSIVE_OR_DISCRIMINATORY", "SUGGESTION_POORLY_FORMATTED", "SUGGESTION_UNHELPFUL", "UNHELPFUL");
    }

    public a8(String str, int i, String str2) {
        this.r = str2;
    }

    public static a8 valueOf(String str) {
        return (a8) Enum.valueOf(a8.class, str);
    }

    public static a8[] values() {
        return (a8[]) C.clone();
    }
}

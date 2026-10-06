package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class c8 {
    public static final b8 Companion;
    public static final c8 s;
    public static final c8 t;
    public static final c8 u;
    public static final /* synthetic */ c8[] v;
    public String r;

    static {
        c8 c8Var = new c8("NEGATIVE", 0, "NEGATIVE");
        s = c8Var;
        c8 c8Var2 = new c8("POSITIVE", 1, "POSITIVE");
        t = c8Var2;
        c8 c8Var3 = new c8("UNKNOWN__", 2, "UNKNOWN__");
        u = c8Var3;
        c8[] c8VarArr = {c8Var, c8Var2, c8Var3};
        v = c8VarArr;
        v8.l0.t(c8VarArr);
        Companion = new b8();
        sy.d0.o("NEGATIVE", "POSITIVE");
    }

    public c8(String str, int i, String str2) {
        this.r = str2;
    }

    public static c8 valueOf(String str) {
        return (c8) Enum.valueOf(c8.class, str);
    }

    public static c8[] values() {
        return (c8[]) v.clone();
    }
}

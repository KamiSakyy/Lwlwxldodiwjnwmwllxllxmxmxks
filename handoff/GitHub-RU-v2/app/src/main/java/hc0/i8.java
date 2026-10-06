package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class i8 {
    public static final h8 Companion;
    public static final i8 s;
    public static final i8 t;
    public static final i8 u;
    public static final /* synthetic */ i8[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        i8 i8Var = new i8("LEFT", 0, "LEFT");
        s = i8Var;
        i8 i8Var2 = new i8("RIGHT", 1, "RIGHT");
        t = i8Var2;
        i8 i8Var3 = new i8("UNKNOWN__", 2, "UNKNOWN__");
        u = i8Var3;
        i8[] i8VarArr = {i8Var, i8Var2, i8Var3};
        v = i8VarArr;
        w = v8.l0.t(i8VarArr);
        Companion = new h8();
        sy.d0.o(new String[]{"LEFT", "RIGHT"});
    }

    public i8(String str, int i, String str2) {
        this.r = str2;
    }

    public static i8 valueOf(String str) {
        return (i8) Enum.valueOf(i8.class, str);
    }

    public static i8[] values() {
        return (i8[]) v.clone();
    }
}

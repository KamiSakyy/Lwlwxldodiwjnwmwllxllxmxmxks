package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class u8 {
    public static final t8 Companion;
    public static final u8 s;
    public static final u8 t;
    public static final u8 u;
    public static final /* synthetic */ u8[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        u8 u8Var = new u8("LEFT", 0, "LEFT");
        s = u8Var;
        u8 u8Var2 = new u8("RIGHT", 1, "RIGHT");
        t = u8Var2;
        u8 u8Var3 = new u8("UNKNOWN__", 2, "UNKNOWN__");
        u = u8Var3;
        u8[] u8VarArr = {u8Var, u8Var2, u8Var3};
        v = u8VarArr;
        w = v8.l0.t(u8VarArr);
        Companion = new t8();
        sy.d0.o(new String[]{"LEFT", "RIGHT"});
    }

    public u8(String str, int i, String str2) {
        this.r = str2;
    }

    public static u8 valueOf(String str) {
        return (u8) Enum.valueOf(u8.class, str);
    }

    public static u8[] values() {
        return (u8[]) v.clone();
    }
}

package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class u8 {
    public static final t8 Companion;
    public static final u8 s;
    public static final u8 t;
    public static final u8 u;
    public static final u8 v;
    public static final /* synthetic */ u8[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        u8 u8Var = new u8("DUPLICATE", 0, "DUPLICATE");
        s = u8Var;
        u8 u8Var2 = new u8("OUTDATED", 1, "OUTDATED");
        t = u8Var2;
        u8 u8Var3 = new u8("RESOLVED", 2, "RESOLVED");
        u = u8Var3;
        u8 u8Var4 = new u8("UNKNOWN__", 3, "UNKNOWN__");
        v = u8Var4;
        u8[] u8VarArr = {u8Var, u8Var2, u8Var3, u8Var4};
        w = u8VarArr;
        x = v8.l0.t(u8VarArr);
        Companion = new t8();
        sy.d0Shadow.o(new String[]{"DUPLICATE", "OUTDATED", "RESOLVED"});
    }

    public u8(String str, int i, String str2) {
        this.r = str2;
    }

    public static u8 valueOf(String str) {
        return (u8) Enum.valueOf(u8.class, str);
    }

    public static u8[] values() {
        return (u8[]) w.clone();
    }
}

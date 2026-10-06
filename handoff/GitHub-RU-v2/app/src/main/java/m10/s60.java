package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class s60 {
    public static final s60 A;
    public static final /* synthetic */ s60[] B;
    public static final /* synthetic */ d71.b C;
    public static final r60 Companion;
    public static final aa.a0 s;
    public static final s60 t;
    public static final s60 u;
    public static final s60 v;
    public static final s60 w;
    public static final s60 x;
    public static final s60 y;
    public static final s60 z;
    public String r;

    static {
        s60 s60Var = new s60("BLUE", 0, "BLUE");
        t = s60Var;
        s60 s60Var2 = new s60("GRAY", 1, "GRAY");
        u = s60Var2;
        s60 s60Var3 = new s60("GREEN", 2, "GREEN");
        v = s60Var3;
        s60 s60Var4 = new s60("ORANGE", 3, "ORANGE");
        w = s60Var4;
        s60 s60Var5 = new s60("PINK", 4, "PINK");
        x = s60Var5;
        s60 s60Var6 = new s60("PURPLE", 5, "PURPLE");
        y = s60Var6;
        s60 s60Var7 = new s60("RED", 6, "RED");
        z = s60Var7;
        s60 s60Var8 = new s60("UNKNOWN__", 7, "UNKNOWN__");
        A = s60Var8;
        s60[] s60VarArr = {s60Var, s60Var2, s60Var3, s60Var4, s60Var5, s60Var6, s60Var7, s60Var8};
        B = s60VarArr;
        C = v8.l0.t(s60VarArr);
        Companion = new r60();
        x61.l.r(new String[]{"BLUE", "GRAY", "GREEN", "ORANGE", "PINK", "PURPLE", "RED"});
        s = new aa.a0("SearchShortcutColor");
    }

    public s60(String str, int i, String str2) {
        this.r = str2;
    }

    public static s60 valueOf(String str) {
        return (s60) Enum.valueOf(s60.class, str);
    }

    public static s60[] values() {
        return (s60[]) B.clone();
    }
}

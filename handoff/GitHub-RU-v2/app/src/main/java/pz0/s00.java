package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class s00 {
    public static final s00 A;
    public static final /* synthetic */ s00[] B;
    public static final /* synthetic */ d71.b C;
    public static final r00 Companion;
    public static final aa.a0 s;
    public static final s00 t;
    public static final s00 u;
    public static final s00 v;
    public static final s00 w;
    public static final s00 x;
    public static final s00 y;
    public static final s00 z;
    public final String r;

    static {
        s00 s00Var = new s00("BLUE", 0, "BLUE");
        t = s00Var;
        s00 s00Var2 = new s00("GRAY", 1, "GRAY");
        u = s00Var2;
        s00 s00Var3 = new s00("GREEN", 2, "GREEN");
        v = s00Var3;
        s00 s00Var4 = new s00("ORANGE", 3, "ORANGE");
        w = s00Var4;
        s00 s00Var5 = new s00("PINK", 4, "PINK");
        x = s00Var5;
        s00 s00Var6 = new s00("PURPLE", 5, "PURPLE");
        y = s00Var6;
        s00 s00Var7 = new s00("RED", 6, "RED");
        z = s00Var7;
        s00 s00Var8 = new s00("UNKNOWN__", 7, "UNKNOWN__");
        A = s00Var8;
        s00[] s00VarArr = {s00Var, s00Var2, s00Var3, s00Var4, s00Var5, s00Var6, s00Var7, s00Var8};
        B = s00VarArr;
        C = v8.l0.t(s00VarArr);
        Companion = new r00();
        x61.l.r(new String[]{"BLUE", "GRAY", "GREEN", "ORANGE", "PINK", "PURPLE", "RED"});
        s = new aa.a0("SearchShortcutColor");
    }

    public s00(String str, int i, String str2) {
        this.r = str2;
    }

    public static s00 valueOf(String str) {
        return (s00) Enum.valueOf(s00.class, str);
    }

    public static s00[] values() {
        return (s00[]) B.clone();
    }
}

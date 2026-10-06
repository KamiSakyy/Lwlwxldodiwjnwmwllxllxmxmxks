package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class z00 {
    public static final z00 A;
    public static final z00 B;
    public static final /* synthetic */ z00[] C;
    public static final y00 Companion;
    public static final /* synthetic */ d71.b D;
    public static final aa.a0 s;
    public static final z00 t;
    public static final z00 u;
    public static final z00 v;
    public static final z00 w;
    public static final z00 x;
    public static final z00 y;
    public static final z00 z;
    public String r;

    static {
        z00 z00Var = new z00("CONFUSED", 0, "CONFUSED");
        t = z00Var;
        z00 z00Var2 = new z00("EYES", 1, "EYES");
        u = z00Var2;
        z00 z00Var3 = new z00("HEART", 2, "HEART");
        v = z00Var3;
        z00 z00Var4 = new z00("HOORAY", 3, "HOORAY");
        w = z00Var4;
        z00 z00Var5 = new z00("LAUGH", 4, "LAUGH");
        x = z00Var5;
        z00 z00Var6 = new z00("ROCKET", 5, "ROCKET");
        y = z00Var6;
        z00 z00Var7 = new z00("THUMBS_DOWN", 6, "THUMBS_DOWN");
        z = z00Var7;
        z00 z00Var8 = new z00("THUMBS_UP", 7, "THUMBS_UP");
        A = z00Var8;
        z00 z00Var9 = new z00("UNKNOWN__", 8, "UNKNOWN__");
        B = z00Var9;
        z00[] z00VarArr = {z00Var, z00Var2, z00Var3, z00Var4, z00Var5, z00Var6, z00Var7, z00Var8, z00Var9};
        C = z00VarArr;
        D = v8.l0.t(z00VarArr);
        Companion = new y00();
        x61.l.r(new String[]{"CONFUSED", "EYES", "HEART", "HOORAY", "LAUGH", "ROCKET", "THUMBS_DOWN", "THUMBS_UP"});
        s = new aa.a0("ReactionContent");
    }

    public z00(String str, int i, String str2) {
        this.r = str2;
    }

    public static z00 valueOf(String str) {
        return (z00) Enum.valueOf(z00.class, str);
    }

    public static z00[] values() {
        return (z00[]) C.clone();
    }
}

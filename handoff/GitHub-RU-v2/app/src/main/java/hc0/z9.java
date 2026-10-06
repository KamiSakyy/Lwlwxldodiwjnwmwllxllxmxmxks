package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class z9 {
    public static final y9 Companion;
    public static final aa.a0 s;
    public static final z9 t;
    public static final z9 u;
    public static final z9 v;
    public static final /* synthetic */ z9[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        z9 z9Var = new z9("DISMISSED", 0, "DISMISSED");
        z9 z9Var2 = new z9("UNVIEWED", 1, "UNVIEWED");
        t = z9Var2;
        z9 z9Var3 = new z9("VIEWED", 2, "VIEWED");
        u = z9Var3;
        z9 z9Var4 = new z9("UNKNOWN__", 3, "UNKNOWN__");
        v = z9Var4;
        z9[] z9VarArr = {z9Var, z9Var2, z9Var3, z9Var4};
        w = z9VarArr;
        x = v8.l0.t(z9VarArr);
        Companion = new y9();
        x61.l.r(new String[]{"DISMISSED", "UNVIEWED", "VIEWED"});
        s = new aa.a0("FileViewedState");
    }

    public z9(String str, int i, String str2) {
        this.r = str2;
    }

    public static z9 valueOf(String str) {
        return (z9) Enum.valueOf(z9.class, str);
    }

    public static z9[] values() {
        return (z9[]) w.clone();
    }
}

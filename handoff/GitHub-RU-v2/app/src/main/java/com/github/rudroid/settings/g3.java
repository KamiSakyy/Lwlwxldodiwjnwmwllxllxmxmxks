package com.github.rudroid.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g3 {
    public static final /* synthetic */ d71.b A;
    public static final a Companion;
    public static final g3 y;
    public static final /* synthetic */ g3[] z;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;

    public static final class a {
        public static g3 a(int i) {
            g3 g3Var;
            g3[] values = g3.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    g3Var = null;
                    break;
                }
                g3Var = values[i2];
                if (g3Var.r == i) {
                    break;
                }
                i2++;
            }
            if (g3Var != null) {
                return g3Var;
            }
            throw new IllegalArgumentException("The action id doesn't exit");
        }
    }

    static {
        g3 g3Var = new g3("DONE", 0, 0, 2131954596, 2131231159, 2131231160, 2131231316, 2131100988, 2131100986);
        g3 g3Var2 = new g3("SAVE", 1, 1, 2131954599, 2131231141, 2131231142, 2131231143, 2131100989, 2131100989);
        g3 g3Var3 = new g3("UNSUBSCRIBE", 2, 2, 2131954602, 2131231133, 2131231134, 2131231130, 2131100987, 2131100987);
        y = g3Var3;
        g3[] g3VarArr = {g3Var, g3Var2, g3Var3, new g3("READ", 3, 3, 2131954597, 2131231233, 2131231234, 2131231240, 2131100986, 2131100986)};
        z = g3VarArr;
        A = v8.l0.t(g3VarArr);
        Companion = new a();
    }

    public g3(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.r = i2;
        this.s = i3;
        this.t = i4;
        this.u = i5;
        this.v = i6;
        this.w = i7;
        this.x = i8;
    }

    public static g3 valueOf(String str) {
        return (g3) Enum.valueOf(g3.class, str);
    }

    public static g3[] values() {
        return (g3[]) z.clone();
    }
}

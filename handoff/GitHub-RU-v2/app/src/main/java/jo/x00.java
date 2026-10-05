package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x00 {
    public final int a;
    public final int b;
    public final int c;
    public final a10 d;

    public x00(int i, int i2, int i3, a10 a10Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = a10Var;
    }

    public static x00 a(x00 x00Var, a10 a10Var) {
        int i = x00Var.a;
        int i2 = x00Var.b;
        int i3 = x00Var.c;
        x00Var.getClass();
        return new x00(i, i2, i3, a10Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x00)) {
            return false;
        }
        x00 x00Var = (x00) obj;
        return this.a == x00Var.a && this.b == x00Var.b && this.c == x00Var.c && k71.k.b(this.d, x00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "Diff(linesAdded=", ", linesDeleted=", ", filesChanged=");
        m.append(this.c);
        m.append(", patches=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}

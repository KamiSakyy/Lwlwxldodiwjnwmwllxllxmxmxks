package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xy {
    public final int a;
    public final int b;
    public final int c;
    public final az d;

    public xy(int i, int i2, int i3, az azVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = azVar;
    }

    public static xy a(xy xyVar, az azVar) {
        int i = xyVar.a;
        int i2 = xyVar.b;
        int i3 = xyVar.c;
        xyVar.getClass();
        return new xy(i, i2, i3, azVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy)) {
            return false;
        }
        xy xyVar = (xy) obj;
        return this.a == xyVar.a && this.b == xyVar.b && this.c == xyVar.c && k71.k.b(this.d, xyVar.d);
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

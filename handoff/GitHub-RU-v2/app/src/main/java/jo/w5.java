package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w5 {
    public final int a;
    public final int b;
    public final int c;
    public final ArrayList d;
    public final double e;

    public w5(double d, int i, int i2, int i3, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = arrayList;
        this.e = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        return this.a == w5Var.a && this.b == w5Var.b && this.c == w5Var.c && this.d.equals(w5Var.d) && Double.compare(this.e, w5Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + no.a.b(this.d, a0.s0.b(this.c, a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "Snippet(startingLineNumber=", ", endingLineNumber=", ", jumpToLineNumber=");
        m.append(this.c);
        m.append(", lines=");
        m.append(this.d);
        m.append(", score=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}

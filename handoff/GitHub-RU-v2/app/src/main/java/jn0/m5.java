package jn0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m5 {
    public final int a;
    public final int b;
    public final int c;
    public final ArrayList d;
    public final double e;

    public m5(double d, int i, int i2, int i3, ArrayList arrayList) {
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
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return this.a == m5Var.a && this.b == m5Var.b && this.c == m5Var.c && this.d.equals(m5Var.d) && Double.compare(this.e, m5Var.e) == 0;
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

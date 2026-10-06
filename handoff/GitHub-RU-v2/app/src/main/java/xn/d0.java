package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    public int a;
    public int b;
    public int c;
    public u0 d;

    public d0(int i, int i2, int i3, u0 u0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a == d0Var.a && this.b == d0Var.b && this.c == d0Var.c && k71.k.b(this.d, d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "ChatMessageCodeVulnerability(id=", ", startOffset=", ", endOffset=");
        m.append(this.c);
        m.append(", details=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}

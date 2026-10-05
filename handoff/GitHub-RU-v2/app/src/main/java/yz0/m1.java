package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 {
    public final String a;
    public final int b;
    public final int c;

    public m1(int i, String str, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && this.b == m1Var.b && this.c == m1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return a0.s0.l(a0.s0.n(this.b, "FileLine(html=", this.a, ", lineLength=", ", lineNumber="), this.c, ")");
    }
}

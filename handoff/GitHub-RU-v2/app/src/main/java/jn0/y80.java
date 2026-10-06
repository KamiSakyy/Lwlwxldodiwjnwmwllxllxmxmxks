package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y80 {
    public z80 a;

    public y80(z80 z80Var) {
        this.a = z80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y80) && k71.k.b(this.a, ((y80) obj).a);
    }

    public final int hashCode() {
        z80 z80Var = this.a;
        if (z80Var == null) {
            return 0;
        }
        return z80Var.hashCode();
    }

    public final String toString() {
        return "UnminimizeComment(unminimizedComment=" + this.a + ")";
    }
}

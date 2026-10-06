package f00;

import m10.cr;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 {
    public final cr a;
    public final q0 b;

    public u0(cr crVar, q0 q0Var) {
        this.a = crVar;
        this.b = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a == u0Var.a && k71.k.b(this.b, u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(direction=" + this.a + ", field=" + this.b + ")";
    }
}

package iy0;

import pz0.xl;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 {
    public xl a;
    public o0 b;

    public s0(xl xlVar, o0 o0Var) {
        this.a = xlVar;
        this.b = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.a == s0Var.a && k71.k.b(this.b, s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(direction=" + this.a + ", field=" + this.b + ")";
    }
}

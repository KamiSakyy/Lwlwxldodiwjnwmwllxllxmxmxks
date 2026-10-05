package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q40 {
    public final r40 a;

    public q40(r40 r40Var) {
        this.a = r40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q40) && k71.k.b(this.a, ((q40) obj).a);
    }

    public final int hashCode() {
        r40 r40Var = this.a;
        if (r40Var == null) {
            return 0;
        }
        return r40Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

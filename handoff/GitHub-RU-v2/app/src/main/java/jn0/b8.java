package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b8 {
    public final c8 a;

    public b8(c8 c8Var) {
        this.a = c8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8) && k71.k.b(this.a, ((b8) obj).a);
    }

    public final int hashCode() {
        c8 c8Var = this.a;
        if (c8Var == null) {
            return 0;
        }
        return c8Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

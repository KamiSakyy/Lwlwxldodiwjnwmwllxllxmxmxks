package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b10 {
    public c10 a;

    public b10(c10 c10Var) {
        this.a = c10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b10) && k71.k.b(this.a, ((b10) obj).a);
    }

    public final int hashCode() {
        c10 c10Var = this.a;
        if (c10Var == null) {
            return 0;
        }
        return c10Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

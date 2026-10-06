package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g7 {
    public h7 a;

    public g7(h7 h7Var) {
        this.a = h7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7) && k71.k.b(this.a, ((g7) obj).a);
    }

    public final int hashCode() {
        h7 h7Var = this.a;
        if (h7Var == null) {
            return 0;
        }
        return h7Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

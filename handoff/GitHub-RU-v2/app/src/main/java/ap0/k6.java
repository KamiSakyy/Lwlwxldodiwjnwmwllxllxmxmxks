package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k6 {
    public final l6 a;

    public k6(l6 l6Var) {
        this.a = l6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6) && k71.k.b(this.a, ((k6) obj).a);
    }

    public final int hashCode() {
        l6 l6Var = this.a;
        if (l6Var == null) {
            return 0;
        }
        return l6Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q60 {
    public final r60 a;

    public q60(r60 r60Var) {
        this.a = r60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q60) && k71.k.b(this.a, ((q60) obj).a);
    }

    public final int hashCode() {
        r60 r60Var = this.a;
        if (r60Var == null) {
            return 0;
        }
        return r60Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

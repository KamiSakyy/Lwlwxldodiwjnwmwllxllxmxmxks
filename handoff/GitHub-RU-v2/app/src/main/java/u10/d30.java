package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d30 {
    public e30 a;

    public d30(e30 e30Var) {
        this.a = e30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d30) && k71.k.b(this.a, ((d30) obj).a);
    }

    public final int hashCode() {
        e30 e30Var = this.a;
        if (e30Var == null) {
            return 0;
        }
        return e30Var.hashCode();
    }

    public final String toString() {
        return "UnminimizeComment(unminimizedComment=" + this.a + ")";
    }
}

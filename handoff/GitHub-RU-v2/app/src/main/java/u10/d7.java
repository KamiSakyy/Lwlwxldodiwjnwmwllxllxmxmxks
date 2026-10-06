package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d7 {
    public e7 a;

    public d7(e7 e7Var) {
        this.a = e7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7) && k71.k.b(this.a, ((d7) obj).a);
    }

    public final int hashCode() {
        e7 e7Var = this.a;
        if (e7Var == null) {
            return 0;
        }
        return e7Var.hashCode();
    }

    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

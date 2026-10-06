package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e6 {
    public final g6 a;

    public e6(g6 g6Var) {
        this.a = g6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6) && k71.k.b(this.a, ((e6) obj).a);
    }

    public final int hashCode() {
        g6 g6Var = this.a;
        if (g6Var == null) {
            return 0;
        }
        return g6Var.hashCode();
    }

    public final String toString() {
        return "CreateDiscussion(discussion=" + this.a + ")";
    }
}

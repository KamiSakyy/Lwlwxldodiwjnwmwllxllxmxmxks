package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public g0 a;
    public f0 b;

    public b0(g0 g0Var, f0 f0Var) {
        this.a = g0Var;
        this.b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b);
    }

    public final int hashCode() {
        g0 g0Var = this.a;
        int hashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        f0 f0Var = this.b;
        return hashCode + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddReaction(subject=" + this.a + ", reaction=" + this.b + ")";
    }
}

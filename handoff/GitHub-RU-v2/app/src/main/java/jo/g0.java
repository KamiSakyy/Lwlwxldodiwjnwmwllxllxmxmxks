package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public l0 a;
    public k0 b;

    public g0(l0 l0Var, k0 k0Var) {
        this.a = l0Var;
        this.b = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b);
    }

    public final int hashCode() {
        l0 l0Var = this.a;
        int hashCode = (l0Var == null ? 0 : l0Var.hashCode()) * 31;
        k0 k0Var = this.b;
        return hashCode + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "AddReaction(subject=" + this.a + ", reaction=" + this.b + ")";
    }
}

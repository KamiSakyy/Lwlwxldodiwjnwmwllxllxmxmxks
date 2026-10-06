package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aaShadow.m0 {
    public g0 a;

    public i0(g0 g0Var) {
        this.a = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && k71.k.b(this.a, ((i0) obj).a);
    }

    public final int hashCode() {
        g0 g0Var = this.a;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.hashCode();
    }

    public final String toString() {
        return "Data(addReaction=" + this.a + ")";
    }
}

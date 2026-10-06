package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y10 {
    public z10 a;

    public y10(z10 z10Var) {
        this.a = z10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y10) && k71.k.b(this.a, ((y10) obj).a);
    }

    public final int hashCode() {
        z10 z10Var = this.a;
        if (z10Var == null) {
            return 0;
        }
        return z10Var.hashCode();
    }

    public final String toString() {
        return "ResolveReviewThread(thread=" + this.a + ")";
    }
}

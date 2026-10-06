package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q90 {
    public p90 a;

    public q90(p90 p90Var) {
        this.a = p90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q90) && k71.k.b(this.a, ((q90) obj).a);
    }

    public final int hashCode() {
        p90 p90Var = this.a;
        if (p90Var == null) {
            return 0;
        }
        return p90Var.hashCode();
    }

    public final String toString() {
        return "UnresolveReviewThread(thread=" + this.a + ")";
    }
}

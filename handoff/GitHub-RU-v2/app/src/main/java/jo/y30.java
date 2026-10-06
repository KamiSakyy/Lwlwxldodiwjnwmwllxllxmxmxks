package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y30 {
    public z30 a;

    public y30(z30 z30Var) {
        this.a = z30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y30) && k71.k.b(this.a, ((y30) obj).a);
    }

    public final int hashCode() {
        z30 z30Var = this.a;
        if (z30Var == null) {
            return 0;
        }
        return z30Var.hashCode();
    }

    public final String toString() {
        return "ResolveReviewThread(thread=" + this.a + ")";
    }
}

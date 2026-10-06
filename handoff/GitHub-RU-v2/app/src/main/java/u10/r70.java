package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r70 {
    public q70 a;

    public r70(q70 q70Var) {
        this.a = q70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r70) && k71.k.b(this.a, ((r70) obj).a);
    }

    public final int hashCode() {
        q70 q70Var = this.a;
        if (q70Var == null) {
            return 0;
        }
        return q70Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

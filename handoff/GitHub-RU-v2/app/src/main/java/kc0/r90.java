package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r90 {
    public final q90 a;

    public r90(q90 q90Var) {
        this.a = q90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r90) && k71.k.b(this.a, ((r90) obj).a);
    }

    public final int hashCode() {
        q90 q90Var = this.a;
        if (q90Var == null) {
            return 0;
        }
        return q90Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

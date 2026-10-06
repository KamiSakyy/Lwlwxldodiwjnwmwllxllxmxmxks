package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m70 {
    public l70 a;

    public m70(l70 l70Var) {
        this.a = l70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m70) && k71.k.b(this.a, ((m70) obj).a);
    }

    public final int hashCode() {
        l70 l70Var = this.a;
        if (l70Var == null) {
            return 0;
        }
        return l70Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReviewComment(pullRequestReviewComment=" + this.a + ")";
    }
}

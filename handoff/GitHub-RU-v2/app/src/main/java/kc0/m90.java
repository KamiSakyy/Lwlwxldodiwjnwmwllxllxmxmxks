package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m90 {
    public final l90 a;

    public m90(l90 l90Var) {
        this.a = l90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m90) && k71.k.b(this.a, ((m90) obj).a);
    }

    public final int hashCode() {
        l90 l90Var = this.a;
        if (l90Var == null) {
            return 0;
        }
        return l90Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReviewComment(pullRequestReviewComment=" + this.a + ")";
    }
}

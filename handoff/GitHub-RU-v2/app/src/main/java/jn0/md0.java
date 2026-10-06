package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class md0 {
    public final ld0 a;

    public md0(ld0 ld0Var) {
        this.a = ld0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md0) && k71.k.b(this.a, ((md0) obj).a);
    }

    public final int hashCode() {
        ld0 ld0Var = this.a;
        if (ld0Var == null) {
            return 0;
        }
        return ld0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReviewComment(pullRequestReviewComment=" + this.a + ")";
    }
}

package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w50 {
    public v50 a;

    public w50(v50 v50Var) {
        this.a = v50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w50) && k71.k.b(this.a, ((w50) obj).a);
    }

    public final int hashCode() {
        v50 v50Var = this.a;
        if (v50Var == null) {
            return 0;
        }
        return v50Var.hashCode();
    }

    public final String toString() {
        return "SubmitPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

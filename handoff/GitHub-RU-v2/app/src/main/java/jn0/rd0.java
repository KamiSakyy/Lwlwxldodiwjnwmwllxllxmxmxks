package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rd0 {
    public final qd0 a;

    public rd0(qd0 qd0Var) {
        this.a = qd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd0) && k71.k.b(this.a, ((rd0) obj).a);
    }

    public final int hashCode() {
        qd0 qd0Var = this.a;
        if (qd0Var == null) {
            return 0;
        }
        return qd0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d20 {
    public c20 a;

    public d20(c20 c20Var) {
        this.a = c20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d20) && k71.k.b(this.a, ((d20) obj).a);
    }

    public final int hashCode() {
        c20 c20Var = this.a;
        if (c20Var == null) {
            return 0;
        }
        return c20Var.hashCode();
    }

    public final String toString() {
        return "SubmitPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

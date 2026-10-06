package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f80 {
    public e80 a;

    public f80(e80 e80Var) {
        this.a = e80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f80) && k71.k.b(this.a, ((f80) obj).a);
    }

    public final int hashCode() {
        e80 e80Var = this.a;
        if (e80Var == null) {
            return 0;
        }
        return e80Var.hashCode();
    }

    public final String toString() {
        return "SubmitPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

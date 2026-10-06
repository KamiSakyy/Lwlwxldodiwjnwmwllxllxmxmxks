package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f00 {
    public e00 a;

    public f00(e00 e00Var) {
        this.a = e00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f00) && k71.k.b(this.a, ((f00) obj).a);
    }

    public final int hashCode() {
        e00 e00Var = this.a;
        if (e00Var == null) {
            return 0;
        }
        return e00Var.hashCode();
    }

    public final String toString() {
        return "SubmitPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

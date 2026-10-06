package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public a1 a;

    public w0(a1 a1Var) {
        this.a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && k71.k.b(this.a, ((w0) obj).a);
    }

    public final int hashCode() {
        a1 a1Var = this.a;
        if (a1Var == null) {
            return 0;
        }
        return a1Var.hashCode();
    }

    public final String toString() {
        return "AddPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

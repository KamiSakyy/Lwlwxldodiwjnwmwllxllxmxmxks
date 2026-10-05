package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fg0 {
    public final eg0 a;

    public fg0(eg0 eg0Var) {
        this.a = eg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg0) && k71.k.b(this.a, ((fg0) obj).a);
    }

    public final int hashCode() {
        eg0 eg0Var = this.a;
        if (eg0Var == null) {
            return 0;
        }
        return eg0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

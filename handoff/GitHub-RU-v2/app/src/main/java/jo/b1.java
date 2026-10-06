package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 {
    public f1Shadow a;

    public b1(f1Shadow f1Var) {
        this.a = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && k71.k.b(this.a, ((b1) obj).a);
    }

    public final int hashCode() {
        f1Shadow f1Var = this.a;
        if (f1Var == null) {
            return 0;
        }
        return f1Var.hashCode();
    }

    public final String toString() {
        return "AddPullRequestReview(pullRequestReview=" + this.a + ")";
    }
}

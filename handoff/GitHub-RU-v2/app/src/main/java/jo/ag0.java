package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ag0 {
    public zf0 a;

    public ag0(zf0 zf0Var) {
        this.a = zf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag0) && k71.k.b(this.a, ((ag0) obj).a);
    }

    public final int hashCode() {
        zf0 zf0Var = this.a;
        if (zf0Var == null) {
            return 0;
        }
        return zf0Var.hashCode();
    }

    public final String toString() {
        return "UpdatePullRequestReviewComment(pullRequestReviewComment=" + this.a + ")";
    }
}

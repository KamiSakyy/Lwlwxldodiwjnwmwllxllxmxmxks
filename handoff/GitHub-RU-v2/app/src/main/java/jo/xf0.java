package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xf0 implements aa.m0 {
    public final ag0 a;

    public xf0(ag0 ag0Var) {
        this.a = ag0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xf0) && k71.k.b(this.a, ((xf0) obj).a);
    }

    public final int hashCode() {
        ag0 ag0Var = this.a;
        if (ag0Var == null) {
            return 0;
        }
        return ag0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestReviewComment=" + this.a + ")";
    }
}

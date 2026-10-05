package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t50 implements aa.m0 {
    public final w50 a;

    public t50(w50 w50Var) {
        this.a = w50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t50) && k71.k.b(this.a, ((t50) obj).a);
    }

    public final int hashCode() {
        w50 w50Var = this.a;
        if (w50Var == null) {
            return 0;
        }
        return w50Var.hashCode();
    }

    public final String toString() {
        return "Data(submitPullRequestReview=" + this.a + ")";
    }
}

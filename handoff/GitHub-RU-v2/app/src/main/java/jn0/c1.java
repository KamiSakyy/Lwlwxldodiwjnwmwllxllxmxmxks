package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 {
    public final d1 a;

    public c1(d1 d1Var) {
        this.a = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && k71.k.b(this.a, ((c1) obj).a);
    }

    public final int hashCode() {
        d1 d1Var = this.a;
        if (d1Var == null) {
            return 0;
        }
        return d1Var.hashCode();
    }

    public final String toString() {
        return "AddPullRequestReviewThreadReply(comment=" + this.a + ")";
    }
}

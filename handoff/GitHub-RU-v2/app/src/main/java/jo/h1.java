package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public final i1 a;

    public h1(i1 i1Var) {
        this.a = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && k71.k.b(this.a, ((h1) obj).a);
    }

    public final int hashCode() {
        i1 i1Var = this.a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public final String toString() {
        return "AddPullRequestReviewThreadReply(comment=" + this.a + ")";
    }
}

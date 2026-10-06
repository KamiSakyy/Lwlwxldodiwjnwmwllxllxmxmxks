package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 implements aaShadow.m0 {
    public h1 a;

    public m1(h1 h1Var) {
        this.a = h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && k71.k.b(this.a, ((m1) obj).a);
    }

    public final int hashCode() {
        h1 h1Var = this.a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public final String toString() {
        return "Data(addPullRequestReviewThreadReply=" + this.a + ")";
    }
}

package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 implements aa.m0 {
    public final c1 a;

    public h1(c1 c1Var) {
        this.a = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && k71.k.b(this.a, ((h1) obj).a);
    }

    public final int hashCode() {
        c1 c1Var = this.a;
        if (c1Var == null) {
            return 0;
        }
        return c1Var.hashCode();
    }

    public final String toString() {
        return "Data(addPullRequestReviewThreadReply=" + this.a + ")";
    }
}

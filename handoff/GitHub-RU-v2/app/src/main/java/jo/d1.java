package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 implements aaShadow.m0 {
    public b1 a;

    public d1(b1 b1Var) {
        this.a = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && k71.k.b(this.a, ((d1) obj).a);
    }

    public final int hashCode() {
        b1 b1Var = this.a;
        if (b1Var == null) {
            return 0;
        }
        return b1Var.hashCode();
    }

    public final String toString() {
        return "Data(addPullRequestReview=" + this.a + ")";
    }
}

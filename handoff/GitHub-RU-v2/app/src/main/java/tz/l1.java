package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 {
    public w1 a;
    public r b;

    public l1(w1 w1Var, r rVar) {
        this.a = w1Var;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b);
    }

    public final int hashCode() {
        w1 w1Var = this.a;
        return this.b.hashCode() + ((w1Var == null ? 0 : w1Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldReviewerValue(reviewers=" + this.a + ", field=" + this.b + ")";
    }
}

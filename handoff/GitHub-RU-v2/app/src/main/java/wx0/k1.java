package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 {
    public final v1 a;
    public final q b;

    public k1(v1 v1Var, q qVar) {
        this.a = v1Var;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return k71.k.b(this.a, k1Var.a) && k71.k.b(this.b, k1Var.b);
    }

    public final int hashCode() {
        v1 v1Var = this.a;
        return this.b.hashCode() + ((v1Var == null ? 0 : v1Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldReviewerValue(reviewers=" + this.a + ", field=" + this.b + ")";
    }
}

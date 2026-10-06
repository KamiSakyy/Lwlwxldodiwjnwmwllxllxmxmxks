package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a9 {
    public String a;
    public of0.f b;

    public a9(String str, of0.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return k71.k.b(this.a, a9Var.a) && k71.k.b(this.b, a9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", deploymentReviewApprovalRequest=" + this.b + ")";
    }
}

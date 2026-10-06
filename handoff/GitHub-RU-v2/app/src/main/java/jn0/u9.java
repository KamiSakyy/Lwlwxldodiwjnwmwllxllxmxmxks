package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u9 {
    public String a;
    public uq0.f b;

    public u9(String str, uq0.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        return k71.k.b(this.a, u9Var.a) && k71.k.b(this.b, u9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", deploymentReviewApprovalRequest=" + this.b + ")";
    }
}

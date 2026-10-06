package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s8 {
    public String a;
    public y40.f b;

    public s8(String str, y40.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return k71.k.b(this.a, s8Var.a) && k71.k.b(this.b, s8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", deploymentReviewApprovalRequest=" + this.b + ")";
    }
}

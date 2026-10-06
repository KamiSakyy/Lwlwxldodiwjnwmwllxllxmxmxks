package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ra {
    public final String a;
    public final cs.f b;

    public ra(String str, cs.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return k71.k.b(this.a, raVar.a) && k71.k.b(this.b, raVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", deploymentReviewApprovalRequest=" + this.b + ")";
    }
}

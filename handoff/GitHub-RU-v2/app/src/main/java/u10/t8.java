package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t8 {
    public final String a;
    public final String b;
    public final y30.f c;

    public t8(String str, String str2, y30.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return k71.k.b(this.a, t8Var.a) && k71.k.b(this.b, t8Var.b) && k71.k.b(this.c, t8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", deploymentReviewApprovalCheckRun=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

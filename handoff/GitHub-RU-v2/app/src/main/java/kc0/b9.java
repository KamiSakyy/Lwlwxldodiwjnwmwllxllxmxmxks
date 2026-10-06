package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b9 {
    public final String a;
    public final String b;
    public final oe0.f c;

    public b9(String str, String str2, oe0.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return k71.k.b(this.a, b9Var.a) && k71.k.b(this.b, b9Var.b) && k71.k.b(this.c, b9Var.c);
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

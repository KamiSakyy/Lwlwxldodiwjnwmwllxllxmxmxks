package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 {
    public String a;
    public String b;
    public String c;
    public q1 d;
    public gv.f0 e;

    public r1(String str, String str2, String str3, q1 q1Var, gv.f0 f0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = q1Var;
        this.e = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return k71.k.b(this.a, r1Var.a) && k71.k.b(this.b, r1Var.b) && k71.k.b(this.c, r1Var.c) && k71.k.b(this.d, r1Var.d) && k71.k.b(this.e, r1Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        q1 q1Var = this.d;
        return this.e.hashCode() + ((i + (q1Var == null ? 0 : q1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", headRefOid=");
        o.append(this.c);
        o.append(", pendingReviews=");
        o.append(this.d);
        o.append(", filesChangedReviewThreadFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}

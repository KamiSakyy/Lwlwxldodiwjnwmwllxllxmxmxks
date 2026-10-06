package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 {
    public String a;
    public String b;
    public String c;
    public l1 d;
    public xt0.v e;

    public m1(String str, String str2, String str3, l1 l1Var, xt0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l1Var;
        this.e = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && k71.k.b(this.b, m1Var.b) && k71.k.b(this.c, m1Var.c) && k71.k.b(this.d, m1Var.d) && k71.k.b(this.e, m1Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        l1 l1Var = this.d;
        return this.e.hashCode() + ((i + (l1Var == null ? 0 : l1Var.hashCode())) * 31);
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

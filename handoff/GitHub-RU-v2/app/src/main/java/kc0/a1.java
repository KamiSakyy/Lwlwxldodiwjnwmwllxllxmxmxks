package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 {
    public String a;
    public String b;
    public z0 c;
    public wi0.c d;

    public a1(String str, String str2, z0 z0Var, wi0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b) && k71.k.b(this.c, a1Var.c) && k71.k.b(this.d, a1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestReview(__typename=", this.a, ", id=", this.b, ", pullRequest=");
        o.append(this.c);
        o.append(", pullRequestReviewFields=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}

package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 {
    public String a;
    public String b;
    public xt0.q3 c;

    public z0(String str, String str2, xt0.q3 q3Var) {
        this.a = str;
        this.b = str2;
        this.c = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && k71.k.b(this.c, z0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestReviewPullRequestData=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

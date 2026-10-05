package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rc {
    public final String a;
    public final String b;
    public final xt0.m3 c;
    public final xt0.q3 d;

    public rc(String str, String str2, xt0.m3 m3Var, xt0.q3 q3Var) {
        this.a = str;
        this.b = str2;
        this.c = m3Var;
        this.d = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return k71.k.b(this.a, rcVar.a) && k71.k.b(this.b, rcVar.b) && k71.k.b(this.c, rcVar.c) && k71.k.b(this.d, rcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestPathData=");
        o.append(this.c);
        o.append(", pullRequestReviewPullRequestData=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}

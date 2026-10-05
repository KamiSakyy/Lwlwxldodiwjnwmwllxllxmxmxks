package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d80 {
    public final String a;
    public final String b;
    public final gv.a4 c;

    public d80(String str, String str2, gv.a4 a4Var) {
        this.a = str;
        this.b = str2;
        this.c = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return k71.k.b(this.a, d80Var.a) && k71.k.b(this.b, d80Var.b) && k71.k.b(this.c, d80Var.c);
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

package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class od {
    public final String a;
    public final String b;
    public final gv.w3 c;
    public final gv.a4 d;

    public od(String str, String str2, gv.w3 w3Var, gv.a4 a4Var) {
        this.a = str;
        this.b = str2;
        this.c = w3Var;
        this.d = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return k71.k.b(this.a, odVar.a) && k71.k.b(this.b, odVar.b) && k71.k.b(this.c, odVar.c) && k71.k.b(this.d, odVar.d);
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

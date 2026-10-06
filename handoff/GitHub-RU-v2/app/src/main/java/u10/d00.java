package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d00 {
    public String a;
    public String b;
    public z70.i3 c;

    public d00(String str, String str2, z70.i3 i3Var) {
        this.a = str;
        this.b = str2;
        this.c = i3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d00)) {
            return false;
        }
        d00 d00Var = (d00) obj;
        return k71.k.b(this.a, d00Var.a) && k71.k.b(this.b, d00Var.b) && k71.k.b(this.c, d00Var.c);
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
    public d00(String p1, String p2, Object p3) {
    }
}

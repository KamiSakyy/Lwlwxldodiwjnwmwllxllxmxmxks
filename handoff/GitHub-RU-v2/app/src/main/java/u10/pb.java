package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pb {
    public String a;
    public String b;
    public z70.e3 c;
    public z70.i3 d;

    public pb(String str, String str2, z70.e3 e3Var, z70.i3 i3Var) {
        this.a = str;
        this.b = str2;
        this.c = e3Var;
        this.d = i3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return k71.k.b(this.a, pbVar.a) && k71.k.b(this.b, pbVar.b) && k71.k.b(this.c, pbVar.c) && k71.k.b(this.d, pbVar.d);
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

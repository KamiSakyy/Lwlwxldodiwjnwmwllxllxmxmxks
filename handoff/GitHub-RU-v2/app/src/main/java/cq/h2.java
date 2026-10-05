package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h2 {
    public final String a;
    public final String b;
    public final n3 c;

    public h2(String str, String str2, n3 n3Var) {
        this.a = str;
        this.b = str2;
        this.c = n3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return k71.k.b(this.a, h2Var.a) && k71.k.b(this.b, h2Var.b) && k71.k.b(this.c, h2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestFeedFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

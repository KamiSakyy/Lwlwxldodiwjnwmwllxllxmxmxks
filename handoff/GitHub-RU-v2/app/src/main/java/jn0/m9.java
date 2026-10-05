package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m9 {
    public final String a;
    public final String b;
    public final xt0.z7 c;
    public final xt0.v d;

    public m9(String str, String str2, xt0.z7 z7Var, xt0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = z7Var;
        this.d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        return k71.k.b(this.a, m9Var.a) && k71.k.b(this.b, m9Var.b) && k71.k.b(this.c, m9Var.c) && k71.k.b(this.d, m9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", viewerLatestReviewRequestStateFragment=");
        o.append(this.c);
        o.append(", filesChangedReviewThreadFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}

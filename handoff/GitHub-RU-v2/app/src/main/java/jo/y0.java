package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public String a;
    public String b;
    public String c;
    public gv.l8 d;
    public gv.f0 e;

    public y0(String str, String str2, String str3, gv.l8 l8Var, gv.f0 f0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l8Var;
        this.e = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b) && k71.k.b(this.c, y0Var.c) && k71.k.b(this.d, y0Var.d) && k71.k.b(this.e, y0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", headRefOid=");
        o.append(this.c);
        o.append(", viewerLatestReviewRequestStateFragment=");
        o.append(this.d);
        o.append(", filesChangedReviewThreadFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}

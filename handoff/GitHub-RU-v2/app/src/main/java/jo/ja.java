package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ja {
    public final String a;
    public final String b;
    public final gv.l8 c;
    public final gv.f0 d;

    public ja(String str, String str2, gv.l8 l8Var, gv.f0 f0Var) {
        this.a = str;
        this.b = str2;
        this.c = l8Var;
        this.d = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return k71.k.b(this.a, jaVar.a) && k71.k.b(this.b, jaVar.b) && k71.k.b(this.c, jaVar.c) && k71.k.b(this.d, jaVar.d);
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

package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s8 {
    public String a;
    public String b;
    public ri0.h8 c;
    public ri0.v d;

    public s8(String str, String str2, ri0.h8 h8Var, ri0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = h8Var;
        this.d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return k71.k.b(this.a, s8Var.a) && k71.k.b(this.b, s8Var.b) && k71.k.b(this.c, s8Var.c) && k71.k.b(this.d, s8Var.d);
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

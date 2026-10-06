package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k8 {
    public String a;
    public String b;
    public z70.s7 c;
    public z70.v d;

    public k8(String str, String str2, z70.s7 s7Var, z70.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = s7Var;
        this.d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8)) {
            return false;
        }
        k8 k8Var = (k8) obj;
        return k71.k.b(this.a, k8Var.a) && k71.k.b(this.b, k8Var.b) && k71.k.b(this.c, k8Var.c) && k71.k.b(this.d, k8Var.d);
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

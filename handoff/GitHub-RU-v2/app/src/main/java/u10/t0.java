package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public final String a;
    public final String b;
    public final String c;
    public final z70.s7 d;
    public final z70.v e;

    public t0(String str, String str2, String str3, z70.s7 s7Var, z70.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s7Var;
        this.e = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b) && k71.k.b(this.c, t0Var.c) && k71.k.b(this.d, t0Var.d) && k71.k.b(this.e, t0Var.e);
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
    public static final Object d = null;
}

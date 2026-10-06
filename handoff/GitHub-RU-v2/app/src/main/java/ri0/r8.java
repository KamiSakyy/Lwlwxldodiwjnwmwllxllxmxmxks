package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r8 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final q8 c;
    public final o8 d;
    public final String e;

    public r8(String str, boolean z, q8 q8Var, o8 o8Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = q8Var;
        this.d = o8Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return k71.k.b(this.a, r8Var.a) && this.b == r8Var.b && k71.k.b(this.c, r8Var.c) && k71.k.b(this.d, r8Var.d) && k71.k.b(this.e, r8Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        q8 q8Var = this.c;
        int hashCode = (e + (q8Var == null ? 0 : q8Var.hashCode())) * 31;
        o8 o8Var = this.d;
        return this.e.hashCode() + ((hashCode + (o8Var != null ? o8Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("ViewerReviewerReviewStateWithRequester(id=", this.a, ", viewerDidAuthor=", ", viewerLatestReviewRequest=", this.b);
        o.append(this.c);
        o.append(", pendingReviews=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}

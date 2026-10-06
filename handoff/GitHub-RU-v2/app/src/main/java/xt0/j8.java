package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j8 implements aa.h0 {
    public String a;
    public boolean b;
    public i8 c;
    public g8 d;
    public String e;

    public j8(String str, boolean z, i8 i8Var, g8 g8Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = i8Var;
        this.d = g8Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return k71.k.b(this.a, j8Var.a) && this.b == j8Var.b && k71.k.b(this.c, j8Var.c) && k71.k.b(this.d, j8Var.d) && k71.k.b(this.e, j8Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        i8 i8Var = this.c;
        int hashCode = (e + (i8Var == null ? 0 : i8Var.hashCode())) * 31;
        g8 g8Var = this.d;
        return this.e.hashCode() + ((hashCode + (g8Var != null ? g8Var.hashCode() : 0)) * 31);
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

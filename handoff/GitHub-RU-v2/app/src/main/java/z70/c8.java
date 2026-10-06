package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c8 implements aa.h0 {
    public String a;
    public boolean b;
    public b8 c;
    public z7 d;
    public String e;

    public c8(String str, boolean z, b8 b8Var, z7 z7Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = b8Var;
        this.d = z7Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return k71.k.b(this.a, c8Var.a) && this.b == c8Var.b && k71.k.b(this.c, c8Var.c) && k71.k.b(this.d, c8Var.d) && k71.k.b(this.e, c8Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        b8 b8Var = this.c;
        int hashCode = (e + (b8Var == null ? 0 : b8Var.hashCode())) * 31;
        z7 z7Var = this.d;
        return this.e.hashCode() + ((hashCode + (z7Var != null ? z7Var.hashCode() : 0)) * 31);
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

package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x8 implements aa.h0 {
    public String a;
    public boolean b;
    public w8 c;
    public u8 d;
    public String e;

    public x8(String str, boolean z, w8 w8Var, u8 u8Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = w8Var;
        this.d = u8Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return k71.k.b(this.a, x8Var.a) && this.b == x8Var.b && k71.k.b(this.c, x8Var.c) && k71.k.b(this.d, x8Var.d) && k71.k.b(this.e, x8Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        w8 w8Var = this.c;
        int hashCode = (e + (w8Var == null ? 0 : w8Var.hashCode())) * 31;
        u8 u8Var = this.d;
        return this.e.hashCode() + ((hashCode + (u8Var != null ? u8Var.hashCode() : 0)) * 31);
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

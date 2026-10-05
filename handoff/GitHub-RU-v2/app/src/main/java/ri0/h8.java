package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h8 implements aa.h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final g8 d;
    public final a8 e;

    public h8(String str, String str2, boolean z, g8 g8Var, a8 a8Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = g8Var;
        this.e = a8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return k71.k.b(this.a, h8Var.a) && k71.k.b(this.b, h8Var.b) && this.c == h8Var.c && k71.k.b(this.d, h8Var.d) && k71.k.b(this.e, h8Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        g8 g8Var = this.d;
        return this.e.hashCode() + ((e + (g8Var == null ? 0 : g8Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ViewerLatestReviewRequestStateFragment(__typename=", this.a, ", id=", this.b, ", viewerDidAuthor=");
        o.append(this.c);
        o.append(", pendingReviews=");
        o.append(this.d);
        o.append(", viewerLatestReviewRequestFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}

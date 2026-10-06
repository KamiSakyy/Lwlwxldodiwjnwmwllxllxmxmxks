package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s7 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public r7 d;
    public l7 e;

    public s7(String str, String str2, boolean z, r7 r7Var, l7 l7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = r7Var;
        this.e = l7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return k71.k.b(this.a, s7Var.a) && k71.k.b(this.b, s7Var.b) && this.c == s7Var.c && k71.k.b(this.d, s7Var.d) && k71.k.b(this.e, s7Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        r7 r7Var = this.d;
        return this.e.hashCode() + ((e + (r7Var == null ? 0 : r7Var.hashCode())) * 31);
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

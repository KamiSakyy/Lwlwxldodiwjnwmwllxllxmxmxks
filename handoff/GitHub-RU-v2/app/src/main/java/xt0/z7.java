package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z7 implements aa.h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final y7 d;
    public final s7 e;

    public z7(String str, String str2, boolean z, y7 y7Var, s7 s7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = y7Var;
        this.e = s7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return k71.k.b(this.a, z7Var.a) && k71.k.b(this.b, z7Var.b) && this.c == z7Var.c && k71.k.b(this.d, z7Var.d) && k71.k.b(this.e, z7Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        y7 y7Var = this.d;
        return this.e.hashCode() + ((e + (y7Var == null ? 0 : y7Var.hashCode())) * 31);
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

package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l8 implements aa.h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final k8 d;
    public final f8 e;

    public l8(String str, String str2, boolean z, k8 k8Var, f8 f8Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = k8Var;
        this.e = f8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return k71.k.b(this.a, l8Var.a) && k71.k.b(this.b, l8Var.b) && this.c == l8Var.c && k71.k.b(this.d, l8Var.d) && k71.k.b(this.e, l8Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        k8 k8Var = this.d;
        return this.e.hashCode() + ((e + (k8Var == null ? 0 : k8Var.hashCode())) * 31);
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
    public Object i = null;
}

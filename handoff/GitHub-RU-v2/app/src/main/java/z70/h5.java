package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h5 {
    public boolean a;
    public boolean b;
    public f5 c;

    public h5(boolean z, boolean z2, f5 f5Var) {
        this.a = z;
        this.b = z2;
        this.c = f5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return this.a == h5Var.a && this.b == h5Var.b && k71.k.b(this.c, h5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = com.github.rudroid.copilot.h1.u("SuggestedReviewer(isAuthor=", this.a, ", isCommenter=", this.b, ", reviewer=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}

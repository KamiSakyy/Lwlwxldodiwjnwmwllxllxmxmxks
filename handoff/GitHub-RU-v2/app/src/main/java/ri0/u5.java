package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u5 {
    public boolean a;
    public boolean b;
    public s5 c;

    public u5(boolean z, boolean z2, s5 s5Var) {
        this.a = z;
        this.b = z2;
        this.c = s5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.a == u5Var.a && this.b == u5Var.b && k71.k.b(this.c, u5Var.c);
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

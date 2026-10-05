package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g2 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final sy.e0 d;
    public final com.github.service.models.response.a e;

    public g2(boolean z, boolean z2, String str, sy.e0 e0Var, com.github.service.models.response.a aVar) {
        k71.k.g(str, "id");
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = e0Var;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.a == g2Var.a && this.b == g2Var.b && k71.k.b(this.c, g2Var.c) && k71.k.b(this.d, g2Var.d) && k71.k.b(this.e, g2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = com.github.rudroid.copilot.h1.u("SuggestedReviewer(isAuthor=", this.a, ", isCommenter=", this.b, ", id=");
        u.append(this.c);
        u.append(", type=");
        u.append(this.d);
        u.append(", reviewer=");
        u.append(this.e);
        u.append(")");
        return u.toString();
    }
}

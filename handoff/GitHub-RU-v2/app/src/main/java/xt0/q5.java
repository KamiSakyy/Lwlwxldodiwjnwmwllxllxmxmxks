package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q5 {
    public final boolean a;
    public final boolean b;
    public final o5 c;

    public q5(boolean z, boolean z2, o5 o5Var) {
        this.a = z;
        this.b = z2;
        this.c = o5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return this.a == q5Var.a && this.b == q5Var.b && k71.k.b(this.c, q5Var.c);
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

package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o5 {
    public boolean a;
    public boolean b;
    public a6 c;

    public o5(boolean z, boolean z2, a6 a6Var) {
        this.a = z;
        this.b = z2;
        this.c = a6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return this.a == o5Var.a && this.b == o5Var.b && k71.k.b(this.c, o5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = com.github.rudroid.copilot.h1.u("Node4(isAuthor=", this.a, ", isCommenter=", this.b, ", reviewer=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}

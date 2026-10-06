package uf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 implements aa.h0 {
    public final String a;
    public final int b;
    public final b1 c;
    public final String d;

    public c1(String str, int i, b1 b1Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = b1Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && this.b == c1Var.b && k71.k.b(this.c, c1Var.c) && k71.k.b(this.d, c1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "DiscussionRepoOwnerFragment(id=", this.a, ", number=", ", repository=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}

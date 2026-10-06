package e50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aa.h0 {
    public String a;
    public int b;
    public x0 c;
    public String d;

    public y0(String str, int i, x0 x0Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = x0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && this.b == y0Var.b && k71.k.b(this.c, y0Var.c) && k71.k.b(this.d, y0Var.d);
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

package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 {
    public final String a;
    public final int b;
    public final l1 c;
    public final String d;

    public k1(String str, int i, l1 l1Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = l1Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return k71.k.b(this.a, k1Var.a) && this.b == k1Var.b && k71.k.b(this.c, k1Var.c) && k71.k.b(this.d, k1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Repository(id=", this.a, ", planLimit=", ", suggestedActors=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}

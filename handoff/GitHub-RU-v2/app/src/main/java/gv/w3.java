package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w3 implements aa.h0 {
    public final String a;
    public final int b;
    public final v3 c;
    public final String d;

    public w3(String str, int i, v3 v3Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = v3Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return k71.k.b(this.a, w3Var.a) && this.b == w3Var.b && k71.k.b(this.c, w3Var.c) && k71.k.b(this.d, w3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "PullRequestPathData(id=", this.a, ", number=", ", repository=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}

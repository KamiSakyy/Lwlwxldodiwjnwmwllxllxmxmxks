package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e3 implements aa.h0 {
    public final String a;
    public final int b;
    public final d3 c;
    public final String d;

    public e3(String str, int i, d3 d3Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = d3Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return k71.k.b(this.a, e3Var.a) && this.b == e3Var.b && k71.k.b(this.c, e3Var.c) && k71.k.b(this.d, e3Var.d);
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

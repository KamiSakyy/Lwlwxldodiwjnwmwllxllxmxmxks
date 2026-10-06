package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m3 implements aa.h0 {
    public String a;
    public int b;
    public l3 c;
    public String d;

    public m3(String str, int i, l3 l3Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = l3Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return k71.k.b(this.a, m3Var.a) && this.b == m3Var.b && k71.k.b(this.c, m3Var.c) && k71.k.b(this.d, m3Var.d);
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

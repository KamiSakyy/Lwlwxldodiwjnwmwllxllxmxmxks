package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u1 {
    public String a;
    public String b;
    public c2 c;

    public u1(String str, String str2, c2 c2Var) {
        this.a = str;
        this.b = str2;
        this.c = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.a, u1Var.a) && k71.k.b(this.b, u1Var.b) && k71.k.b(this.c, u1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", workflowFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

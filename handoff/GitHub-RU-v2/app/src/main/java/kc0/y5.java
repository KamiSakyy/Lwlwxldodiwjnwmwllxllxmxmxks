package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y5 {
    public String a;
    public String b;
    public we0.l1 c;

    public y5(String str, String str2, we0.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return k71.k.b(this.a, y5Var.a) && k71.k.b(this.b, y5Var.b) && k71.k.b(this.c, y5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", commitFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

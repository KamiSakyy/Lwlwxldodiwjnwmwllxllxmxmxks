package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q2 {
    public String a;
    public String b;
    public wk0.c1 c;

    public q2(String str, String str2, wk0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return k71.k.b(this.a, q2Var.a) && k71.k.b(this.b, q2Var.b) && k71.k.b(this.c, q2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e6 {
    public final String a;
    public final String b;
    public final cq0.l1 c;

    public e6(String str, String str2, cq0.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return k71.k.b(this.a, e6Var.a) && k71.k.b(this.b, e6Var.b) && k71.k.b(this.c, e6Var.c);
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

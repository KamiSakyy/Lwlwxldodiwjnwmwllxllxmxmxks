package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 {
    public String a;
    public String b;
    public z2 c;
    public y2 d;

    public x2(String str, String str2, z2 z2Var, y2 y2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = z2Var;
        this.d = y2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return k71.k.b(this.a, x2Var.a) && k71.k.b(this.b, x2Var.b) && k71.k.b(this.c, x2Var.c) && k71.k.b(this.d, x2Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        z2 z2Var = this.c;
        int hashCode = (i + (z2Var == null ? 0 : z2Var.a.hashCode())) * 31;
        y2 y2Var = this.d;
        return hashCode + (y2Var != null ? y2Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepositoryNode=");
        o.append(this.c);
        o.append(", onAssignable=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}

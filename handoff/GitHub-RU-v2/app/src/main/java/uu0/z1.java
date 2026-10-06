package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z1 {
    public String a;
    public String b;
    public x1 c;
    public String d;

    public z1(String str, String str2, x1 x1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = x1Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return k71.k.b(this.a, z1Var.a) && k71.k.b(this.b, z1Var.b) && k71.k.b(this.c, z1Var.c) && k71.k.b(this.d, z1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Parent(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}

package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 {
    public String a;
    public String b;
    public z1 c;
    public String d;

    public b2(String str, String str2, z1 z1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z1Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return k71.k.b(this.a, b2Var.a) && k71.k.b(this.b, b2Var.b) && k71.k.b(this.c, b2Var.c) && k71.k.b(this.d, b2Var.d);
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

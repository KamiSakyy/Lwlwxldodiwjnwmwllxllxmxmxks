package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 {
    public String a;
    public String b;
    public k3 c;
    public String d;

    public l3(String str, String str2, k3 k3Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = k3Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return k71.k.b(this.a, l3Var.a) && k71.k.b(this.b, l3Var.b) && k71.k.b(this.c, l3Var.c) && k71.k.b(this.d, l3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}

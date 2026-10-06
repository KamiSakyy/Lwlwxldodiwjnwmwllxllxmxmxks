package xt0;

import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g5 {
    public String a;
    public String b;
    public n30 c;
    public String d;
    public String e;

    public g5(String str, String str2, n30 n30Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = n30Var;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return k71.k.b(this.a, g5Var.a) && k71.k.b(this.b, g5Var.b) && this.c == g5Var.c && k71.k.b(this.d, g5Var.d) && k71.k.b(this.e, g5Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(id=", this.a, ", context=", this.b, ", state=");
        o.append(this.c);
        o.append(", description=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}

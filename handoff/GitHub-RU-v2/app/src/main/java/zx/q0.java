package zx;

import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public String a;
    public String b;
    public da0 c;
    public String d;
    public String e;

    public q0(String str, String str2, da0 da0Var, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = da0Var;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && this.c == q0Var.c && k71.k.b(this.d, q0Var.d) && k71.k.b(this.e, q0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(id=", this.a, ", context=", this.b, ", state=");
        o.append(this.c);
        o.append(", description=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}

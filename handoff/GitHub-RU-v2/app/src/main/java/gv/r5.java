package gv;

import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r5 {
    public String a;
    public String b;
    public da0 c;
    public String d;
    public String e;

    public r5(String str, String str2, da0 da0Var, String str3, String str4) {
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
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return k71.k.b(this.a, r5Var.a) && k71.k.b(this.b, r5Var.b) && this.c == r5Var.c && k71.k.b(this.d, r5Var.d) && k71.k.b(this.e, r5Var.e);
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

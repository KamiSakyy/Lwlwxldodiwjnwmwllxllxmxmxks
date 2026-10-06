package vn0;

import pz0.na0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c2 implements aa.h0 {
    public String a;
    public String b;
    public na0 c;
    public b2 d;
    public String e;

    public c2(String str, String str2, na0 na0Var, b2 b2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = na0Var;
        this.d = b2Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return k71.k.b(this.a, c2Var.a) && k71.k.b(this.b, c2Var.b) && this.c == c2Var.c && k71.k.b(this.d, c2Var.d) && k71.k.b(this.e, c2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkflowFragment(id=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", runs=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}

package ow0;

import com.github.rudroid.copilot.h1;
import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 {
    public final String a;
    public final String b;
    public final n30 c;
    public final String d;
    public final String e;

    public b0(String str, String str2, n30 n30Var, String str3, String str4) {
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
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && this.c == b0Var.c && k71.k.b(this.d, b0Var.d) && k71.k.b(this.e, b0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(id=", this.a, ", context=", this.b, ", state=");
        o.append(this.c);
        o.append(", description=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}

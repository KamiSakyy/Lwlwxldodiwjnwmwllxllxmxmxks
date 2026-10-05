package z70;

import hc0.uu;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v4 {
    public final String a;
    public final String b;
    public final uu c;
    public final String d;
    public final String e;

    public v4(String str, String str2, uu uuVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = uuVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return k71.k.b(this.a, v4Var.a) && k71.k.b(this.b, v4Var.b) && this.c == v4Var.c && k71.k.b(this.d, v4Var.d) && k71.k.b(this.e, v4Var.e);
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

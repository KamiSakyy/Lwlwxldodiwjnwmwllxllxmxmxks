package ri0;

import gn0.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i5 {
    public final String a;
    public final String b;
    public final yv c;
    public final String d;
    public final String e;

    public i5(String str, String str2, yv yvVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = yvVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return k71.k.b(this.a, i5Var.a) && k71.k.b(this.b, i5Var.b) && this.c == i5Var.c && k71.k.b(this.d, i5Var.d) && k71.k.b(this.e, i5Var.e);
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

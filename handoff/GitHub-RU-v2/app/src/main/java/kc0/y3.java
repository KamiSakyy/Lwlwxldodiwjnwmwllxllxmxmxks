package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 {
    public final String a;
    public final String b;
    public final gn0.yv c;
    public final String d;
    public final String e;

    public y3(String str, String str2, gn0.yv yvVar, String str3, String str4) {
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
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return k71.k.b(this.a, y3Var.a) && k71.k.b(this.b, y3Var.b) && this.c == y3Var.c && k71.k.b(this.d, y3Var.d) && k71.k.b(this.e, y3Var.e);
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

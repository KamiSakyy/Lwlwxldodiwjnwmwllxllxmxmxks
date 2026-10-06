package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e4 {
    public final String a;
    public final String b;
    public final pz0.n30 c;
    public final String d;
    public final String e;

    public e4(String str, String str2, pz0.n30 n30Var, String str3, String str4) {
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
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return k71.k.b(this.a, e4Var.a) && k71.k.b(this.b, e4Var.b) && this.c == e4Var.c && k71.k.b(this.d, e4Var.d) && k71.k.b(this.e, e4Var.e);
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

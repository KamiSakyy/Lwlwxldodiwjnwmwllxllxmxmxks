package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n4 {
    public String a;
    public String b;
    public m10.da0 c;
    public String d;
    public String e;

    public n4(String str, String str2, m10.da0 da0Var, String str3, String str4) {
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
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return k71.k.b(this.a, n4Var.a) && k71.k.b(this.b, n4Var.b) && this.c == n4Var.c && k71.k.b(this.d, n4Var.d) && k71.k.b(this.e, n4Var.e);
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

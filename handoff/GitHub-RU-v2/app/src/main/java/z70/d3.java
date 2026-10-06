package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d3 {
    public final String a;
    public final String b;
    public final c3 c;
    public final String d;

    public d3(String str, String str2, c3 c3Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = c3Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return k71.k.b(this.a, d3Var.a) && k71.k.b(this.b, d3Var.b) && k71.k.b(this.c, d3Var.c) && k71.k.b(this.d, d3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}

package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d2 {
    public final String a;
    public final String b;
    public final c2 c;
    public final String d;

    public d2(String str, String str2, c2 c2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = c2Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return k71.k.b(this.a, d2Var.a) && k71.k.b(this.b, d2Var.b) && k71.k.b(this.c, d2Var.c) && k71.k.b(this.d, d2Var.d);
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

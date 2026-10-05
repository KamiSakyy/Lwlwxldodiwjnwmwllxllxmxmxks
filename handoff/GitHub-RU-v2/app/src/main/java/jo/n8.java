package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n8 {
    public final String a;
    public final String b;
    public final l8 c;
    public final String d;

    public n8(String str, String str2, l8 l8Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = l8Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return k71.k.b(this.a, n8Var.a) && k71.k.b(this.b, n8Var.b) && k71.k.b(this.c, n8Var.c) && k71.k.b(this.d, n8Var.d);
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

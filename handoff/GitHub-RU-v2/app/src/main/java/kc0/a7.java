package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a7 {
    public final String a;
    public final String b;
    public final y6 c;
    public final String d;

    public a7(String str, String str2, y6 y6Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = y6Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return k71.k.b(this.a, a7Var.a) && k71.k.b(this.b, a7Var.b) && k71.k.b(this.c, a7Var.c) && k71.k.b(this.d, a7Var.d);
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

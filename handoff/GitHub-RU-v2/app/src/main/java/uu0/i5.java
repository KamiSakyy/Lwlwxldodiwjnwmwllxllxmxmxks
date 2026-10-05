package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i5 {
    public final String a;
    public final String b;
    public final g5 c;
    public final String d;

    public i5(String str, String str2, g5 g5Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = g5Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return k71.k.b(this.a, i5Var.a) && k71.k.b(this.b, i5Var.b) && k71.k.b(this.c, i5Var.c) && k71.k.b(this.d, i5Var.d);
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

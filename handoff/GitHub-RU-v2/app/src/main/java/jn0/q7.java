package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q7 {
    public String a;
    public String b;
    public o7 c;
    public String d;

    public q7(String str, String str2, o7 o7Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = o7Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return k71.k.b(this.a, q7Var.a) && k71.k.b(this.b, q7Var.b) && k71.k.b(this.c, q7Var.c) && k71.k.b(this.d, q7Var.d);
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

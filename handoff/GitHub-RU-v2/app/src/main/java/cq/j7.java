package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j7 {
    public String a;
    public String b;
    public i7 c;
    public String d;

    public j7(String str, String str2, i7 i7Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i7Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return k71.k.b(this.a, j7Var.a) && k71.k.b(this.b, j7Var.b) && k71.k.b(this.c, j7Var.c) && k71.k.b(this.d, j7Var.d);
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

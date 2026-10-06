package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o5 {
    public String a;
    public String b;
    public j5 c;

    public o5(String str, String str2, j5 j5Var) {
        this.a = str;
        this.b = str2;
        this.c = j5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return k71.k.b(this.a, o5Var.a) && k71.k.b(this.b, o5Var.b) && k71.k.b(this.c, o5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Reviewer(__typename=", this.a, ", id=", this.b, ", onUser=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

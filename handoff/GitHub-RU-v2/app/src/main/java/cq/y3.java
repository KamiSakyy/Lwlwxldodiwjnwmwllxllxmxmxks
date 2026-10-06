package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y3 {
    public String a;
    public String b;
    public String c;

    public y3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return k71.k.b(this.a, y3Var.a) && k71.k.b(this.b, y3Var.b) && k71.k.b(this.c, y3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Discussion(id=", this.a, ", url=", this.b, ", __typename="), this.c, ")");
    }
}

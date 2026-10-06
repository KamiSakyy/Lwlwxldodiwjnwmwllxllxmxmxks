package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 {
    public final String a;
    public final String b;
    public final String c;

    public x1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return k71.k.b(this.a, x1Var.a) && k71.k.b(this.b, x1Var.b) && k71.k.b(this.c, x1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Node1(id=", this.a, ", url=", this.b, ", __typename="), this.c, ")");
    }
}

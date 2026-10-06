package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b3 {
    public final String a;
    public final int b;
    public final String c;

    public b3(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return k71.k.b(this.a, b3Var.a) && this.b == b3Var.b && k71.k.b(this.c, b3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "Repository(id=", this.a, ", planLimit=", ", __typename="), this.c, ")");
    }
}

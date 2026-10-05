package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 {
    public final String a;
    public final String b;
    public final String c;

    public f3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return k71.k.b(this.a, f3Var.a) && k71.k.b(this.b, f3Var.b) && k71.k.b(this.c, f3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Node(id=", this.a, ", name=", this.b, ", __typename="), this.c, ")");
    }
}

package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h3 {
    public String a;
    public String b;
    public String c;

    public h3(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return k71.k.b(this.a, h3Var.a) && k71.k.b(this.b, h3Var.b) && k71.k.b(this.c, h3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Node(id=", this.a, ", name=", this.b, ", __typename="), this.c, ")");
    }
}

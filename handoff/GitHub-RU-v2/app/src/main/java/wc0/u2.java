package wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u2 {
    public String a;
    public String b;
    public String c;

    public u2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return k71.k.b(this.a, u2Var.a) && k71.k.b(this.b, u2Var.b) && k71.k.b(this.c, u2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Workflow(id=", this.a, ", name=", this.b, ", __typename="), this.c, ")");
    }
}

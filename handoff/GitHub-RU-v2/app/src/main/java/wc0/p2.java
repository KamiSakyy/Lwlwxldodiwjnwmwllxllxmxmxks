package wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 {
    public final String a;
    public final String b;
    public final String c;

    public p2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return k71.k.b(this.a, p2Var.a) && k71.k.b(this.b, p2Var.b) && k71.k.b(this.c, p2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("DefaultBranchRef(id=", this.a, ", name=", this.b, ", __typename="), this.c, ")");
    }
}

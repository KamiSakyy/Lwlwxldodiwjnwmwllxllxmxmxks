package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g3 implements aa.h0 {
    public final String a;
    public final int b;
    public final String c;

    public g3(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return k71.k.b(this.a, g3Var.a) && this.b == g3Var.b && k71.k.b(this.c, g3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "PullRequestNumber(id=", this.a, ", number=", ", __typename="), this.c, ")");
    }
}

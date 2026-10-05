package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q3 implements aa.h0 {
    public final String a;
    public final int b;
    public final String c;

    public q3(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return k71.k.b(this.a, q3Var.a) && this.b == q3Var.b && k71.k.b(this.c, q3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "PullRequestNumber(id=", this.a, ", number=", ", __typename="), this.c, ")");
    }
}

package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 implements aa.h0 {
    public final String a;
    public final int b;
    public final String c;

    public z2(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return k71.k.b(this.a, z2Var.a) && this.b == z2Var.b && k71.k.b(this.c, z2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "PullRequestNumber(id=", this.a, ", number=", ", __typename="), this.c, ")");
    }
}

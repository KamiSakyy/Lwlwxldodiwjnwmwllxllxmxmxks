package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k10 {
    public final String a;
    public final String b;
    public final gv.z2 c;

    public k10(String str, String str2, gv.z2 z2Var) {
        this.a = str;
        this.b = str2;
        this.c = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k10)) {
            return false;
        }
        k10 k10Var = (k10) obj;
        return k71.k.b(this.a, k10Var.a) && k71.k.b(this.b, k10Var.b) && k71.k.b(this.c, k10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", pullRequestItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

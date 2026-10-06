package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vj0 {
    public final String a;
    public final String b;
    public final tu.s c;

    public vj0(String str, String str2, tu.s sVar) {
        this.a = str;
        this.b = str2;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj0)) {
            return false;
        }
        vj0 vj0Var = (vj0) obj;
        return k71.k.b(this.a, vj0Var.a) && k71.k.b(this.b, vj0Var.b) && k71.k.b(this.c, vj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", organizationListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

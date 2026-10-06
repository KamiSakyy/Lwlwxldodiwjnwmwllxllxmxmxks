package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z40 {
    public final String a;
    public final String b;
    public final tu.s c;

    public z40(String str, String str2, tu.s sVar) {
        this.a = str;
        this.b = str2;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        return k71.k.b(this.a, z40Var.a) && k71.k.b(this.b, z40Var.b) && k71.k.b(this.c, z40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnOrganization(__typename=", this.a, ", id=", this.b, ", organizationListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

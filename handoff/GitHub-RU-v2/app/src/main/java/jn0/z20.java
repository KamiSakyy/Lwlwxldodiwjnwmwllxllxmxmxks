package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z20 {
    public final String a;
    public final String b;
    public final kt0.q c;

    public z20(String str, String str2, kt0.q qVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z20)) {
            return false;
        }
        z20 z20Var = (z20) obj;
        return k71.k.b(this.a, z20Var.a) && k71.k.b(this.b, z20Var.b) && k71.k.b(this.c, z20Var.c);
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

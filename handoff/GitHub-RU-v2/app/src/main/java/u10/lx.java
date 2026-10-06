package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lx {
    public String a;
    public String b;
    public k70.q c;

    public lx(String str, String str2, k70.q qVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        return k71.k.b(this.a, lxVar.a) && k71.k.b(this.b, lxVar.b) && k71.k.b(this.c, lxVar.c);
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
    public lx(String p1, String p2, Object p3) {
    }
}

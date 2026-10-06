package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kx {
    public String a;
    public lx b;
    public ja0.a c;

    public kx(String str, lx lxVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = lxVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        return k71.k.b(this.a, kxVar.a) && k71.k.b(this.b, kxVar.b) && k71.k.b(this.c, kxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lx lxVar = this.b;
        int hashCode2 = (hashCode + (lxVar == null ? 0 : lxVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
    public kx(String p1, Object p2, Object p3) {
    }
}

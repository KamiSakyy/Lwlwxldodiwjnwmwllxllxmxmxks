package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rh {
    public String a;
    public vh b;
    public kw0.a c;

    public rh(String str, vh vhVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = vhVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh)) {
            return false;
        }
        rh rhVar = (rh) obj;
        return k71.k.b(this.a, rhVar.a) && k71.k.b(this.b, rhVar.b) && k71.k.b(this.c, rhVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vh vhVar = this.b;
        int hashCode2 = (hashCode + (vhVar == null ? 0 : vhVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node4(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}

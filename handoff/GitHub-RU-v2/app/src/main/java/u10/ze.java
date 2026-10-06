package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ze {
    public final String a;
    public final cf b;
    public final ja0.a c;

    public ze(String str, cf cfVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cfVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        return k71.k.b(this.a, zeVar.a) && k71.k.b(this.b, zeVar.b) && k71.k.b(this.c, zeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cf cfVar = this.b;
        int hashCode2 = (hashCode + (cfVar == null ? 0 : cfVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node4(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}

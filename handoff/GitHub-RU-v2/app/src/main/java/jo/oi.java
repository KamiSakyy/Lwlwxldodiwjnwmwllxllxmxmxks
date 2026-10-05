package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oi {
    public final String a;
    public final si b;
    public final vx.a c;

    public oi(String str, si siVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = siVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return k71.k.b(this.a, oiVar.a) && k71.k.b(this.b, oiVar.b) && k71.k.b(this.c, oiVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        si siVar = this.b;
        int hashCode2 = (hashCode + (siVar == null ? 0 : siVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node4(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}

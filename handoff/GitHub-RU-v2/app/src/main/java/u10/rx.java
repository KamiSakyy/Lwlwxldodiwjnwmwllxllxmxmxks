package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rx {
    public String a;
    public sx b;
    public ja0.a c;

    public rx(String str, sx sxVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = sxVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return k71.k.b(this.a, rxVar.a) && k71.k.b(this.b, rxVar.b) && k71.k.b(this.c, rxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sx sxVar = this.b;
        int hashCode2 = (hashCode + (sxVar == null ? 0 : sxVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
    public rx(String p1, Object p2, Object p3) {
    }
}

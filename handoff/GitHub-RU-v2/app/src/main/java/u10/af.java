package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class af {
    public final String a;
    public final bf b;
    public final ja0.a c;

    public af(String str, bf bfVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bfVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return k71.k.b(this.a, afVar.a) && k71.k.b(this.b, afVar.b) && k71.k.b(this.c, afVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bf bfVar = this.b;
        int hashCode2 = (hashCode + (bfVar == null ? 0 : bfVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onIssue=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}

package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ld {
    public final String a;
    public final od b;
    public final ja0.a c;

    public ld(String str, od odVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = odVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return false;
        }
        ld ldVar = (ld) obj;
        return k71.k.b(this.a, ldVar.a) && k71.k.b(this.b, ldVar.b) && k71.k.b(this.c, ldVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        od odVar = this.b;
        int hashCode2 = (hashCode + (odVar == null ? 0 : odVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}

package a40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final g b;
    public final ja0.a c;

    public c(String str, g gVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = gVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.a.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Closable(__typename=");
        sb.append(this.a);
        sb.append(", onRepositoryNode=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}

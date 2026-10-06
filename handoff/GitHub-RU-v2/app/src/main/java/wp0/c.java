package wp0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public String a;
    public g b;
    public kw0.a c;

    public c(String str, g gVar, kw0.a aVar) {
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
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Closable(__typename=");
        sb.append(this.a);
        sb.append(", onRepositoryNode=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}

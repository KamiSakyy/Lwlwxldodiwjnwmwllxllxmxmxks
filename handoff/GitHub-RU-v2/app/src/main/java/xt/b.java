package xt;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final g b;
    public final h c;
    public final gw.c d;

    public b(String str, g gVar, h hVar, gw.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = gVar;
        this.c = hVar;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.c;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        gw.c cVar = this.d;
        return hashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "Canonical(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", crossReferencedEventRepositoryFields=" + this.d + ")";
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}

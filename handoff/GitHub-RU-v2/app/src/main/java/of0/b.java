package of0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final String a;
    public final d b;
    public final c c;

    public b(String str, d dVar, c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.c;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", onUser=" + this.b + ", onTeam=" + this.c + ")";
    }
}

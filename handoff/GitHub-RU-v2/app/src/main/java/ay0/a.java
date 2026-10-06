package ay0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public b b;
    public d c;
    public c d;

    public a(String str, b bVar, d dVar, c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
        this.c = dVar;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c) && k71.k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.a.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.a.hashCode())) * 31;
        c cVar = this.d;
        return hashCode3 + (cVar != null ? cVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "Field(__typename=" + this.a + ", onProjectV2Field=" + this.b + ", onProjectV2SingleSelectField=" + this.c + ", onProjectV2IterationField=" + this.d + ")";
    }
    public Object O(Object p1) { return null; }
}

package iy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public c b;
    public d c;
    public b d;

    public a(String str, c cVar, d dVar, b bVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
        this.c = dVar;
        this.d = bVar;
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
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.d;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", onDraftIssue=" + this.d + ")";
    }
    public Object O(Object p1) { return null; }
}

package ef0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public b b;
    public c c;

    public h(String str, b bVar, c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.c;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "Source(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}

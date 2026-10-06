package sr;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public final String a;
    public final c b;
    public final d c;

    public i(String str, c cVar, d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.c;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Source(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}

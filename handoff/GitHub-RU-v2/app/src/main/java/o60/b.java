package o60;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final c b;
    public final d c;
    public final y80.c d;

    public b(String str, c cVar, d dVar, y80.c cVar2) {
        k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
        this.c = dVar;
        this.d = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.c;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        y80.c cVar2 = this.d;
        return hashCode3 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Canonical(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", crossReferencedEventRepositoryFields=" + this.d + ")";
    }
}

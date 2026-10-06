package eq0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final String a;
    public final b b;
    public final c c;

    public d(String str, b bVar, c cVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.c;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}

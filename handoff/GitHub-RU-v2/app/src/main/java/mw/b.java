package mw;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final eq.c b;
    public final ax.b c;

    public b(String str, eq.c cVar, ax.b bVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eq.c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ax.b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "RequestedReviewer(__typename=" + this.a + ", actorFields=" + this.b + ", teamFields=" + this.c + ")";
    }
}

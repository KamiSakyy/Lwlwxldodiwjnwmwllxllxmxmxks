package wj0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public ud0.a b;
    public gk0.b c;

    public b(String str, ud0.a aVar, gk0.b bVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
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
        ud0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        gk0.b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "RequestedReviewer(__typename=" + this.a + ", actorFields=" + this.b + ", teamFields=" + this.c + ")";
    }
}

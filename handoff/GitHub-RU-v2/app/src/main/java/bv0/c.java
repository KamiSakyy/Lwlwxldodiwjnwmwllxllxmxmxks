package bv0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final b b;
    public final a c;
    public final kw0.a d;

    public c(String str, b bVar, a aVar, kw0.a aVar2) {
        k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
        this.c = aVar;
        this.d = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        kw0.a aVar2 = this.d;
        return hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        return "RequestedReviewer(__typename=" + this.a + ", onUser=" + this.b + ", onTeam=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}

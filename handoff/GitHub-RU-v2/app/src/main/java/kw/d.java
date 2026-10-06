package kw;

import jo.f4Shadow;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public c b;
    public b c;
    public a d;
    public vx.a e;

    public d(String str, c cVar, b bVar, a aVar, vx.a aVar2) {
        k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
        this.c = bVar;
        this.d = aVar;
        this.e = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c) && k.b(this.d, dVar.d) && k.b(this.e, dVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        vx.a aVar2 = this.e;
        return hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestedReviewer(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", onTeam=");
        sb.append(this.c);
        sb.append(", onBot=");
        sb.append(this.d);
        sb.append(", nodeIdFragment=");
        return f4Shadow.r(sb, this.e, ")");
    }
}

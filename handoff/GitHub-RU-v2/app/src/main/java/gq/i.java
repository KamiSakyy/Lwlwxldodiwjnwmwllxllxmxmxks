package gq;

import aa.h0;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements h0 {
    public final String a;
    public final g b;
    public final vx.a c;

    public i(String str, g gVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = gVar;
        this.c = aVar;
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
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssigneeFragment(__typename=");
        sb.append(this.a);
        sb.append(", assignedActors=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}

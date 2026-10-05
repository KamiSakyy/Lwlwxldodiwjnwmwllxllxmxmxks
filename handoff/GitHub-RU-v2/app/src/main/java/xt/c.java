package xt;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final f b;
    public final vx.a c;

    public c(String str, f fVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = fVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Duplicate(__typename=");
        sb.append(this.a);
        sb.append(", onIssue=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}

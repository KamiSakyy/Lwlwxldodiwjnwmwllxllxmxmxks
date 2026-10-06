package gw;

import aa.h0;
import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final b b;
    public final vx.a c;

    public c(String str, b bVar, vx.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = bVar;
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
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vx.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrossReferencedEventRepositoryFields(__typename=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}

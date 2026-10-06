package xu0;

import aa.h0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements h0 {
    public final String a;
    public final b b;
    public final kw0.a c;

    public c(String str, b bVar, kw0.a aVar) {
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
        kw0.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrossReferencedEventRepositoryFields(__typename=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}

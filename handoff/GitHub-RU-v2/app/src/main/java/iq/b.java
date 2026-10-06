package iq;

import jo.f4Shadow;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public String a;
    public eq.c b;

    public b(String str, eq.c cVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eq.c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return f4Shadow.n("Assignee(__typename=", this.a, ", actorFields=", this.b, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}

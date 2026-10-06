package gp0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public cp0.c b;

    public b(String str, cp0.c cVar) {
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
        cp0.c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return f1.e.i("Assignee(__typename=", this.a, ", actorFields=", this.b, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}

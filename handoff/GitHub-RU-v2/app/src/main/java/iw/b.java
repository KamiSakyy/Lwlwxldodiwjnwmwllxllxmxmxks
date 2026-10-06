package iw;

import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final eq.c b;

    public b(String str, eq.c cVar) {
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}

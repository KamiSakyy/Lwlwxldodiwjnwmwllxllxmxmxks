package ae0;

import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final String a;
    public final ud0.a b;

    public b(String str, ud0.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
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
        ud0.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.p("Assignee(__typename=", this.a, ", actorFields=", this.b, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}

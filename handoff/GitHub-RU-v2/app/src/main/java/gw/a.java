package gw;

import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final eq.c b;

    public a(String str, eq.c cVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eq.c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return f4.n("Owner(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

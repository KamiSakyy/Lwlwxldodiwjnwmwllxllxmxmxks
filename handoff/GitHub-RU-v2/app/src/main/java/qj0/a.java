package qj0;

import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final ud0.a b;

    public a(String str, ud0.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
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
        ud0.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.p("Owner(__typename=", this.a, ", actorFields=", this.b, ")");
    }
    public Object O(Object p1) { return null; }
}

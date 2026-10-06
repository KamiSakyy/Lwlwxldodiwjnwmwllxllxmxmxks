package qr;

import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final eq.c b;

    public a(String str, eq.c cVar) {
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Actor(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

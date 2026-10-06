package ct;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public String a;
    public eq.c b;

    public q(String str, eq.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eq.c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return f4.n("Node(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

package bu;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final eq.c b;

    public e(String str, eq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Enqueuer(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

package o40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public e30.a b;

    public d(String str, e30.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e30.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return no.a.m("Owner1(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

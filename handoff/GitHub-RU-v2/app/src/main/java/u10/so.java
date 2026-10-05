package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class so {
    public final String a;
    public final e30.a b;

    public so(String str, e30.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so)) {
            return false;
        }
        so soVar = (so) obj;
        return k71.k.b(this.a, soVar.a) && k71.k.b(this.b, soVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return no.a.m("Author1(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

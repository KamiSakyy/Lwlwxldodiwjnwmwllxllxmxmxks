package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bm {
    public String a;
    public e30.a b;

    public bm(String str, e30.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return k71.k.b(this.a, bmVar.a) && k71.k.b(this.b, bmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return no.a.m("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

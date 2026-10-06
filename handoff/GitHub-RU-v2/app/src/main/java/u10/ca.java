package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ca {
    public final String a;
    public final e30.a b;

    public ca(String str, e30.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return k71.k.b(this.a, caVar.a) && k71.k.b(this.b, caVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return no.a.m("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

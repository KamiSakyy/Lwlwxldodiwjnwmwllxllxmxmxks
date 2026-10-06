package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wm {
    public String a;
    public e30.a b;

    public wm(String str, e30.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return k71.k.b(this.a, wmVar.a) && k71.k.b(this.b, wmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return no.a.m("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

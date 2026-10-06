package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wt {
    public final String a;
    public final eq.c b;

    public wt(String str, eq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt)) {
            return false;
        }
        wt wtVar = (wt) obj;
        return k71.k.b(this.a, wtVar.a) && k71.k.b(this.b, wtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Author1(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

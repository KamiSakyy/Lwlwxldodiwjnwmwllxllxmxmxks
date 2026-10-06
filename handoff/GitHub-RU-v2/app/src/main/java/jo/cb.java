package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cb {
    public String a;
    public eq.c b;

    public cb(String str, eq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return k71.k.b(this.a, cbVar.a) && k71.k.b(this.b, cbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Actor(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

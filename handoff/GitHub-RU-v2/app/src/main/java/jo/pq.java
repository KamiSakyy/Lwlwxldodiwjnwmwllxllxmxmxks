package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pq {
    public final String a;
    public final eq.c b;

    public pq(String str, eq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        return k71.k.b(this.a, pqVar.a) && k71.k.b(this.b, pqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

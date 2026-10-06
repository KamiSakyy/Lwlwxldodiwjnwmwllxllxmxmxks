package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bc {
    public String a;
    public eq.c b;

    public bc(String str, eq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return k71.k.b(this.a, bcVar.a) && k71.k.b(this.b, bcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

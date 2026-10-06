package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pr {
    public String a;
    public eq.c b;

    public pr(String str, eq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        return k71.k.b(this.a, prVar.a) && k71.k.b(this.b, prVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

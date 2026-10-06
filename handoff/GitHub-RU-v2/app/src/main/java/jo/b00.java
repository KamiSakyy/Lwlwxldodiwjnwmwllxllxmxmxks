package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b00 {
    public final String a;
    public final eq.c b;

    public b00(String str, eq.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b00)) {
            return false;
        }
        b00 b00Var = (b00) obj;
        return k71.k.b(this.a, b00Var.a) && k71.k.b(this.b, b00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.n("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

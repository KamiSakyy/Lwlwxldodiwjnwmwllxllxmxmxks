package kq0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final cp0.c b;

    public a(String str, cp0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f1.e.i("Actor(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

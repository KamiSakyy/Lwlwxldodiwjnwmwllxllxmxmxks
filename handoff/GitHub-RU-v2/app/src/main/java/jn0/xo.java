package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xo {
    public String a;
    public cp0.c b;

    public xo(String str, cp0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        return k71.k.b(this.a, xoVar.a) && k71.k.b(this.b, xoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f1.e.i("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

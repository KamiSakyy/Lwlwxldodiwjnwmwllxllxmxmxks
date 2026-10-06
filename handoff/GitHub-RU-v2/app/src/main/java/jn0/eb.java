package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eb {
    public final String a;
    public final cp0.c b;

    public eb(String str, cp0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj;
        return k71.k.b(this.a, ebVar.a) && k71.k.b(this.b, ebVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f1.e.i("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

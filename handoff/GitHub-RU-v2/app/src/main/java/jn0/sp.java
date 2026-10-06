package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sp {
    public String a;
    public cp0.c b;

    public sp(String str, cp0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp)) {
            return false;
        }
        sp spVar = (sp) obj;
        return k71.k.b(this.a, spVar.a) && k71.k.b(this.b, spVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f1.e.i("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

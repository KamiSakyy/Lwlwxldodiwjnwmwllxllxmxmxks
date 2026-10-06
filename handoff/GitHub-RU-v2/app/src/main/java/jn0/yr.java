package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yr {
    public final String a;
    public final cp0.c b;

    public yr(String str, cp0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj;
        return k71.k.b(this.a, yrVar.a) && k71.k.b(this.b, yrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f1.e.i("Author1(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

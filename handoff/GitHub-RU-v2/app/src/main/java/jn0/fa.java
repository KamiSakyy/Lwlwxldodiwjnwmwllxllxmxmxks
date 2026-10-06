package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fa {
    public String a;
    public cp0.c b;

    public fa(String str, cp0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return k71.k.b(this.a, faVar.a) && k71.k.b(this.b, faVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f1.e.i("Actor(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

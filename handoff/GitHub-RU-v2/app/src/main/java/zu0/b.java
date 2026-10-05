package zu0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final String a;
    public final cp0.c b;

    public b(String str, cp0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f1.e.i("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}

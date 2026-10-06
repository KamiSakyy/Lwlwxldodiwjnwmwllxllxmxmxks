package kq0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public String a;
    public cp0.c b;

    public e(String str, cp0.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cp0.c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return f1.e.i("Owner(__typename=", this.a, ", actorFields=", this.b, ")");
    }
    public static Object i(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}

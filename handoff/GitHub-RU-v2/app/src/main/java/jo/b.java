package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final gq.c b;

    public b(String str, gq.c cVar) {
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
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Assignable(__typename=" + this.a + ", assignableFragment=" + this.b + ")";
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}

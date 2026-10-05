package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tm {
    public final String a;
    public final zt.d b;

    public tm(String str, zt.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm)) {
            return false;
        }
        tm tmVar = (tm) obj;
        return k71.k.b(this.a, tmVar.a) && k71.k.b(this.b, tmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}

package cn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public h01.q a;
    public Object b;

    public h(h01.q qVar, List list) {
        k71.k.g(qVar, "timeline");
        this.a = qVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && this.b.equals(hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheEntry(timeline=" + this.a + ", localAdditions=" + this.b + ")";
    }
    public Object d(Object p1, Object p2, Object p3) { return null; }
    public Object d(Object, int, Object) { return null; }
}

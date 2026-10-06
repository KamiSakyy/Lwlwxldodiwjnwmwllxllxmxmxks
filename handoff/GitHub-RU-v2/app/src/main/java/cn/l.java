package cn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public h01.q a;
    public Object b;

    public l(h01.q qVar, List list) {
        k71.k.g(qVar, "timeline");
        this.a = qVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && this.b.equals(lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineWithLocalAdditions(timeline=" + this.a + ", localAdditions=" + this.b + ")";
    }
}

package bw;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public d a;
    public List b;

    public e(d dVar, List list) {
        this.a = dVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
    public Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}

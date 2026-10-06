package ey;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public p a;
    public List b;

    public r(p pVar, List list) {
        this.a = pVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "StatusChecks(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

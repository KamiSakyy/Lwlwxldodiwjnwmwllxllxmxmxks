package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qp {
    public final sp a;
    public final List b;

    public qp(sp spVar, List list) {
        this.a = spVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp)) {
            return false;
        }
        qp qpVar = (qp) obj;
        return k71.k.b(this.a, qpVar.a) && k71.k.b(this.b, qpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Mentions(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

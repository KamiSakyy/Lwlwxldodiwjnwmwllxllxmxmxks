package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kh {
    public final qh a;
    public final List b;

    public kh(qh qhVar, List list) {
        this.a = qhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return k71.k.b(this.a, khVar.a) && k71.k.b(this.b, khVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Following(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

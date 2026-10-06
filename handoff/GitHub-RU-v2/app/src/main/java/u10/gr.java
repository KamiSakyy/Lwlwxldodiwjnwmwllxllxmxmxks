package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gr {
    public lr a;
    public List b;

    public gr(lr lrVar, List list) {
        this.a = lrVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr)) {
            return false;
        }
        gr grVar = (gr) obj;
        return k71.k.b(this.a, grVar.a) && k71.k.b(this.b, grVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Contributors(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

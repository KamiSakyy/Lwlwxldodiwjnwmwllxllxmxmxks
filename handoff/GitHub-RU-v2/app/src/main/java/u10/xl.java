package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xl {
    public yl a;
    public List b;

    public xl(yl ylVar, List list) {
        this.a = ylVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl)) {
            return false;
        }
        xl xlVar = (xl) obj;
        return k71.k.b(this.a, xlVar.a) && k71.k.b(this.b, xlVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Organizations(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

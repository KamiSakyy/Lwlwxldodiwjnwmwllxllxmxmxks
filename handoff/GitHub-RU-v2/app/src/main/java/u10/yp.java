package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yp {
    public final xp a;
    public final List b;

    public yp(xp xpVar, List list) {
        this.a = xpVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp)) {
            return false;
        }
        yp ypVar = (yp) obj;
        return k71.k.b(this.a, ypVar.a) && k71.k.b(this.b, ypVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Releases(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

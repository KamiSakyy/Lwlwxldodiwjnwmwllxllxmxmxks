package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ft {
    public dt a;
    public List b;

    public ft(dt dtVar, List list) {
        this.a = dtVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft)) {
            return false;
        }
        ft ftVar = (ft) obj;
        return k71.k.b(this.a, ftVar.a) && k71.k.b(this.b, ftVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories1(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

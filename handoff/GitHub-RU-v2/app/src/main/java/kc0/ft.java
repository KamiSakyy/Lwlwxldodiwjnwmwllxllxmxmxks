package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ft {
    public final kt a;
    public final List b;

    public ft(kt ktVar, List list) {
        this.a = ktVar;
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
        return "Forks(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

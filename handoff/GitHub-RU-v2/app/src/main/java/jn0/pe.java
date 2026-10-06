package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pe {
    public final re a;
    public final List b;

    public pe(re reVar, List list) {
        this.a = reVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj;
        return k71.k.b(this.a, peVar.a) && k71.k.b(this.b, peVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Items(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ku {
    public final ju a;
    public final List b;

    public ku(ju juVar, List list) {
        this.a = juVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku)) {
            return false;
        }
        ku kuVar = (ku) obj;
        return k71.k.b(this.a, kuVar.a) && k71.k.b(this.b, kuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Watchers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

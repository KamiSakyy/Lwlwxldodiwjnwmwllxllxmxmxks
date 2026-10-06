package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uu {
    public su a;
    public List b;

    public uu(su suVar, List list) {
        this.a = suVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        return k71.k.b(this.a, uuVar.a) && k71.k.b(this.b, uuVar.b);
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

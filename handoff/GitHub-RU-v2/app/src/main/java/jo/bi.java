package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bi {
    public final fi a;
    public final List b;

    public bi(fi fiVar, List list) {
        this.a = fiVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return k71.k.b(this.a, biVar.a) && k71.k.b(this.b, biVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "CodeSearch(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

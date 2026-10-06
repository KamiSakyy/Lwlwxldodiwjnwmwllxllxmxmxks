package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lb {
    public nb a;
    public List b;

    public lb(nb nbVar, List list) {
        this.a = nbVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return k71.k.b(this.a, lbVar.a) && k71.k.b(this.b, lbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DiscussionCategories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

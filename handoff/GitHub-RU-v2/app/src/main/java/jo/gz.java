package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gz {
    public ez a;
    public List b;

    public gz(ez ezVar, List list) {
        this.a = ezVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj;
        return k71.k.b(this.a, gzVar.a) && k71.k.b(this.b, gzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nx {
    public rx a;
    public List b;

    public nx(rx rxVar, List list) {
        this.a = rxVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx)) {
            return false;
        }
        nx nxVar = (nx) obj;
        return k71.k.b(this.a, nxVar.a) && k71.k.b(this.b, nxVar.b);
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

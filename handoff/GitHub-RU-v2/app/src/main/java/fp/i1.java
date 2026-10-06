package fp;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public int a;
    public List b;
    public g1Shadow c;

    public i1(int i, List list, g1Shadow g1Var) {
        this.a = i;
        this.b = list;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.a == i1Var.a && k71.k.b(this.b, i1Var.b) && k71.k.b(this.c, i1Var.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "RepositoryCustomAgents(totalCount=" + this.a + ", nodes=" + this.b + ", pageInfo=" + this.c + ")";
    }
}

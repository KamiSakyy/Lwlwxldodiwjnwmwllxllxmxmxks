package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w2 {
    public final u2 a;
    public final int b;
    public final List c;

    public w2(u2 u2Var, int i, List list) {
        this.a = u2Var;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return k71.k.b(this.a, w2Var.a) && this.b == w2Var.b && k71.k.b(this.c, w2Var.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestedAssignees(pageInfo=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

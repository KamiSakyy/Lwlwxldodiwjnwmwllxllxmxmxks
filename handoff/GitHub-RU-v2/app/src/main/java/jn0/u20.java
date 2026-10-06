package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u20 {
    public final int a;
    public final r20 b;
    public final List c;

    public u20(int i, r20 r20Var, List list) {
        this.a = i;
        this.b = r20Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u20)) {
            return false;
        }
        u20 u20Var = (u20) obj;
        return this.a == u20Var.a && k71.k.b(this.b, u20Var.b) && k71.k.b(this.c, u20Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(issueCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

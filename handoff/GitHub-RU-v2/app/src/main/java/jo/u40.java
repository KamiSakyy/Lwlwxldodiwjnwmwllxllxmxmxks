package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u40 {
    public int a;
    public r40 b;
    public List c;

    public u40(int i, r40 r40Var, List list) {
        this.a = i;
        this.b = r40Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return this.a == u40Var.a && k71.k.b(this.b, u40Var.b) && k71.k.b(this.c, u40Var.c);
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

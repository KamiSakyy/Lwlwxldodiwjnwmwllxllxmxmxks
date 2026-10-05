package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p50 {
    public final int a;
    public final o50 b;
    public final List c;

    public p50(int i, o50 o50Var, List list) {
        this.a = i;
        this.b = o50Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return this.a == p50Var.a && k71.k.b(this.b, p50Var.b) && k71.k.b(this.c, p50Var.c);
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

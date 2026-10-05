package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c00 {
    public final g00 a;
    public final int b;
    public final List c;

    public c00(g00 g00Var, int i, List list) {
        this.a = g00Var;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        return k71.k.b(this.a, c00Var.a) && this.b == c00Var.b && k71.k.b(this.c, c00Var.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Collaborators(pageInfo=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

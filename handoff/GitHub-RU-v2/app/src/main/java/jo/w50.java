package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w50 {
    public final int a;
    public final v50 b;
    public final List c;

    public w50(int i, v50 v50Var, List list) {
        this.a = i;
        this.b = v50Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) obj;
        return this.a == w50Var.a && k71.k.b(this.b, w50Var.b) && k71.k.b(this.c, w50Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(repositoryCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

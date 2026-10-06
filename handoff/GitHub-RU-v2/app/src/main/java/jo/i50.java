package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i50 {
    public int a;
    public h50 b;
    public List c;

    public i50(int i, h50 h50Var, List list) {
        this.a = i;
        this.b = h50Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return this.a == i50Var.a && k71.k.b(this.b, i50Var.b) && k71.k.b(this.c, i50Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(userCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

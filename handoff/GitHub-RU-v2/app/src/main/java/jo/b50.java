package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b50 {
    public final int a;
    public final a50 b;
    public final List c;

    public b50(int i, a50 a50Var, List list) {
        this.a = i;
        this.b = a50Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return this.a == b50Var.a && k71.k.b(this.b, b50Var.b) && k71.k.b(this.c, b50Var.c);
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

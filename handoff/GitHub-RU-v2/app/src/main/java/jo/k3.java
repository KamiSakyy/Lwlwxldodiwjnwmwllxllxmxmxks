package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k3 {
    public i3 a;
    public int b;
    public List c;

    public k3(i3 i3Var, int i, List list) {
        this.a = i3Var;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return k71.k.b(this.a, k3Var.a) && this.b == k3Var.b && k71.k.b(this.c, k3Var.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestedActors(pageInfo=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

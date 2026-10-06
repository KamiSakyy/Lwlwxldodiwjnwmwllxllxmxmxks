package vo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public int a;
    public x0 b;
    public List c;

    public v0(int i, x0 x0Var, List list) {
        this.a = i;
        this.b = x0Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && k71.k.b(this.b, v0Var.b) && k71.k.b(this.c, v0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuites(totalCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

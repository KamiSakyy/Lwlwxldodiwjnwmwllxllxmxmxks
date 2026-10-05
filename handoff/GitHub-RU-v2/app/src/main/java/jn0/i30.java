package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i30 {
    public final int a;
    public final h30 b;
    public final List c;

    public i30(int i, h30 h30Var, List list) {
        this.a = i;
        this.b = h30Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i30)) {
            return false;
        }
        i30 i30Var = (i30) obj;
        return this.a == i30Var.a && k71.k.b(this.b, i30Var.b) && k71.k.b(this.c, i30Var.c);
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

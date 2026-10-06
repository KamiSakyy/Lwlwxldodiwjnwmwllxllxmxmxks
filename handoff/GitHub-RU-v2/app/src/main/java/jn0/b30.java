package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b30 {
    public int a;
    public a30 b;
    public List c;

    public b30(int i, a30 a30Var, List list) {
        this.a = i;
        this.b = a30Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b30)) {
            return false;
        }
        b30 b30Var = (b30) obj;
        return this.a == b30Var.a && k71.k.b(this.b, b30Var.b) && k71.k.b(this.c, b30Var.c);
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

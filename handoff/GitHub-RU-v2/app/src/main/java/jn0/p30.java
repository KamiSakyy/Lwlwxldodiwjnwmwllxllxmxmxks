package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p30 {
    public int a;
    public o30 b;
    public List c;

    public p30(int i, o30 o30Var, List list) {
        this.a = i;
        this.b = o30Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p30)) {
            return false;
        }
        p30 p30Var = (p30) obj;
        return this.a == p30Var.a && k71.k.b(this.b, p30Var.b) && k71.k.b(this.c, p30Var.c);
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

package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h00 {
    public int a;
    public g00 b;
    public List c;

    public h00(int i, g00 g00Var, List list) {
        this.a = i;
        this.b = g00Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        return this.a == h00Var.a && k71.k.b(this.b, h00Var.b) && k71.k.b(this.c, h00Var.c);
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

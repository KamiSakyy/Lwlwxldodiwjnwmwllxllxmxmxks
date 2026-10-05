package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w30 {
    public final int a;
    public final v30 b;
    public final List c;

    public w30(int i, v30 v30Var, List list) {
        this.a = i;
        this.b = v30Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w30)) {
            return false;
        }
        w30 w30Var = (w30) obj;
        return this.a == w30Var.a && k71.k.b(this.b, w30Var.b) && k71.k.b(this.c, w30Var.c);
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

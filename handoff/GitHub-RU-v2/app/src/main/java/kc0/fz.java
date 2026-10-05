package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fz {
    public final int a;
    public final cz b;
    public final List c;

    public fz(int i, cz czVar, List list) {
        this.a = i;
        this.b = czVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        return this.a == fzVar.a && k71.k.b(this.b, fzVar.b) && k71.k.b(this.c, fzVar.c);
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

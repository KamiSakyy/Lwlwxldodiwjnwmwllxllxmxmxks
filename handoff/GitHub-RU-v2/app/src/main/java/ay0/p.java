package ay0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.h0 {
    public final int a;
    public final o b;
    public final List c;

    public p(int i, o oVar, List list) {
        k71.k.g(oVar, "pageInfo");
        this.a = i;
        this.b = oVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProjectV2GroupItemsFragment(totalCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

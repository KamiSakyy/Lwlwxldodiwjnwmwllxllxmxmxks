package wc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final int a;
    public final o b;
    public final List c;

    public g(int i, o oVar, List list) {
        this.a = i;
        this.b = oVar;
        this.c = list;
    }

    public static g a(g gVar, List list) {
        int i = gVar.a;
        o oVar = gVar.b;
        gVar.getClass();
        return new g(i, oVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckRuns(totalCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

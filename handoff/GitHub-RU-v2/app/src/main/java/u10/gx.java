package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gx {
    public int a;
    public dx b;
    public List c;

    public gx(int i, dx dxVar, List list) {
        this.a = i;
        this.b = dxVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx)) {
            return false;
        }
        gx gxVar = (gx) obj;
        return this.a == gxVar.a && k71.k.b(this.b, gxVar.b) && k71.k.b(this.c, gxVar.c);
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

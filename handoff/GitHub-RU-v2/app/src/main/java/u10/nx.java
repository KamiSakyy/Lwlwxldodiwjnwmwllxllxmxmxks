package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nx {
    public int a;
    public mx b;
    public List c;

    public nx(int i, mx mxVar, List list) {
        this.a = i;
        this.b = mxVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx)) {
            return false;
        }
        nx nxVar = (nx) obj;
        return this.a == nxVar.a && k71.k.b(this.b, nxVar.b) && k71.k.b(this.c, nxVar.c);
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

package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cy {
    public int a;
    public ay b;
    public List c;

    public cy(int i, ay ayVar, List list) {
        this.a = i;
        this.b = ayVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy)) {
            return false;
        }
        cy cyVar = (cy) obj;
        return this.a == cyVar.a && k71.k.b(this.b, cyVar.b) && k71.k.b(this.c, cyVar.c);
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

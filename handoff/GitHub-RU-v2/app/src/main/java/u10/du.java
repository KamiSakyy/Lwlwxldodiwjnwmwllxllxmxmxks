package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class du {
    public hu a;
    public int b;
    public List c;

    public du(hu huVar, int i, List list) {
        this.a = huVar;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du)) {
            return false;
        }
        du duVar = (du) obj;
        return k71.k.b(this.a, duVar.a) && this.b == duVar.b && k71.k.b(this.c, duVar.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Collaborators(pageInfo=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

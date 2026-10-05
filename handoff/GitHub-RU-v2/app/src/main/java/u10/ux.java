package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ux {
    public final int a;
    public final tx b;
    public final List c;

    public ux(int i, tx txVar, List list) {
        this.a = i;
        this.b = txVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        return this.a == uxVar.a && k71.k.b(this.b, uxVar.b) && k71.k.b(this.c, uxVar.c);
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

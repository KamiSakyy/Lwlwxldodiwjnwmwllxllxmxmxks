package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ot {
    public final int a;
    public final st b;
    public final List c;

    public ot(int i, st stVar, List list) {
        this.a = i;
        this.b = stVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return this.a == otVar.a && k71.k.b(this.b, otVar.b) && k71.k.b(this.c, otVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Entries(totalCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

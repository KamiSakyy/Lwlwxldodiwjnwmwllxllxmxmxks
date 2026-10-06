package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rv {
    public vv a;
    public int b;
    public List c;

    public rv(vv vvVar, int i, List list) {
        this.a = vvVar;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return k71.k.b(this.a, rvVar.a) && this.b == rvVar.b && k71.k.b(this.c, rvVar.c);
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

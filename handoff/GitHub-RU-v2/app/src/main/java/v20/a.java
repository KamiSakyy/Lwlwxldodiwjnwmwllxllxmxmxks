package v20;

import a0.s0;
import java.util.List;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public e a;
    public int b;
    public List c;

    public a(e eVar, int i, List list) {
        this.a = eVar;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        int b = s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssignableUsers(pageInfo=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(this.b);
        sb.append(", nodes=");
        return i.l(sb, this.c, ")");
    }
}

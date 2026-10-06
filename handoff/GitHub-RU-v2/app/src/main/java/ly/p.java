package ly;

import a0.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public final s a;
    public final List b;
    public final int c;

    public p(s sVar, List list, int i) {
        this.a = sVar;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && this.c == pVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Items(pageInfo=");
        sb.append(this.a);
        sb.append(", nodes=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return s0.l(sb, this.c, ")");
    }
}

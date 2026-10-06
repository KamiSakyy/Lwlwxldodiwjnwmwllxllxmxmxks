package fp;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final List a;
    public final on.g b;
    public final int c;

    public a(List list, on.g gVar, int i) {
        k71.k.g(gVar, "order");
        this.a = list;
        this.b = gVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        List list = this.a;
        return Integer.hashCode(this.c) + ((this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AgentSessionParameters(filterStatus=");
        sb.append(this.a);
        sb.append(", order=");
        sb.append(this.b);
        sb.append(", pageSize=");
        return a0.s0.l(sb, this.c, ")");
    }
    public Object m(Object p1) { return null; }
}

package b20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public int a;
    public k b;
    public List c;

    public m(int i, k kVar, List list) {
        this.a = i;
        this.b = kVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Steps(totalCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

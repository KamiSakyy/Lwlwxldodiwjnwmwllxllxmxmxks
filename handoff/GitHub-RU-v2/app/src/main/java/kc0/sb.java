package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sb {
    public final int a;
    public final qb b;
    public final List c;

    public sb(int i, qb qbVar, List list) {
        this.a = i;
        this.b = qbVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        return this.a == sbVar.a && k71.k.b(this.b, sbVar.b) && k71.k.b(this.c, sbVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(discussionCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

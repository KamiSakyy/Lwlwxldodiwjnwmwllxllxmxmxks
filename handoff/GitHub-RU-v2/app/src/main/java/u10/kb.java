package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kb {
    public final int a;
    public final ib b;
    public final List c;

    public kb(int i, ib ibVar, List list) {
        this.a = i;
        this.b = ibVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return this.a == kbVar.a && k71.k.b(this.b, kbVar.b) && k71.k.b(this.c, kbVar.c);
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

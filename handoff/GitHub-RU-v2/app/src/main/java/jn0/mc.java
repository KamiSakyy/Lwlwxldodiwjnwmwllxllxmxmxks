package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mc {
    public int a;
    public kc b;
    public List c;

    public mc(int i, kc kcVar, List list) {
        this.a = i;
        this.b = kcVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        return this.a == mcVar.a && k71.k.b(this.b, mcVar.b) && k71.k.b(this.c, mcVar.c);
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

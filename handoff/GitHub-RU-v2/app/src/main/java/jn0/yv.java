package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yv {
    public final int a;
    public final cw b;
    public final List c;

    public yv(int i, cw cwVar, List list) {
        this.a = i;
        this.b = cwVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv)) {
            return false;
        }
        yv yvVar = (yv) obj;
        return this.a == yvVar.a && k71.k.b(this.b, yvVar.b) && k71.k.b(this.c, yvVar.c);
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

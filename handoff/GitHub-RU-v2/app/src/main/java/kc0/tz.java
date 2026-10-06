package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tz {
    public int a;
    public sz b;
    public List c;

    public tz(int i, sz szVar, List list) {
        this.a = i;
        this.b = szVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz)) {
            return false;
        }
        tz tzVar = (tz) obj;
        return this.a == tzVar.a && k71.k.b(this.b, tzVar.b) && k71.k.b(this.c, tzVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(userCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
}

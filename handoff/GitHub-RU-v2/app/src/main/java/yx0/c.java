package yx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final int a;
    public final g b;
    public final List c;

    public c(int i, g gVar, List list) {
        this.a = i;
        this.b = gVar;
        this.c = list;
    }

    public static c a(c cVar, g gVar, List list, int i) {
        int i2 = cVar.a;
        if ((i & 2) != 0) {
            gVar = cVar.b;
        }
        cVar.getClass();
        return new c(i2, gVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Groups(totalCount=");
        sb.append(this.a);
        sb.append(", pageInfo=");
        sb.append(this.b);
        sb.append(", nodes=");
        return x.i.l(sb, this.c, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public Object d(Object p1) { return null; }
    public static final Object a = null;
    public static final Object i = null;
    public static final Object l = null;
}

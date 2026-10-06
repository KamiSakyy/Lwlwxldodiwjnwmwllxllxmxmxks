package wk;

import java.util.ArrayList;
import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public List a;
    public ArrayList b;
    public List c;

    public a(List list, ArrayList arrayList, List list2) {
        k.g(list, "navLinks");
        k.g(list2, "shortcuts");
        this.a = list;
        this.b = arrayList;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b.equals(aVar.b) && k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeCachedData(navLinks=");
        sb.append(this.a);
        sb.append(", pinnedItems=");
        sb.append(this.b);
        sb.append(", shortcuts=");
        return x.i.l(sb, this.c, ")");
    }
    public Object a(Object p1) { return null; }
}

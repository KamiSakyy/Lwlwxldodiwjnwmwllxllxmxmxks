package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.h0 {
    public List a;
    public b b;

    public c(List list, b bVar) {
        this.a = list;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "ProjectV2ConnectionFragment(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
    public Object b(Object p1) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
    public static final Object j = null;
}

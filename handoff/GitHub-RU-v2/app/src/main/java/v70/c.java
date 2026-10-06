package v70;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final b a;
    public final List b;

    public c(b bVar, List list) {
        this.a = bVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Projects(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}

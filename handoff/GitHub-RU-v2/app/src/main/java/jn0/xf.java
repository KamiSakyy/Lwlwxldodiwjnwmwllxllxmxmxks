package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xf {
    public ag a;
    public List b;

    public xf(ag agVar, List list) {
        this.a = agVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        return k71.k.b(this.a, xfVar.a) && k71.k.b(this.b, xfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "History(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

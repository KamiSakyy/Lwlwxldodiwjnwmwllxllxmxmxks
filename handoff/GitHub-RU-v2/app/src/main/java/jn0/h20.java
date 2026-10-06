package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h20 {
    public final g20 a;
    public final List b;

    public h20(g20 g20Var, List list) {
        this.a = g20Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return k71.k.b(this.a, h20Var.a) && k71.k.b(this.b, h20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Search(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

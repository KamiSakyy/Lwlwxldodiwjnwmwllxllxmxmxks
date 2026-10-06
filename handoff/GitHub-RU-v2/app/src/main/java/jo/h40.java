package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h40 {
    public final g40 a;
    public final List b;

    public h40(g40 g40Var, List list) {
        this.a = g40Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj;
        return k71.k.b(this.a, h40Var.a) && k71.k.b(this.b, h40Var.b);
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

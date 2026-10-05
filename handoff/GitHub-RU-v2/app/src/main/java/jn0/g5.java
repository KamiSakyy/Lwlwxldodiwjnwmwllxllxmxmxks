package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g5 {
    public final l5 a;
    public final List b;

    public g5(l5 l5Var, List list) {
        this.a = l5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return k71.k.b(this.a, g5Var.a) && k71.k.b(this.b, g5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "CodeSearch(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

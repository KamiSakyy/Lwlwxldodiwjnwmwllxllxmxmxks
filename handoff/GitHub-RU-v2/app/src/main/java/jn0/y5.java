package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y5 {
    public k6 a;
    public List b;

    public y5(k6 k6Var, List list) {
        this.a = k6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return k71.k.b(this.a, y5Var.a) && k71.k.b(this.b, y5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Commits(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

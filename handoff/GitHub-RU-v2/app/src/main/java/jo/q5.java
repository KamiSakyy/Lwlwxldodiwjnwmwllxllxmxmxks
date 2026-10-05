package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q5 {
    public final v5 a;
    public final List b;

    public q5(v5 v5Var, List list) {
        this.a = v5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return k71.k.b(this.a, q5Var.a) && k71.k.b(this.b, q5Var.b);
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

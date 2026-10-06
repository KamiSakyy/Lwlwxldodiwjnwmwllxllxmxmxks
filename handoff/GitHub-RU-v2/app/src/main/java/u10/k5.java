package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k5 {
    public w5 a;
    public List b;

    public k5(w5 w5Var, List list) {
        this.a = w5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return k71.k.b(this.a, k5Var.a) && k71.k.b(this.b, k5Var.b);
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

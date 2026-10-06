package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k00 {
    public q00 a;
    public List b;

    public k00(q00 q00Var, List list) {
        this.a = q00Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k00)) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return k71.k.b(this.a, k00Var.a) && k71.k.b(this.b, k00Var.b);
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

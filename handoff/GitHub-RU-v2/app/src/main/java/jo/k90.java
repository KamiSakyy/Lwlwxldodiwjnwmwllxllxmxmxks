package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k90 {
    public j90 a;
    public List b;

    public k90(j90 j90Var, List list) {
        this.a = j90Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90Var = (k90) obj;
        return k71.k.b(this.a, k90Var.a) && k71.k.b(this.b, k90Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "TopRepositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

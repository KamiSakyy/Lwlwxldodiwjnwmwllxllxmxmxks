package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z60 {
    public y60 a;
    public List b;

    public z60(y60 y60Var, List list) {
        this.a = y60Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z60)) {
            return false;
        }
        z60 z60Var = (z60) obj;
        return k71.k.b(this.a, z60Var.a) && k71.k.b(this.b, z60Var.b);
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

package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z3 {
    public final y3 a;
    public final List b;

    public z3(y3 y3Var, List list) {
        this.a = y3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return k71.k.b(this.a, z3Var.a) && k71.k.b(this.b, z3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SavedReplies(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

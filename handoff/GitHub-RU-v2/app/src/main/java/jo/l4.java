package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l4 {
    public final u4 a;
    public final List b;

    public l4(u4 u4Var, List list) {
        this.a = u4Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return k71.k.b(this.a, l4Var.a) && k71.k.b(this.b, l4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Contexts(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

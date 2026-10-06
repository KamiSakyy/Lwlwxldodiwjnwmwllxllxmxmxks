package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i30 {
    public final k30 a;
    public final List b;

    public i30(k30 k30Var, List list) {
        this.a = k30Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i30)) {
            return false;
        }
        i30 i30Var = (i30) obj;
        return k71.k.b(this.a, i30Var.a) && k71.k.b(this.b, i30Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Milestones(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

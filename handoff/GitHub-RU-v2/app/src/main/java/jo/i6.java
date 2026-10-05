package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i6 {
    public final u6 a;
    public final List b;

    public i6(u6 u6Var, List list) {
        this.a = u6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return k71.k.b(this.a, i6Var.a) && k71.k.b(this.b, i6Var.b);
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

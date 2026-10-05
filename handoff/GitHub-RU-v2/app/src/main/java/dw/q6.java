package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q6 {
    public final p6 a;
    public final List b;

    public q6(p6 p6Var, List list) {
        this.a = p6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return k71.k.b(this.a, q6Var.a) && k71.k.b(this.b, q6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SubIssues(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u5 {
    public final t5 a;
    public final List b;

    public u5(t5 t5Var, List list) {
        this.a = t5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return k71.k.b(this.a, u5Var.a) && k71.k.b(this.b, u5Var.b);
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

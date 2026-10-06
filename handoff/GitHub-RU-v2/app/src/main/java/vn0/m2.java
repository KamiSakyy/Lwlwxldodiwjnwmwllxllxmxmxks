package vn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 implements aa.h0 {
    public l2 a;
    public List b;

    public m2(l2 l2Var, List list) {
        this.a = l2Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return k71.k.b(this.a, m2Var.a) && k71.k.b(this.b, m2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "WorkflowRunConnectionFragment(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}

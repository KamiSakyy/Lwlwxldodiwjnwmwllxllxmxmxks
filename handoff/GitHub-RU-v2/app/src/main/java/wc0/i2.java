package wc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements aa.h0 {
    public final h2 a;
    public final List b;

    public i2(h2 h2Var, List list) {
        this.a = h2Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return k71.k.b(this.a, i2Var.a) && k71.k.b(this.b, i2Var.b);
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

package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m5 {
    public final int a;
    public final List b;

    public m5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return this.a == m5Var.a && k71.k.b(this.b, m5Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "RequiredStatusChecks(totalCount=", ", nodes=", ")", this.b);
    }
}

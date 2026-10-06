package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y5 {
    public int a;
    public List b;

    public y5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return this.a == y5Var.a && k71.k.b(this.b, y5Var.b);
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

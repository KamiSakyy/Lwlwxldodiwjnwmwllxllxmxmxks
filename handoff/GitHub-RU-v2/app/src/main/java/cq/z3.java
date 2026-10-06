package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z3 {
    public int a;
    public List b;

    public z3(int i, List list) {
        this.a = i;
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
        return this.a == z3Var.a && k71.k.b(this.b, z3Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Mentions(totalCount=", ", nodes=", ")", this.b);
    }
}

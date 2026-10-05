package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m2 {
    public final int a;
    public final List b;

    public m2(int i, List list) {
        this.a = i;
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
        return this.a == m2Var.a && k71.k.b(this.b, m2Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "AssignedActors(totalCount=", ", nodes=", ")", this.b);
    }
}

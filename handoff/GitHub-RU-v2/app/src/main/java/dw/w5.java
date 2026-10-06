package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w5 {
    public int a;
    public List b;

    public w5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        return this.a == w5Var.a && k71.k.b(this.b, w5Var.b);
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

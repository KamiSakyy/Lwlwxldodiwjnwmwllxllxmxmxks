package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 {
    public int a;
    public List b;

    public r4(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return this.a == r4Var.a && k71.k.b(this.b, r4Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "Contexts(totalCount=", ", nodes=", ")", this.b);
    }
}

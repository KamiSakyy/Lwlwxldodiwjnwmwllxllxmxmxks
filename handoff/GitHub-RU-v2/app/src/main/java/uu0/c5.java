package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 {
    public int a;
    public List b;

    public c5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return this.a == c5Var.a && k71.k.b(this.b, c5Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Assignees(totalCount=", ", nodes=", ")", this.b);
    }
}

package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c2 {
    public final int a;
    public final List b;

    public c2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.a == c2Var.a && k71.k.b(this.b, c2Var.b);
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

package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 {
    public final int a;
    public final List b;

    public a2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.a == a2Var.a && k71.k.b(this.b, a2Var.b);
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

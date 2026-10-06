package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v4 {
    public final int a;
    public final List b;

    public v4(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return this.a == v4Var.a && k71.k.b(this.b, v4Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "RequiredStatusChecks(totalCount=", ", nodes=", ")", this.b);
    }
}

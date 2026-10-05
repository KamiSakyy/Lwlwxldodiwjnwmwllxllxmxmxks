package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m4 {
    public final int a;
    public final List b;

    public m4(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return this.a == m4Var.a && k71.k.b(this.b, m4Var.b);
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
